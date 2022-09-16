package defpackage;

import android.media.MediaCodec;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: oto  reason: default package */
/* loaded from: classes4.dex */
public final class oto implements Runnable {
    final /* synthetic */ MediaCodec.CryptoException a;
    final /* synthetic */ ots b;

    public oto(ots otsVar, MediaCodec.CryptoException cryptoException) {
        this.b = otsVar;
        this.a = cryptoException;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.b.c.a(this.a);
    }
}
