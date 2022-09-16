package com.facebook.f.f;

import android.content.res.Resources;
import android.graphics.Matrix;
import android.graphics.PointF;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.os.Build;
import com.facebook.common.d.i;
import com.facebook.f.e.g;
import com.facebook.f.e.h;
import com.facebook.f.e.j;
import com.facebook.f.e.k;
import com.facebook.f.e.l;
import com.facebook.f.e.m;
import com.facebook.f.e.n;
import com.facebook.f.e.o;
import com.facebook.f.f.d;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
/* compiled from: WrappingUtils.java */
/* loaded from: classes.dex */
public class e {

    /* renamed from: a  reason: collision with root package name */
    private static final Drawable f2472a = new ColorDrawable(0);

    /* JADX INFO: Access modifiers changed from: package-private */
    public static Drawable a(Drawable drawable, o.b bVar) {
        return a(drawable, bVar, (PointF) null);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static Drawable a(Drawable drawable, o.b bVar, PointF pointF) {
        if (drawable == null || bVar == null) {
            return drawable;
        }
        n nVar = new n(drawable, bVar);
        if (pointF != null) {
            nVar.a(pointF);
        }
        return nVar;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static Drawable a(Drawable drawable, Matrix matrix) {
        return (drawable == null || matrix == null) ? drawable : new h(drawable, matrix);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static n a(com.facebook.f.e.c cVar, o.b bVar) {
        Drawable a2 = a(cVar.a(f2472a), bVar);
        cVar.a(a2);
        i.a(a2, "Parent has no child drawable!");
        return (n) a2;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void a(com.facebook.f.e.c cVar, d dVar) {
        Drawable a2 = cVar.a();
        if (dVar != null && dVar.c() == d.a.OVERLAY_COLOR) {
            if (a2 instanceof m) {
                m mVar = (m) a2;
                a((j) mVar, dVar);
                mVar.a(dVar.d());
                return;
            }
            cVar.a(a(cVar.a(f2472a), dVar));
        } else if (!(a2 instanceof m)) {
        } else {
            cVar.a(((m) a2).b(f2472a));
            f2472a.setCallback(null);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void a(com.facebook.f.e.c cVar, d dVar, Resources resources) {
        com.facebook.f.e.c a2 = a(cVar);
        Drawable a3 = a2.a();
        if (dVar != null && dVar.c() == d.a.BITMAP_ONLY) {
            if (a3 instanceof j) {
                a((j) a3, dVar);
            } else if (a3 == null) {
            } else {
                a2.a(f2472a);
                a2.a(b(a3, dVar, resources));
            }
        } else if (!(a3 instanceof j)) {
        } else {
            a((j) a3);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static Drawable a(Drawable drawable, d dVar) {
        if (drawable == null || dVar == null || dVar.c() != d.a.OVERLAY_COLOR) {
            return drawable;
        }
        m mVar = new m(drawable);
        a((j) mVar, dVar);
        mVar.a(dVar.d());
        return mVar;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static Drawable a(Drawable drawable, d dVar, Resources resources) {
        if (drawable == null || dVar == null || dVar.c() != d.a.BITMAP_ONLY) {
            return drawable;
        }
        if (drawable instanceof g) {
            com.facebook.f.e.c a2 = a((g) drawable);
            a2.a(b(a2.a(f2472a), dVar, resources));
            return drawable;
        }
        return b(drawable, dVar, resources);
    }

    private static Drawable b(Drawable drawable, d dVar, Resources resources) {
        if (drawable instanceof BitmapDrawable) {
            BitmapDrawable bitmapDrawable = (BitmapDrawable) drawable;
            k kVar = new k(resources, bitmapDrawable.getBitmap(), bitmapDrawable.getPaint());
            a((j) kVar, dVar);
            return kVar;
        } else if (!(drawable instanceof ColorDrawable) || Build.VERSION.SDK_INT < 11) {
            return drawable;
        } else {
            l a2 = l.a((ColorDrawable) drawable);
            a((j) a2, dVar);
            return a2;
        }
    }

    static void a(j jVar, d dVar) {
        jVar.a(dVar.a());
        jVar.a(dVar.b());
        jVar.a(dVar.f(), dVar.e());
        jVar.b(dVar.g());
    }

    static void a(j jVar) {
        jVar.a(false);
        jVar.a(BitmapDescriptorFactory.HUE_RED);
        jVar.a(0, BitmapDescriptorFactory.HUE_RED);
        jVar.b(BitmapDescriptorFactory.HUE_RED);
    }

    static com.facebook.f.e.c a(com.facebook.f.e.c cVar) {
        while (true) {
            Drawable a2 = cVar.a();
            if (a2 == cVar || !(a2 instanceof com.facebook.f.e.c)) {
                break;
            }
            cVar = (com.facebook.f.e.c) a2;
        }
        return cVar;
    }
}
