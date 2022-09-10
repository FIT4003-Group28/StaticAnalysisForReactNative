package defpackage;

import com.google.ar.core.ImageMetadata;
import java.util.ArrayList;
import java.util.List;
/* compiled from: PG */
/* renamed from: blii  reason: default package */
/* loaded from: classes3.dex */
public abstract class blii extends blho implements btzi<dinq, dins> {
    private final btvo a;
    private final cdqt b;
    private final dehq c;
    @dzsi
    private String d;
    @dzsi
    private final cdjd g;
    private boolean h;
    private boolean i;
    private final buuy j;

    public blii(btvo btvoVar, buuy buuyVar, dehq dehqVar, cdqt cdqtVar, blhw blhwVar, boolean z, cdjd cdjdVar) {
        super(blhwVar);
        this.a = btvoVar;
        this.j = buuyVar;
        this.c = dehqVar;
        this.b = cdqtVar;
        this.h = z;
        this.g = cdjdVar;
    }

    private final void g(List<cdjd> list) {
        cdjd cdjdVar;
        ArrayList arrayList = new ArrayList();
        if (!this.i && (cdjdVar = this.g) != null) {
            arrayList.add(cdjdVar);
        }
        this.i = true;
        for (cdjd cdjdVar2 : list) {
            if (this.g == null || !cdjdVar2.a().g().equals(this.g.a().g())) {
                if (cdjdVar2.a().b().a()) {
                    arrayList.add(cdjdVar2);
                }
            }
        }
        f(blhy.c(arrayList));
    }

    @Override // defpackage.btzi
    public final void QY(btzr<dinq> btzrVar, btzy btzyVar) {
        this.h = false;
        f(blhy.a);
    }

    @Override // defpackage.btzi
    public final /* bridge */ /* synthetic */ void QZ(btzr<dinq> btzrVar, dins dinsVar) {
        dins dinsVar2 = dinsVar;
        boolean z = true;
        int i = dinsVar2.a & 1;
        if (1 != i) {
            z = false;
        }
        this.h = z;
        if (i != 0) {
            this.d = dinsVar2.c;
        }
        g(dcbg.b(dinsVar2.b).s(blig.a).z());
    }

    @Override // defpackage.blho
    public final boolean a() {
        return this.h;
    }

