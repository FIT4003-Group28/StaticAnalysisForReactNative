package defpackage;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
/* compiled from: PG */
/* renamed from: amfl  reason: default package */
/* loaded from: classes2.dex */
final class amfl extends cqtd {
    final /* synthetic */ Bitmap a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public amfl(Object[] objArr, Bitmap bitmap) {
        super(objArr);
        this.a = bitmap;
    }

    @Override // defpackage.cqtd
    public final Drawable a(Context context) {
        return new BitmapDrawable(context.getResources(), this.a);
    }
}
