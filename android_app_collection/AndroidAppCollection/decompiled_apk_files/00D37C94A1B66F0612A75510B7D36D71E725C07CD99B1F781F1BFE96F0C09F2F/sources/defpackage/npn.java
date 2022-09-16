package defpackage;

import com.google.protos.youtube.api.innertube.ButtonRendererOuterClass;
import com.google.protos.youtube.api.innertube.PrependNewerCommentsCommandOuterClass$PrependNewerCommentsCommand;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Timer;
/* compiled from: PG */
/* renamed from: npn  reason: default package */
/* loaded from: classes3.dex */
public final class npn extends ajxh implements nnc {
    public List a;
    private final npr b;
    private boolean c;
    private final boolean d;

    public npn(aari aariVar, yni yniVar, yzj yzjVar, acti actiVar, npr nprVar, aacz aaczVar) {
        super(aariVar, yniVar, yzjVar, actiVar);
        this.b = nprVar;
        apzt apztVar = aaczVar.b().z;
        this.d = (apztVar == null ? apzt.a : apztVar).i;
    }

    @Override // defpackage.nnc
    public final void d() {
        f();
    }

    @Override // defpackage.nnc
    public final /* synthetic */ void e() {
    }

    public final void f() {
        if (this.d) {
            this.b.f();
            this.b.o();
            Y();
            A();
        }
    }

    @Override // defpackage.nnc
    public final void h() {
        this.b.e();
        List list = this.a;
        if (list != null) {
            k(list);
        }
    }

    public final void i() {
        if (this.d) {
            this.c = true;
            Y();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void k(List list) {
        List arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            asls aslsVar = (asls) it.next();
            if ((aslsVar.b & 8) != 0 && !this.c) {
                avia aviaVar = aslsVar.f;
                if (aviaVar == null) {
                    aviaVar = avia.a;
                }
                this.b.t = aviaVar.c - 500;
                ajfz g = ajna.g(aviaVar);
                ae(g, g, new Timer());
                arrayList.add(ajna.g(aviaVar));
            }
        }
        ls(arrayList);
    }

    public final void l() {
        if (this.d) {
            this.c = false;
            h();
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.ajxh
    public final /* bridge */ /* synthetic */ void lz(Object obj, ajfy ajfyVar) {
        auqh auqhVar = (auqh) obj;
        if (auqhVar == null || ajfyVar != ajfy.TIMED) {
            return;
        }
        npr nprVar = this.b;
        if (nprVar.r) {
            return;
        }
        auqd auqdVar = auqhVar.n;
        if (auqdVar == null) {
            auqdVar = auqd.a;
        }
        aunb aunbVar = auqdVar.c;
        if (aunbVar == null) {
            aunbVar = aunb.a;
        }
        apoj apojVar = (apoj) aunbVar.qm(ButtonRendererOuterClass.buttonRenderer);
        apzg apzgVar = apojVar.p;
        if (apzgVar == null) {
            apzgVar = apzg.a;
        }
        nprVar.q = ((PrependNewerCommentsCommandOuterClass$PrependNewerCommentsCommand) apzgVar.qm(PrependNewerCommentsCommandOuterClass$PrependNewerCommentsCommand.prependNewerCommentsCommand)).b;
        nprVar.s = !nprVar.q.isEmpty();
        if ((apojVar.b & 256) != 0) {
            arag aragVar = apojVar.i;
            if (aragVar == null) {
                aragVar = arag.a;
            }
            nprVar.j = ampq.j(ajgl.b(aragVar));
            nprVar.l = ampq.j(new acte(apojVar.t));
            if (nprVar.l.h()) {
                nprVar.k.D((acum) nprVar.l.c());
            }
            nprVar.d("");
            Timer timer = nprVar.n;
            if (timer != null) {
                timer.cancel();
            }
            nprVar.n = new Timer();
            nprVar.n.schedule(new npq(nprVar), nprVar.t);
        }
        if (auqhVar.d.size() <= 1 || (((auqk) auqhVar.d.get(1)).b & 16) == 0) {
            return;
        }
        aslq aslqVar = ((auqk) auqhVar.d.get(1)).j;
        if (aslqVar == null) {
            aslqVar = aslq.a;
        }
        aopu aopuVar = aslqVar.f;
        this.a = aopuVar;
        k((List) aopuVar);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.ajxh
    public final /* bridge */ /* synthetic */ Object np(auna aunaVar) {
        return (auqh) aunaVar.qm(auqh.b);
    }

    @Override // defpackage.nnc
    public final void pc() {
        f();
    }

    @Override // defpackage.nnc
    public final void pd() {
        if (this.d) {
            this.b.f();
            npr nprVar = this.b;
            nprVar.r = false;
            nprVar.o();
            Y();
            A();
            this.a = null;
        }
    }
}
