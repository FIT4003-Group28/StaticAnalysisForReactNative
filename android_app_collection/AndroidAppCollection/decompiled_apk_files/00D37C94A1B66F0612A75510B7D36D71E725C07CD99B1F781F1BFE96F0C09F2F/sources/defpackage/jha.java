package defpackage;

import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.widget.ImageView;
/* compiled from: PG */
/* renamed from: jha  reason: default package */
/* loaded from: classes3.dex */
public final class jha implements tef {
    private final azqb a;

    public jha(azqb azqbVar) {
        this.a = azqbVar;
    }

    @Override // defpackage.tef
    public final /* bridge */ /* synthetic */ Drawable a(Object obj, Bitmap bitmap, ImageView.ScaleType scaleType) {
        return new jhb(bitmap, scaleType, (teb) this.a.get(), ((aqol) obj).c);
    }

    @Override // defpackage.tef
    public final aooq b() {
        return aqol.b;
    }
}
