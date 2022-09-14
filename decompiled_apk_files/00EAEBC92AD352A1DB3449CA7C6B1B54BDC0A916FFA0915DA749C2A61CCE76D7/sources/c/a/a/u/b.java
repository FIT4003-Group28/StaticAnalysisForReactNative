package c.a.a.u;

import android.content.Context;
import android.content.res.AssetManager;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.util.Base64;
import android.view.View;
import c.a.a.h;
import c.a.a.y.d;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
/* loaded from: classes.dex */
public class b {

    /* renamed from: e  reason: collision with root package name */
    private static final Object f2414e = new Object();

    /* renamed from: a  reason: collision with root package name */
    private final Context f2415a;

    /* renamed from: b  reason: collision with root package name */
    private String f2416b;

    /* renamed from: c  reason: collision with root package name */
    private c.a.a.b f2417c;

    /* renamed from: d  reason: collision with root package name */
    private final Map<String, h> f2418d;

    public b(Drawable.Callback callback, String str, c.a.a.b bVar, Map<String, h> map) {
        String str2;
        this.f2416b = str;
        if (!TextUtils.isEmpty(str)) {
            if (this.f2416b.charAt(str2.length() - 1) != '/') {
                this.f2416b += '/';
            }
        }
        if (!(callback instanceof View)) {
            d.b("LottieDrawable must be inside of a view for images to work.");
            this.f2418d = new HashMap();
            this.f2415a = null;
            return;
        }
        this.f2415a = ((View) callback).getContext();
        this.f2418d = map;
        a(bVar);
    }

    private Bitmap a(String str, Bitmap bitmap) {
        synchronized (f2414e) {
            this.f2418d.get(str).a(bitmap);
        }
        return bitmap;
    }

    public Bitmap a(String str) {
        String str2;
        Bitmap a2;
        h hVar = this.f2418d.get(str);
        if (hVar == null) {
            return null;
        }
        Bitmap a3 = hVar.a();
        if (a3 != null) {
            return a3;
        }
        c.a.a.b bVar = this.f2417c;
        if (bVar != null) {
            Bitmap a4 = bVar.a(hVar);
            if (a4 != null) {
                a(str, a4);
            }
            return a4;
        }
        String b2 = hVar.b();
        BitmapFactory.Options options = new BitmapFactory.Options();
        options.inScaled = true;
        options.inDensity = 160;
        if (!b2.startsWith("data:") || b2.indexOf("base64,") <= 0) {
            try {
                if (TextUtils.isEmpty(this.f2416b)) {
                    throw new IllegalStateException("You must set an images folder before loading an image. Set it with LottieComposition#setImagesFolder or LottieDrawable#setImagesFolder");
                }
                AssetManager assets = this.f2415a.getAssets();
                a2 = c.a.a.y.h.a(BitmapFactory.decodeStream(assets.open(this.f2416b + b2), null, options), hVar.e(), hVar.c());
            } catch (IOException e2) {
                e = e2;
                str2 = "Unable to open asset.";
                d.a(str2, e);
                return null;
            }
        } else {
            try {
                byte[] decode = Base64.decode(b2.substring(b2.indexOf(44) + 1), 0);
                a2 = BitmapFactory.decodeByteArray(decode, 0, decode.length, options);
            } catch (IllegalArgumentException e3) {
                e = e3;
                str2 = "data URL did not have correct base64 format.";
                d.a(str2, e);
                return null;
            }
        }
        a(str, a2);
        return a2;
    }

    public void a(c.a.a.b bVar) {
        this.f2417c = bVar;
    }

    public boolean a(Context context) {
        return (context == null && this.f2415a == null) || this.f2415a.equals(context);
    }
}
