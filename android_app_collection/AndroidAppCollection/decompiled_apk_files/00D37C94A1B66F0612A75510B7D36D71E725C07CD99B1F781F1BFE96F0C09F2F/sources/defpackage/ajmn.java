package defpackage;

import android.widget.ImageView;
/* compiled from: PG */
/* renamed from: ajmn  reason: default package */
/* loaded from: classes.dex */
public final class ajmn implements yyr {
    final /* synthetic */ ajmu a;
    final /* synthetic */ ajnc b;
    final /* synthetic */ avhn c;
    final /* synthetic */ ajnj d;
    public final /* synthetic */ ajmo e;

    public ajmn(ajmo ajmoVar, ajmu ajmuVar, ajnc ajncVar, avhn avhnVar, ajnj ajnjVar) {
        this.e = ajmoVar;
        this.a = ajmuVar;
        this.b = ajncVar;
        this.c = avhnVar;
        this.d = ajnjVar;
    }

    public final void a(ImageView imageView) {
        ajmw ajmwVar = this.a.h;
        if (ajmwVar != null) {
            ajmwVar.b(imageView);
        }
        this.b.c(imageView, this.a, this.c);
    }

    @Override // defpackage.yyr
    public final void d(ImageView imageView) {
        ajmu ajmuVar = this.a;
        ajmw ajmwVar = ajmuVar.h;
        int i = ajmuVar.e;
        if (i > 0) {
            this.d.g(i);
        }
        if (ajmwVar != null) {
            ajmwVar.a(imageView);
        }
        this.b.b(imageView, this.a, this.c);
    }

    @Override // defpackage.yyr
    public final void e(ImageView imageView) {
        ajmw ajmwVar = this.a.h;
        if (ajmwVar != null) {
            ajmwVar.c(imageView);
        }
        this.b.d(imageView, this.a, this.c);
    }

    @Override // defpackage.yyr
    public final void f(ImageView imageView) {
        ajmw ajmwVar = this.a.h;
        if (ajmwVar != null) {
            ajmwVar.b(imageView);
        }
        this.b.e(imageView, this.a, this.c);
    }

    @Override // defpackage.yyr
    public final void g() {
    }
}
