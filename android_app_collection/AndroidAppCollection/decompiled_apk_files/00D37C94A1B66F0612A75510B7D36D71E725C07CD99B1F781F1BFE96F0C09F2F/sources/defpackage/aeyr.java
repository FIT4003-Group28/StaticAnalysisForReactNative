package defpackage;

import java.io.IOException;
/* compiled from: PG */
/* renamed from: aeyr  reason: default package */
/* loaded from: classes.dex */
public final class aeyr extends IOException implements afma {
    public final long a;
    public final long b;
    public final long c;
    public final String d;

    public aeyr(long j, long j2, long j3, long j4) {
        this.a = j;
        this.b = j3;
        this.c = j4;
        StringBuilder sb = new StringBuilder(97);
        sb.append("seekTimeUs.");
        sb.append(j);
        sb.append(";errorChunks.");
        sb.append(j2);
        sb.append(";newSequence.");
        sb.append(j3);
        this.d = sb.toString();
    }

    @Override // defpackage.afma
    public final String a(boolean z) {
        return "player.exception";
    }

    @Override // defpackage.afma
    public final String b() {
        String valueOf = String.valueOf(this.d);
        return valueOf.length() != 0 ? "info.ManifestlessSeek;".concat(valueOf) : new String("info.ManifestlessSeek;");
    }
}
