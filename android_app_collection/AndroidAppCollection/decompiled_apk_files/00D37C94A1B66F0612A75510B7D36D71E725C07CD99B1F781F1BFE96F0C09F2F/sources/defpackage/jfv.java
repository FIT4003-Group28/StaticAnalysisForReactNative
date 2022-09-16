package defpackage;
/* compiled from: PG */
/* renamed from: jfv  reason: default package */
/* loaded from: classes3.dex */
public final class jfv {
    public final jga a;
    public final jga b;
    public final jga c;

    public jfv(jga jgaVar, jga jgaVar2, jga jgaVar3) {
        this.a = jgaVar;
        this.b = jgaVar2;
        this.c = jgaVar3;
    }

    public final ankt a(jfz jfzVar) {
        if (jfzVar.a() == agqv.class) {
            return this.a.a(jfzVar);
        }
        if (jfzVar.a() == awjr.class) {
            return this.b.a(jfzVar);
        }
        if (jfzVar.a() == asze.class) {
            return this.c.a(jfzVar);
        }
        String valueOf = String.valueOf(jfzVar.a());
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 82);
        sb.append("CompositeDownloadStateChecker.getVideoDisplayStateAsync does not have support for ");
        sb.append(valueOf);
        throw new UnsupportedOperationException(sb.toString());
    }
}
