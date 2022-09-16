package defpackage;

import android.content.Context;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.youtube.R;
import com.google.protos.youtube.api.innertube.ChipCloudRendererOuterClass;
import java.util.concurrent.atomic.AtomicReference;
/* compiled from: PG */
/* renamed from: mpc  reason: default package */
/* loaded from: classes3.dex */
public final class mpc extends ajsl {
    public final View a;
    public final azpq b;
    public ajwb c;
    public odd d;
    private final RecyclerView e;
    private final ajsm f;
    private final ajrc g;
    private final ntu h;
    private final aajl i;
    private final ayor j;
    private odb k;
    private aypg l;
    private String m;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v1, types: [java.lang.Object, ajsa] */
    public mpc(Context context, ajyi ajyiVar, ayor ayorVar, ajsg ajsgVar, aacz aaczVar, aagi aagiVar, afvn afvnVar) {
        this.j = ayorVar;
        if (eog.am(aaczVar)) {
            this.a = LayoutInflater.from(context).inflate(R.layout.related_chip_cloud_reduced_margins, (ViewGroup) null);
        } else {
            this.a = LayoutInflater.from(context).inflate(R.layout.related_chip_cloud, (ViewGroup) null);
        }
        RecyclerView recyclerView = (RecyclerView) this.a.findViewById(R.id.related_chip_cloud);
        this.e = recyclerView;
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager();
        linearLayoutManager.ab(0);
        recyclerView.ag(linearLayoutManager);
        recyclerView.af(null);
        ajsf b = ajsgVar.b(ajyiVar.get(), new ViewGroup.LayoutParams(-2, -2));
        this.b = azpq.e();
        ntu ntuVar = new ntu();
        this.h = ntuVar;
        ajrc ajrcVar = new ajrc();
        this.g = ajrcVar;
        ajrcVar.a = ntuVar;
        b.rZ(ajrcVar);
        b.rZ(new ajrt() { // from class: moz
            @Override // defpackage.ajrt
            public final void a(ajrs ajrsVar, ajqm ajqmVar, final int i) {
                final mpc mpcVar = mpc.this;
                fkg.f(ajrsVar, new ajrm() { // from class: moy
                    @Override // defpackage.ajrm
                    public final boolean h(View view) {
                        mpc mpcVar2 = mpc.this;
                        int i2 = i;
                        if (mpcVar2.d.e() == i2) {
                            mpcVar2.g(0);
                            mpcVar2.d.g();
                            return true;
                        }
                        mpcVar2.g(i2);
                        return false;
                    }
                });
                ajrsVar.g(amup.k("chipSelected", ajqmVar.c(i)));
                ajwb ajwbVar = mpcVar.c;
                if (ajwbVar != null) {
                    ajrsVar.g(amup.k("sectionListController", ajwbVar));
                }
                odd oddVar = mpcVar.d;
                if (oddVar != null) {
                    ajrsVar.g(amup.k("sectionController", oddVar));
                }
                fkg.e(ajrsVar, mpcVar.b.V(new faz(i, 3)));
            }
        });
        ajsm ajsmVar = new ajsm();
        this.f = ajsmVar;
        b.h(ajsmVar);
        recyclerView.ad(b);
        recyclerView.aC(new mpb(this, context.getResources().getDimensionPixelSize(R.dimen.watch_next_chip_left_margin)));
        this.i = aagiVar.a(afvnVar.c());
    }

    @Override // defpackage.ajru
    public final View a() {
        return this.a;
    }

