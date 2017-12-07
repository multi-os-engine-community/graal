/*
 * Copyright (c) 2016, Oracle and/or its affiliates.
 *
 * All rights reserved.
 *
 * Redistribution and use in source and binary forms, with or without modification, are
 * permitted provided that the following conditions are met:
 *
 * 1. Redistributions of source code must retain the above copyright notice, this list of
 * conditions and the following disclaimer.
 *
 * 2. Redistributions in binary form must reproduce the above copyright notice, this list of
 * conditions and the following disclaimer in the documentation and/or other materials provided
 * with the distribution.
 *
 * 3. Neither the name of the copyright holder nor the names of its contributors may be used to
 * endorse or promote products derived from this software without specific prior written
 * permission.
 *
 * THIS SOFTWARE IS PROVIDED BY THE COPYRIGHT HOLDERS AND CONTRIBUTORS "AS IS" AND ANY EXPRESS
 * OR IMPLIED WARRANTIES, INCLUDING, BUT NOT LIMITED TO, THE IMPLIED WARRANTIES OF
 * MERCHANTABILITY AND FITNESS FOR A PARTICULAR PURPOSE ARE DISCLAIMED. IN NO EVENT SHALL THE
 * COPYRIGHT HOLDER OR CONTRIBUTORS BE LIABLE FOR ANY DIRECT, INDIRECT, INCIDENTAL, SPECIAL,
 * EXEMPLARY, OR CONSEQUENTIAL DAMAGES (INCLUDING, BUT NOT LIMITED TO, PROCUREMENT OF SUBSTITUTE
 * GOODS OR SERVICES; LOSS OF USE, DATA, OR PROFITS; OR BUSINESS INTERRUPTION) HOWEVER CAUSED
 * AND ON ANY THEORY OF LIABILITY, WHETHER IN CONTRACT, STRICT LIABILITY, OR TORT (INCLUDING
 * NEGLIGENCE OR OTHERWISE) ARISING IN ANY WAY OUT OF THE USE OF THIS SOFTWARE, EVEN IF ADVISED
 * OF THE POSSIBILITY OF SUCH DAMAGE.
 */
package com.oracle.truffle.llvm.nodes.others;

import com.oracle.truffle.api.frame.VirtualFrame;
import com.oracle.truffle.llvm.runtime.LLVMAddress;
import com.oracle.truffle.llvm.runtime.LLVMFunctionDescriptor;
import com.oracle.truffle.llvm.runtime.LLVMUnsupportedException;
import com.oracle.truffle.llvm.runtime.LLVMUnsupportedException.UnsupportedReason;
import com.oracle.truffle.llvm.runtime.debug.scope.LLVMSourceLocation;
import com.oracle.truffle.llvm.runtime.floating.LLVM80BitFloat;
import com.oracle.truffle.llvm.runtime.nodes.api.LLVMExpressionNode;

public class LLVMUnsupportedInlineAssemblerNode extends LLVMExpressionNode {

    private final LLVMSourceLocation source;
    protected final String message;

    public LLVMUnsupportedInlineAssemblerNode(LLVMSourceLocation location, String message) {
        this.source = location;
        this.message = message;
    }

    @Override
    public LLVMSourceLocation getSourceLocation() {
        return source;
    }

    public static class LLVMI1UnsupportedInlineAssemblerNode extends LLVMUnsupportedInlineAssemblerNode {

        public LLVMI1UnsupportedInlineAssemblerNode(LLVMSourceLocation sourceSection, String message) {
            super(sourceSection, message);
        }

        @Override
        public boolean executeI1(VirtualFrame frame) {
            throw new LLVMUnsupportedException(UnsupportedReason.INLINE_ASSEMBLER, message);
        }

        @Override
        public Object executeGeneric(VirtualFrame frame) {
            return executeI1(frame);
        }
    }

    public static class LLVMI8UnsupportedInlineAssemblerNode extends LLVMUnsupportedInlineAssemblerNode {

        public LLVMI8UnsupportedInlineAssemblerNode(LLVMSourceLocation sourceSection, String message) {
            super(sourceSection, message);
        }

        @Override
        public byte executeI8(VirtualFrame frame) {
            throw new LLVMUnsupportedException(UnsupportedReason.INLINE_ASSEMBLER, message);
        }

        @Override
        public Object executeGeneric(VirtualFrame frame) {
            return executeI8(frame);
        }
    }

    public static class LLVMI16UnsupportedInlineAssemblerNode extends LLVMUnsupportedInlineAssemblerNode {

        public LLVMI16UnsupportedInlineAssemblerNode(LLVMSourceLocation sourceSection, String message) {
            super(sourceSection, message);
        }

