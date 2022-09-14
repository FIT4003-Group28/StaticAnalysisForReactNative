package c.a.a.u;

import android.content.res.AssetManager;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.view.View;
import c.a.a.v.i;
import c.a.a.y.d;
import java.util.HashMap;
import java.util.Map;
/* loaded from: classes.dex */
public class a {

    /* renamed from: d  reason: collision with root package name */
    private final AssetManager f2411d;

    /* renamed from: e  reason: collision with root package name */
    private c.a.a.a f2412e;

    /* renamed from: a  reason: collision with root package name */
    private final i<String> f2408a = new i<>();

    /* renamed from: b  reason: collision with root package name */
    private final Map<i<String>, Typeface> f2409b = new HashMap();

    /* renamed from: c  reason: collision with root package name */
    private final Map<String, Typeface> f2410c = new HashMap();

    /* renamed from: f  reason: collision with root package name */
    private String f2413f = ".ttf";

    public a(Drawable.Callback callback, c.a.a.a aVar) {
        AssetManager assets;
        this.f2412e = aVar;
        if (!(callback instanceof View)) {
            d.b("LottieDrawable must be inside of a view for images to work.");
            assets = null;
        } else {
            assets = ((View) callback).getContext().getAssets();
        }
        this.f2411d = assets;
    }

    private Typeface a(Typeface typeface, String str) {
        boolean contains = str.contains("Italic");
        boolean contains2 = str.contains("Bold");
        int i = (!contains || !contains2) ? contains ? 2 : contains2 ? 1 : 0 : 3;
        return typeface.getStyle() == i ? typeface : Typeface.create(typeface, i);
    }

    private Typeface a(String str) {
        Typeface typeface = this.f2410c.get(str);
        if (typeface != null) {
            return typeface;
        }
        c.a.a.a aVar = this.f2412e;
        if (aVar != null) {
            aVar.a(str);
            throw null;
        } else if (aVar != null) {
            aVar.b(str);
            throw null;
        } else {
            Typeface createFromAsset = Typeface.createFromAsset(this.f2411d, "fonts/" + str + this.f2413f);
            this.f2410c.put(str, createFromAsset);
            return createFromAsset;
        }
    }

    public Typeface a(String str, String str2) {
        this.f2408a.a(str, str2);
        Typeface typeface = this.f2409b.get(this.f2408a);
        if (typeface != null) {
            return typeface;
        }
        Typeface a2 = a(a(str), str2);
        this.f2409b.put(this.f2408a, a2);
        return a2;
    }

    public void a(c.a.a.a aVar) {
        this.f2412e = aVar;
    }
}
