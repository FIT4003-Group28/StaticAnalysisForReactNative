package defpackage;

import android.view.View;
import android.view.ViewPropertyAnimator;
/* compiled from: PG */
/* renamed from: aycl  reason: default package */
/* loaded from: classes3.dex */
public final class aycl extends ehz {
    @Override // defpackage.ehz
    protected final void A(acl aclVar) {
        View view = aclVar.a;
        view.setAlpha(0.0f);
        view.setTranslationY(0.0f);
        if (aclVar.d() == 0) {
            view.setTranslationX(-view.getWidth());
        } else {
            view.setTranslationX(view.getWidth() * 3);
        }
    }

    @Override // defpackage.ehz
    protected final ViewPropertyAnimator h(acl aclVar) {
        return aclVar.a.animate().alpha(0.0f).translationY(-aclVar.a.getHeight());
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.ehz
    public final ViewPropertyAnimator k(acl aclVar) {
        return aclVar.a.animate().alpha(1.0f).translationX(0.0f);
    }

    @Override // defpackage.abn
    public final void q(acl aclVar) {
        aclVar.a.setTranslationY(0.0f);
        aclVar.a.setTranslationX(0.0f);
        aclVar.a.setAlpha(1.0f);
    }
}
