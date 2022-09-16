package defpackage;

import java.util.Iterator;
import java.util.List;
/* compiled from: PG */
/* renamed from: abij  reason: default package */
/* loaded from: classes.dex */
public class abij extends ajxh {
    public boolean a;
    public boolean b;
    final /* synthetic */ abiq c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public abij(abiq abiqVar, aari aariVar, yni yniVar, final yzj yzjVar, acti actiVar) {
        super(aariVar, yniVar, yzjVar, actiVar);
        this.c = abiqVar;
        this.D = new ajxb() { // from class: abih
            @Override // defpackage.ajxb
            public final void a(cff cffVar, final ajfz ajfzVar) {
                final abij abijVar = abij.this;
                yzj yzjVar2 = yzjVar;
                abkq o = abijVar.c.o();
                if (o != null) {
                    o.z(yzjVar2.b(cffVar), new Runnable() { // from class: abii
                        @Override // java.lang.Runnable
                        public final void run() {
                            abij.this.lr(ajfzVar);
                        }
                    });
                }
                abis abisVar = abijVar.c.w;
                if (abisVar != null) {
                    abisVar.f();
                }
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public static final assn l(auna aunaVar) {
        if (aunaVar == null || !aunaVar.qn(assn.b)) {
            return null;
        }
        return (assn) aunaVar.qm(assn.b);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final void k(assn assnVar) {
        this.c.t(assnVar);
    }

    @Override // defpackage.ajxh
    protected final boolean lo() {
        return false;
    }

    @Override // defpackage.ajxh
    protected final void lq(aapd aapdVar, ajxa ajxaVar) {
        if (!(aapdVar instanceof aays)) {
            return;
        }
        aays aaysVar = (aays) aapdVar;
        if (this.a) {
            aaysVar.d = true;
        }
        if (this.b) {
            aaysVar.s = true;
        }
        abiq abiqVar = this.c;
        if (abiqVar.v && !abiqVar.u) {
            aaysVar.c = true;
        }
        abiqVar.v = false;
        if (!ajxaVar.a) {
            return;
        }
        aaysVar.t = true;
    }

    @Override // defpackage.ajxh
    public final void ls(List list) {
        super.ls(list);
        Iterator it = list.iterator();
        while (it.hasNext()) {
            byte[] d = ((ajfz) it.next()).d();
            if (d != null) {
                this.c.q.oi().D(new acte(d));
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.ajxh
    public final /* bridge */ /* synthetic */ void lz(Object obj, ajfy ajfyVar) {
        k((assn) obj);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.ajxh
    public final /* bridge */ /* synthetic */ Object np(auna aunaVar) {
        return l(aunaVar);
    }
}
