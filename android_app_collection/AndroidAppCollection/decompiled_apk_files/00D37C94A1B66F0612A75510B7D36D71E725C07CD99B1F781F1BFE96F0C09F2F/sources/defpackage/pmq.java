package defpackage;

import android.media.MediaCodec;
/* compiled from: PG */
/* renamed from: pmq  reason: default package */
/* loaded from: classes4.dex */
public final class pmq {
    public byte[] a;
    public byte[] b;
    public int c;
    public int[] d;
    public int[] e;
    public int f;
    public int g;
    public int h;
    public final MediaCodec.CryptoInfo i;
    public final pmp j;

    public pmq() {
        MediaCodec.CryptoInfo cryptoInfo = new MediaCodec.CryptoInfo();
        this.i = cryptoInfo;
        this.j = pxi.a >= 24 ? new pmp(cryptoInfo) : null;
    }
}
