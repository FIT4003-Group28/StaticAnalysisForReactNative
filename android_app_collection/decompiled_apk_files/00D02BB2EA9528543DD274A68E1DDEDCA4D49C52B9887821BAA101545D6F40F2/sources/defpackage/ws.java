package defpackage;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: ws  reason: default package */
/* loaded from: classes7.dex */
public final class ws implements vs {
    final /* synthetic */ wt a;

    public ws(wt wtVar) {
        this.a = wtVar;
    }

    @Override // defpackage.vs
    public final boolean a(vf vfVar) {
        wt wtVar = this.a;
        if (vfVar == wtVar.c) {
            return false;
        }
        vi viVar = ((wb) vfVar).k;
        vs vsVar = wtVar.e;
        if (vsVar == null) {
            return false;
        }
        return vsVar.a(vfVar);
    }

    @Override // defpackage.vs
    public final void b(vf vfVar, boolean z) {
        if (vfVar instanceof wb) {
            vfVar.y().q(false);
        }
        vs vsVar = this.a.e;
        if (vsVar != null) {
            vsVar.b(vfVar, z);
        }
    }
}
