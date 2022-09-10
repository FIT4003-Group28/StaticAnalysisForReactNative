package defpackage;

import android.app.Application;
import android.content.Context;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
/* compiled from: PG */
/* renamed from: sgc  reason: default package */
/* loaded from: classes7.dex */
public class sgc {
    public static final dcdc<dmlo> a;
    public static final dmqx b;
    public final akox c;
    public final Context e;
    @dzsi
    public aktg g;
    public final List<aktc> d = new ArrayList();
    public final Map<dcdc<dpce>, akuh> f = new HashMap();

    static {
        dcdc<dmlo> i = dcdc.i(dmlo.BOTTOM_RIGHT, dmlo.BOTTOM_LEFT, dmlo.TOP_RIGHT, dmlo.TOP_LEFT);
        a = i;
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
        dmsuVar.o = 2;
        int i2 = dmsuVar.a | 2048;
        dmsuVar.a = i2;
        int i3 = i2 | 8192;
        dmsuVar.a = i3;
        dmsuVar.s = 3.0f;
        int i4 = i3 | 16384;
        dmsuVar.a = i4;
        dmsuVar.t = 2.0f;
        int i5 = i4 | 32;
        dmsuVar.a = i5;
        dmsuVar.g = 12;
        int i6 = i5 | 16;
        dmsuVar.a = i6;
        dmsuVar.f = 6;
        dmsuVar.a = i6 | 1024;
        dmsuVar.n = 16;
        bZ2.a(i);
        if (bZ2.c) {
            bZ2.bF();
            bZ2.c = false;
        }
        dmsu dmsuVar2 = (dmsu) bZ2.b;
        int i7 = dmsuVar2.a | 4;
        dmsuVar2.a = i7;
        dmsuVar2.d = -1;
        int i8 = i7 | 64;
        dmsuVar2.a = i8;
        dmsuVar2.j = 0;
        int i9 = i8 | 128;
        dmsuVar2.a = i9;
        dmsuVar2.k = 1;
        int i10 = i9 | 512;
        dmsuVar2.a = i10;
        dmsuVar2.m = 16;
        dmsuVar2.a = i10 | 256;
        dmsuVar2.l = 1493172224;
        dmsu bK = bZ2.bK();
        if (bZ.c) {
            bZ.bF();
            bZ.c = false;
        }
        dmpv dmpvVar = (dmpv) bZ.b;
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
        b = (dmqx) dmqtVar.bK();
    }

    public sgc(Application application, akox akoxVar) {
        this.e = application;
        this.c = akoxVar;
    }

    public final void a() {
        for (aktc aktcVar : this.d) {
            this.c.aj().ak().a(aktcVar);
        }
        this.d.clear();
        akvz aE = this.c.aj().aE();
        for (akuh akuhVar : this.f.values()) {
            aE.j(akuhVar);
        }
        this.f.clear();
        aktg aktgVar = this.g;
        if (aktgVar != null) {
            aE.j(aktgVar);
            this.g = null;
        }
    }
}
