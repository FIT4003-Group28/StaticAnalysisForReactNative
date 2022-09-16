package defpackage;

import android.content.res.Resources;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: yaf  reason: default package */
/* loaded from: classes7.dex */
public class yaf extends yaj {
    final /* synthetic */ dpap a;
    final /* synthetic */ cjta b;
    final /* synthetic */ yak c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public yaf(yak yakVar, yae yaeVar, dpap dpapVar, cjta cjtaVar) {
        super(yaeVar);
        this.c = yakVar;
        this.a = dpapVar;
        this.b = cjtaVar;
    }

    @Override // defpackage.xyx
    public jhk a() {
        douj doujVar = this.a.i;
        if (doujVar == null) {
            doujVar = douj.h;
        }
        return new jhk(doujVar.c);
    }

    @Override // defpackage.xyx
    public jhk b() {
        dpan dpanVar = this.a.b;
        if (dpanVar == null) {
            dpanVar = dpan.e;
        }
        douj doujVar = dpanVar.d;
        if (doujVar == null) {
            doujVar = douj.h;
        }
        return new jhk(doujVar.c);
    }

    @Override // defpackage.xyx
    public CharSequence c() {
        dpej dpejVar;
        yak yakVar = this.c;
        dgas dgasVar = this.a.c;
        if (dgasVar == null) {
            dgasVar = dgas.e;
        }
        dpap dpapVar = this.a;
        if ((dpapVar.a & 256) == 0) {
            dpejVar = dpej.DELAY_NODATA;
        } else {
            dpejVar = dpej.b(dpapVar.j);
            if (dpejVar == null) {
                dpejVar = dpej.DELAY_NODATA;
            }
        }
        return yakVar.a(dgasVar, dpejVar);
    }

    @Override // defpackage.xyx
    public CharSequence d() {
        Resources resources = this.c.a.getResources();
        dquj dqujVar = this.a.e;
        if (dqujVar == null) {
            dqujVar = dquj.f;
        }
        return vxc.a(resources, dqujVar);
    }

    @Override // defpackage.xyx
    public CharSequence e() {
        bvsi bvsiVar = new bvsi(this.c.a.getResources());
        dpan dpanVar = this.a.b;
        if (dpanVar == null) {
            dpanVar = dpan.e;
        }
        bvsiVar.c(dpanVar.c);
        bvsiVar.c(c());
        Resources resources = this.c.a.getResources();
        dquj dqujVar = this.a.e;
        if (dqujVar == null) {
            dqujVar = dquj.f;
        }
        bvsiVar.c(vxc.b(resources, dqujVar));
        return bvsiVar.toString();
    }

    @Override // defpackage.yaj, defpackage.xyx
    public cjtd h() {
        return this.b.b(dtxn.aE);
    }
}
