package defpackage;

import android.graphics.Rect;
import android.graphics.drawable.BitmapDrawable;
import android.view.View;
import android.view.ViewTreeObserver;
import android.view.animation.AlphaAnimation;
import android.view.animation.AnimationSet;
import android.view.animation.TranslateAnimation;
import java.util.Map;
import java.util.Set;
/* compiled from: PG */
/* renamed from: bfd  reason: default package */
/* loaded from: classes2.dex */
final class bfd implements ViewTreeObserver.OnGlobalLayoutListener {
    final /* synthetic */ Map a;
    final /* synthetic */ Map b;
    final /* synthetic */ bfl c;

    public bfd(bfl bflVar, Map map, Map map2) {
        this.c = bflVar;
        this.a = map;
        this.b = map2;
    }

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public final void onGlobalLayout() {
        bfp bfpVar;
        int i;
        bhc bhcVar;
        this.c.o.getViewTreeObserver().removeGlobalOnLayoutListener(this);
        bfl bflVar = this.c;
        Map map = this.a;
        Map map2 = this.b;
        Set set = bflVar.r;
        if (set == null || bflVar.s == null) {
            return;
        }
        int size = set.size() - bflVar.s.size();
        bfe bfeVar = new bfe(bflVar);
        int firstVisiblePosition = bflVar.o.getFirstVisiblePosition();
        int i2 = 0;
        boolean z = true;
        boolean z2 = false;
        while (i2 < bflVar.o.getChildCount()) {
            View childAt = bflVar.o.getChildAt(i2);
            bhc bhcVar2 = (bhc) bflVar.p.getItem(firstVisiblePosition + i2);
            Rect rect = (Rect) map.get(bhcVar2);
            int top = childAt.getTop();
            if (rect != null) {
                i = rect.top;
            } else {
                i = (bflVar.y * size) + top;
            }
            AnimationSet animationSet = new AnimationSet(z);
            Set set2 = bflVar.r;
            if (set2 == null || !set2.contains(bhcVar2)) {
                bhcVar = bhcVar2;
            } else {
                AlphaAnimation alphaAnimation = new AlphaAnimation(0.0f, 0.0f);
                bhcVar = bhcVar2;
                alphaAnimation.setDuration(bflVar.S);
                animationSet.addAnimation(alphaAnimation);
                i = top;
            }
            TranslateAnimation translateAnimation = new TranslateAnimation(0.0f, 0.0f, i - top, 0.0f);
            translateAnimation.setDuration(bflVar.R);
            animationSet.addAnimation(translateAnimation);
            z = true;
            animationSet.setFillAfter(true);
            animationSet.setFillEnabled(true);
            animationSet.setInterpolator(bflVar.U);
            if (!z2) {
                animationSet.setAnimationListener(bfeVar);
            }
            childAt.clearAnimation();
            childAt.startAnimation(animationSet);
            bhc bhcVar3 = bhcVar;
            map.remove(bhcVar3);
            map2.remove(bhcVar3);
            i2++;
            z2 = true;
        }
        for (Map.Entry entry : map2.entrySet()) {
            bhc bhcVar4 = (bhc) entry.getKey();
            BitmapDrawable bitmapDrawable = (BitmapDrawable) entry.getValue();
            Rect rect2 = (Rect) map.get(bhcVar4);
            if (bflVar.s.contains(bhcVar4)) {
                bfpVar = new bfp(bitmapDrawable, rect2);
                bfpVar.h = 1.0f;
                bfpVar.i = 0.0f;
                bfpVar.e = bflVar.T;
                bfpVar.d = bflVar.U;
            } else {
                int i3 = bflVar.y;
                bfp bfpVar2 = new bfp(bitmapDrawable, rect2);
                bfpVar2.g = i3 * size;
                bfpVar2.e = bflVar.R;
                bfpVar2.d = bflVar.U;
                bfpVar2.m = new bex(bflVar, bhcVar4);
                bflVar.t.add(bhcVar4);
                bfpVar = bfpVar2;
            }
            bflVar.o.a.add(bfpVar);
        }
    }
}
