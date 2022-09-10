package defpackage;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.TransitionDrawable;
import com.google.android.apps.maps.R;
/* compiled from: PG */
/* renamed from: bmyr  reason: default package */
/* loaded from: classes3.dex */
final class bmyr extends cqtd {
    final /* synthetic */ bmys a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bmyr(bmys bmysVar, Object[] objArr) {
        super(objArr);
        this.a = bmysVar;
    }

    @Override // defpackage.cqtd
    public final Drawable a(Context context) {
        Drawable[] drawableArr = new Drawable[2];
        if (this.a.l()) {
            drawableArr[0] = new cqlu();
            drawableArr[1] = context.getResources().getDrawable(R.drawable.action_icon_background);
        } else {
            drawableArr[0] = context.getResources().getDrawable(R.drawable.action_icon_background);
            drawableArr[1] = new cqlu();
        }
        TransitionDrawable transitionDrawable = new TransitionDrawable(drawableArr);
        transitionDrawable.setCrossFadeEnabled(true);
        transitionDrawable.startTransition(cpnx.a);
        return transitionDrawable;
    }
}
