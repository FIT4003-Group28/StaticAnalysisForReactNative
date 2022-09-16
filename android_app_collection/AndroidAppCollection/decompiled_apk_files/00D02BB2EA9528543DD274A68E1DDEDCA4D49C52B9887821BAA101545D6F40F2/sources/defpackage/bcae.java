package defpackage;

import android.animation.Animator;
import android.animation.ObjectAnimator;
/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: bcae  reason: default package */
/* loaded from: classes3.dex */
public final /* synthetic */ class bcae implements dbrn {
    static final dbrn a = new bcae();

    private bcae() {
    }

    @Override // defpackage.dbrn
    public final Object a(Object obj) {
        bcaf bcafVar = (bcaf) obj;
        bcafVar.b.playTogether((Animator[]) dcbg.b(bcafVar.a).E(ObjectAnimator.class));
        return bcafVar.b;
    }
}
