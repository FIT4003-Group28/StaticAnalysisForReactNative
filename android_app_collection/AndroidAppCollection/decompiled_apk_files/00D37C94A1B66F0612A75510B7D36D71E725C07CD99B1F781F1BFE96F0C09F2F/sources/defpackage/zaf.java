package defpackage;

import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
/* compiled from: PG */
/* renamed from: zaf  reason: default package */
/* loaded from: classes4.dex */
final class zaf extends LayerDrawable {
    public final Drawable a;
    public final int b;

    public zaf(Drawable drawable, Drawable drawable2, int i) {
        super(new Drawable[]{drawable, drawable2});
        drawable.getClass();
        this.a = drawable;
        this.b = i;
    }
}
