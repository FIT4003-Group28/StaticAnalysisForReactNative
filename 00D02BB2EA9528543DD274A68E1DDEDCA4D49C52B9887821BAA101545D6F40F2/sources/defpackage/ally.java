package defpackage;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: ally  reason: default package */
/* loaded from: classes2.dex */
public final class ally implements alsn {
    private static final dcqe a = dcqe.c("ally");
    private final int b;

    public ally(int i) {
        this.b = i;
    }

    @Override // defpackage.akuh
    public final int a() {
        return -1;
    }

    @Override // defpackage.akuh
    @dzsi
    public final dmpz b() {
        return null;
    }

    @Override // defpackage.akuh
    public final void c(Runnable runnable) {
        runnable.run();
    }

    @Override // defpackage.akuh
    public final dmqx d() {
        return dmqx.e;
    }

    @Override // defpackage.akuh
    public final dmpc e() {
        dmpc dmpcVar = (dmpc) dmpd.h.bZ();
        int i = this.b;
        if (dmpcVar.c) {
            dmpcVar.bF();
            dmpcVar.c = false;
        }
        dmpd dmpdVar = (dmpd) dmpcVar.b;
        dmpdVar.a |= 8;
        dmpdVar.e = i;
        return dmpcVar;
    }

    @Override // defpackage.akuh
    public final dmpe f() {
        bvoo.h("Trying to use a SubStyle (value=%d) to make a LabelGroup; they can only be used for LabelElements", Integer.valueOf(this.b));
        return (dmpe) dmph.f.bZ();
    }

    @Override // defpackage.akuh
    public final dmpk g() {
        bvoo.h("Trying to use a SubStyle (value=%d) to make a LabelRenderOp; they can only be used for LabelElements", Integer.valueOf(this.b));
        return (dmpk) dmpn.r.bZ();
    }

    @Override // defpackage.alsn
    public final boolean q(akuh akuhVar, boolean z) {
        bvoo.h("Trying to use a SubStyle (value=%d) on a line label; they can only be used for LabelElements", Integer.valueOf(this.b));
        return false;
    }
}
