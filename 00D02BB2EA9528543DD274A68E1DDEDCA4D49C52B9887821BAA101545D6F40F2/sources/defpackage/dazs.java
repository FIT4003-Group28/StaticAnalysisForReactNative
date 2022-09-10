package defpackage;
/* compiled from: PG */
/* renamed from: dazs  reason: default package */
/* loaded from: classes5.dex */
final class dazs implements deff {
    final /* synthetic */ dazn a;
    final /* synthetic */ deff b;

    public dazs(dazn daznVar, deff deffVar) {
        this.a = daznVar;
        this.b = deffVar;
    }

    @Override // defpackage.deff
    public final dehn a() {
        dazn g = dbaa.g(this.a);
        try {
            return this.b.a();
        } finally {
            dbaa.g(g);
        }
    }

    public final String toString() {
        String valueOf = String.valueOf(this.b);
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 14);
        sb.append("propagating=[");
        sb.append(valueOf);
        sb.append("]");
        return sb.toString();
    }
}
