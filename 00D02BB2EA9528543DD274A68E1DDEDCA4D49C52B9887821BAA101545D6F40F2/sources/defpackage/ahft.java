package defpackage;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Executor;
/* compiled from: PG */
/* renamed from: ahft  reason: default package */
/* loaded from: classes2.dex */
public class ahft implements agzv {
    public final mw<agzv> a;
    private final dlcn b;
    private final List<ahfs> c;
    private final cjtd d;

    public ahft(cqhn cqhnVar, ahfv ahfvVar, dlcn dlcnVar, mw<agzv> mwVar, int i, int i2) {
        final ahft ahftVar = this;
        ahfv ahfvVar2 = ahfvVar;
        dlcn dlcnVar2 = dlcnVar;
        ahftVar.b = dlcnVar2;
        ahftVar.a = mwVar;
        cjta b = cjtd.b();
        b.d = dtxu.bF;
        b.i(i);
        ahftVar.d = b.a();
        ahftVar.c = new ArrayList();
        boolean z = false;
        int i3 = 0;
        while (i3 < dlcnVar2.e.size()) {
            dlcm dlcmVar = dlcnVar2.e.get(i3);
            List<ahfs> list = ahftVar.c;
            String str = dlcnVar2.c;
            String str2 = dlcmVar.a;
            mw mwVar2 = new mw(ahftVar) { // from class: ahfp
                private final ahft a;

                {
                    this.a = ahftVar;
                }

                @Override // defpackage.mw
                public final void a(Object obj) {
                    ahft ahftVar2 = this.a;
                    ahftVar2.g(((ahfs) obj).f());
                    ahftVar2.a.a(ahftVar2);
                }
            };
            dqel bZ = dqem.e.bZ();
            dspd dspdVar = dlcnVar2.b;
            if (bZ.c) {
                bZ.bF();
                bZ.c = z;
            }
            dqem dqemVar = (dqem) bZ.b;
            dspdVar.getClass();
            dqemVar.a |= 1;
            dqemVar.d = dspdVar;
            dspd dspdVar2 = dlcmVar.b;
            dspdVar2.getClass();
            dqemVar.b = 2;
            dqemVar.c = dspdVar2;
            dqem bK = bZ.bK();
            boolean z2 = i3 == i2;
            gga a = ahfvVar2.a.a();
            ahfv.a(a, 1);
            cjqq a2 = ahfvVar2.b.a();
            ahfv.a(a2, 2);
            bbdv a3 = ahfvVar2.c.a();
            ahfv.a(a3, 3);
            dxio a4 = ((dxjh) ahfvVar2.d).a();
            ahfv.a(a4, 4);
            Executor a5 = ahfvVar2.e.a();
            ahfv.a(a5, 5);
            cjqy a6 = ahfvVar2.f.a();
            ahfv.a(a6, 6);
            ahfv.a(str, 8);
            ahfv.a(str2, 9);
            ahfv.a(mwVar2, 10);
            ahfv.a(bK, 11);
            list.add(new ahfs(a, a2, a3, a4, a5, a6, i3, str, str2, mwVar2, bK, z2));
            i3++;
            ahftVar = this;
            ahfvVar2 = ahfvVar;
            dlcnVar2 = dlcnVar;
            z = false;
        }
    }

    @Override // defpackage.agzv
    public String b() {
        return this.b.c;
    }

    @Override // defpackage.agzv
    public cjtd c() {
        return this.d;
    }

    @Override // defpackage.agzv
    public List<ahfs> d() {
        return this.c;
    }

    public dlcn e() {
        return this.b;
    }

    public int f() {
        for (int i = 0; i < this.c.size(); i++) {
            if (this.c.get(i).a().booleanValue()) {
                return i;
            }
        }
        return -1;
    }

    public void g(dspd dspdVar) {
        for (ahfs ahfsVar : this.c) {
            ahfsVar.g(ahfsVar.f().equals(dspdVar));
            cqkx.p(ahfsVar);
        }
    }

    @Override // defpackage.agzv
    public jic a() {
        dlcn dlcnVar = this.b;
        if ((dlcnVar.a & 4) == 0) {
            return new jic();
        }
        return agxk.h(dlcnVar.d, ckqc.FULLY_QUALIFIED);
    }
}