        @Override
        public short executeI16(VirtualFrame frame) {
            throw new LLVMUnsupportedException(UnsupportedReason.INLINE_ASSEMBLER, message);
        }

        @Override
        public Object executeGeneric(VirtualFrame frame) {
            return executeI16(frame);
        }
    }

    public static class LLVMI32UnsupportedInlineAssemblerNode extends LLVMUnsupportedInlineAssemblerNode {

        public LLVMI32UnsupportedInlineAssemblerNode(LLVMSourceLocation sourceSection, String message) {
            super(sourceSection, message);
        }

        @Override
        public int executeI32(VirtualFrame frame) {
            throw new LLVMUnsupportedException(UnsupportedReason.INLINE_ASSEMBLER, message);
        }

        @Override
        public Object executeGeneric(VirtualFrame frame) {
            return executeI32(frame);
        }
    }

    public static class LLVMI64UnsupportedInlineAssemblerNode extends LLVMUnsupportedInlineAssemblerNode {

        public LLVMI64UnsupportedInlineAssemblerNode(LLVMSourceLocation sourceSection, String message) {
            super(sourceSection, message);
        }

        @Override
        public long executeI64(VirtualFrame frame) {
            throw new LLVMUnsupportedException(UnsupportedReason.INLINE_ASSEMBLER, message);
        }

        @Override
        public Object executeGeneric(VirtualFrame frame) {
            return executeI64(frame);
        }
    }

    public static class LLVMFloatUnsupportedInlineAssemblerNode extends LLVMUnsupportedInlineAssemblerNode {

        public LLVMFloatUnsupportedInlineAssemblerNode(LLVMSourceLocation sourceSection, String message) {
            super(sourceSection, message);
        }

        @Override
        public float executeFloat(VirtualFrame frame) {
            throw new LLVMUnsupportedException(UnsupportedReason.INLINE_ASSEMBLER, message);
        }

        @Override
        public Object executeGeneric(VirtualFrame frame) {
            return executeFloat(frame);
        }
    }

    public static class LLVMDoubleUnsupportedInlineAssemblerNode extends LLVMUnsupportedInlineAssemblerNode {

        public LLVMDoubleUnsupportedInlineAssemblerNode(LLVMSourceLocation sourceSection, String message) {
            super(sourceSection, message);
        }

        @Override
        public double executeDouble(VirtualFrame frame) {
            throw new LLVMUnsupportedException(UnsupportedReason.INLINE_ASSEMBLER, message);
        }

        @Override
        public Object executeGeneric(VirtualFrame frame) {
            return executeDouble(frame);
        }
    }

    public static class LLVM80BitFloatUnsupportedInlineAssemblerNode extends LLVMUnsupportedInlineAssemblerNode {

        public LLVM80BitFloatUnsupportedInlineAssemblerNode(LLVMSourceLocation sourceSection, String message) {
            super(sourceSection, message);
        }

        @Override
        public LLVM80BitFloat executeLLVM80BitFloat(VirtualFrame frame) {
            throw new LLVMUnsupportedException(UnsupportedReason.INLINE_ASSEMBLER, message);
        }

        @Override
        public Object executeGeneric(VirtualFrame frame) {
            return executeLLVM80BitFloat(frame);
        }
    }

    public static class LLVMAddressUnsupportedInlineAssemblerNode extends LLVMUnsupportedInlineAssemblerNode {

        public LLVMAddressUnsupportedInlineAssemblerNode(LLVMSourceLocation sourceSection, String message) {
            super(sourceSection, message);
        }

        @Override
        public LLVMAddress executeLLVMAddress(VirtualFrame frame) {
            throw new LLVMUnsupportedException(UnsupportedReason.INLINE_ASSEMBLER, message);
        }

        @Override
        public Object executeGeneric(VirtualFrame frame) {
            return executeLLVMAddress(frame);
        }
    }

    public static class LLVMFunctionUnsupportedInlineAssemblerNode extends LLVMUnsupportedInlineAssemblerNode {

        public LLVMFunctionUnsupportedInlineAssemblerNode(LLVMSourceLocation sourceSection, String message) {
            super(sourceSection, message);
        }

        @Override
        public LLVMFunctionDescriptor executeLLVMFunctionDescriptor(VirtualFrame frame) {
            throw new LLVMUnsupportedException(UnsupportedReason.INLINE_ASSEMBLER, message);
        }

        @Override
        public Object executeGeneric(VirtualFrame frame) {
            return executeLLVMFunctionDescriptor(frame);
        }
    }

    @Override
    public Object executeGeneric(VirtualFrame frame) {
        throw new LLVMUnsupportedException(UnsupportedReason.INLINE_ASSEMBLER, message);
    }
}
