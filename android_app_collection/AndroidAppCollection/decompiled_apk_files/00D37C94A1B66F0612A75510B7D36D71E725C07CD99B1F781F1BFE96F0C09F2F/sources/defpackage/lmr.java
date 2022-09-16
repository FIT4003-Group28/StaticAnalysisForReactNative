package defpackage;

import android.animation.Animator;
import android.animation.ArgbEvaluator;
import android.animation.ValueAnimator;
import android.view.View;
/* compiled from: PG */
/* renamed from: lmr  reason: default package */
/* loaded from: classes3.dex */
public final class lmr {
    /* JADX INFO: Access modifiers changed from: package-private */
    public static final Class[] a(ltu ltuVar, Object obj, int i) {
        if (i != -1) {
            if (i == 0) {
                ltuVar.b((isw) obj);
                return null;
            }
            StringBuilder sb = new StringBuilder(32);
            sb.append("unsupported op code: ");
            sb.append(i);
            throw new IllegalStateException(sb.toString());
        }
        return new Class[]{isw.class};
    }

    public static zbu b(yve yveVar, awan awanVar) {
        return new zcq(yveVar, new llx(awanVar, 1), new lly(awanVar));
    }

    public static zbu c(yve yveVar, awan awanVar) {
        return new zcq(yveVar, new llx(awanVar), new lly(awanVar, 2));
    }

    public static final Animator d(View view, int i, int i2, long j) {
        ValueAnimator ofObject = ValueAnimator.ofObject(new ArgbEvaluator(), Integer.valueOf(i), Integer.valueOf(i2));
        ofObject.setDuration(j);
        ofObject.addUpdateListener(new jfo(view, 2));
        return ofObject;
    }
}
