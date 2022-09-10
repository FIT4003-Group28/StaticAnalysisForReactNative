package defpackage;

import android.app.Activity;
/* compiled from: PG */
/* renamed from: adjh  reason: default package */
/* loaded from: classes.dex */
public class adjh extends aczs implements adjg {
    @dzsi
    private String a;
    private final abns b;
    private final absg c;

    public adjh(abva abvaVar, acwt acwtVar, absg absgVar) {
        Activity activity = (Activity) ((dxjd) abvaVar.a).a;
        abva.a(activity, 1);
        abva.a(abvaVar.b.a(), 2);
        abuo a = abvaVar.c.a();
        abva.a(a, 3);
        dxio a2 = ((dxjh) abvaVar.d).a();
        abva.a(a2, 4);
        abuy a3 = abvaVar.e.a();
        abva.a(a3, 5);
        akpm a4 = abvaVar.f.a();
        abva.a(a4, 6);
        dxio a5 = ((dxjh) abvaVar.g).a();
        abva.a(a5, 7);
        abva.a(absgVar, 10);
        this.b = new abuz(activity, a, a2, a3, a4, a5, acwtVar, absgVar);
        this.c = absgVar;
    }

    @Override // defpackage.adjg
    public abns a() {
        return this.b;
    }

    public void b(@dzsi dvhw dvhwVar) {
        djrm djrmVar;
        String str = null;
        if (dvhwVar == null || (dvhwVar.a & 4) == 0) {
            djrmVar = null;
        } else {
            djrmVar = dvhwVar.d;
            if (djrmVar == null) {
                djrmVar = djrm.v;
            }
        }
        if (this.b.a(djrmVar).booleanValue()) {
            if (dvhwVar != null && (dvhwVar.a & 1) != 0) {
                str = dvhwVar.b;
            }
            this.a = str;
        }
    }

    public boolean c() {
        return !this.b.c().isEmpty();
    }

    @Override // defpackage.aczr
    public cjtd e() {
        cjta b = cjtd.b();
        b.g(this.a);
        b.d = this.c == absg.AREA_EXPLORE ? dtxj.cD : dtxr.ay;
        return b.a();
    }
}
