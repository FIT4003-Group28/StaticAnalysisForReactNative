package defpackage;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
/* compiled from: PG */
/* renamed from: cqui  reason: default package */
/* loaded from: classes.dex */
public final class cqui extends cqtd {
    protected final cqug[] a;

    public cqui(cqug[] cqugVarArr) {
        super(cqugVarArr);
        this.a = cqugVarArr;
    }

    public static cqui c(cqug... cqugVarArr) {
        return new cqui(cqugVarArr);
    }

    @Override // defpackage.cqtd
    public final Drawable a(Context context) {
        GradientDrawable gradientDrawable = new GradientDrawable();
        for (cqug cqugVar : this.a) {
            cqugVar.a(context, gradientDrawable);
        }
        return gradientDrawable;
    }
}
