package defpackage;

import java.nio.charset.Charset;
/* compiled from: PG */
/* renamed from: ddag  reason: default package */
/* loaded from: classes5.dex */
final class ddag extends ddal {
    final Charset a;
    final /* synthetic */ ddah b;

    public ddag(ddah ddahVar, Charset charset) {
        this.b = ddahVar;
        dbsk.s(charset);
        this.a = charset;
    }

    @Override // defpackage.ddal
    public final String a() {
        return new String(this.b.a(), this.a);
    }

    public final String toString() {
        String obj = this.b.toString();
        String valueOf = String.valueOf(this.a);
        StringBuilder sb = new StringBuilder(String.valueOf(obj).length() + 15 + String.valueOf(valueOf).length());
        sb.append(obj);
        sb.append(".asCharSource(");
        sb.append(valueOf);
        sb.append(")");
        return sb.toString();
    }
}
