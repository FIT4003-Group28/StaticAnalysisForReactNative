package defpackage;

import android.content.res.Resources;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: arcz  reason: default package */
/* loaded from: classes.dex */
public final class arcz {
    public final akvz a;
    public final Resources b;
    public final dzjs<akuh> c = new dzjs<>();
    public final Map<ardb, akuh> d = new HashMap();
    public final List<akuh> e = new ArrayList();

    public arcz(akvz akvzVar, Resources resources) {
        this.a = akvzVar;
        this.b = resources;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final akuh a(int i) {
        akuh i2 = this.c.i(i);
        if (i2 != null) {
            return i2;
        }
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
        int color = (this.b.getColor(i) & 16777215) | (-553648128);
        if (bZ2.c) {
            bZ2.bF();
            bZ2.c = false;
        }
        dmsu dmsuVar = (dmsu) bZ2.b;
        int i3 = dmsuVar.a | 4;
        dmsuVar.a = i3;
        dmsuVar.d = color;
        int i4 = i3 | 64;
        dmsuVar.a = i4;
        dmsuVar.j = 0;
        int i5 = i4 | 128;
        dmsuVar.a = i5;
        dmsuVar.k = 1;
        int i6 = i5 | 256;
        dmsuVar.a = i6;
        dmsuVar.l = 1493172224;
        dmsuVar.a = i6 | 512;
        dmsuVar.m = 16;
        dmsu dmsuVar2 = (dmsu) bZ2.b;
        dmsuVar2.o = 3;
        int i7 = dmsuVar2.a | 2048;
        dmsuVar2.a = i7;
        int i8 = i7 | 8;
        dmsuVar2.a = i8;
        dmsuVar2.e = 0;
        int i9 = 16 | i8;
        dmsuVar2.a = i9;
        dmsuVar2.f = 6;
        int i10 = i9 | 8192;
        dmsuVar2.a = i10;
        dmsuVar2.s = 2.0f;
        dmsuVar2.a = i10 | 16384;
        dmsuVar2.t = 3.0f;
        dmsu.c(dmsuVar2);
        bZ2.b(dmlo.BOTTOM);
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
        aktg c = this.a.c((dmqx) dmqtVar.bK());
        this.c.a(i, c);
        return c;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final akuh b(int i, int i2) {
        arbz arbzVar = new arbz(i, i2);
        akuh akuhVar = this.d.get(arbzVar);
        if (akuhVar != null) {
            return akuhVar;
        }
        int dimension = (int) (this.b.getDimension(i2) / this.b.getDisplayMetrics().density);
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
        int color = this.b.getColor(i);
        if (bZ.c) {
            bZ.bF();
            bZ.c = false;
        }
        dmpv dmpvVar = (dmpv) bZ.b;
        dmpvVar.a |= 1;
        dmpvVar.b = color;
        dmoa bZ2 = dmob.g.bZ();
        if (bZ2.c) {
            bZ2.bF();
            bZ2.c = false;
        }
        dmob dmobVar = (dmob) bZ2.b;
        int i3 = dmobVar.a | 1;
        dmobVar.a = i3;
        dmobVar.b = dimension;
        dmobVar.a = i3 | 2;
        dmobVar.c = 1;
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
        aktg c = this.a.c((dmqx) dmqtVar.bK());
        this.d.put(arbzVar, c);
        return c;
    }
}
