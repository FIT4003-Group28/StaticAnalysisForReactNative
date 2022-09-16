package defpackage;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: oyb  reason: default package */
/* loaded from: classes7.dex */
public final class oyb implements bnjt {
    final /* synthetic */ dtof a;
    final /* synthetic */ cjzt b;

    public oyb(dtof dtofVar, cjzt cjztVar) {
        this.a = dtofVar;
        this.b = cjztVar;
    }

    @Override // defpackage.bnjt
    public final void a(cjqm cjqmVar) {
        if ((this.a.a & 4) != 0) {
            cjzt cjztVar = this.b;
            nxc b = nxc.b(cjztVar.a, cjztVar.b, cjqmVar);
            cjyi cjyiVar = this.b.c;
            dthb dthbVar = this.a.d;
            if (dthbVar == null) {
                dthbVar = dthb.F;
            }
            cjyiVar.j(dthbVar, b);
        }
    }
}
