// AUTOGENERATED FILE - DO NOT MODIFY!
// This file generated by Djinni from ethereum_like_wallet.djinni

package co.ledger.core;

import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicBoolean;

/** Class representing a Ethereum account. */
public abstract class EthereumLikeAccount {
    /** Send a raw (binary) transaction on the Ethereum blockchain. */
    public abstract void broadcastRawTransaction(byte[] transaction, StringCallback callback);

    /** Send a transaction on the Ethereum blockchain. */
    public abstract void broadcastTransaction(EthereumLikeTransaction transaction, StringCallback callback);

    /** Get a builder object to construct transactions. */
    public abstract EthereumLikeTransactionBuilder buildTransaction();

    /** Get the list of ERC20 accounts associated with this Ethereum account. */
    public abstract ArrayList<ERC20LikeAccount> getERC20Accounts();

    /**
     * Get gas price from network
     * Note: it would have been better to have this method on EthereumLikeWallet
     * but since EthereumLikeWallet is not used anywhere, it's better to keep all
     * specific methods under the same specific class so it will be easy to segratate
     * when the right time comes !
     */
    public abstract void getGasPrice(BigIntCallback callback);

    /**
     * Get estimated gas limit to set so the transaction will succeed
     * The passed address could be EOA or contract
     * This estimation is based on X last incoming txs (to address) that succeeded
     * Note: same note as above
     */
    public abstract void getEstimatedGasLimit(String address, BigIntCallback callback);

    /**
     * Get balance of ERC20 token
     * The passed address is an ERC20 account
     * Note: same note as above
     */
    public abstract void getERC20Balance(String erc20Address, BigIntCallback callback);

    private static final class CppProxy extends EthereumLikeAccount
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
        public void broadcastRawTransaction(byte[] transaction, StringCallback callback)
        {
            assert !this.destroyed.get() : "trying to use a destroyed object";
            native_broadcastRawTransaction(this.nativeRef, transaction, callback);
        }
        private native void native_broadcastRawTransaction(long _nativeRef, byte[] transaction, StringCallback callback);

        @Override
        public void broadcastTransaction(EthereumLikeTransaction transaction, StringCallback callback)
        {
            assert !this.destroyed.get() : "trying to use a destroyed object";
            native_broadcastTransaction(this.nativeRef, transaction, callback);
        }
        private native void native_broadcastTransaction(long _nativeRef, EthereumLikeTransaction transaction, StringCallback callback);

        @Override
        public EthereumLikeTransactionBuilder buildTransaction()
        {
            assert !this.destroyed.get() : "trying to use a destroyed object";
            return native_buildTransaction(this.nativeRef);
        }
        private native EthereumLikeTransactionBuilder native_buildTransaction(long _nativeRef);

        @Override
        public ArrayList<ERC20LikeAccount> getERC20Accounts()
        {
            assert !this.destroyed.get() : "trying to use a destroyed object";
            return native_getERC20Accounts(this.nativeRef);
        }
        private native ArrayList<ERC20LikeAccount> native_getERC20Accounts(long _nativeRef);

        @Override
        public void getGasPrice(BigIntCallback callback)
        {
            assert !this.destroyed.get() : "trying to use a destroyed object";
            native_getGasPrice(this.nativeRef, callback);
        }
        private native void native_getGasPrice(long _nativeRef, BigIntCallback callback);

        @Override
        public void getEstimatedGasLimit(String address, BigIntCallback callback)
        {
            assert !this.destroyed.get() : "trying to use a destroyed object";
            native_getEstimatedGasLimit(this.nativeRef, address, callback);
        }
        private native void native_getEstimatedGasLimit(long _nativeRef, String address, BigIntCallback callback);

        @Override
        public void getERC20Balance(String erc20Address, BigIntCallback callback)
        {
            assert !this.destroyed.get() : "trying to use a destroyed object";
            native_getERC20Balance(this.nativeRef, erc20Address, callback);
        }
        private native void native_getERC20Balance(long _nativeRef, String erc20Address, BigIntCallback callback);
    }
}
