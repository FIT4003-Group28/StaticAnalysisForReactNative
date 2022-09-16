package defpackage;

import android.view.View;
import java.util.List;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: bdla  reason: default package */
/* loaded from: classes3.dex */
public final class bdla extends afy {
    final /* synthetic */ bdlb a;

    public bdla(bdlb bdlbVar) {
        this.a = bdlbVar;
    }

    @Override // defpackage.afu
    public final void h(acl aclVar, int i) {
        dead deadVar;
        int e = aclVar.e();
        bdlb bdlbVar = this.a;
        if (bdlbVar.d.bb()) {
            if (e < 0) {
                bvoo.h("Unable to unselect photo with NEGATIVE photo index: %d", Integer.valueOf(e));
            } else {
                List<bdlm> d = bdlbVar.d();
                if (e >= d.size()) {
                    bvoo.h("Unable to delete photo with photo index (%d) >= pending upload list size (%d)", Integer.valueOf(e), Integer.valueOf(d.size()));
                } else {
                    bdlbVar.e.c(bdlbVar.i.b(d.get(e).h()));
                }
            }
        }
        bdlb bdlbVar2 = this.a;
        View view = aclVar.a;
        if (i == 1) {
            deadVar = dead.UP;
        } else if (i != 2) {
            return;
        } else {
            deadVar = dead.DOWN;
        }
        cjtd k = cjqg.k(view);
        if (k != null) {
            bdlbVar2.k.m(new cjte(deaf.SWIPE, deadVar), k);
        }
    }

    @Override // defpackage.afu
    public final boolean n(acl aclVar, acl aclVar2) {
        return false;
    }
}
