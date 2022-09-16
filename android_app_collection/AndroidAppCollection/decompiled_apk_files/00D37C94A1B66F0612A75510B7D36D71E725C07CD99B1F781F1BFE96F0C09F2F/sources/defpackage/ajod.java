package defpackage;

import android.content.Context;
import android.net.Uri;
import android.widget.ImageView;
import com.google.android.youtube.R;
import java.util.Locale;
import org.chromium.net.CellularSignalStrengthError;
/* compiled from: PG */
/* renamed from: ajod  reason: default package */
/* loaded from: classes.dex */
public final class ajod implements ajmy {
    final amqo b;
    public final azqb c;
    private final Context d;
    private final azqb e;
    private final amqo g;
    final amqo a = aqxo.i(adyd.u);
    private final ajnc f = new ajnc();
    private final ajoa h = new ajoa(this);

    public ajod(final Context context, azqb azqbVar, final azqb azqbVar2, azqb azqbVar3, azqb azqbVar4) {
        this.d = context;
        this.e = azqbVar;
        this.b = aqxo.i(new amqo() { // from class: ajny
            @Override // defpackage.amqo
            public final Object get() {
                azqb azqbVar5 = azqb.this;
                Context context2 = context;
                if (((apfc) azqbVar5.get()).y) {
                    return cgh.b(R.anim.fade_in_glide);
                }
                ajnx ajnxVar = new ajnx(context2);
                cgh cghVar = new cgh();
                cghVar.c(new cuj(ajnxVar));
                return cghVar;
            }
        });
        this.c = azqbVar2;
        this.g = aqxo.i(new ajnz(azqbVar2, azqbVar4, azqbVar3));
    }

    private final void p(ImageView imageView, avhn avhnVar, ajmu ajmuVar) {
        if (imageView == null) {
            return;
        }
        if (ajmuVar == null) {
            ajmuVar = ajmu.a;
        }
        if (!akel.A(avhnVar)) {
            e(imageView);
            int i = ajmuVar.e;
            if (i <= 0) {
                return;
            }
            imageView.setImageResource(i);
            return;
        }
        ajog ajogVar = new ajog(new ctu(imageView), ajmuVar, avhnVar, this.f, ajmuVar.h);
        Context context = imageView.getContext();
        if (ajmuVar == null) {
            ajmuVar = ajmu.a;
        }
        cgg a = this.h.a(context);
        if (a == null) {
            return;
        }
        cgd c = a.c();
        ctm ctmVar = new ctm();
        int i2 = ajmuVar.e;
        if (i2 > 0) {
            ctmVar.z(i2);
        }
        cgd d = c.l(ctmVar).k((cgh) (ajmuVar.d ? this.b : this.a).get()).d((ctl) this.g.get());
        if (avhnVar.c.size() == 1) {
            d.f(zgt.j(((avhm) avhnVar.c.get(0)).c));
        } else {
            d.h(avhnVar);
        }
        d.p(ajogVar);
    }

    @Override // defpackage.ajmy, defpackage.yys
    public final void a(Uri uri, yiw yiwVar) {
        b().a(uri, yiwVar);
    }

    @Override // defpackage.ajmy
    public final ajmr b() {
        return (ajmr) this.e.get();
    }

    @Override // defpackage.ajmy
    public final ajmu c() {
        return ajmu.a;
    }

    @Override // defpackage.ajmy
    public final void d(ajmx ajmxVar) {
        this.f.a(ajmxVar);
    }

    @Override // defpackage.ajmy
    public final void e(ImageView imageView) {
        cgg a;
        if (imageView == null || (a = this.h.a(imageView.getContext())) == null) {
            return;
        }
        a.i(imageView);
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
        p(imageView, avhnVar, null);
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
        if (akel.A(avhnVar)) {
            p(imageView, avhnVar, ajmuVar);
        } else {
            p(imageView, null, ajmuVar);
        }
    }

    @Override // defpackage.ajmy
    public final void l(Uri uri, yiw yiwVar) {
        b().a(uri, yiwVar);
    }

    @Override // defpackage.ajmy
    public final void m(Uri uri, yiw yiwVar) {
        b().g(uri, yiwVar);
    }

    @Override // defpackage.ajmy
    public final void o(ajmx ajmxVar) {
        this.f.f(ajmxVar);
    }

    @Override // defpackage.ajmy
    public final void n(avhn avhnVar, int i, int i2) {
        if (i <= 0 || i2 <= 0) {
            zep.b(String.format(Locale.ENGLISH, "ImageManager: cannot preload image. Invalid dimensions given: %d x %d", Integer.valueOf(i), Integer.valueOf(i2)));
        } else if (!akel.A(avhnVar)) {
            zep.b("ImageManager: cannot preload image with no model.");
        } else {
            cgg a = this.h.a(this.d);
            if (a == null) {
                return;
            }
            if (avhnVar.c.size() == 1) {
                a.b().f(zgt.j(((avhm) avhnVar.c.get(0)).c)).o(CellularSignalStrengthError.ERROR_NOT_SUPPORTED, CellularSignalStrengthError.ERROR_NOT_SUPPORTED);
            } else {
                a.f(avhnVar).o(i, i2);
            }
        }
    }
}
