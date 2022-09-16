package defpackage;

import android.app.Application;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: yah  reason: default package */
/* loaded from: classes7.dex */
public class yah extends yaj {
    final /* synthetic */ dpck a;
    final /* synthetic */ cjta b;
    final /* synthetic */ yak c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public yah(yak yakVar, yae yaeVar, dpck dpckVar, cjta cjtaVar) {
        super(yaeVar);
        this.c = yakVar;
        this.a = dpckVar;
        this.b = cjtaVar;
    }

    @Override // defpackage.xyx
    public jhk a() {
        douj doujVar = this.a.d;
        if (doujVar == null) {
            doujVar = douj.h;
        }
        return new jhk(doujVar.c);
    }

    @Override // defpackage.xyx
    @dzsi
    public jhk b() {
        return null;
    }

    @Override // defpackage.xyx
    public CharSequence c() {
        dpej dpejVar;
        yak yakVar = this.c;
        dgas dgasVar = this.a.b;
        if (dgasVar == null) {
            dgasVar = dgas.e;
        }
        dpck dpckVar = this.a;
        if ((dpckVar.a & 16) == 0) {
            dpejVar = dpej.DELAY_NODATA;
        } else {
            dpejVar = dpej.b(dpckVar.f);
            if (dpejVar == null) {
                dpejVar = dpej.DELAY_NODATA;
            }
        }
        return yakVar.a(dgasVar, dpejVar);
    }

    @Override // defpackage.xyx
    public CharSequence d() {
        dpck dpckVar = this.a;
        if ((dpckVar.a & 16) != 0) {
            Application application = this.c.a;
            dpej b = dpej.b(dpckVar.f);
            if (b == null) {
                b = dpej.DELAY_NODATA;
            }
            String j = vyb.j(application, b);
            return j != null ? j : "";
        }
        return "";
    }

    @Override // defpackage.xyx
    public CharSequence e() {
        bvsi bvsiVar = new bvsi(this.c.a.getResources());
        bvsiVar.c(this.a.c);
        bvsiVar.c(c());
        bvsiVar.c(d());
        return bvsiVar.toString();
    }

    @Override // defpackage.yaj, defpackage.xyx
    public cjtd h() {
        dqvj dqvjVar = dqvj.DRIVE;
        dqvj c = dqvj.c(this.a.e);
        if (c == null) {
            c = dqvj.DRIVE;
        }
        int ordinal = c.ordinal();
        if (ordinal != 0) {
            if (ordinal == 1) {
                return this.b.b(dtxn.am);
            }
            if (ordinal == 2) {
                return this.b.b(dtxn.aV);
            }
            if (ordinal == 5) {
                return this.b.b(dtxn.aR);
            }
            return cjtd.b;
        }
        return this.b.b(dtxn.aq);
    }
}
