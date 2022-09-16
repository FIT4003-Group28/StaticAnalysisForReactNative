package defpackage;

import android.content.res.AssetManager;
import android.graphics.drawable.Drawable;
import android.view.View;
import java.util.HashMap;
import java.util.Map;
/* compiled from: PG */
/* renamed from: bzo  reason: default package */
/* loaded from: classes2.dex */
public final class bzo {
    public final AssetManager d;
    public final bzx a = new bzx();
    public final Map b = new HashMap();
    public final Map c = new HashMap();
    public final String e = ".ttf";

    public bzo(Drawable.Callback callback) {
        if (!(callback instanceof View)) {
            cda.a("LottieDrawable must be inside of a view for images to work.");
            this.d = null;
            return;
        }
        this.d = ((View) callback).getContext().getAssets();
    }
}
