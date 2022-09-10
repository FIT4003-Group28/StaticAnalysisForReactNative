package defpackage;

import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;
import com.google.android.apps.maps.R;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: atzi  reason: default package */
/* loaded from: classes2.dex */
public final class atzi {
    public final akuh a;
    public final akuh b;
    public final akuh c;
    public final akuh d;
    public final akuh e;
    public final akuh f;
    public final akuh g;
    public final akuh h;
    public final akuh i;
    public final dcdn<asti, akuh> j;
    private final akvz k;
    private final akuh l;
    private final akuh m;

    public atzi(Resources resources, akvz akvzVar, boolean z) {
        int color;
        this.k = akvzVar;
        dmqt dmqtVar = (dmqt) dmqx.e.bZ();
        dmoo dmooVar = (dmoo) dmop.h.bZ();
        if (dmooVar.c) {
            dmooVar.bF();
            dmooVar.c = false;
        }
        dmop dmopVar = (dmop) dmooVar.b;
        dmopVar.a |= 1;
        dmopVar.b = 0;
        dmpq bZ = dmpv.s.bZ();
        if (bZ.c) {
            bZ.bF();
            bZ.c = false;
        }
        dmpv dmpvVar = (dmpv) bZ.b;
        dmpvVar.a |= 1;
        dmpvVar.b = -16777216;
        dmoa bZ2 = dmob.g.bZ();
        if (bZ2.c) {
            bZ2.bF();
            bZ2.c = false;
        }
        dmob dmobVar = (dmob) bZ2.b;
        int i = dmobVar.a | 4;
        dmobVar.a = i;
        dmobVar.d = 100;
        dmobVar.a = i | 1;
        dmobVar.b = 14;
        if (bZ.c) {
            bZ.bF();
            bZ.c = false;
        }
        dmpv dmpvVar2 = (dmpv) bZ.b;
        dmob bK = bZ2.bK();
        bK.getClass();
        dmpvVar2.e = bK;
        dmpvVar2.a |= 4;
        if (dmooVar.c) {
            dmooVar.bF();
            dmooVar.c = false;
        }
        dmop dmopVar2 = (dmop) dmooVar.b;
        dmpv bK2 = bZ.bK();
        bK2.getClass();
        dmopVar2.d = bK2;
        dmopVar2.a |= 4;
        dmqtVar.a(dmooVar);
        this.a = akvzVar.c((dmqx) dmqtVar.bK());
        int color2 = z ? resources.getColor(R.color.callout_nightmode_background) : -1;
        dmqt dmqtVar2 = (dmqt) dmqx.e.bZ();
        dmoo dmooVar2 = (dmoo) dmop.h.bZ();
        if (dmooVar2.c) {
            dmooVar2.bF();
            dmooVar2.c = false;
        }
        dmop dmopVar3 = (dmop) dmooVar2.b;
        dmopVar3.a |= 1;
        dmopVar3.b = 0;
        dmpq bZ3 = dmpv.s.bZ();
        dmsr bZ4 = dmsu.u.bZ();
        if (bZ4.c) {
            bZ4.bF();
            bZ4.c = false;
        }
        dmsu dmsuVar = (dmsu) bZ4.b;
        int i2 = dmsuVar.a | 4;
        dmsuVar.a = i2;
        dmsuVar.d = color2;
        int i3 = i2 | 64;
        dmsuVar.a = i3;
        dmsuVar.j = 0;
        int i4 = i3 | 128;
        dmsuVar.a = i4;
        dmsuVar.k = 1;
        int i5 = i4 | 256;
        dmsuVar.a = i5;
        dmsuVar.l = 1493172224;
        int i6 = i5 | 512;
        dmsuVar.a = i6;
        dmsuVar.m = 16;
        int i7 = i6 | 8192;
        dmsuVar.a = i7;
        dmsuVar.s = 8.0f;
        dmsuVar.a = i7 | 16384;
        dmsuVar.t = 4.0f;
        dmsu dmsuVar2 = (dmsu) bZ4.b;
        dmsuVar2.o = 2;
        int i8 = dmsuVar2.a | 2048;
        dmsuVar2.a = i8;
        int i9 = i8 | 32;
        dmsuVar2.a = i9;
        dmsuVar2.g = 14;
        int i10 = i9 | 16;
        dmsuVar2.a = i10;
        dmsuVar2.f = 6;
        dmsuVar2.a = i10 | 1024;
        dmsuVar2.n = 16;
        bZ4.a(atzk.a);
        if (bZ3.c) {
            bZ3.bF();
            bZ3.c = false;
        }
        dmpv dmpvVar3 = (dmpv) bZ3.b;
        dmsu bK3 = bZ4.bK();
        bK3.getClass();
        dmpvVar3.f = bK3;
        dmpvVar3.a |= 8;
        if (dmooVar2.c) {
            dmooVar2.bF();
            dmooVar2.c = false;
        }
        dmop dmopVar4 = (dmop) dmooVar2.b;
        dmpv bK4 = bZ3.bK();
        bK4.getClass();
        dmopVar4.d = bK4;
        dmopVar4.a |= 4;
        dmqtVar2.a(dmooVar2);
        this.b = akvzVar.c((dmqx) dmqtVar2.bK());
        this.c = b(resources, akvzVar, z ? R.color.quantum_greywhite1000 : R.color.qu_black_alpha_87);
        int i11 = R.color.qu_google_red_500;
        this.d = b(resources, akvzVar, R.color.qu_google_red_500);
        this.e = c(resources, akvzVar, true != z ? R.color.qu_black_alpha_54 : R.color.quantum_grey);
        this.f = c(resources, akvzVar, R.color.qu_orange_800);
        this.g = c(resources, akvzVar, true == z ? R.color.quantum_grey : i11);
        Drawable drawable = resources.getDrawable(2131232584);
        if (z) {
            color = resources.getColor(R.color.quantum_grey);
        } else {
            color = resources.getColor(R.color.qu_grey_600);
        }
        drawable.setColorFilter(new PorterDuffColorFilter(color, PorterDuff.Mode.SRC_IN));
        int ceil = (int) Math.ceil(resources.getDisplayMetrics().density * 16.0f);
        Bitmap createBitmap = Bitmap.createBitmap(ceil, ceil, Bitmap.Config.ARGB_8888);
        createBitmap.setDensity(resources.getDisplayMetrics().densityDpi);
        Canvas canvas = new Canvas(createBitmap);
        drawable.setBounds(0, 0, canvas.getWidth(), canvas.getHeight());
        drawable.draw(canvas);
        this.h = akvzVar.d(createBitmap);
        akuh e = e(akvzVar, resources, z, asti.FULL);
        this.l = e;
        akuh e2 = e(akvzVar, resources, z, asti.HALF);
        this.m = e2;
        akuh e3 = e(akvzVar, resources, z, asti.EMPTY);
        this.i = e3;
        this.j = dcdn.m(asti.FULL, e, asti.HALF, e2, asti.EMPTY, e3);
    }

