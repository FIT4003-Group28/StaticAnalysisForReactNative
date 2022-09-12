package defpackage;

import android.animation.ObjectAnimator;
/* compiled from: PG */
/* renamed from: csnc  reason: default package */
/* loaded from: classes5.dex */
final class csnc {
    public static ObjectAnimator a(Object obj) {
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(obj, "growScale", 1.0f);
        ofFloat.setInterpolator(csku.c);
        ofFloat.setDuration(500L);
        return ofFloat;
    }

    public static ObjectAnimator b(Object obj) {
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(obj, "growScale", 0.0f);
        ofFloat.setInterpolator(csku.c);
        ofFloat.setDuration(500L);
        return ofFloat;
    }
}
