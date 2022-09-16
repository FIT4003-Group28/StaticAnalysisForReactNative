package defpackage;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: aewo  reason: default package */
/* loaded from: classes.dex */
public final class aewo implements phs {
    final /* synthetic */ aewx a;

    public aewo(aewx aewxVar) {
        this.a = aewxVar;
    }

    @Override // defpackage.phs
    public final void a(boolean z) {
        aewx aewxVar = this.a;
        aewxVar.L = z;
        afki afkiVar = afki.ABR;
        afbi afbiVar = aewxVar.i.n;
        if (afbiVar != null) {
            String m = agpr.m(z);
            String m2 = agpr.m(this.a.M);
            long g = this.a.g();
            StringBuilder sb = new StringBuilder(m.length() + 33 + m2.length());
            sb.append("sfo.");
            sb.append(m);
            sb.append(";po.");
            sb.append(m2);
            sb.append(";pos.");
            sb.append(g);
            afbiVar.b.w("esfo", sb.toString());
        }
    }

    @Override // defpackage.phs
    public final /* synthetic */ void b() {
    }
}
