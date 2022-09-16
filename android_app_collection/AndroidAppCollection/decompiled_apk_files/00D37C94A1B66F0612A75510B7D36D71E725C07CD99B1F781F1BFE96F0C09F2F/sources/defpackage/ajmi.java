package defpackage;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
/* compiled from: PG */
/* renamed from: ajmi  reason: default package */
/* loaded from: classes.dex */
public class ajmi implements afts {
    private final ajmh a;
    private final Context b;

    public ajmi(Context context) {
        this.b = context;
        this.a = new ajmh(zew.l(context), Bitmap.Config.ARGB_8888);
    }

    @Override // defpackage.afts
    /* renamed from: a */
    public Drawable b(byte[] bArr) {
        return c(bArr);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final Drawable c(byte[] bArr) {
        return new BitmapDrawable(this.b.getResources(), this.a.b(bArr));
    }
}
