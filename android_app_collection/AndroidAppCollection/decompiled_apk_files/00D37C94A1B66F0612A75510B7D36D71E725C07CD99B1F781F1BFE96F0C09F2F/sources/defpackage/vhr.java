package defpackage;
/* compiled from: PG */
/* renamed from: vhr  reason: default package */
/* loaded from: classes4.dex */
public final class vhr implements vhs {
    private final /* synthetic */ int a;

    public vhr() {
    }

    public vhr(int i) {
        this.a = i;
    }

    @Override // defpackage.vhs
    public final void a(vif vifVar) {
        int i = this.a;
        if (i == 0) {
            if (!(vifVar instanceof vgz)) {
                return;
            }
            ((vgz) vifVar).a();
        } else if (i == 1) {
            if (!(vifVar instanceof vhi)) {
                return;
            }
            ((vhi) vifVar).a();
        } else if (i == 2) {
            if (!(vifVar instanceof vid)) {
                return;
            }
            ((vid) vifVar).a();
        } else if (!(vifVar instanceof vvo)) {
        } else {
            ((vvo) vifVar).d();
        }
    }
}