    private static akuh b(Resources resources, akvz akvzVar, int i) {
        return d(resources, akvzVar, i, 1);
    }

    private static akuh c(Resources resources, akvz akvzVar, int i) {
        return d(resources, akvzVar, i, 0);
    }

    private static akuh d(Resources resources, akvz akvzVar, int i, int i2) {
        dmqt dmqtVar = (dmqt) dmqx.e.bZ();
        dmoo dmooVar = (dmoo) dmop.h.bZ();
        if (dmooVar.c) {
            dmooVar.bF();
            dmooVar.c = false;
        }
        dmop dmopVar = (dmop) dmooVar.b;
        dmopVar.a |= 1;
        dmopVar.b = 0;
        dmpq bZ = dmpv.s.bZ();
        int color = resources.getColor(i);
        if (bZ.c) {
            bZ.bF();
            bZ.c = false;
        }
        dmpv dmpvVar = (dmpv) bZ.b;
        int i3 = dmpvVar.a | 1;
        dmpvVar.a = i3;
        dmpvVar.b = color;
        dmpvVar.a = i3 | 2;
        dmpvVar.c = 0;
        dmoa bZ2 = dmob.g.bZ();
        if (bZ2.c) {
            bZ2.bF();
            bZ2.c = false;
        }
        dmob dmobVar = (dmob) bZ2.b;
        int i4 = dmobVar.a | 2;
        dmobVar.a = i4;
        dmobVar.c = i2;
        int i5 = i4 | 1;
        dmobVar.a = i5;
        dmobVar.b = 16;
        int i6 = i5 | 32;
        dmobVar.a = i6;
        dmobVar.f = 22;
        int i7 = i6 | 4;
        dmobVar.a = i7;
        dmobVar.d = 100;
        dmobVar.a = i7 | 8;
        dmobVar.e = 0;
        if (bZ.c) {
            bZ.bF();
            bZ.c = false;
        }
        dmpv dmpvVar2 = (dmpv) bZ.b;
        dmob bK = bZ2.bK();
        bK.getClass();
        dmpvVar2.e = bK;
        dmpvVar2.a |= 4;
        if (dmooVar.c) {
            dmooVar.bF();
            dmooVar.c = false;
        }
        dmop dmopVar2 = (dmop) dmooVar.b;
        dmpv bK2 = bZ.bK();
        bK2.getClass();
        dmopVar2.d = bK2;
        dmopVar2.a |= 4;
        dmqtVar.a(dmooVar);
        return akvzVar.c((dmqx) dmqtVar.bK());
    }

    private static akuh e(akvz akvzVar, Resources resources, boolean z, asti astiVar) {
        return akvzVar.d(astiVar.a(resources, z));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void a() {
        this.k.j(this.a);
        this.k.j(this.b);
        this.k.j(this.c);
        this.k.j(this.d);
        this.k.j(this.e);
        this.k.j(this.f);
        this.k.j(this.g);
        this.k.j(this.h);
        this.k.j(this.l);
        this.k.j(this.m);
        this.k.j(this.i);
    }
}
