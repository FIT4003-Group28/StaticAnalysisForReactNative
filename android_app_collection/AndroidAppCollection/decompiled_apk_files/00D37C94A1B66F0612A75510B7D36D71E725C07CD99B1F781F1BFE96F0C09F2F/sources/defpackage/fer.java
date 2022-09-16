package defpackage;

import android.graphics.Bitmap;
import android.util.LruCache;
import android.widget.ImageView;
import java.util.HashMap;
import java.util.Map;
/* compiled from: PG */
/* renamed from: fer  reason: default package */
/* loaded from: classes3.dex */
public final class fer {
    public final yni a;
    public final Map b;
    public final LruCache c;
    public final boolean d;

    public fer(yni yniVar, yme ymeVar) {
        HashMap hashMap = new HashMap();
        LruCache lruCache = new LruCache(5);
        yniVar.getClass();
        this.a = yniVar;
        this.b = hashMap;
        this.c = lruCache;
        this.d = ymeVar.b().t;
    }

    public final Bitmap a(String str) {
        if (!this.d) {
            return (Bitmap) this.c.get(str);
        }
        return null;
    }

    public final fep b(String str) {
        return (fep) this.b.get(str);
    }

    public final void c(String str, long j, Bitmap bitmap, ImageView.ScaleType scaleType) {
        fep fepVar = new fep(j, scaleType);
        this.b.put(str, fepVar);
        if (!this.d) {
            if (bitmap != null) {
                this.c.put(str, bitmap);
            } else {
                this.c.remove(str);
            }
        }
        this.a.f(new feq(str, fepVar));
    }

    public final void d(String str, long j) {
        c(str, j, null, ImageView.ScaleType.FIT_CENTER);
    }
}
