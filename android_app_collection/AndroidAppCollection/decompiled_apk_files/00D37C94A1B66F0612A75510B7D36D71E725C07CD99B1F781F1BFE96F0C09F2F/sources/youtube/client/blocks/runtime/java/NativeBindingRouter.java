package youtube.client.blocks.runtime.java;

import com.google.common.util.concurrent.SettableFuture;
/* compiled from: PG */
/* loaded from: classes4.dex */
public final class NativeBindingRouter {
    private NativeBindingRouter() {
    }

    private native void nativeCallAsync(byte[] bArr, SettableFuture settableFuture);

    private native byte[] nativeCallSyncBinding(byte[] bArr);

    private native void nativeCallWritableStream(byte[] bArr, SettableFuture settableFuture);

    private native void nativeRead(byte[] bArr, ReaderProxy readerProxy);

    private native void nativeSetStreamWriter(byte[] bArr, WriterProxy writerProxy);
}
