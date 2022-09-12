package defpackage;

import android.content.res.Resources;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: yag  reason: default package */
/* loaded from: classes7.dex */
public class yag extends yaj {
    final /* synthetic */ dpaf a;
    final /* synthetic */ cjta b;
    final /* synthetic */ yak c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public yag(yak yakVar, yae yaeVar, dpaf dpafVar, cjta cjtaVar) {
        super(yaeVar);
        this.c = yakVar;
        this.a = dpafVar;
        this.b = cjtaVar;
    }

    @Override // defpackage.xyx
    public jhk a() {
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
    @dzsi
    public jhk b() {
        return null;
    }

    @Override // defpackage.xyx
    public CharSequence c() {
        dpej dpejVar;
        yak yakVar = this.c;
        dgas dgasVar = this.a.c;
        if (dgasVar == null) {
            dgasVar = dgas.e;
        }
        dpaf dpafVar = this.a;
        if ((dpafVar.a & 16) == 0) {
            dpejVar = dpej.DELAY_NODATA;
        } else {
            dpejVar = dpej.b(dpafVar.e);
            if (dpejVar == null) {
                dpejVar = dpej.DELAY_NODATA;
            }
        }
        return yakVar.a(dgasVar, dpejVar);
    }

    @Override // defpackage.xyx
    public CharSequence d() {
        Resources resources = this.c.a.getResources();
        dquj dqujVar = this.a.d;
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
        dquj dqujVar = this.a.d;
        if (dqujVar == null) {
            dqujVar = dquj.f;
        }
        bvsiVar.c(vxc.b(resources, dqujVar));
        return bvsiVar.toString();
    }

    @Override // defpackage.yaj, defpackage.xyx
    public cjtd h() {
        return this.b.b(dtxn.aB);
    }
}
