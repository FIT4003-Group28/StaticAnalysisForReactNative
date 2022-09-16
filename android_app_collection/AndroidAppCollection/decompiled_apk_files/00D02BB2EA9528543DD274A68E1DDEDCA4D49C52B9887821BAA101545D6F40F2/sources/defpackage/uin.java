package defpackage;
/* compiled from: PG */
/* renamed from: uin  reason: default package */
/* loaded from: classes7.dex */
public final class uin implements awwn, uio {
    public final dxio<awwq> a;
    private dpej b = dpej.DELAY_NODATA;
    private String c = "";

    public uin(dxio<awwq> dxioVar) {
        this.a = dxioVar;
    }

    @Override // defpackage.awwn
    @dzsi
    public final awwt a() {
        awws u = awwt.u();
        u.t(dcdc.f("informal_transit"));
        u.e(awvv.H);
        return u.a();
    }

    @Override // defpackage.awwn
    public final void b(awwb awwbVar, awwp awwpVar) {
        dpej dpejVar;
        dbsg a = awwbVar.a(awvv.H);
        if (!a.a() || (((dptu) a.b()).a & 256) == 0) {
            return;
        }
        dptt dpttVar = ((dptu) a.b()).i;
        if (dpttVar == null) {
            dpttVar = dptt.d;
        }
        if ((dpttVar.a & 1) == 0) {
            return;
        }
        dptt dpttVar2 = ((dptu) a.b()).i;
        if (dpttVar2 == null) {
            dpttVar2 = dptt.d;
        }
        int a2 = dpts.a(dpttVar2.b);
        if (a2 == 0 || a2 == 1) {
            return;
        }
        dptt dpttVar3 = ((dptu) a.b()).i;
        if (dpttVar3 == null) {
            dpttVar3 = dptt.d;
        }
        int a3 = dpts.a(dpttVar3.b);
        if (a3 == 0) {
            a3 = 1;
        }
        int i = a3 - 1;
        if (i == 0) {
            dpejVar = dpej.DELAY_NODATA;
        } else if (i == 1) {
            dpejVar = dpej.DELAY_LIGHT;
        } else if (i != 2) {
            dpejVar = dpej.DELAY_HEAVY;
        } else {
            dpejVar = dpej.DELAY_MEDIUM;
        }
        this.b = dpejVar;
        dptt dpttVar4 = ((dptu) a.b()).j;
        if (dpttVar4 == null) {
            dpttVar4 = dptt.d;
        }
        this.c = dpttVar4.c;
    }

    @Override // defpackage.uio
    public final dpej c() {
        return this.b;
    }

    @Override // defpackage.uio
    public final String d() {
        return this.c;
    }
}
