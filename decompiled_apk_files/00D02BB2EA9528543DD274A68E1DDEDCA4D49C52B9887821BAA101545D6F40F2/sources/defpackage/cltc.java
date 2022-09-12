package defpackage;

import android.media.MediaCodec;
/* compiled from: PG */
/* renamed from: cltc  reason: default package */
/* loaded from: classes5.dex */
public final class cltc {
    public byte[] a;
    public int[] b;
    public int[] c;
    public final MediaCodec.CryptoInfo d;
    public final cltb e;

    public cltc() {
        MediaCodec.CryptoInfo cryptoInfo = new MediaCodec.CryptoInfo();
        this.d = cryptoInfo;
        this.e = cmny.a >= 24 ? new cltb(cryptoInfo) : null;
    }
}