    @Override // defpackage.blho
    protected final void b() {
        if (!this.i) {
            dbsg<blih> c = c(this.b);
            if (c.a()) {
                blih b = c.b();
                this.h = b.b();
                this.d = b.c().f();
                g(b.a());
                return;
            }
        }
        buuy buuyVar = this.j;
        blhw blhwVar = this.e;
        String str = this.d;
        dinc bZ = dinm.i.bZ();
        String o = blhwVar.a().o();
        if (bZ.c) {
            bZ.bF();
            bZ.c = false;
        }
        dinm dinmVar = (dinm) bZ.b;
        o.getClass();
        dinmVar.a |= 1;
        dinmVar.b = o;
        if (blhwVar.c()) {
            ding bZ2 = dinh.e.bZ();
            if (bZ2.c) {
                bZ2.bF();
                bZ2.c = false;
            }
            dinh dinhVar = (dinh) bZ2.b;
            dinhVar.d = 3;
            dinhVar.a |= 1;
            if (bZ.c) {
                bZ.bF();
                bZ.c = false;
            }
            dinm dinmVar2 = (dinm) bZ.b;
            dinh bK = bZ2.bK();
            bK.getClass();
            dinmVar2.d = bK;
            dinmVar2.a |= 4;
            dinj bZ3 = dinl.c.bZ();
            if (bZ3.c) {
                bZ3.bF();
                bZ3.c = false;
            }
            dinl dinlVar = (dinl) bZ3.b;
            dinlVar.b = 1;
            dinlVar.a |= 1;
            if (bZ.c) {
                bZ.bF();
                bZ.c = false;
            }
            dinm dinmVar3 = (dinm) bZ.b;
            dinl bK2 = bZ3.bK();
            bK2.getClass();
            dinmVar3.c = bK2;
            dinmVar3.a |= 2;
        } else {
            ding bZ4 = dinh.e.bZ();
            dind bZ5 = dinf.c.bZ();
            if (bZ5.c) {
                bZ5.bF();
                bZ5.c = false;
            }
            dinf dinfVar = (dinf) bZ5.b;
            dinfVar.b = 3;
            dinfVar.a |= 1;
            bZ4.a(bZ5);
            if (bZ4.c) {
                bZ4.bF();
                bZ4.c = false;
            }
            dinh dinhVar2 = (dinh) bZ4.b;
            dinhVar2.d = 1;
            dinhVar2.a |= 1;
            if (bZ.c) {
                bZ.bF();
                bZ.c = false;
            }
            dinm dinmVar4 = (dinm) bZ.b;
            dinh bK3 = bZ4.bK();
            bK3.getClass();
            dinmVar4.d = bK3;
            dinmVar4.a |= 4;
            dinj bZ6 = dinl.c.bZ();
            if (bZ6.c) {
                bZ6.bF();
                bZ6.c = false;
            }
            dinl dinlVar2 = (dinl) bZ6.b;
            dinlVar2.b = 3;
            dinlVar2.a |= 1;
            dinl bK4 = bZ6.bK();
            if (bZ.c) {
                bZ.bF();
                bZ.c = false;
            }
            dinm dinmVar5 = (dinm) bZ.b;
            bK4.getClass();
            dinmVar5.c = bK4;
            dinmVar5.a |= 2;
            if (!blhwVar.g().isEmpty()) {
                String b2 = blhwVar.b();
                if (bZ.c) {
                    bZ.bF();
                    bZ.c = false;
                }
                dinm dinmVar6 = (dinm) bZ.b;
                b2.getClass();
                dinmVar6.a |= 8;
                dinmVar6.e = b2;
                boolean K = this.a.getUgcParameters().K();
                if (bZ.c) {
                    bZ.bF();
                    bZ.c = false;
                }
                dinm dinmVar7 = (dinm) bZ.b;
                dinmVar7.a |= 16;
                dinmVar7.f = K;
            }
            if (blhwVar.f().a()) {
                dina bZ7 = dinb.c.bZ();
                drdk drdkVar = blhwVar.f().b().b;
                if (drdkVar == null) {
                    drdkVar = drdk.c;
                }
                if (bZ7.c) {
                    bZ7.bF();
                    bZ7.c = false;
                }
                dinb dinbVar = (dinb) bZ7.b;
                drdkVar.getClass();
                dinbVar.b = drdkVar;
                dinbVar.a |= 1;
                if (bZ.c) {
                    bZ.bF();
                    bZ.c = false;
                }
                dinm dinmVar8 = (dinm) bZ.b;
                dinb bK5 = bZ7.bK();
                bK5.getClass();
                dinmVar8.h = bK5;
                dinmVar8.a |= 32;
                drfb bZ8 = drfc.c.bZ();
                drey dreyVar = drey.PLACE_TOPIC_MENTION;
                if (bZ8.c) {
                    bZ8.bF();
                    bZ8.c = false;
                }
                drfc drfcVar = (drfc) bZ8.b;
                drfcVar.b = dreyVar.e;
                drfcVar.a |= 1;
                if (bZ.c) {
                    bZ.bF();
                    bZ.c = false;
                }
                dinm dinmVar9 = (dinm) bZ.b;
                drfc bK6 = bZ8.bK();
                bK6.getClass();
                dsrj<drfc> dsrjVar = dinmVar9.g;
                if (!dsrjVar.a()) {
                    dinmVar9.g = dsqw.cl(dsrjVar);
                }
                dinmVar9.g.add(bK6);
            }
        }
        dinn bZ9 = dino.d.bZ();
        if (bZ9.c) {
            bZ9.bF();
            bZ9.c = false;
        }
        dino dinoVar = (dino) bZ9.b;
        int i = dinoVar.a | 1;
        dinoVar.a = i;
        dinoVar.b = 10;
        if (str != null) {
            str.getClass();
            dinoVar.a = i | 2;
            dinoVar.c = str;
        }
        dimz bZ10 = dinq.g.bZ();
        if (bZ10.c) {
            bZ10.bF();
            bZ10.c = false;
        }
        dinq dinqVar = (dinq) bZ10.b;
        dino bK7 = bZ9.bK();
        bK7.getClass();
        dinqVar.c = bK7;
        dinqVar.a |= 2;
        if (bZ10.c) {
            bZ10.bF();
            bZ10.c = false;
        }
        dinq dinqVar2 = (dinq) bZ10.b;
        dinm bK8 = bZ.bK();
        bK8.getClass();
        dinqVar2.b = bK8;
        dinqVar2.a |= 1;
        int h = blhwVar.d().h();
        if (bZ10.c) {
            bZ10.bF();
            bZ10.c = false;
        }
        dinq dinqVar3 = (dinq) bZ10.b;
        int i2 = h - 1;
        if (h == 0) {
            throw null;
        }
        dinqVar3.d = i2;
        dinqVar3.a |= 4;
        dmbh bZ11 = dmbi.a.bZ();
        if (bZ11.c) {
            bZ11.bF();
            bZ11.c = false;
        }
        dmbi.e((dmbi) bZ11.b);
        if (bZ11.c) {
            bZ11.bF();
            bZ11.c = false;
        }
        dmbi.d((dmbi) bZ11.b);
        if (bZ11.c) {
            bZ11.bF();
            bZ11.c = false;
        }
        dmbi.b((dmbi) bZ11.b);
        if (bZ11.c) {
            bZ11.bF();
            bZ11.c = false;
        }
        dmbi.f((dmbi) bZ11.b);
        if (bZ11.c) {
            bZ11.bF();
            bZ11.c = false;
        }
        dmbi.c((dmbi) bZ11.b);
        if (bZ10.c) {
            bZ10.bF();
            bZ10.c = false;
        }
        dinq dinqVar4 = (dinq) bZ10.b;
        dmbi bK9 = bZ11.bK();
        bK9.getClass();
        dinqVar4.e = bK9;
        dinqVar4.a |= 8;
        dnqg bZ12 = dnqh.p.bZ();
        dnmu dnmuVar = dnmu.PROPERTY_GMM;
        if (bZ12.c) {
            bZ12.bF();
            bZ12.c = false;
        }
        dnqh dnqhVar = (dnqh) bZ12.b;
        dnqhVar.l = dnmuVar.ap;
        dnqhVar.a |= ImageMetadata.CONTROL_AE_ANTIBANDING_MODE;
        if (bZ10.c) {
            bZ10.bF();
            bZ10.c = false;
        }
        dinq dinqVar5 = (dinq) bZ10.b;
        dnqh bK10 = bZ12.bK();
        bK10.getClass();
        dinqVar5.f = bK10;
        dinqVar5.a |= 32;
        buuyVar.b(bZ10.bK(), this, this.c);
    }

    protected abstract dbsg<blih> c(cdqt cdqtVar);
}
