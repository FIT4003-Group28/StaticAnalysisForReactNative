package defpackage;

import android.os.StrictMode;
import com.airbnb.lottie.LottieAnimationView;
/* compiled from: PG */
/* renamed from: swm  reason: default package */
/* loaded from: classes4.dex */
public final class swm {
    /* JADX INFO: Access modifiers changed from: package-private */
    public static axnk a(axmz axmzVar, Boolean bool) {
        int b;
        aodq aodqVar = new aodq(0);
        axmn axmnVar = new axmn();
        int b2 = axmzVar.b(8);
        axmn axmnVar2 = null;
        if (b2 != 0) {
            axmnVar.f(axmzVar.a(b2 + axmzVar.a), axmzVar.b);
        } else {
            axmnVar = null;
        }
        int a = tfy.a(aodqVar, axmnVar);
        axmn axmnVar3 = new axmn();
        int b3 = axmzVar.b(10);
        if (b3 != 0) {
            axmnVar3.f(axmzVar.a(b3 + axmzVar.a), axmzVar.b);
        } else {
            axmnVar3 = null;
        }
        int a2 = tfy.a(aodqVar, axmnVar3);
        axmn axmnVar4 = new axmn();
        int b4 = axmzVar.b(4);
        if (b4 != 0) {
            axmnVar4.f(axmzVar.a(b4 + axmzVar.a), axmzVar.b);
            axmnVar2 = axmnVar4;
        }
        int a3 = tfy.a(aodqVar, axmnVar2);
        long j = 0;
        if (!bool.booleanValue() && (b = axmzVar.b(6)) != 0) {
            j = 4294967295L & axmzVar.b.getInt(b + axmzVar.a);
        }
        aodqVar.k(axnk.aG(aodqVar, a3, j, a, a2));
        return axnk.aK(aodqVar.f());
    }

    public static awlq b(LottieAnimationView lottieAnimationView) {
        aopa createBuilder = awlq.a.createBuilder();
        boolean o = lottieAnimationView.o();
        createBuilder.copyOnWrite();
        awlq awlqVar = (awlq) createBuilder.instance;
        awlqVar.c |= 1;
        awlqVar.d = o;
        float c = lottieAnimationView.d.c();
        createBuilder.copyOnWrite();
        awlq awlqVar2 = (awlq) createBuilder.instance;
        awlqVar2.c |= 2;
        awlqVar2.e = c;
        return (awlq) createBuilder.mo39build();
    }

    public static awon c(LottieAnimationView lottieAnimationView) {
        return d(null, b(lottieAnimationView));
    }

    public static awon d(awon awonVar, awlq awlqVar) {
        aopc aopcVar;
        if (awonVar != null) {
            aopcVar = (aopc) awon.a.createBuilder(awonVar);
        } else {
            aopcVar = (aopc) awon.a.createBuilder();
        }
        aopcVar.e(awlq.b, awlqVar);
        return (awon) aopcVar.mo39build();
    }

    public static final StrictMode.ThreadPolicy e() {
        return new StrictMode.ThreadPolicy.Builder().detectAll().penaltyLog().build();
    }

    public static ankx f(ankx ankxVar) {
        return new sod(ankxVar);
    }
}
