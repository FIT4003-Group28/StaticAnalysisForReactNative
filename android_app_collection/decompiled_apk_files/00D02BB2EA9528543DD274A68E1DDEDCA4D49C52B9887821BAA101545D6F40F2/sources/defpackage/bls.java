package defpackage;

import android.content.res.AssetManager;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.view.View;
import java.util.HashMap;
import java.util.Map;
/* compiled from: PG */
/* renamed from: bls  reason: default package */
/* loaded from: classes3.dex */
public final class bls {
    public final AssetManager d;
    public bik e;
    public final bmc<String> a = new bmc<>();
    public final Map<bmc<String>, Typeface> b = new HashMap();
    public final Map<String, Typeface> c = new HashMap();
    public final String f = ".ttf";

    public bls(Drawable.Callback callback, bik bikVar) {
        this.e = bikVar;
        if (!(callback instanceof View)) {
            bpo.a("LottieDrawable must be inside of a view for images to work.");
            this.d = null;
            return;
        }
        this.d = ((View) callback).getContext().getAssets();
    }
}