    @Override // defpackage.ajsl
    protected final /* bridge */ /* synthetic */ void d(ajrs ajrsVar, Object obj) {
        aumr aumrVar = (aumr) obj;
        Object c = ajrsVar.c("watchNextChipsVisibilityPredicate");
        acti actiVar = null;
        ampt amptVar = c instanceof ampt ? (ampt) c : null;
        boolean z = amptVar == null || amptVar.a(this.a);
        ntu ntuVar = this.h;
        if (z) {
            actiVar = ajrsVar.a;
        }
        ntuVar.A(actiVar);
        Object c2 = ajrsVar.c("sectionListController");
        if (c2 instanceof ajwb) {
            this.c = (ajwb) c2;
        }
        Object c3 = ajrsVar.c("sectionController");
        if (!(c3 instanceof odd)) {
            zep.b("A RelatedChipsSectionController is required for the RelatedChipCloud.");
            return;
        }
        odd oddVar = (odd) c3;
        this.d = oddVar;
        int e = oddVar.e();
        aunb aunbVar = aumrVar.c;
        if (aunbVar == null) {
            aunbVar = aunb.a;
        }
        if (aunbVar.qn(ChipCloudRendererOuterClass.chipCloudRenderer)) {
            aunb aunbVar2 = aumrVar.c;
            if (aunbVar2 == null) {
                aunbVar2 = aunb.a;
            }
            for (apvk apvkVar : ((apvj) aunbVar2.qm(ChipCloudRendererOuterClass.chipCloudRenderer)).b) {
                int i = apvkVar.b;
                if (i == 91394224) {
                    apvg apvgVar = (apvg) apvkVar.c;
                    int size = this.f.size();
                    ajsm ajsmVar = this.f;
                    boolean z2 = size == e;
                    if (apvgVar.i != z2) {
                        aopa mo52toBuilder = apvgVar.mo52toBuilder();
                        mo52toBuilder.copyOnWrite();
                        apvg apvgVar2 = (apvg) mo52toBuilder.instance;
                        apvgVar2.b |= 256;
                        apvgVar2.i = z2;
                        apvgVar = (apvg) mo52toBuilder.mo39build();
                    }
                    ajsmVar.add(apvgVar);
                } else if (i == 65153809) {
                    this.f.add((apoj) apvkVar.c);
                }
            }
        }
        Object c4 = ajrsVar.c("related_chip_section_list_filter");
        if (c4 instanceof odb) {
            this.k = (odb) c4;
        }
        String str = aumrVar.e;
        this.m = str;
        if (amps.e(str)) {
            return;
        }
        this.l = this.i.h(this.m, true).I(kth.m).V(lyd.m).k(aumu.class).X(this.j).as(new ayqb() { // from class: mpa
            @Override // defpackage.ayqb
            public final void a(Object obj2) {
                mpc.this.f(((aumu) obj2).getSelectedChipIndex().intValue());
            }
        });
    }

    @Override // defpackage.ajsl
    protected final /* bridge */ /* synthetic */ byte[] e(Object obj) {
        aumr aumrVar = (aumr) obj;
        return null;
    }

    public final void f(int i) {
        if (this.d == null) {
            return;
        }
        this.e.ab(i);
        this.b.c(Integer.valueOf(i));
        odb odbVar = this.k;
        if (odbVar != null) {
            if (i == 0) {
                odbVar.b();
            } else if (this.d.e() == 0) {
                this.k.a();
            }
        }
        this.d.k(i);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void g(int i) {
        if (amps.e(this.m)) {
            f(i);
            return;
        }
        aajs c = this.i.c();
        String str = this.m;
        str.getClass();
        aqxo.z(!str.isEmpty(), "key cannot be empty");
        aopa createBuilder = aumv.a.createBuilder();
        createBuilder.copyOnWrite();
        aumv aumvVar = (aumv) createBuilder.instance;
        aumvVar.b |= 1;
        aumvVar.c = str;
        aums aumsVar = new aums(createBuilder);
        Long valueOf = Long.valueOf(i);
        aopa aopaVar = aumsVar.a;
        long longValue = valueOf.longValue();
        aopaVar.copyOnWrite();
        aumv aumvVar2 = (aumv) aopaVar.instance;
        aumvVar2.b |= 2;
        aumvVar2.d = longValue;
        c.j(aumsVar);
        c.b().Q();
    }

    @Override // defpackage.ajru
    public final void qZ(ajsa ajsaVar) {
        aypg aypgVar = this.l;
        if (aypgVar != null && !aypgVar.e()) {
            ayqi.c((AtomicReference) this.l);
        }
        this.m = null;
        this.f.clear();
        this.d = null;
        this.c = null;
        this.k = null;
    }
}
