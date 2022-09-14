package defpackage;

import android.content.Context;
import com.google.android.apps.gmm.directions.api.GmmNotice;
import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.concurrent.TimeUnit;
/* compiled from: PG */
/* renamed from: zrs  reason: default package */
/* loaded from: classes7.dex */
public class zrs implements zcv {
    private final dbsg<acrq> a;
    private final btvo b;
    private final GmmNotice c;
    private final doza d;
    private final boolean e;
    private final cqtd f;
    private final cqtd g;
    private final String h;
    private final dozy i;
    private final String j;
    private final String k;
    private final String l;
    private final String m;
    private final String n;
    private final boolean o;
    @dzsi
    private final cqkn<zcv> p;
    @dzsi
    private cqkn<zcv> q;
    @dzsi
    private cjtd r;
    @dzsi
    private final zvb s;
    @dzsi
    private final String t;
    @dzsi
    private final String u;
    @dzsi
    private final String v;
    @dzsi
    private final String w;
    @dzsi
    private final cjtd x;
    @dzsi
    private final dwag y;

    /* JADX WARN: Removed duplicated region for block: B:29:0x00c3  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00ff  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x011f  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0133  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x013a  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0146  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x014d  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x0192  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x019a  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x01a4  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public zrs(android.app.Application r18, defpackage.vtn r19, defpackage.dbsg<defpackage.acrq> r20, defpackage.btvo r21, com.google.android.apps.gmm.directions.api.GmmNotice r22, boolean r23, int r24, @defpackage.dzsi defpackage.cjtd r25, @defpackage.dzsi defpackage.cqkn<defpackage.zcv> r26) {
        /*
            Method dump skipped, instructions count: 460
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.zrs.<init>(android.app.Application, vtn, dbsg, btvo, com.google.android.apps.gmm.directions.api.GmmNotice, boolean, int, cjtd, cqkn):void");
    }

    public static dcdc<zcv> s(zrt zrtVar, @dzsi List<GmmNotice> list, @dzsi cqkn<zcv> cqknVar) {
        return t(zrtVar, list, cqknVar, null);
    }

    public static dcdc<zcv> t(zrt zrtVar, @dzsi List<GmmNotice> list, @dzsi cqkn<zcv> cqknVar, @dzsi cjtd cjtdVar) {
        if (list == null || list.isEmpty()) {
            return dcdc.e();
        }
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        for (GmmNotice gmmNotice : list) {
            linkedHashSet.add(zrtVar.a(gmmNotice, false, 0, cjtdVar, cqknVar));
        }
        return dcdc.r(linkedHashSet);
    }

    private static String u(Context context, boolean z, doza dozaVar, int i, int i2, int i3) {
        if (!z || i == 0) {
            return "";
        }
        if (true != doza.INFORMATION.equals(dozaVar)) {
            i2 = i3;
        }
        return context.getResources().getQuantityString(i2, i, Integer.valueOf(i));
    }

    @Override // defpackage.zcv
    public doza a() {
        return this.d;
    }

    @Override // defpackage.zcv
    public cqtd b() {
        return this.f;
    }

    @Override // defpackage.zcv
    public cqtd c() {
        return this.g;
    }

    @Override // defpackage.zcv
    public String d() {
        return this.h;
    }

    @Override // defpackage.zcv
    public String e() {
        return this.j;
    }

    public boolean equals(@dzsi Object obj) {
        if (!(obj instanceof zrs)) {
            return false;
        }
        zrs zrsVar = (zrs) obj;
        return dbsd.a(this.d, zrsVar.d) && dbsd.a(this.i, zrsVar.i) && dbsd.a(this.j, zrsVar.j) && dbsd.a(Boolean.valueOf(this.o), Boolean.valueOf(zrsVar.o)) && dbsd.a(this.k, zrsVar.k) && dbsd.a(this.m, zrsVar.m) && dbsd.a(this.t, zrsVar.t) && dbsd.a(this.v, zrsVar.v) && dbsd.a(this.y, zrsVar.y);
    }

    @Override // defpackage.zcv
    public String f() {
        return this.k;
    }

    @Override // defpackage.zcv
    public String g() {
        return this.l;
    }

    @Override // defpackage.zcv
    public cqss h() {
        if (this.e) {
            return ibm.p();
        }
        return alca.g(this.c);
    }

    public int hashCode() {
        return Arrays.hashCode(new Object[]{this.d, this.i, this.j, Boolean.valueOf(this.o), this.k, this.m, this.t, this.v, this.y});
    }

    @Override // defpackage.zcv
    public String i() {
        return this.m;
    }

    @Override // defpackage.zcv
    @dzsi
    public zvb j() {
        return this.s;
    }

    @Override // defpackage.zcv
    @dzsi
    public String k() {
        return this.t;
    }

    @Override // defpackage.zcv
    @dzsi
    public cqkn<zcv> l() {
        return this.p;
    }

    @Override // defpackage.zcv
    @dzsi
    public cjtd m() {
        return this.x;
    }

    @Override // defpackage.zcv
    public String n() {
        return this.n;
    }

    @Override // defpackage.zcv
    @dzsi
    public String o() {
        return this.u;
    }

    @Override // defpackage.zcv
    @dzsi
    public cjtd p() {
        if (this.v == null) {
            return null;
        }
        if (this.r == null) {
            cjta b = cjtd.b();
            b.d = dtyc.eD;
            if (!bvpb.c(this.w)) {
                b.g(this.w);
            }
            this.r = b.a();
        }
        return this.r;
    }

    @Override // defpackage.zcv
    @dzsi
    public cqkn<zcv> q() {
        String str = this.v;
        if (str == null) {
            return null;
        }
        if (this.q == null) {
            this.q = new zrr(str);
        }
        return this.q;
    }

    @Override // defpackage.zcv
    @dzsi
    public acqy r() {
        if (!this.b.getDirectionsPageParameters().I || this.y == null || !this.a.a()) {
            return null;
        }
        acrp a = this.a.b().a();
        dvvo dvvoVar = this.y.a;
        if (dvvoVar == null) {
            dvvoVar = dvvo.e;
        }
        a.i(dvvoVar, dpol.b(eaol.b(eaou.k((int) TimeUnit.MINUTES.toMillis(this.y.b))).B()), Integer.valueOf(eaol.b(eaou.k((int) TimeUnit.MINUTES.toMillis(this.y.b))).C()));
        return a;
    }
}
