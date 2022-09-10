package defpackage;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: ak  reason: default package */
/* loaded from: classes2.dex */
public final class ak implements aa {
    v a;
    final /* synthetic */ ahp b;
    final /* synthetic */ x c;

    public ak(ahp ahpVar, x xVar) {
        this.b = ahpVar;
        this.c = xVar;
    }

    @Override // defpackage.aa
    public final void m(Object obj) {
        v vVar = (v) this.b.a(obj);
        v vVar2 = this.a;
        if (vVar2 == vVar) {
            return;
        }
        if (vVar2 != null) {
            this.c.n(vVar2);
        }
        this.a = vVar;
        if (vVar == null) {
            return;
        }
        this.c.m(vVar, new aj(this));
    }
}
