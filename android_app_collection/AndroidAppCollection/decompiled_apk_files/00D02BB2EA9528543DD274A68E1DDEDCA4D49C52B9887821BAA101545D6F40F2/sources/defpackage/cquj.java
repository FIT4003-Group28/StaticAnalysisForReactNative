package defpackage;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
/* compiled from: PG */
/* renamed from: cquj  reason: default package */
/* loaded from: classes5.dex */
public final class cquj extends cqtd {
    protected final cqup[] a;

    public cquj(cqup[] cqupVarArr) {
        super(cqupVarArr);
        this.a = cqupVarArr;
    }

    public static cquj c(cqup... cqupVarArr) {
        return new cquj(cqupVarArr);
    }

    @Override // defpackage.cqtd
    public final Drawable a(Context context) {
        Drawable[] drawableArr = new Drawable[2];
        for (int i = 0; i < 2; i++) {
            drawableArr[i] = this.a[i].b.a(context);
        }
        LayerDrawable layerDrawable = new LayerDrawable(drawableArr);
        for (int i2 = 0; i2 < 2; i2++) {
            for (cqun cqunVar : this.a[i2].a) {
                cqunVar.Ss(layerDrawable, i2);
            }
        }
        return layerDrawable;
    }
}
