package defpackage;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: boyl  reason: default package */
/* loaded from: classes3.dex */
public final class boyl implements alht {
    final /* synthetic */ boys a;

    public boyl(boys boysVar) {
        this.a = boysVar;
    }

    @Override // defpackage.alht
    public final boolean a(alhr alhrVar) {
        boys boysVar = this.a;
        if (!boysVar.aD) {
            return false;
        }
        if (!boysVar.e.g.equals(bpuh.INITIAL) && !boysVar.e.g.equals(bpuh.CAROUSEL)) {
            return false;
        }
        boysVar.w(alhrVar.a.S(), dbpy.a, true);
        if (!boysVar.e.g.equals(bpuh.INITIAL)) {
            return true;
        }
        boysVar.c.i();
        return true;
    }
}
