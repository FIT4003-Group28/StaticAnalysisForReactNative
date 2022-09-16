package defpackage;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.TransitionDrawable;
/* compiled from: PG */
/* renamed from: atre  reason: default package */
/* loaded from: classes2.dex */
final class atre extends cqtd {
    private final cqss a;
    private final cqss b;

    public atre(cqss cqssVar, cqss cqssVar2) {
        super(new Object[0]);
        this.a = cqssVar;
        this.b = cqssVar2;
    }

    @Override // defpackage.cqtd
    public final Drawable a(Context context) {
        TransitionDrawable transitionDrawable = new TransitionDrawable(new Drawable[]{aclp.a(this.a, this.b, atrf.g, atrf.f).a(context), new cqlu()});
        transitionDrawable.setCrossFadeEnabled(true);
        return transitionDrawable;
    }
}
