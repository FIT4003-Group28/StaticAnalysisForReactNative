package defpackage;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.content.DialogInterface;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.View;
import java.util.ArrayList;
/* compiled from: PG */
/* renamed from: hro  reason: default package */
/* loaded from: classes3.dex */
public abstract class hro extends dh implements DialogInterface.OnKeyListener, htk {
    public hvn ae;
    public acth af;
    public int ag;
    public boolean ah;
    protected final hrm ai = new hrm(this);
    private AnimatorSet aj;

    protected abstract View aE();

    protected abstract View aF();

    /* JADX INFO: Access modifiers changed from: protected */
    public final void aG(boolean z, Animator.AnimatorListener animatorListener) {
        ArrayList arrayList;
        AnimatorSet animatorSet = this.aj;
        if (animatorSet != null && animatorSet.isRunning()) {
            this.aj.end();
        }
        float f = true != z ? 0.0f : 1.0f;
        int i = z ? 0 : this.ag;
        if (!this.ah) {
            ArrayList arrayList2 = new ArrayList();
            arrayList2.add(ObjectAnimator.ofFloat(aF(), View.ALPHA, f).setDuration(300L));
            arrayList2.add(ObjectAnimator.ofFloat(aE(), View.TRANSLATION_Y, i).setDuration(300L));
            arrayList2.add(ObjectAnimator.ofFloat(aE(), View.ALPHA, f).setDuration(300L));
            arrayList = arrayList2;
        } else {
            arrayList = new ArrayList();
            float f2 = i;
            arrayList.add(ObjectAnimator.ofFloat(aF(), View.TRANSLATION_Y, f2).setDuration(300L));
            arrayList.add(ObjectAnimator.ofFloat(aE(), View.TRANSLATION_Y, f2).setDuration(300L));
            arrayList.add(ObjectAnimator.ofFloat(aE(), View.TRANSLATION_Y, f2).setDuration(300L));
        }
        AnimatorSet animatorSet2 = new AnimatorSet();
        animatorSet2.playTogether(arrayList);
        if (!z) {
            animatorSet2.addListener(new hrn(this));
        } else if (animatorListener != null) {
            animatorSet2.addListener(animatorListener);
        }
        animatorSet2.start();
        this.aj = animatorSet2;
        if (z) {
            this.ae.aP();
            return;
        }
        this.af.oi().t();
        this.ae.aO();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final void aH() {
        aG(false, null);
    }

    @Override // defpackage.dh, defpackage.dp
    public final void mQ(Bundle bundle) {
        super.mQ(bundle);
        mN(2, 2132083361);
    }

    @Override // android.content.DialogInterface.OnKeyListener
    public boolean onKey(DialogInterface dialogInterface, int i, KeyEvent keyEvent) {
        if (i == 4 && keyEvent.getAction() == 1) {
            aH();
            return true;
        }
        return false;
    }
}
