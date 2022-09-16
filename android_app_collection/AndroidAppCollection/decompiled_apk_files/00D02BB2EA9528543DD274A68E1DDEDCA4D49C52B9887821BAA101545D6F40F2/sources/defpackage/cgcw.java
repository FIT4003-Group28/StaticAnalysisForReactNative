package defpackage;

import android.content.res.Resources;
import com.google.android.apps.maps.R;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: cgcw  reason: default package */
/* loaded from: classes4.dex */
public final class cgcw {
    public static final dcdc<dmlo> a = dcdc.g(dmlo.BOTTOM_RIGHT, dmlo.BOTTOM_LEFT);
    public final akvz b;
    public final akuh c;
    public final akuh d;

    public cgcw(Resources resources, akvz akvzVar) {
        this.b = akvzVar;
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
        dmsuVar.d = -1;
        dmsu dmsuVar2 = (dmsu) bZ2.b;
        dmsuVar2.o = 2;
        int i = dmsuVar2.a | 2048;
        dmsuVar2.a = i;
        int i2 = i | 64;
        dmsuVar2.a = i2;
        dmsuVar2.j = 1;
        int i3 = i2 | 128;
        dmsuVar2.a = i3;
        dmsuVar2.k = 1;
        int i4 = i3 | 512;
        dmsuVar2.a = i4;
        dmsuVar2.m = 4;
        int i5 = i4 | 256;
        dmsuVar2.a = i5;
        dmsuVar2.l = 1493172224;
        int i6 = i5 | 8192;
        dmsuVar2.a = i6;
        dmsuVar2.s = 16.0f;
        int i7 = i6 | 16384;
        dmsuVar2.a = i7;
        dmsuVar2.t = 10.0f;
        int i8 = i7 | 32;
        dmsuVar2.a = i8;
        dmsuVar2.g = 12;
        int i9 = i8 | 8;
        dmsuVar2.a = i9;
        dmsuVar2.e = 8;
        int i10 = i9 | 16;
        dmsuVar2.a = i10;
        dmsuVar2.f = 6;
        dmsuVar2.a = i10 | 1024;
        dmsuVar2.n = 24;
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
        this.c = akvzVar.c((dmqx) dmqtVar.bK());
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
        int color = resources.getColor(R.color.qu_black_alpha_87);
        if (bZ3.c) {
            bZ3.bF();
            bZ3.c = false;
        }
        dmpv dmpvVar2 = (dmpv) bZ3.b;
        int i11 = dmpvVar2.a | 1;
        dmpvVar2.a = i11;
        dmpvVar2.b = color;
        dmpvVar2.a = i11 | 2;
        dmpvVar2.c = 0;
        dmoa bZ4 = dmob.g.bZ();
        if (bZ4.c) {
            bZ4.bF();
            bZ4.c = false;
        }
        dmob dmobVar = (dmob) bZ4.b;
        int i12 = dmobVar.a | 32;
        dmobVar.a = i12;
        dmobVar.f = 22;
        dmobVar.a = 1 | i12;
        dmobVar.b = 12;
        if (bZ3.c) {
            bZ3.bF();
            bZ3.c = false;
        }
        dmpv dmpvVar3 = (dmpv) bZ3.b;
        dmob bK3 = bZ4.bK();
        bK3.getClass();
        dmpvVar3.e = bK3;
        dmpvVar3.a |= 4;
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
        this.d = akvzVar.c((dmqx) dmqtVar2.bK());
    }
}
