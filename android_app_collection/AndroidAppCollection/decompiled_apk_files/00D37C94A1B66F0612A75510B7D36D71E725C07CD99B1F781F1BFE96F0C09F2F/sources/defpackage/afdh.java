package defpackage;

import android.media.MediaCodec;
/* compiled from: PG */
/* renamed from: afdh  reason: default package */
/* loaded from: classes.dex */
public final class afdh implements otr {
    public final aetv a;
    public int d;
    private final amqo e;
    public volatile aflm c = aflm.a;
    public final String b = "ExoPlayer";

    public afdh(amqo amqoVar, aetv aetvVar) {
        this.e = amqoVar;
        this.a = aetvVar;
    }

    @Override // defpackage.otr
    public final void a(MediaCodec.CryptoException cryptoException) {
        String str = this.b;
        StringBuilder sb = new StringBuilder(str.length() + 24);
        sb.append("Audio CryptoError with ");
        sb.append(str);
        sb.append(".");
        zep.d(sb.toString(), cryptoException);
    }

    @Override // defpackage.otr
    public final void b(otq otqVar) {
        String str = this.b;
        StringBuilder sb = new StringBuilder(str.length() + 41);
        sb.append("Error with ");
        sb.append(str);
        sb.append(" audio decoder initialization.");
        zep.d(sb.toString(), otqVar);
    }

    @Override // defpackage.otr
    public final void c(String str, long j, long j2) {
        this.c.b(j, j2);
    }

    public final void d(oux ouxVar) {
        String str = this.b;
        StringBuilder sb = new StringBuilder(str.length() + 39);
        sb.append("Error with ");
        sb.append(str);
        sb.append(" audio track initialization.");
        zep.d(sb.toString(), ouxVar);
    }

    public final void e(ouy ouyVar) {
        String str = this.b;
        StringBuilder sb = new StringBuilder(str.length() + 30);
        sb.append("Error with ");
        sb.append(str);
        sb.append(" audio track write.");
        zep.d(sb.toString(), ouyVar);
    }

    public final void f(long j, long j2) {
        StringBuilder sb = new StringBuilder(45);
        sb.append("b.");
        sb.append(j);
        sb.append(";e.");
        sb.append(j2);
        this.a.g(new afkn("underrun", ((Long) this.e.get()).longValue(), sb.toString()));
    }
}
