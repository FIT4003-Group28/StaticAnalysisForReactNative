package c.d.h.f;

import android.content.res.Resources;
import android.graphics.PointF;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.NinePatchDrawable;
import android.os.Build;
import c.d.d.d.i;
import c.d.h.e.h;
import c.d.h.e.k;
import c.d.h.e.l;
import c.d.h.e.m;
import c.d.h.e.n;
import c.d.h.e.p;
import c.d.h.e.q;
import c.d.h.e.r;
import c.d.h.f.d;
/* loaded from: classes.dex */
public class e {

    /* renamed from: a  reason: collision with root package name */
    private static final Drawable f3113a = new ColorDrawable(0);

    /* JADX INFO: Access modifiers changed from: package-private */
    public static Drawable a(Drawable drawable, r.b bVar) {
        return a(drawable, bVar, (PointF) null);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static Drawable a(Drawable drawable, r.b bVar, PointF pointF) {
        if (c.d.j.p.b.c()) {
            c.d.j.p.b.a("WrappingUtils#maybeWrapWithScaleType");
        }
        if (drawable == null || bVar == null) {
            if (c.d.j.p.b.c()) {
                c.d.j.p.b.a();
            }
            return drawable;
        }
        q qVar = new q(drawable, bVar);
        if (pointF != null) {
            qVar.a(pointF);
        }
        if (c.d.j.p.b.c()) {
            c.d.j.p.b.a();
        }
        return qVar;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static Drawable a(Drawable drawable, d dVar) {
        try {
            if (c.d.j.p.b.c()) {
                c.d.j.p.b.a("WrappingUtils#maybeWrapWithRoundedOverlayColor");
            }
            if (drawable != null && dVar != null && dVar.h() == d.a.OVERLAY_COLOR) {
                n nVar = new n(drawable);
                a((k) nVar, dVar);
                nVar.a(dVar.d());
                return nVar;
            }
            if (c.d.j.p.b.c()) {
                c.d.j.p.b.a();
            }
            return drawable;
        } finally {
            if (c.d.j.p.b.c()) {
                c.d.j.p.b.a();
            }
        }
    }

    private static Drawable a(Drawable drawable, d dVar, Resources resources) {
        if (drawable instanceof BitmapDrawable) {
            BitmapDrawable bitmapDrawable = (BitmapDrawable) drawable;
            l lVar = new l(resources, bitmapDrawable.getBitmap(), bitmapDrawable.getPaint());
            a((k) lVar, dVar);
            return lVar;
        } else if (drawable instanceof NinePatchDrawable) {
            p pVar = new p((NinePatchDrawable) drawable);
            a((k) pVar, dVar);
            return pVar;
        } else if (!(drawable instanceof ColorDrawable) || Build.VERSION.SDK_INT < 11) {
            c.d.d.e.a.c("WrappingUtils", "Don't know how to round that drawable: %s", drawable);
            return drawable;
        } else {
            m a2 = m.a((ColorDrawable) drawable);
            a((k) a2, dVar);
            return a2;
        }
    }

    static c.d.h.e.d a(c.d.h.e.d dVar) {
        while (true) {
            Drawable a2 = dVar.a();
            if (a2 == dVar || !(a2 instanceof c.d.h.e.d)) {
                break;
            }
            dVar = (c.d.h.e.d) a2;
        }
        return dVar;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static q a(c.d.h.e.d dVar, r.b bVar) {
        Drawable a2 = a(dVar.a(f3113a), bVar);
        dVar.a(a2);
        i.a(a2, "Parent has no child drawable!");
        return (q) a2;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void a(c.d.h.e.d dVar, d dVar2) {
        Drawable a2 = dVar.a();
        if (dVar2 == null || dVar2.h() != d.a.OVERLAY_COLOR) {
            if (!(a2 instanceof n)) {
                return;
            }
            dVar.a(((n) a2).b(f3113a));
            f3113a.setCallback(null);
        } else if (!(a2 instanceof n)) {
            dVar.a(a(dVar.a(f3113a), dVar2));
        } else {
            n nVar = (n) a2;
            a((k) nVar, dVar2);
            nVar.a(dVar2.d());
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void a(c.d.h.e.d dVar, d dVar2, Resources resources) {
        c.d.h.e.d a2 = a(dVar);
        Drawable a3 = a2.a();
        if (dVar2 == null || dVar2.h() != d.a.BITMAP_ONLY) {
            if (!(a3 instanceof k)) {
                return;
            }
            a((k) a3);
        } else if (a3 instanceof k) {
            a((k) a3, dVar2);
        } else if (a3 == null) {
        } else {
            a2.a(f3113a);
            a2.a(a(a3, dVar2, resources));
        }
    }

    static void a(k kVar) {
        kVar.a(false);
        kVar.b(0.0f);
        kVar.a(0, 0.0f);
        kVar.a(0.0f);
        kVar.c(false);
        kVar.b(false);
    }

    static void a(k kVar, d dVar) {
        kVar.a(dVar.g());
        kVar.a(dVar.c());
        kVar.a(dVar.a(), dVar.b());
        kVar.a(dVar.e());
        kVar.c(dVar.i());
        kVar.b(dVar.f());
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static Drawable b(Drawable drawable, d dVar, Resources resources) {
        try {
            if (c.d.j.p.b.c()) {
                c.d.j.p.b.a("WrappingUtils#maybeApplyLeafRounding");
            }
            if (drawable != null && dVar != null && dVar.h() == d.a.BITMAP_ONLY) {
                if (drawable instanceof h) {
                    c.d.h.e.d a2 = a((h) drawable);
                    a2.a(a(a2.a(f3113a), dVar, resources));
                    return drawable;
                }
                Drawable a3 = a(drawable, dVar, resources);
                if (c.d.j.p.b.c()) {
                    c.d.j.p.b.a();
                }
                return a3;
            }
            if (c.d.j.p.b.c()) {
                c.d.j.p.b.a();
            }
            return drawable;
        } finally {
            if (c.d.j.p.b.c()) {
                c.d.j.p.b.a();
            }
        }
    }
}
