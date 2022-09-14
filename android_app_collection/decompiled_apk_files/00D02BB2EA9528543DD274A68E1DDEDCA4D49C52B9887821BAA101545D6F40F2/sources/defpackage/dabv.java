package defpackage;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import java.util.List;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: dabv  reason: default package */
/* loaded from: classes5.dex */
public final class dabv extends AnimatorListenerAdapter {
    final /* synthetic */ dabx a;

    public dabv(dabx dabxVar) {
        this.a = dabxVar;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        super.onAnimationEnd(animator);
        super/*android.graphics.drawable.Drawable*/.setVisible(false, false);
        dabx dabxVar = this.a;
        azu azuVar = dabxVar.g;
        if (azuVar != null) {
            azuVar.b();
        }
        List<azu> list = dabxVar.f;
        if (list != null) {
            for (azu azuVar2 : list) {
                azuVar2.b();
            }
        }
    }
}
