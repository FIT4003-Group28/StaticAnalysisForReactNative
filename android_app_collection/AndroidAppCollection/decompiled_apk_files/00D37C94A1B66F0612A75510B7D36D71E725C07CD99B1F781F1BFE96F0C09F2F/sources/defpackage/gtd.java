package defpackage;

import android.animation.AnimatorSet;
import android.animation.ArgbEvaluator;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.os.Bundle;
import android.view.View;
import android.view.animation.AccelerateInterpolator;
import android.widget.TextView;
import com.google.android.libraries.youtube.proto.lite.util.ParcelableMessageLite;
import com.google.protos.youtube.api.innertube.ReelWatchEndpointOuterClass$ReelWatchEndpoint;
/* compiled from: PG */
/* renamed from: gtd  reason: default package */
/* loaded from: classes3.dex */
public final class gtd {
    public static Bundle a(avhn avhnVar) {
        Bundle bundle = new Bundle();
        bundle.putParcelable("com.google.android.apps.youtube.ThumbnailData", new ParcelableMessageLite(avhnVar));
        return bundle;
    }

    public static avhn b(apzg apzgVar, ajmy ajmyVar) {
        avhn avhnVar;
        avhn avhnVar2 = null;
        if (apzgVar != null && apzgVar.qn(ReelWatchEndpointOuterClass$ReelWatchEndpoint.reelWatchEndpoint)) {
            ReelWatchEndpointOuterClass$ReelWatchEndpoint reelWatchEndpointOuterClass$ReelWatchEndpoint = (ReelWatchEndpointOuterClass$ReelWatchEndpoint) apzgVar.qm(ReelWatchEndpointOuterClass$ReelWatchEndpoint.reelWatchEndpoint);
            if ((reelWatchEndpointOuterClass$ReelWatchEndpoint.b & 64) != 0) {
                avhnVar = reelWatchEndpointOuterClass$ReelWatchEndpoint.h;
                if (avhnVar == null) {
                    avhnVar = avhn.a;
                }
            } else {
                avhnVar = null;
            }
            if (avhnVar != null) {
                avhnVar2 = avhnVar;
            } else if ((reelWatchEndpointOuterClass$ReelWatchEndpoint.b & 64) != 0) {
                avhn avhnVar3 = reelWatchEndpointOuterClass$ReelWatchEndpoint.h;
                if (avhnVar3 == null) {
                    avhnVar3 = avhn.a;
                }
                avhnVar2 = avhnVar3;
            }
            if (avhnVar2 != null) {
                int i = 1;
                int i2 = avhnVar2.c.size() > 0 ? ((avhm) avhnVar2.c.get(0)).e : 1;
                if (avhnVar2.c.size() > 0) {
                    i = ((avhm) avhnVar2.c.get(0)).d;
                }
                ajmyVar.n(avhnVar2, i, i2);
            }
        }
        return avhnVar2;
    }

    public static AnimatorSet c(TextView textView, float f) {
        if (textView == null) {
            return null;
        }
        AnimatorSet animatorSet = new AnimatorSet();
        AnimatorSet animatorSet2 = new AnimatorSet();
        int shadowColor = textView.getShadowColor();
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(textView, View.ALPHA, 0.0f);
        ofFloat.setInterpolator(new AccelerateInterpolator());
        ValueAnimator ofObject = ValueAnimator.ofObject(new ArgbEvaluator(), Integer.valueOf(shadowColor), 0);
        ofObject.addUpdateListener(new abqy(textView, 1));
        animatorSet2.playTogether(amuk.s(ofFloat, ofObject));
        animatorSet2.setStartDelay(250L);
        animatorSet2.setDuration(250L);
        animatorSet.playSequentially(ObjectAnimator.ofFloat(textView, "translationX", f, 0.0f).setDuration(300L), animatorSet2);
        animatorSet.addListener(new gsu(textView, shadowColor));
        return animatorSet;
    }

    public static void d(acti actiVar, String str, actj actjVar) {
        if (actiVar == null || actjVar == null) {
            return;
        }
        acte acteVar = new acte(actjVar);
        aopa createBuilder = asjj.a.createBuilder();
        aopa createBuilder2 = askf.a.createBuilder();
        createBuilder2.copyOnWrite();
        askf askfVar = (askf) createBuilder2.instance;
        str.getClass();
        askfVar.b |= 1;
        askfVar.c = str;
        createBuilder.copyOnWrite();
        asjj asjjVar = (asjj) createBuilder.instance;
        askf askfVar2 = (askf) createBuilder2.mo39build();
        askfVar2.getClass();
        asjjVar.g = askfVar2;
        asjjVar.b |= 8;
        actiVar.H(65, acteVar, (asjj) createBuilder.mo39build());
    }

    public static void e(TextView textView, int i) {
        textView.setShadowLayer(textView.getShadowRadius(), textView.getShadowDx(), textView.getShadowDy(), i);
    }
}
