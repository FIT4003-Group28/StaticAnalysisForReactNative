package defpackage;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import com.google.android.youtube.R;
/* compiled from: PG */
/* renamed from: lsv  reason: default package */
/* loaded from: classes3.dex */
public abstract class lsv extends ajxh implements ajwq {
    private final ajyi a;
    protected final ViewGroup b;
    protected final ajzq c;
    protected RecyclerView d;
    protected lsu e;
    protected View f;
    public boolean g;
    public boolean h;
    public aopa i;
    private final ajsg j;
    private auqa k;
    private boolean l;
    private ajsm m;
    private ajsf n;
    private lst o;

    public lsv(ViewGroup viewGroup, ajzq ajzqVar, ajsg ajsgVar, ajyi ajyiVar, aari aariVar, yni yniVar, yzj yzjVar, acti actiVar) {
        super(aariVar, yniVar, yzjVar, actiVar);
        viewGroup.getClass();
        this.b = viewGroup;
        ajyiVar.getClass();
        this.a = ajyiVar;
        this.c = ajzqVar;
        ajsgVar.getClass();
        this.j = ajsgVar;
        ajyiVar.a(auqa.class);
    }

    protected abstract void c(ajsm ajsmVar, aupw aupwVar, boolean z);

    /* JADX INFO: Access modifiers changed from: protected */
    public void d(ajrs ajrsVar, ajqm ajqmVar, int i) {
        ajrsVar.f("is_drawer_context", true);
        ajrsVar.f("avatar_selection_listener", this.e);
        ajrsVar.f("avatar_selection_controller", this.o);
        ajrsVar.f("sectionListController", this.c);
        akal.c(ajrsVar, this);
        if (i == 0) {
            ajrsVar.f("is_first_drawer_list", true);
        }
    }

    protected abstract void k();

    protected void l(ajsf ajsfVar) {
    }

    @Override // defpackage.ajwq
    public final /* synthetic */ void li(aumx aumxVar, zdt zdtVar, ajxo ajxoVar, apzg apzgVar) {
        throw null;
    }

    @Override // defpackage.ajwq
    public final void lx(aumx aumxVar, apzg apzgVar) {
        lr(ajna.g(aumxVar));
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.ajxh
    public final /* bridge */ /* synthetic */ void lz(Object obj, ajfy ajfyVar) {
        aupw aupwVar = (aupw) obj;
        super.lz(aupwVar, ajfyVar);
        if (aupwVar == null || ajfyVar != ajfy.RELOAD) {
            return;
        }
        c(this.m, aupwVar, true);
    }

    protected final void n(auqa auqaVar) {
        for (aupz aupzVar : auqaVar.b) {
            int i = aupzVar.b;
            if (i == 106506504) {
                c(this.m, (aupw) aupzVar.c, false);
            } else if (i == 117271479) {
                this.m.add((atni) aupzVar.c);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.ajxh
    public final /* bridge */ /* synthetic */ Object np(auna aunaVar) {
        if (aunaVar == null || !aunaVar.qn(aupw.b)) {
            return null;
        }
        return (aupw) aunaVar.qm(aupw.b);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v4, types: [java.lang.Object, ajsa] */
    public final void o() {
        if (this.g) {
            return;
        }
        if (this.k == null) {
            this.l = true;
            return;
        }
        this.f = this.b.findViewById(R.id.section_list_refresher);
        ((ViewStub) this.b.findViewById(R.id.drawer_stub)).inflate();
        this.d = (RecyclerView) this.b.findViewById(R.id.drawer_results);
        k();
        ajsf a = this.j.a(this.a.get());
        this.n = a;
        this.d.ad(a);
        l(this.n);
        ajsm ajsmVar = new ajsm();
        this.m = ajsmVar;
        this.n.h(ajsmVar);
        this.o = new lst();
        lsu lsuVar = new lsu(this);
        this.e = lsuVar;
        this.n.rZ(lsuVar);
        n(this.k);
        this.g = true;
    }

    public final void p(auqa auqaVar) {
        if (akzj.f(this.k, auqaVar)) {
            return;
        }
        this.k = auqaVar;
        if (!this.g) {
            if (!this.l) {
                return;
            }
            o();
            return;
        }
        this.i = null;
        this.m = new ajsm();
        n(auqaVar);
        this.n.h(this.m);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final void q(aupu aupuVar, boolean z) {
        if (aupuVar != null) {
            this.i = aupuVar.mo52toBuilder();
        }
        this.h = z;
    }

    public void r(int i) {
    }

    public void s(aopa aopaVar) {
        aupv aupvVar;
        aupv aupvVar2;
        aumx aumxVar;
        lst lstVar = this.o;
        aopa aopaVar2 = this.i;
        if (aopaVar2 != null) {
            lss lssVar = (lss) lstVar.a.get(aopaVar2.mo39build());
            if (lssVar != null) {
                lssVar.c((aupu) aopaVar2.mo39build(), false);
            }
            aopaVar2.copyOnWrite();
            aupu aupuVar = (aupu) aopaVar2.instance;
            aupu aupuVar2 = aupu.a;
            aupuVar.b |= 1024;
            aupuVar.l = false;
        }
        if (aopaVar != null) {
            lss lssVar2 = (lss) lstVar.a.get(aopaVar.mo39build());
            if (lssVar2 != null) {
                lssVar2.c((aupu) aopaVar.mo39build(), true);
            }
            aopaVar.copyOnWrite();
            aupu aupuVar3 = (aupu) aopaVar.instance;
            aupu aupuVar4 = aupu.a;
            aupuVar3.b |= 1024;
            aupuVar3.l = true;
        }
        this.i = aopaVar;
        if (aopaVar != null) {
            aupu aupuVar5 = (aupu) aopaVar.instance;
            if (aupuVar5.e == 11) {
                aupvVar = (aupv) aupuVar5.f;
            } else {
                aupvVar = aupv.a;
            }
            if (aupvVar.b != 60487319) {
                return;
            }
            this.c.h();
            ajzq ajzqVar = this.c;
            aupu aupuVar6 = (aupu) aopaVar.instance;
            if (aupuVar6.e == 11) {
                aupvVar2 = (aupv) aupuVar6.f;
            } else {
                aupvVar2 = aupv.a;
            }
            if (aupvVar2.b == 60487319) {
                aumxVar = (aumx) aupvVar2.c;
            } else {
                aumxVar = aumx.a;
            }
            ajzqVar.lr(ajna.g(aumxVar));
        }
    }
}
