package defpackage;

import android.content.Context;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.Executor;
/* compiled from: PG */
/* renamed from: zpy  reason: default package */
/* loaded from: classes7.dex */
public class zpy {
    public final cqat a;
    public final buti b;
    public final Executor c;
    private final btvo d;
    private final bvsl e;
    private final vtn f;
    private final zrl g;
    private final btpc h;
    private final byaf i;
    private final zse j;
    private final zlr k;
    private final zgs l;
    private final zqg m;
    private final zrt n;

    public zpy(btvo btvoVar, cqat cqatVar, bvsl bvslVar, vtn vtnVar, zrl zrlVar, btpc btpcVar, byaf byafVar, zse zseVar, buti butiVar, zlr zlrVar, zgs zgsVar, zqg zqgVar, zrt zrtVar, Executor executor) {
        this.d = btvoVar;
        this.a = cqatVar;
        this.e = bvslVar;
        this.f = vtnVar;
        this.g = zrlVar;
        this.h = btpcVar;
        this.i = byafVar;
        this.j = zseVar;
        this.b = butiVar;
        this.k = zlrVar;
        this.l = zgsVar;
        this.m = zqgVar;
        this.c = executor;
        this.n = zrtVar;
    }

    @dzsi
    public static zhw f(Context context, cqat cqatVar, amub amubVar, @dzsi zfc zfcVar, boolean z) {
        if (amubVar.o.length - (amubVar.aj() ? 1 : 0) > 2) {
            return new zhw(amubVar, context, cqatVar, zfcVar, z);
        }
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x0084  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00e4  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00e8  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.util.List<defpackage.zqy> a(android.content.Context r36, defpackage.amub r37, boolean r38, boolean r39, defpackage.zfe r40) {
        /*
            Method dump skipped, instructions count: 283
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.zpy.a(android.content.Context, amub, boolean, boolean, zfe):java.util.List");
    }

    public final List<zfk> b(amub amubVar) {
        ArrayList a = dchl.a();
        amubVar.i();
        for (dozz dozzVar : amubVar.d.b().j) {
            dozy b = dozy.b(dozzVar.f);
            if (b == null) {
                b = dozy.UNKNOWN;
            }
            if (b != dozy.VEHICLE_LICENSE_RESTRICTION && (!alca.s(dozzVar) || (dozzVar.a & 128) != 0)) {
                a.add(this.m.a(dozzVar, null, false));
            }
        }
        return Collections.unmodifiableList(a);
    }

    public final List<zfk> c(amub amubVar, @dzsi zfb zfbVar) {
        dozs dozsVar;
        ArrayList a = dchl.a();
        for (dozz dozzVar : amubVar.d.f().e) {
            if (dozzVar.b == 22) {
                dozsVar = (dozs) dozzVar.c;
            } else {
                dozsVar = dozs.q;
            }
            if (!dozsVar.e) {
                doyd b = doyd.b(dozzVar.t);
                if (b == null) {
                    b = doyd.INCIDENT_OTHER;
                }
                if (b != doyd.INCIDENT_SPEED_CAMERA) {
                    doyd b2 = doyd.b(dozzVar.t);
                    if (b2 == null) {
                        b2 = doyd.INCIDENT_OTHER;
                    }
                    if (b2 != doyd.INCIDENT_SPEED_LIMIT) {
                        a.add(this.m.a(dozzVar, zfbVar != null ? new zpx(dozzVar, amubVar, zfbVar) : null, false));
                    }
                }
            }
        }
        Collections.sort(a);
        return Collections.unmodifiableList(a);
    }

    public final zqc d(Context context, amve amveVar) {
        if (amveVar.r()) {
            return zqc.q(context.getResources(), this.e, amveVar.s(), amveVar.t(), amtg.c(amveVar));
        }
        return zqc.p();
    }

    @dzsi
    public final zsd e(amub amubVar, amve amveVar, boolean z) {
        int a = duos.a(this.d.getDirectionsPageParameters().d);
        if (a != 0 && a == 4 && (amveVar.f().a & 8) != 0 && amubVar.ai() <= 2 && !amubVar.ao()) {
            zse zseVar = this.j;
            dpfx dpfxVar = amveVar.f().i;
            if (dpfxVar == null) {
                dpfxVar = dpfx.f;
            }
            return zseVar.a(dpfxVar, z);
        }
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:33:0x009e  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00a1  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00ae  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0104  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x012a  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x0145  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x01b7  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x01ba  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x0201  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x0204  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final defpackage.zqa g(android.content.Context r34, defpackage.amsy r35, defpackage.dcdc<defpackage.vnu> r36, defpackage.amub r37, defpackage.vyp r38, defpackage.zfl r39, defpackage.vyo r40, boolean r41, boolean r42, boolean r43, boolean r44, boolean r45) {
        /*
            Method dump skipped, instructions count: 549
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.zpy.g(android.content.Context, amsy, dcdc, amub, vyp, zfl, vyo, boolean, boolean, boolean, boolean, boolean):zqa");
    }
}
