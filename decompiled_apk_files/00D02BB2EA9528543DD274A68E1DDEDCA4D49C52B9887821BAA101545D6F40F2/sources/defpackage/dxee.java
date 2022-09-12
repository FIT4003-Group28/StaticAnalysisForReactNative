package defpackage;

import android.graphics.Picture;
import android.graphics.drawable.PictureDrawable;
/* compiled from: PG */
/* renamed from: dxee  reason: default package */
/* loaded from: classes.dex */
public final class dxee {
    public final Picture a;

    public dxee(Picture picture) {
        this.a = picture;
    }

    public final PictureDrawable a() {
        return new PictureDrawable(this.a);
    }
}
