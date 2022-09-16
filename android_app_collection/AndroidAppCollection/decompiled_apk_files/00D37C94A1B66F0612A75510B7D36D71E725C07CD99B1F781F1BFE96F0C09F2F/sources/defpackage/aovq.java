package defpackage;
/* compiled from: PG */
/* renamed from: aovq  reason: default package */
/* loaded from: classes.dex */
public final class aovq {
    private final aajl a;
    private final aovs b;

    public aovq(aovs aovsVar, aajl aajlVar) {
        this.b = aovsVar;
        this.a = aajlVar;
    }

    public static aovp b(aovs aovsVar) {
        return new aovp(aovsVar.mo52toBuilder());
    }

    public final amvn a() {
        amvl amvlVar = new amvl();
        aovr aovrVar = this.b.c;
        if (aovrVar == null) {
            aovrVar = aovr.a;
        }
        amvlVar.j(aovo.b(aovrVar).a().a());
        return amvlVar.g();
    }

    public final boolean equals(Object obj) {
        return (obj instanceof aovq) && this.b.equals(((aovq) obj).b);
    }

    public final int hashCode() {
        return this.b.hashCode() ^ 1008001;
    }

    public final String toString() {
        String valueOf = String.valueOf(this.b);
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 34);
        sb.append("AccessibilitySupportedDatasModel{");
        sb.append(valueOf);
        sb.append("}");
        return sb.toString();
    }
}
