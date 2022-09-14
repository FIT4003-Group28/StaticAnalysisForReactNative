package defpackage;

import android.animation.Animator;
import android.animation.TimeInterpolator;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.DecelerateInterpolator;
/* compiled from: PG */
/* renamed from: ayg  reason: default package */
/* loaded from: classes3.dex */
public final class ayg extends azp {
    private static final TimeInterpolator q = new DecelerateInterpolator();
    private static final TimeInterpolator r = new AccelerateInterpolator();
    private static final ayd t = new ayb();
    private static final ayd u = new ayc();
    private ayd s;

    public ayg() {
        throw null;
    }

    private static final void K(ayx ayxVar) {
        int[] iArr = new int[2];
        ayxVar.b.getLocationOnScreen(iArr);
        ayxVar.a.put("android:slide:screenPosition", iArr);
    }

    @Override // defpackage.azp, defpackage.ayn
    public final void b(ayx ayxVar) {
        azp.J(ayxVar);
        K(ayxVar);
    }

    @Override // defpackage.azp, defpackage.ayn
    public final void c(ayx ayxVar) {
        azp.J(ayxVar);
        K(ayxVar);
    }

    @Override // defpackage.azp
    public final Animator e(ViewGroup viewGroup, View view, ayx ayxVar, ayx ayxVar2) {
        int[] iArr = (int[]) ayxVar2.a.get("android:slide:screenPosition");
        float translationX = view.getTranslationX();
        float translationY = view.getTranslationY();
        return aza.a(view, ayxVar2, iArr[0], iArr[1], this.s.a(viewGroup, view), this.s.b(viewGroup, view), translationX, translationY, q, this);
    }

    @Override // defpackage.azp
    public final Animator f(ViewGroup viewGroup, View view, ayx ayxVar) {
        int[] iArr = (int[]) ayxVar.a.get("android:slide:screenPosition");
        return aza.a(view, ayxVar, iArr[0], iArr[1], view.getTranslationX(), view.getTranslationY(), this.s.a(viewGroup, view), this.s.b(viewGroup, view), r, this);
    }

    public ayg(byte[] bArr) {
        this.s = u;
        this.s = t;
        aya ayaVar = new aya();
        ayaVar.a = 8388611;
        this.m = ayaVar;
    }
}
