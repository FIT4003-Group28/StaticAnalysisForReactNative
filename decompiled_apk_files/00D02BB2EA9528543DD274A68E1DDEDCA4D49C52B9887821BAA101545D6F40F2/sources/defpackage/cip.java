package defpackage;

import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.TransitionDrawable;
/* compiled from: PG */
/* renamed from: cip  reason: default package */
/* loaded from: classes4.dex */
public final class cip implements cit<Drawable> {
    private final int a;
    private final boolean b;

    public cip(int i, boolean z) {
        this.a = i;
        this.b = z;
    }

    @Override // defpackage.cit
    public final /* bridge */ /* synthetic */ boolean a(Drawable drawable, cis cisVar) {
        Drawable drawable2 = drawable;
        Drawable m = cisVar.m();
        if (m == null) {
            m = new ColorDrawable(0);
        }
        TransitionDrawable transitionDrawable = new TransitionDrawable(new Drawable[]{m, drawable2});
        transitionDrawable.setCrossFadeEnabled(this.b);
        transitionDrawable.startTransition(this.a);
        cisVar.n(transitionDrawable);
        return true;
    }
}
