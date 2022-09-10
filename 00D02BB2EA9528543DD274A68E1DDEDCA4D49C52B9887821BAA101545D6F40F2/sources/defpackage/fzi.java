package defpackage;

import android.graphics.Canvas;
import android.support.v7.widget.RecyclerView;
/* compiled from: PG */
/* renamed from: fzi  reason: default package */
/* loaded from: classes6.dex */
final class fzi extends afu {
    int a = -1;
    int b = -1;
    boolean c = false;
    final /* synthetic */ fzj d;

    public fzi(fzj fzjVar) {
        this.d = fzjVar;
    }

    @Override // defpackage.afu
    public final boolean f() {
        return false;
    }

    @Override // defpackage.afu
    public final boolean g() {
        return false;
    }

    @Override // defpackage.afu
    public final void h(acl aclVar, int i) {
    }

    @Override // defpackage.afu
    public final void j(RecyclerView recyclerView, acl aclVar) {
        super.j(recyclerView, aclVar);
        od.F(aclVar.a, 0.0f);
        od.B(aclVar.a).c(1.0f);
        od.B(aclVar.a).d(1.0f);
        od.B(aclVar.a).e(50L);
    }

    @Override // defpackage.afu
    public final int l() {
        return b(3, 0);
    }

    @Override // defpackage.afu
    public final boolean n(acl aclVar, acl aclVar2) {
        int e = aclVar.e();
        int e2 = aclVar2.e();
        this.b = e2;
        fzh fzhVar = this.d.W;
        if (fzhVar != null) {
            return fzhVar.c(e, e2);
        }
        return false;
    }

    @Override // defpackage.afu
    public final void k(Canvas canvas, RecyclerView recyclerView, acl aclVar, float f, float f2, int i, boolean z) {
        if (i != 2 || !z) {
            super.k(canvas, recyclerView, aclVar, f, f2, i, z);
            return;
        }
        od.F(aclVar.a, 8.0f);
        super.k(canvas, recyclerView, aclVar, f, f2, 2, true);
    }

    @Override // defpackage.afu
    public final void i(@dzsi acl aclVar, int i) {
        if (aclVar != null && i == 2) {
            this.c = true;
            this.a = aclVar.e();
            this.b = -1;
            od.B(aclVar.a).c(1.03f);
            od.B(aclVar.a).d(1.03f);
            od.B(aclVar.a).e(50L);
        } else if (aclVar != null || !this.c || i != 0) {
        } else {
            int i2 = this.a;
            int i3 = this.b;
            this.c = false;
            this.a = -1;
            this.b = -1;
            acl ab = this.d.ab(i3);
            cjqm cjqmVar = null;
            if (ab != null) {
                cjql e = cjqg.e(ab.a);
                cjtd k = cjqg.k(ab.a);
                if (e != null && k != null) {
                    cjqmVar = this.d.V.n(e, new cjte(deaf.DRAG, i2 > i3 ? dead.UP : dead.DOWN), k);
                }
            }
            fzj fzjVar = this.d;
            fzh fzhVar = fzjVar.W;
            if (fzhVar == null) {
                return;
            }
            fzhVar.d(fzjVar, i2, i3, cjqmVar);
        }
    }
}
