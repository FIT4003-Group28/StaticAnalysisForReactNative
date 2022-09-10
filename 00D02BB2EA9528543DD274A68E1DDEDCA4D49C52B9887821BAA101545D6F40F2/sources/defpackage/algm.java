package defpackage;

import android.content.res.Resources;
import android.graphics.BitmapFactory;
import java.util.List;
import java.util.Map;
/* compiled from: PG */
/* renamed from: algm  reason: default package */
/* loaded from: classes2.dex */
public final class algm {
    public static final dcdc<dmlo> a = dcdc.i(dmlo.BOTTOM_RIGHT, dmlo.BOTTOM_LEFT, dmlo.TOP_RIGHT, dmlo.TOP_LEFT);
    public final akvz b;
    public final akuh c;
    public final akuh d;
    public final akuh e;
    public final akuh f;
    public final akuh g;
    public final akuh h;
    public final akuh i;
    public final akuh j;
    public final akuh k;
    public final akuh l;
    public final akuh m;
    public final akuh n;
    public final Map<String, akuh> o = dcjz.h();

    public algm(akvz akvzVar, Resources resources) {
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
        this.c = akvzVar.c((dmqx) dmqtVar.bK());
        this.d = e(akvzVar, algl.SELECTED);
        this.f = e(akvzVar, algl.ALTERNATE_DAY);
        this.g = e(akvzVar, algl.ALTERNATE_NIGHT);
        this.e = d(akvzVar, algl.SELECTED);
        this.h = d(akvzVar, algl.ALTERNATE_DAY);
        this.i = d(akvzVar, algl.ALTERNATE_NIGHT);
        this.l = d(akvzVar, algl.SELECTED_SUBTEXT);
        this.m = d(akvzVar, algl.ALTERNATE_DAY_SUBTEXT);
        this.n = d(akvzVar, algl.ALTERNATE_NIGHT_SUBTEXT);
        this.k = akvzVar.d(BitmapFactory.decodeResource(resources, 2131232584));
        this.j = akvzVar.d(BitmapFactory.decodeResource(resources, 2131232585));
    }

    private static akuh d(akvz akvzVar, algl alglVar) {
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
        algl alglVar2 = algl.SELECTED;
        int i = alglVar.h;
        if (bZ.c) {
            bZ.bF();
            bZ.c = false;
        }
        dmpv dmpvVar = (dmpv) bZ.b;
        int i2 = dmpvVar.a | 1;
        dmpvVar.a = i2;
        dmpvVar.b = i;
        dmpvVar.a = i2 | 2;
        dmpvVar.c = 0;
        dmoa bZ2 = dmob.g.bZ();
        int i3 = alglVar.j;
        if (bZ2.c) {
            bZ2.bF();
            bZ2.c = false;
        }
        dmob dmobVar = (dmob) bZ2.b;
        int i4 = dmobVar.a | 1;
        dmobVar.a = i4;
        dmobVar.b = i3;
        int i5 = i4 | 32;
        dmobVar.a = i5;
        dmobVar.f = 22;
        int i6 = i5 | 4;
        dmobVar.a = i6;
        dmobVar.d = 90;
        int i7 = i6 | 8;
        dmobVar.a = i7;
        dmobVar.e = 0;
        int i8 = alglVar.i;
        dmobVar.a = i7 | 2;
        dmobVar.c = i8;
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

    private static akuh e(akvz akvzVar, algl alglVar) {
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
        algl alglVar2 = algl.SELECTED;
        int i = alglVar.g;
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
        dmsuVar.j = 2;
        int i4 = i3 | 128;
        dmsuVar.a = i4;
        dmsuVar.k = 2;
        int i5 = i4 | 256;
        dmsuVar.a = i5;
        dmsuVar.l = 2130706432;
        dmsuVar.a = i5 | 512;
        dmsuVar.m = 48;
        dmsu dmsuVar2 = (dmsu) bZ2.b;
        dmsuVar2.o = 2;
        int i6 = dmsuVar2.a | 2048;
        dmsuVar2.a = i6;
        int i7 = i6 | 8192;
        dmsuVar2.a = i7;
        dmsuVar2.s = 8.0f;
        dmsuVar2.a = i7 | 16384;
        dmsuVar2.t = 3.0f;
        bZ2.a(a);
        if (bZ2.c) {
            bZ2.bF();
            bZ2.c = false;
        }
        dmsu dmsuVar3 = (dmsu) bZ2.b;
        int i8 = dmsuVar3.a | 8;
        dmsuVar3.a = i8;
        dmsuVar3.e = 8;
        int i9 = i8 | 32;
        dmsuVar3.a = i9;
        dmsuVar3.g = 12;
        int i10 = i9 | 16;
        dmsuVar3.a = i10;
        dmsuVar3.f = 6;
        dmsuVar3.a = i10 | 1024;
        dmsuVar3.n = 48;
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

    public final List<akuh> a(List<String> list, boolean z) {
        dccx F = dcdc.F();
        synchronized (this) {
            for (String str : list) {
                F.g(b(str, z));
            }
        }
        return F.f();
    }

    public final akuh b(String str, boolean z) {
        akuh akuhVar;
        synchronized (this) {
            String str2 = "1";
            if (true != z) {
                str2 = "0";
            }
            StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 5 + str2.length());
            sb.append(str);
            sb.append("&car=");
            sb.append(str2);
            String sb2 = sb.toString();
            if (!this.o.containsKey(sb2)) {
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
                dmog dmogVar = (dmog) dmoh.h.bZ();
                if (dmogVar.c) {
                    dmogVar.bF();
                    dmogVar.c = false;
                }
                dmoh dmohVar = (dmoh) dmogVar.b;
                str.getClass();
                int i = dmohVar.a | 1;
                dmohVar.a = i;
                dmohVar.b = str;
                int i2 = true != z ? 4 : 3;
                dmohVar.a = i | 4;
                dmohVar.c = i2;
                bZ.a(dmogVar);
                if (dmooVar.c) {
                    dmooVar.bF();
                    dmooVar.c = false;
                }
                dmop dmopVar2 = (dmop) dmooVar.b;
                dmpv bK = bZ.bK();
                bK.getClass();
                dmopVar2.d = bK;
                dmopVar2.a = 4 | dmopVar2.a;
                dmqtVar.a(dmooVar);
                this.o.put(sb2, this.b.c((dmqx) dmqtVar.bK()));
            }
            akuhVar = this.o.get(sb2);
        }
        return akuhVar;
    }

    public final akuh c(boolean z) {
        return z ? this.j : this.k;
    }
}
