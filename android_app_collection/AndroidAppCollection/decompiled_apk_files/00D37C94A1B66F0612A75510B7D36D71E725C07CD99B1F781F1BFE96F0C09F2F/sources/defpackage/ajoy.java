package defpackage;

import android.widget.ImageView;
import j$.util.concurrent.ConcurrentHashMap;
import java.util.Map;
/* compiled from: PG */
/* renamed from: ajoy  reason: default package */
/* loaded from: classes.dex */
public abstract class ajoy implements ajmx {
    final int a;
    private final ajmy b;
    private final akcq c;
    private final int d;
    private final int e;
    private final boolean f;
    private final boolean g;
    private final akvm h;
    private int j;
    private final Map i = new ConcurrentHashMap();
    private boolean k = false;

    /* JADX INFO: Access modifiers changed from: protected */
    public ajoy(ajmy ajmyVar, akcq akcqVar, int i, int i2, int i3, boolean z, boolean z2, akvm akvmVar) {
        this.b = ajmyVar;
        this.c = akcqVar;
        this.a = i;
        this.d = i2;
        this.e = i3;
        this.f = z;
        this.h = akvmVar;
        this.g = z2;
    }

    private final void m(ImageView imageView) {
        this.i.remove(imageView);
        if (!this.i.isEmpty() || this.j < this.d) {
            return;
        }
        if (this.f || this.g) {
            a();
        } else {
            l();
        }
    }

    public abstract void a();

    @Override // defpackage.ajmx
    public final void b(ImageView imageView, ajmu ajmuVar, avhn avhnVar) {
        akvm akvmVar;
        Integer num = (Integer) this.i.get(imageView);
        if (num != null) {
            g(new ajpv(num.intValue()));
            m(imageView);
        }
        if (!this.f || (akvmVar = this.h) == null) {
            return;
        }
        int i = this.a;
        if (i == 1) {
            akvmVar.e("HOME");
        } else if (i == 2) {
            akvmVar.e("SEARCH");
        } else if (i == 4) {
            akvmVar.e("TRENDING");
        } else if (i == 5) {
            akvmVar.e("SUBS");
        } else {
            akvmVar.e("UNKNOWN");
        }
    }

    @Override // defpackage.ajmx
    public final void c(ImageView imageView, ajmu ajmuVar, avhn avhnVar) {
        Integer num = (Integer) this.i.get(imageView);
        if (num != null) {
            f(new ajpu(num.intValue()));
            m(imageView);
        }
    }

    @Override // defpackage.ajmx
    public final void d(ImageView imageView, ajmu ajmuVar, avhn avhnVar) {
        ajnb ajnbVar;
        avhm y = akel.y(avhnVar);
        int i = 0;
        int i2 = y != null ? y.d : 0;
        if (!this.k || this.j >= this.d) {
            return;
        }
        if (i2 < this.e && imageView.getWidth() < this.e) {
            return;
        }
        this.i.put(imageView, Integer.valueOf(this.j));
        if (ajmuVar != null && (ajnbVar = ajmuVar.i) != null) {
            i = ajnbVar.a;
        }
        i(new ajpx(i, this.j));
        this.j++;
    }

    @Override // defpackage.ajmx
    public final void e(ImageView imageView, ajmu ajmuVar, avhn avhnVar) {
        akvm akvmVar;
        Integer num = (Integer) this.i.get(imageView);
        if (num != null) {
            h(new ajpw(num.intValue()));
            m(imageView);
        }
        if (!this.g || (akvmVar = this.h) == null) {
            return;
        }
        int i = this.a;
        if (i == 1) {
            akvmVar.d("HOME");
        } else if (i == 2) {
            akvmVar.d("SEARCH");
        } else if (i == 4) {
            akvmVar.d("TRENDING");
        } else if (i == 5) {
            akvmVar.d("SUBS");
        } else {
            akvmVar.d("UNKNOWN");
        }
    }

    public abstract void f(ajpu ajpuVar);

    public abstract void g(ajpv ajpvVar);

    public abstract void h(ajpw ajpwVar);

    public abstract void i(ajpx ajpxVar);

    public abstract void j();

    public final void k() {
        j();
        this.i.clear();
        this.j = 0;
        akcq akcqVar = this.c;
        if (akcqVar != null) {
            akcqVar.a(this);
        }
        this.b.d(this);
        this.k = true;
    }

    public final void l() {
        if (this.k) {
            a();
            akcq akcqVar = this.c;
            if (akcqVar != null) {
                akcqVar.b(this);
            }
            this.b.o(this);
            this.i.clear();
            this.k = false;
        }
    }
}
