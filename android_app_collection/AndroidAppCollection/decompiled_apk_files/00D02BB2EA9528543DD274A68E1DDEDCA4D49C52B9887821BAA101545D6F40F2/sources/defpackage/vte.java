package defpackage;

import android.content.res.Resources;
import android.graphics.drawable.BitmapDrawable;
import com.google.android.apps.maps.R;
/* compiled from: PG */
/* renamed from: vte  reason: default package */
/* loaded from: classes7.dex */
final class vte {
    static final dcdc<dmlo> a = dcdc.i(dmlo.BOTTOM_RIGHT, dmlo.BOTTOM_LEFT, dmlo.TOP_RIGHT, dmlo.TOP_LEFT);
    public final akvz b;
    public final akuh c;
    public final akuh d;
    public final akuh e;
    public final akuh f;
    public final akuh g;
    public final akuh h;
    public final akuh i;

    public vte(Resources resources, akvz akvzVar) {
        this.b = akvzVar;
        this.e = akvzVar.d(((BitmapDrawable) resources.getDrawable(2131232764)).getBitmap());
        this.f = a(resources, akvzVar, false);
        this.g = a(resources, akvzVar, true);
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
        int color = resources.getColor(R.color.quantum_googblue);
        if (bZ.c) {
            bZ.bF();
            bZ.c = false;
        }
        dmpv dmpvVar = (dmpv) bZ.b;
        int i = dmpvVar.a | 1;
        dmpvVar.a = i;
        dmpvVar.b = color;
        dmpvVar.a = i | 2;
        dmpvVar.c = 0;
        dmoa bZ2 = dmob.g.bZ();
        if (bZ2.c) {
            bZ2.bF();
            bZ2.c = false;
        }
        dmob dmobVar = (dmob) bZ2.b;
        int i2 = dmobVar.a | 4;
        dmobVar.a = i2;
        dmobVar.d = 100;
        int i3 = i2 | 1;
        dmobVar.a = i3;
        dmobVar.b = 14;
        int i4 = i3 | 2;
        dmobVar.a = i4;
        dmobVar.c = 8;
        dmobVar.a = i4 | 32;
        dmobVar.f = 5;
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
        this.h = akvzVar.c((dmqx) dmqtVar.bK());
        this.c = b(resources, akvzVar, false);
        this.d = b(resources, akvzVar, true);
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
        if (bZ3.c) {
            bZ3.bF();
            bZ3.c = false;
        }
        dmpv dmpvVar3 = (dmpv) bZ3.b;
        dmpvVar3.a |= 1;
        dmpvVar3.b = -16777216;
        dmoa bZ4 = dmob.g.bZ();
        if (bZ4.c) {
            bZ4.bF();
            bZ4.c = false;
        }
        dmob dmobVar2 = (dmob) bZ4.b;
        int i5 = dmobVar2.a | 4;
        dmobVar2.a = i5;
        dmobVar2.d = 100;
        dmobVar2.a = 1 | i5;
        dmobVar2.b = 11;
        if (bZ3.c) {
            bZ3.bF();
            bZ3.c = false;
        }
        dmpv dmpvVar4 = (dmpv) bZ3.b;
        dmob bK3 = bZ4.bK();
        bK3.getClass();
        dmpvVar4.e = bK3;
        dmpvVar4.a |= 4;
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
        this.i = akvzVar.c((dmqx) dmqtVar2.bK());
    }

    private static akuh a(Resources resources, akvz akvzVar, boolean z) {
        int i = true != z ? R.color.qu_black_alpha_87 : R.color.quantum_greywhite1000;
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
        int i2 = dmpvVar.a | 1;
        dmpvVar.a = i2;
        dmpvVar.b = color;
        dmpvVar.a = i2 | 2;
        dmpvVar.c = 0;
        dmoa bZ2 = dmob.g.bZ();
        if (bZ2.c) {
            bZ2.bF();
            bZ2.c = false;
        }
        dmob dmobVar = (dmob) bZ2.b;
        int i3 = dmobVar.a | 4;
        dmobVar.a = i3;
        dmobVar.d = 100;
        int i4 = i3 | 1;
        dmobVar.a = i4;
        dmobVar.b = 16;
        int i5 = i4 | 2;
        dmobVar.a = i5;
        dmobVar.c = 1;
        dmobVar.a = i5 | 32;
        dmobVar.f = 5;
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

    private static akuh b(Resources resources, akvz akvzVar, boolean z) {
        int color = z ? resources.getColor(R.color.callout_nightmode_background) : -1;
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
        dmsr bZ2 = dmsu.u.bZ();
        if (bZ2.c) {
            bZ2.bF();
            bZ2.c = false;
        }
        dmsu dmsuVar = (dmsu) bZ2.b;
        dmsuVar.a |= 4;
        dmsuVar.d = color;
        dmsu dmsuVar2 = (dmsu) bZ2.b;
        dmsuVar2.o = 2;
        int i = dmsuVar2.a | 2048;
        dmsuVar2.a = i;
        int i2 = i | 64;
        dmsuVar2.a = i2;
        dmsuVar2.j = 0;
        int i3 = i2 | 128;
        dmsuVar2.a = i3;
        dmsuVar2.k = 1;
        int i4 = i3 | 512;
        dmsuVar2.a = i4;
        dmsuVar2.m = 16;
        int i5 = i4 | 256;
        dmsuVar2.a = i5;
        dmsuVar2.l = 1493172224;
        int i6 = i5 | 8192;
        dmsuVar2.a = i6;
        dmsuVar2.s = 8.0f;
        int i7 = i6 | 16384;
        dmsuVar2.a = i7;
        dmsuVar2.t = 4.0f;
        int i8 = i7 | 32;
        dmsuVar2.a = i8;
        dmsuVar2.g = 14;
        int i9 = i8 | 16;
        dmsuVar2.a = i9;
        dmsuVar2.f = 6;
        dmsuVar2.a = i9 | 1024;
        dmsuVar2.n = 16;
        bZ2.a(a);
        if (bZ.c) {
            bZ.bF();
            bZ.c = false;
        }
        dmpv dmpvVar = (dmpv) bZ.b;
        dmsu bK = bZ2.bK();
        bK.getClass();
        dmpvVar.f = bK;
        dmpvVar.a |= 8;
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
}
