package defpackage;

import android.app.Application;
import android.content.Context;
/* compiled from: PG */
/* renamed from: wqy  reason: default package */
/* loaded from: classes7.dex */
public final class wqy {
    private final Context a;
    private final vtn b;
    private final wsm c;
    private final wqw d;

    public wqy(Context context, vtn vtnVar, wsm wsmVar, wqw wqwVar) {
        this.a = context;
        dbsk.s(vtnVar);
        this.b = vtnVar;
        this.c = wsmVar;
        this.d = wqwVar;
    }

    @dzsi
    public static dgaw d(@dzsi amub amubVar) {
        if (amubVar == null) {
            return null;
        }
        dpci dpciVar = amubVar.d.b().f;
        if (dpciVar == null) {
            dpciVar = dpci.i;
        }
        dgaw dgawVar = dpciVar.f;
        return dgawVar == null ? dgaw.g : dgawVar;
    }

    private final zsf f(dcdc<dpce> dcdcVar, dphe dpheVar, boolean z) {
        dpgl dpglVar = dpheVar.l.get(0).b;
        if (dpglVar == null) {
            dpglVar = dpgl.g;
        }
        String str = dpglVar.f;
        Integer num = null;
        akqi b = (!z || str.isEmpty()) ? null : akqi.b(str);
        jhk T = vyb.T(dpheVar, vtj.TRANSIT_AUTO);
        if ((dpheVar.a & 128) != 0) {
            num = Integer.valueOf(dpheVar.h);
        }
        return new zsf(this.b, dcdcVar, null, T, num, b, null, cjtd.b);
    }

    public final wsl a(amub amubVar, int i, boolean z, @dzsi ddho ddhoVar, @dzsi ddho ddhoVar2) {
        dwaa dwaaVar = amubVar.b.b;
        if (dwaaVar == null) {
            dwaaVar = dwaa.g;
        }
        dvzu dvzuVar = dwaaVar.b;
        if (dvzuVar == null) {
            dvzuVar = dvzu.F;
        }
        dsrj<dwae> dsrjVar = dvzuVar.q;
        amtr b = amug.b(amubVar);
        return b(amug.c(b), b, amubVar.d, i, dsrjVar, wsk.RELEVANCY_FROM_CLOCK_TIME, false, true, true, z, ddhoVar, ddhoVar2);
    }

    /* JADX WARN: Removed duplicated region for block: B:101:0x0200  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x022b  */
    /* JADX WARN: Removed duplicated region for block: B:121:0x026d  */
    /* JADX WARN: Removed duplicated region for block: B:124:0x027f  */
    /* JADX WARN: Removed duplicated region for block: B:127:0x029c  */
    /* JADX WARN: Removed duplicated region for block: B:130:0x02ba  */
    /* JADX WARN: Removed duplicated region for block: B:133:0x02cb  */
    /* JADX WARN: Removed duplicated region for block: B:139:0x02ed  */
    /* JADX WARN: Removed duplicated region for block: B:149:0x0316  */
    /* JADX WARN: Removed duplicated region for block: B:155:0x0345  */
    /* JADX WARN: Removed duplicated region for block: B:158:0x034b  */
    /* JADX WARN: Removed duplicated region for block: B:159:0x0353  */
    /* JADX WARN: Removed duplicated region for block: B:167:0x0381  */
    /* JADX WARN: Removed duplicated region for block: B:168:0x0384  */
    /* JADX WARN: Removed duplicated region for block: B:171:0x03b0  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x01b6  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x01be  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x01dc  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final defpackage.wsl b(defpackage.amuq r30, defpackage.amtr r31, defpackage.amve r32, int r33, java.util.List<defpackage.dwae> r34, defpackage.wsk r35, boolean r36, boolean r37, boolean r38, boolean r39, @defpackage.dzsi defpackage.ddho r40, @defpackage.dzsi defpackage.ddho r41) {
        /*
            Method dump skipped, instructions count: 950
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.wqy.b(amuq, amtr, amve, int, java.util.List, wsk, boolean, boolean, boolean, boolean, ddho, ddho):wsl");
    }

    public final wpr c(amub amubVar, @dzsi cqkn<wpr> cqknVar) {
        return wqv.e(amubVar, d(amubVar), e(amug.d(amug.b(amubVar))), cqknVar);
    }

    @dzsi
    public final wqu e(@dzsi amuf amufVar) {
        Integer num = null;
        if (amufVar == null) {
            return null;
        }
        amsm amsmVar = (amsm) amufVar;
        dcdc<dpce> w = alcf.w(amsmVar.b.a, true);
        dpgw dpgwVar = amsmVar.a.g().d;
        if (dpgwVar == null) {
            dpgwVar = dpgw.r;
        }
        dpgw dpgwVar2 = amsmVar.b.g().c;
        if (dpgwVar2 == null) {
            dpgwVar2 = dpgw.r;
        }
        if ((dpgwVar.a & 8) != 0 && (dpgwVar2.a & 16) != 0) {
            dgaw dgawVar = dpgwVar2.f;
            if (dgawVar == null) {
                dgawVar = dgaw.g;
            }
            long j = dgawVar.b;
            dgaw dgawVar2 = dpgwVar.e;
            if (dgawVar2 == null) {
                dgawVar2 = dgaw.g;
            }
            num = Integer.valueOf((int) (j - dgawVar2.b));
        }
        wqw wqwVar = this.d;
        zsf f = f(w, amsmVar.b.g(), true);
        Application a = wqwVar.a.a();
        wqw.a(a, 1);
        wqw.a(f, 2);
        return new wqu(a, f, num);
    }
}
