package defpackage;

import android.animation.Animator;
import android.view.View;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: afq  reason: default package */
/* loaded from: classes2.dex */
public final class afq extends afx {
    final /* synthetic */ int a;
    final /* synthetic */ acl b;
    final /* synthetic */ aga c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public afq(aga agaVar, acl aclVar, int i, float f, float f2, float f3, float f4, int i2, acl aclVar2) {
        super(aclVar, i, f, f2, f3, f4);
        this.c = agaVar;
        this.a = i2;
        this.b = aclVar2;
    }

    @Override // defpackage.afx, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        super.onAnimationEnd(animator);
        if (this.n) {
            return;
        }
        if (this.a <= 0) {
            aga agaVar = this.c;
            agaVar.j.j(agaVar.m, this.b);
        } else {
            this.c.a.add(this.b.a);
            this.k = true;
            int i = this.a;
            if (i > 0) {
                aga agaVar2 = this.c;
                agaVar2.m.post(new afr(agaVar2, this, i));
            }
        }
        aga agaVar3 = this.c;
        View view = agaVar3.p;
        View view2 = this.b.a;
        if (view != view2) {
            return;
        }
        agaVar3.n(view2);
    }
}
