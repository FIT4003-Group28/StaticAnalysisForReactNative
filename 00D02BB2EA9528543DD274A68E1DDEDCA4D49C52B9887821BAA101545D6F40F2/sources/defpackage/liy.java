package defpackage;

import android.content.Context;
import android.content.res.Configuration;
import android.os.Bundle;
import android.util.TypedValue;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Executor;
/* compiled from: PG */
/* renamed from: liy  reason: default package */
/* loaded from: classes7.dex */
public final class liy implements atcv, btph {
    public final List<atcv> a;
    public final atdd b;
    public final maw c;
    public final asla d;
    public final lxf e;
    @dzsi
    public final atdr f;
    private final Executor g;
    private final boolean h;
    private final LinkedHashMap<atcv, lix> i;
    private boolean j;

    public liy(btrm btrmVar, cjqy cjqyVar, cjqq cjqqVar, bwqv bwqvVar, cqat cqatVar, bvnx bvnxVar, final btvo btvoVar, akfa akfaVar, bvjj bvjjVar, dxio dxioVar, ckcw ckcwVar, cqkj cqkjVar, asvx asvxVar, akox akoxVar, hwe hweVar, arbu arbuVar, qbo qboVar, afwo afwoVar, broq broqVar, awpk awpkVar, atcu atcuVar, atdc atdcVar, gll gllVar, aufc aufcVar, brcw brcwVar, Executor executor, Executor executor2, crzm crzmVar, jzv jzvVar, dxio dxioVar2, brlh brlhVar, lxj lxjVar, lyy lyyVar, kdg kdgVar, koc kocVar) {
        ArrayList arrayList = new ArrayList();
        this.a = arrayList;
        this.i = new LinkedHashMap<>();
        Context context = cqkjVar.d;
        boolean z = true;
        this.h = (!kdgVar.o() || cqsz.d().a(context) >= TypedValue.applyDimension(1, 480.0f, context.getResources().getDisplayMetrics())) ? false : z;
        atdd atddVar = new atdd(btrmVar, btvoVar, cjqyVar, bwqvVar, dbpy.a, aufcVar, executor, new crmu(bwqvVar), new crmt(bwqvVar, cqkjVar.d.getApplicationContext(), executor, executor2, btsp.c(jzvVar), cqatVar), null, crzmVar, atcuVar, atdcVar);
        this.b = atddVar;
        atddVar.H(null);
        this.g = executor;
        maw mawVar = new maw(cqatVar, cqkjVar.d, btvoVar, akfaVar, bvjjVar, dxioVar, broqVar, ckcwVar, atddVar, akoxVar, brcwVar, dxioVar2, kocVar);
        this.c = mawVar;
        arrayList.add(mawVar);
        if (!kdgVar.o()) {
            atdr atdrVar = new atdr(atddVar, btrmVar);
            this.f = atdrVar;
            arrayList.add(atdrVar);
        } else {
            this.f = null;
        }
        asla aslaVar = new asla(btvoVar, cjqqVar, bvnxVar, cqkjVar.d.getResources(), akoxVar, gllVar, atddVar, arbuVar, asvxVar, null, false);
        this.d = aslaVar;
        arrayList.add(aslaVar);
        btsp c = btsp.c(afwoVar);
        btsp c2 = btsp.c(qboVar);
        btvoVar.getClass();
        lxf lxfVar = new lxf(atcuVar, btrmVar, cjqyVar, cjqqVar, atddVar, aslaVar, c, akoxVar, hweVar, c2, btsp.b(new dbty(btvoVar) { // from class: liu
            private final btvo a;

            {
                this.a = btvoVar;
            }

            @Override // defpackage.dbty
            public final Object a() {
                return this.a.getDirectionsExperimentsParameters();
            }
        }), lxjVar, kdgVar);
        this.e = lxfVar;
        arrayList.add(lxfVar);
        arrayList.add(awpkVar);
        arrayList.add(new atdx(atcuVar, atddVar, cqatVar, btrmVar, lyyVar.b()));
        if (brlhVar != null) {
            arrayList.add(brlhVar);
        }
    }

    @Override // defpackage.btph
    public final void NX(String str, PrintWriter printWriter) {
        throw null;
    }

    @Override // defpackage.asmo
    public final void NZ(@dzsi Bundle bundle) {
        for (atcv atcvVar : this.a) {
            atcvVar.NZ(bundle);
        }
    }

    @Override // defpackage.asmo
    public final void Qo(Configuration configuration) {
        for (atcv atcvVar : this.a) {
            atcvVar.Qo(configuration);
        }
    }

    @Override // defpackage.asmo
    public final void Qp() {
        synchronized (this.i) {
            if (this.j) {
                this.i.clear();
            }
        }
        for (atcv atcvVar : this.a) {
            atcvVar.Qp();
        }
    }

    @Override // defpackage.asmo
    public final void Qr(Bundle bundle) {
        this.b.Qr(bundle);
        for (atcv atcvVar : this.a) {
            atcvVar.Qr(bundle);
        }
    }

    @Override // defpackage.asmo
    public final void b() {
        for (atcv atcvVar : this.a) {
            atcvVar.b();
        }
        this.b.b();
        this.b.I();
        if (this.h) {
            this.d.h(false);
            this.d.i(0.8f);
            this.d.j(dbsg.i(Float.valueOf(15.0f)));
        }
    }

    @Override // defpackage.asmo
    public final void c() {
        if (this.h) {
            this.d.j(dbpy.a);
            this.d.i(1.0f);
            this.d.h(true);
        }
        this.b.c();
        for (atcv atcvVar : this.a) {
            atcvVar.c();
        }
    }

    public final void h() {
        synchronized (this.i) {
            Iterator<Map.Entry<atcv, lix>> it = this.i.entrySet().iterator();
            if (!it.hasNext()) {
                this.j = false;
                return;
            }
            Map.Entry<atcv, lix> next = it.next();
            lix value = next.getValue();
            this.i.remove(next.getKey());
            value.a.Oc(value.b, value.c);
            this.g.execute(new Runnable(this) { // from class: liw
                private final liy a;

                {
                    this.a = this;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    this.a.h();
                }
            });
        }
    }

    @Override // defpackage.atcv
    public final void Oc(atlq atlqVar, @dzsi atlq atlqVar2) {
        if (atlqVar2 == null) {
            for (atcv atcvVar : this.a) {
                atcvVar.getClass();
                atcvVar.Oc(atlqVar, null);
                atcvVar.getClass();
            }
            return;
        }
        synchronized (this.i) {
            for (atcv atcvVar2 : this.a) {
                lix lixVar = this.i.get(atcvVar2);
                if (lixVar == null) {
                    this.i.put(atcvVar2, new lix(atcvVar2, atlqVar, atlqVar2));
                } else {
                    lixVar.b = atlqVar;
                }
            }
            if (this.j) {
                return;
            }
            this.j = true;
            this.g.execute(new Runnable(this) { // from class: liv
                private final liy a;

                {
                    this.a = this;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    this.a.h();
                }
            });
        }
    }
}
