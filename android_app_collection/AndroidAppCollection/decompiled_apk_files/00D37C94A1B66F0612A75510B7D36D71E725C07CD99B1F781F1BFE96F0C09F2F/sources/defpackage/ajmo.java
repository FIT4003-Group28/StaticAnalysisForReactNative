package defpackage;

import android.net.Uri;
import android.widget.ImageView;
import com.google.android.youtube.R;
import java.util.Iterator;
import java.util.Locale;
/* compiled from: PG */
/* renamed from: ajmo  reason: default package */
/* loaded from: classes.dex */
public final class ajmo implements ajmy {
    public static final yyj a = new yyj();
    private static final yiw c = new joq(4);
    public final boolean b;
    private final ajmr d;
    private final ajnc e;
    private final ajmu f;
    private final aacz g;

    public ajmo(ajmr ajmrVar, apfc apfcVar, ajmu ajmuVar, aacz aaczVar) {
        ajmrVar.getClass();
        this.d = ajmrVar;
        this.e = new ajnc();
        this.f = ajmuVar;
        this.b = apfcVar.h;
        this.g = aaczVar;
    }

    static final ajnj p(ImageView imageView) {
        return (ajnj) imageView.getTag(R.id.image_view_controller_tag);
    }

    private final ajmn q(ajnj ajnjVar, ajmu ajmuVar, avhn avhnVar, ajnc ajncVar) {
        if (ajmuVar.h != null || ajmuVar.e > 0 || !ajncVar.g()) {
            return new ajmn(this, ajmuVar, ajncVar, avhnVar, ajnjVar);
        }
        return null;
    }

    private static final yyo r(ajnj ajnjVar, ImageView imageView, ajmu ajmuVar) {
        boolean z = ajmuVar.d;
        if (ajnjVar == null || ajnjVar.c.c() != z) {
            return z ? new yyq(imageView.getContext()) : a;
        }
        return ajnjVar.c;
    }

    @Override // defpackage.ajmy, defpackage.yys
    public final void a(Uri uri, yiw yiwVar) {
        this.d.a(uri, yiwVar);
    }

    @Override // defpackage.ajmy
    public final ajmr b() {
        return this.d;
    }

    @Override // defpackage.ajmy
    public final ajmu c() {
        return this.f;
    }

    @Override // defpackage.ajmy
    public final void d(ajmx ajmxVar) {
        this.e.a(ajmxVar);
    }

    @Override // defpackage.ajmy
    public final void e(ImageView imageView) {
        ajnj p;
        if (imageView == null || (p = p(imageView)) == null) {
            return;
        }
        p.a();
    }

    @Override // defpackage.ajmy
    public final void f() {
    }

    @Override // defpackage.ajmy
    public final void g(ImageView imageView, Uri uri) {
        i(imageView, uri, null);
    }

    @Override // defpackage.ajmy
    public final void h(ImageView imageView, avhn avhnVar) {
        k(imageView, avhnVar, null);
    }

    @Override // defpackage.ajmy
    public final void i(ImageView imageView, Uri uri, ajmu ajmuVar) {
        k(imageView, akel.z(uri), ajmuVar);
    }

    @Override // defpackage.ajmy
    @Deprecated
    public final void j(ImageView imageView, aalc aalcVar, ajmu ajmuVar) {
        k(imageView, aalcVar.e(), ajmuVar);
    }

    @Override // defpackage.ajmy
    public final void k(ImageView imageView, avhn avhnVar, ajmu ajmuVar) {
        boolean z;
        if (imageView == null) {
            return;
        }
        if (ajmuVar == null) {
            ajmuVar = this.f;
        }
        ajnj p = p(imageView);
        if (p == null) {
            p = new ajnj(this.d, r(null, imageView, ajmuVar), null, imageView, ajmuVar.c, this.g);
            imageView.setTag(R.id.image_view_controller_tag, p);
        } else {
            p.b.c(ajmuVar.c);
            p.f(r(p, imageView, ajmuVar));
            p.h(null);
        }
        if (avhnVar == null || !akel.A(avhnVar)) {
            int i = ajmuVar.e;
            if (i > 0) {
                p.g(i);
                return;
            } else {
                p.a();
                return;
            }
        }
        int i2 = ajmuVar.j;
        if (i2 == 2 || i2 == 3) {
            Iterator it = avhnVar.c.iterator();
            while (true) {
                if (!it.hasNext()) {
                    z = false;
                    break;
                }
                Uri parse = Uri.parse(((avhm) it.next()).c);
                if (this.d.h(parse)) {
                    p.m(akel.z(parse), ajmuVar.f, ajmuVar.g, q(p, ajmuVar, avhnVar, this.e));
                    z = true;
                    break;
                }
            }
            if (ajmuVar.j == 2 || z) {
                return;
            }
        }
        p.m(avhnVar, ajmuVar.f, ajmuVar.g, q(p, ajmuVar, avhnVar, this.e));
    }

    @Override // defpackage.ajmy
    public final void l(Uri uri, yiw yiwVar) {
        this.d.a(uri, yiwVar);
    }

    @Override // defpackage.ajmy
    public final void m(Uri uri, yiw yiwVar) {
        this.d.g(uri, yiwVar);
    }

    @Override // defpackage.ajmy
    public final void o(ajmx ajmxVar) {
        this.e.f(ajmxVar);
    }

    @Override // defpackage.ajmy
    public final void n(avhn avhnVar, int i, int i2) {
        if (i <= 0 || i2 <= 0) {
            zep.b(String.format(Locale.ENGLISH, "ImageManager: cannot preload image. Invalid dimensions given: %d x %d", Integer.valueOf(i), Integer.valueOf(i2)));
            return;
        }
        Uri r = akel.r(avhnVar, i, i2);
        if (r == null) {
            zep.b("ImageManager: cannot preload image with null uri.");
        } else {
            this.d.a(r, c);
        }
    }
}
