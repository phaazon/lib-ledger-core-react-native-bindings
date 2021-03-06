// AUTOGENERATED FILE - DO NOT MODIFY!
// This file generated by Djinni from stellar_like_wallet.djinni

package co.ledger.core;

import java.util.concurrent.atomic.AtomicBoolean;

public abstract class StellarLikeTransactionBuilder {
    public abstract StellarLikeTransactionBuilder addNativePayment(String address, Amount amount);

    public abstract StellarLikeTransactionBuilder addCreateAccount(String address, Amount amount);

    public abstract StellarLikeTransactionBuilder setBaseFee(Amount baseFee);

    public abstract StellarLikeTransactionBuilder setTextMemo(String text);

    public abstract StellarLikeTransactionBuilder setNumberMemo(BigInt number);

    public abstract StellarLikeTransactionBuilder setHashMemo(byte[] hash);

    public abstract StellarLikeTransactionBuilder setReturnMemo(byte[] value);

    public abstract StellarLikeTransactionBuilder setSequence(BigInt sequence);

    public abstract void build(StellarLikeTransactionCallback callback);

    public static native StellarLikeTransaction parseRawTransaction(Currency currency, byte[] rawTransaction);

    public static native StellarLikeTransaction parseSignatureBase(Currency currency, byte[] rawTransaction);

    private static final class CppProxy extends StellarLikeTransactionBuilder
    {
        private final long nativeRef;
        private final AtomicBoolean destroyed = new AtomicBoolean(false);

        private CppProxy(long nativeRef)
        {
            if (nativeRef == 0) throw new RuntimeException("nativeRef is zero");
            this.nativeRef = nativeRef;
        }

        private native void nativeDestroy(long nativeRef);
        public void destroy()
        {
            boolean destroyed = this.destroyed.getAndSet(true);
            if (!destroyed) nativeDestroy(this.nativeRef);
        }
        protected void finalize() throws java.lang.Throwable
        {
            destroy();
            super.finalize();
        }

        @Override
        public StellarLikeTransactionBuilder addNativePayment(String address, Amount amount)
        {
            assert !this.destroyed.get() : "trying to use a destroyed object";
            return native_addNativePayment(this.nativeRef, address, amount);
        }
        private native StellarLikeTransactionBuilder native_addNativePayment(long _nativeRef, String address, Amount amount);

        @Override
        public StellarLikeTransactionBuilder addCreateAccount(String address, Amount amount)
        {
            assert !this.destroyed.get() : "trying to use a destroyed object";
            return native_addCreateAccount(this.nativeRef, address, amount);
        }
        private native StellarLikeTransactionBuilder native_addCreateAccount(long _nativeRef, String address, Amount amount);

        @Override
        public StellarLikeTransactionBuilder setBaseFee(Amount baseFee)
        {
            assert !this.destroyed.get() : "trying to use a destroyed object";
            return native_setBaseFee(this.nativeRef, baseFee);
        }
        private native StellarLikeTransactionBuilder native_setBaseFee(long _nativeRef, Amount baseFee);

        @Override
        public StellarLikeTransactionBuilder setTextMemo(String text)
        {
            assert !this.destroyed.get() : "trying to use a destroyed object";
            return native_setTextMemo(this.nativeRef, text);
        }
        private native StellarLikeTransactionBuilder native_setTextMemo(long _nativeRef, String text);

        @Override
        public StellarLikeTransactionBuilder setNumberMemo(BigInt number)
        {
            assert !this.destroyed.get() : "trying to use a destroyed object";
            return native_setNumberMemo(this.nativeRef, number);
        }
        private native StellarLikeTransactionBuilder native_setNumberMemo(long _nativeRef, BigInt number);

        @Override
        public StellarLikeTransactionBuilder setHashMemo(byte[] hash)
        {
            assert !this.destroyed.get() : "trying to use a destroyed object";
            return native_setHashMemo(this.nativeRef, hash);
        }
        private native StellarLikeTransactionBuilder native_setHashMemo(long _nativeRef, byte[] hash);

        @Override
        public StellarLikeTransactionBuilder setReturnMemo(byte[] value)
        {
            assert !this.destroyed.get() : "trying to use a destroyed object";
            return native_setReturnMemo(this.nativeRef, value);
        }
        private native StellarLikeTransactionBuilder native_setReturnMemo(long _nativeRef, byte[] value);

        @Override
        public StellarLikeTransactionBuilder setSequence(BigInt sequence)
        {
            assert !this.destroyed.get() : "trying to use a destroyed object";
            return native_setSequence(this.nativeRef, sequence);
        }
        private native StellarLikeTransactionBuilder native_setSequence(long _nativeRef, BigInt sequence);

        @Override
        public void build(StellarLikeTransactionCallback callback)
        {
            assert !this.destroyed.get() : "trying to use a destroyed object";
            native_build(this.nativeRef, callback);
        }
        private native void native_build(long _nativeRef, StellarLikeTransactionCallback callback);
    }
}
