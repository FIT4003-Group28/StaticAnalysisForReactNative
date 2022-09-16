package defpackage;

import android.graphics.Bitmap;
import java.util.HashMap;
import java.util.Map;
/* compiled from: PG */
/* renamed from: kxd  reason: default package */
/* loaded from: classes7.dex */
public final class kxd {
    public static final dcdc<dmlo> e = dcdc.m(dmlo.TOP_RIGHT, dmlo.TOP, dmlo.TOP_LEFT, dmlo.LEFT, dmlo.BOTTOM_LEFT, dmlo.BOTTOM, dmlo.BOTTOM_RIGHT, dmlo.RIGHT);
    public final akvz a;
    public final Map<Bitmap, akuh> b = new HashMap();
    public final akuh c;
    public final akuh d;

    public kxd(akvz akvzVar) {
        this.a = akvzVar;
        this.c = a(akvzVar, false);
        this.d = a(akvzVar, true);
    }

    private static akuh a(akvz akvzVar, boolean z) {
        int i = true != z ? -1 : -6248267;
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
        int i2 = dmsuVar.a | 4;
        dmsuVar.a = i2;
        dmsuVar.d = i;
        int i3 = i2 | 64;
        dmsuVar.a = i3;
        dmsuVar.j = 0;
        int i4 = i3 | 128;
        dmsuVar.a = i4;
        dmsuVar.k = 1;
        int i5 = i4 | 256;
        dmsuVar.a = i5;
        dmsuVar.l = 956301312;
        dmsuVar.a = i5 | 512;
        dmsuVar.m = 16;
        dmsu dmsuVar2 = (dmsu) bZ2.b;
        dmsuVar2.o = 3;
        int i6 = dmsuVar2.a | 2048;
        dmsuVar2.a = i6;
        int i7 = i6 | 32;
        dmsuVar2.a = i7;
        dmsuVar2.g = 22;
        int i8 = i7 | 8;
        dmsuVar2.a = i8;
        dmsuVar2.e = 22;
        dmsuVar2.a = 16 | i8;
        dmsuVar2.f = 8;
        dmsu.c(dmsuVar2);
        if (bZ2.c) {
            bZ2.bF();
            bZ2.c = false;
        }
        dmsu dmsuVar3 = (dmsu) bZ2.b;
        int i9 = dmsuVar3.a | 8192;
        dmsuVar3.a = i9;
        dmsuVar3.s = 4.0f;
        dmsuVar3.a = i9 | 16384;
        dmsuVar3.t = 4.0f;
        bZ2.a(e);
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
