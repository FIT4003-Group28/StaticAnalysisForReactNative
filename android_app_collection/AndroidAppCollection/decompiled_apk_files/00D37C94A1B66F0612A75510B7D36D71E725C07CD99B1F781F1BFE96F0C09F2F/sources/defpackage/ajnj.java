package defpackage;

import android.net.Uri;
import android.widget.ImageView;
/* compiled from: PG */
/* renamed from: ajnj  reason: default package */
/* loaded from: classes.dex */
public final class ajnj {
    private static final ajmv e = ajnh.a;
    public final ImageView a;
    public final ajni b;
    public yyo c;
    public yyn d;
    private final yys f;
    private final int g;
    private ajmv h;
    private avhn i;
    private Uri j;

    public ajnj(yys yysVar, ImageView imageView) {
        this(yysVar, imageView, false);
    }

    public final void a() {
        b();
        this.a.setImageDrawable(null);
    }

    public final void b() {
        yyt.a(this.a);
        this.b.b();
        this.d = null;
        this.i = null;
        this.j = null;
    }

    public final void c(Uri uri, yyr yyrVar, yyn yynVar) {
        yyt.c(this.f, yynVar, this.c, uri, this.a, yyrVar);
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0026  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0028  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0039  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x003b  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x007d  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0081  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void d(defpackage.yyr r8, defpackage.yyn r9, int r10) {
        /*
            r7 = this;
            avhn r0 = r7.i
            if (r0 != 0) goto L5
            return
        L5:
            android.widget.ImageView r0 = r7.a
            int r0 = r0.getWidth()
            android.widget.ImageView r1 = r7.a
            int r1 = r1.getHeight()
            r2 = 0
            r3 = 1
            if (r0 == 0) goto L18
            if (r1 != 0) goto L22
            r1 = 0
        L18:
            avhn r4 = r7.i
            aopu r4 = r4.c
            int r4 = r4.size()
            if (r4 != r3) goto L8c
        L22:
            avhn r4 = r7.i
            if (r0 < 0) goto L28
            r5 = 1
            goto L29
        L28:
            r5 = 0
        L29:
            defpackage.aqxo.p(r5)
            if (r1 < 0) goto L2f
            r2 = 1
        L2f:
            defpackage.aqxo.p(r2)
            boolean r2 = defpackage.akel.A(r4)
            r5 = 0
            if (r2 != 0) goto L3b
            r10 = r5
            goto L60
        L3b:
            java.util.ArrayList r2 = new java.util.ArrayList
            aopu r6 = r4.c
            r2.<init>(r6)
            ahdo r6 = defpackage.ahdo.c
            java.util.Collections.sort(r2, r6)
            avhm r0 = defpackage.akel.w(r4, r0, r1)
            int r0 = r2.indexOf(r0)
            int r0 = r0 + r10
            int r10 = r2.size()
            int r10 = r10 + (-1)
            int r10 = java.lang.Math.min(r0, r10)
            java.lang.Object r10 = r2.get(r10)
            avhm r10 = (defpackage.avhm) r10
        L60:
            if (r10 == 0) goto L6e
            int r0 = r10.b
            r0 = r0 & r3
            if (r0 == 0) goto L6e
            java.lang.String r10 = r10.c
            android.net.Uri r10 = defpackage.zgt.j(r10)
            goto L6f
        L6e:
            r10 = r5
        L6f:
            if (r10 == 0) goto L79
            android.net.Uri r0 = r7.j
            boolean r0 = r10.equals(r0)
            if (r0 != 0) goto L86
        L79:
            r7.j = r10
            if (r10 == 0) goto L81
            r7.c(r10, r8, r9)
            goto L86
        L81:
            android.widget.ImageView r8 = r7.a
            r8.setImageDrawable(r5)
        L86:
            ajni r8 = r7.b
            r8.b()
            return
        L8c:
            ajni r9 = r7.b
            r9.a(r8)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ajnj.d(yyr, yyn, int):void");
    }

    public final void e(int i) {
        this.a.setBackgroundResource(i);
    }

    public final void f(yyo yyoVar) {
        yyoVar.getClass();
        this.c = yyoVar;
    }

    public final void g(int i) {
        b();
        this.a.setImageResource(i);
    }

    public final void h(ajmv ajmvVar) {
        if (ajmvVar == null) {
            ajmvVar = e;
        }
        this.h = ajmvVar;
    }

    public final void i(ImageView.ScaleType scaleType) {
        this.a.setScaleType(scaleType);
    }

    @Deprecated
    public final void j(aalc aalcVar) {
        m(aalcVar != null ? aalcVar.e() : null, true, true, null);
    }

    public final void k(avhn avhnVar) {
        m(avhnVar, true, true, null);
    }

    public final void l(avhn avhnVar, yyr yyrVar) {
        m(avhnVar, true, true, yyrVar);
    }

    public final void m(avhn avhnVar, boolean z, boolean z2, yyr yyrVar) {
        if (avhnVar != this.i) {
            this.d = this.h.a();
            this.i = avhnVar;
            this.j = null;
            if (z) {
                this.a.setImageDrawable(null);
            }
            this.b.b();
        }
        if (!akel.A(avhnVar)) {
            return;
        }
        if (this.b.a || !this.a.isLayoutRequested() || !z2) {
            d(yyrVar, this.d, this.g);
        } else {
            this.b.a(yyrVar);
        }
    }

    public final void n() {
        this.a.setBackground(null);
    }

    public final void o() {
        this.a.setVisibility(8);
    }

    public ajnj(yys yysVar, ImageView imageView, boolean z) {
        this(yysVar, new yyq(imageView.getContext()), imageView, z);
    }

    public ajnj(yys yysVar, yyo yyoVar, ImageView imageView, boolean z) {
        this(yysVar, yyoVar, e, imageView, z);
    }

    public ajnj(yys yysVar, yyo yyoVar, ajmv ajmvVar, ImageView imageView, boolean z) {
        this(yysVar, yyoVar, ajmvVar, imageView, z, null);
    }

    public ajnj(yys yysVar, yyo yyoVar, ajmv ajmvVar, ImageView imageView, boolean z, aacz aaczVar) {
        yysVar.getClass();
        this.f = yysVar;
        imageView.getClass();
        this.a = imageView;
        int i = 0;
        if (aaczVar != null && aaczVar.b() != null && (aaczVar.b().b & 67108864) != 0) {
            aveq aveqVar = aaczVar.b().u;
            i = (aveqVar == null ? aveq.a : aveqVar).j;
            this.g = i;
        } else {
            this.g = 0;
        }
        this.b = new ajni(this, z, i);
        f(yyoVar);
        h(ajmvVar);
    }
}
