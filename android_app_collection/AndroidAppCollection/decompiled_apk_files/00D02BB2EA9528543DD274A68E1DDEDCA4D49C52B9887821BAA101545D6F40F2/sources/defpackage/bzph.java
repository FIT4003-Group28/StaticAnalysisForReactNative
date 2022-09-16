package defpackage;

import android.app.Activity;
import com.google.android.gms.udc.CheckConsentRequest;
import com.google.android.gms.udc.ConsentFlowConfig;
/* compiled from: PG */
/* renamed from: bzph  reason: default package */
/* loaded from: classes.dex */
public final class bzph implements bzqa {
    public static final ConsentFlowConfig a;
    public final Activity b;
    public final ckcw c;
    public final dxio<awnm> d;
    private final bzpe f;
    private final dxio<axwy> g;
    private final dxio<bzpz> h;
    private final btvo i;
    private final dxio<bzov> j;

    static {
        ConsentFlowConfig consentFlowConfig = new ConsentFlowConfig(false, true, false, 0, 0, true, 0);
        cpde.a(consentFlowConfig);
        cpde.b(consentFlowConfig);
        a = consentFlowConfig;
    }

    public bzph(Activity activity, bzpe bzpeVar, ckcw ckcwVar, dxio<axwy> dxioVar, dxio<awnm> dxioVar2, btvo btvoVar, dxio<bzov> dxioVar3, dxio<bzpz> dxioVar4) {
        this.b = activity;
        this.f = bzpeVar;
        this.c = ckcwVar;
        this.g = dxioVar;
        this.d = dxioVar2;
        this.i = btvoVar;
        this.j = dxioVar3;
        this.h = dxioVar4;
    }

    public static int b(int i) {
        if (i == 0 || i == 8 || i == 15 || i == 16 || i == 4500 || i == 4501 || i == 4502 || i == 4504 || i == 4505) {
            return i;
        }
        return -1;
    }

    @Override // defpackage.bzqa
    public final void a(int[] iArr, @dzsi awnl awnlVar, @dzsi String str) {
        dbsg<cpdv> a2 = this.f.a();
        if (!a2.a()) {
            ((ckco) this.c.a(ckid.d)).a(ckic.a(1));
            return;
        }
        boolean d = decl.d(iArr, bzqb.WEB_AND_APP_ACTIVITY.d);
        if (d) {
            this.g.a().e();
        }
        ((ckco) this.c.a(ckid.d)).a(ckic.a(2));
        boolean c = c(str);
        bzpf bzpfVar = new bzpf(awnlVar, iArr);
        if (!c) {
            if (d) {
                bzpfVar.a = awnn.FOOTPRINTS_WAA_CONSENT;
                bzpz a3 = this.h.a();
                a3.b = bzpfVar;
                a3.a(str);
                return;
            }
            bzpfVar.a = awnn.LOHIBOSHE_LH_CONSENT;
            bzov a4 = this.j.a();
            a4.b = bzpfVar;
            a4.a(str);
            return;
        }
        cpdb cpdbVar = new cpdb();
        cpdbVar.b(iArr);
        cpdbVar.a = 8;
        if (!dbsj.d(str)) {
            cpdbVar.b = str;
        }
        bzpfVar.a = awnn.UDC_CONSENT;
        cpdv b = a2.b();
        CheckConsentRequest a5 = cpdbVar.a();
        cpeq cpeqVar = b.a;
        cnoh<cpdp> a6 = cpeq.a(b.i, a5);
        cpey cpeyVar = new cpey();
        cpct cpctVar = new cpct();
        a6.k(new cpex(cpeyVar, a6, cpctVar));
        cpctVar.a.s(new bzpg(this, bzpfVar));
    }

    @Override // defpackage.bzqa
    public final boolean c(String str) {
        return dbsj.d(str) || !this.i.getEnableFeatureParameters().by;
    }
}
