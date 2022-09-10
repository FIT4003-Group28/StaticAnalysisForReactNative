package defpackage;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: puo  reason: default package */
/* loaded from: classes7.dex */
public final class puo implements alht {
    final /* synthetic */ puy a;

    public puo(puy puyVar) {
        this.a = puyVar;
    }

    @Override // defpackage.alht
    public final boolean a(alhr alhrVar) {
        puy puyVar = this.a;
        if (!puyVar.aD) {
            return false;
        }
        pvk pvkVar = puyVar.bh;
        dbsk.s(pvkVar);
        if (!pvkVar.s || !pvkVar.c.b().booleanValue() || pvkVar.d.l().L() != jjn.COLLAPSED) {
            return false;
        }
        pvkVar.d.B(jjn.EXPANDED);
        return true;
    }
}
