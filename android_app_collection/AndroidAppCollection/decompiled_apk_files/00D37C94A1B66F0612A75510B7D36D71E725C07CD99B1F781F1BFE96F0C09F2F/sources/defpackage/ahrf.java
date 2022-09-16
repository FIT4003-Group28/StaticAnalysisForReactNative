package defpackage;

import android.content.Context;
import android.view.ViewGroup;
import com.google.android.youtube.R;
/* compiled from: PG */
/* renamed from: ahrf  reason: default package */
/* loaded from: classes.dex */
public final class ahrf implements ahku, airt, ajxc {
    public final acti a;
    public ahrj b;
    public aubm[] c;
    private final Context d;
    private final ViewGroup e;
    private final ajmy f;
    private final aafo g;

    public ahrf(acti actiVar, Context context, ViewGroup viewGroup, ajmy ajmyVar, aafo aafoVar) {
        actiVar.getClass();
        this.a = actiVar;
        this.d = context;
        viewGroup.getClass();
        this.e = viewGroup;
        ajmyVar.getClass();
        this.f = ajmyVar;
        aafoVar.getClass();
        this.g = aafoVar;
    }

    @Override // defpackage.ajxc
    public final void a(ajga ajgaVar) {
    }

    @Override // defpackage.airt
    public final aypg[] g(airw airwVar) {
        return new aypg[]{airwVar.ao().aa(new ayqb() { // from class: ahre
            @Override // defpackage.ayqb
            public final void a(Object obj) {
                ahrj ahrjVar;
                ahlp ahlpVar;
                ahlo ahloVar;
                ahrf ahrfVar = ahrf.this;
                ahhm ahhmVar = (ahhm) obj;
                aubk aubkVar = null;
                if (ahhmVar.a() != null && ahhmVar.a().i != null) {
                    aubb aubbVar = ahhmVar.a().i.g;
                    if (aubbVar == null) {
                        aubbVar = aubb.a;
                    }
                    if ((aubbVar.b & 1) != 0) {
                        aubb aubbVar2 = ahhmVar.a().i.g;
                        if (aubbVar2 == null) {
                            aubbVar2 = aubb.a;
                        }
                        aubkVar = aubbVar2.c;
                        if (aubkVar == null) {
                            aubkVar = aubk.a;
                        }
                    }
                }
                if (ahhmVar.c() == aijx.VIDEO_LOADING && (ahrjVar = ahrfVar.b) != null && (ahlpVar = ahrjVar.i) != null && (ahloVar = ahlpVar.k) != null) {
                    ahloVar.removeAllViews();
                }
                if (aubkVar != null) {
                    int min = Math.min(4, aubkVar.d.size());
                    ahrfVar.c = new aubm[min];
                    System.arraycopy(aubkVar.d.toArray(new aubm[0]), 0, ahrfVar.c, 0, min);
                    ahrj ahrjVar2 = ahrfVar.b;
                    if (ahrjVar2 != null) {
                        ahrjVar2.c(ahrfVar.c);
                    }
                    ahrfVar.a.D(new acte(aubkVar.g));
                }
            }
        }, ahqs.c)};
    }

    @Override // defpackage.ahku
    public final void qT(ahof ahofVar, ahob ahobVar) {
        ahrj ahrjVar = new ahrj(this.d, ahobVar, ahobVar.a().clone(), this.f, this.e, this.g);
        this.b = ahrjVar;
        azqb c = ahofVar.a.c();
        ahrh ahrhVar = ahrjVar.h;
        float a = ahrhVar.a(R.dimen.watch_next_item_width);
        float a2 = ahrhVar.a(R.dimen.watch_next_item_margin);
        float a3 = ahom.a((a + a2 + a2) * 4.0f);
        ahrh ahrhVar2 = ahrjVar.h;
        float a4 = ahrhVar2.a(R.dimen.watch_next_item_width);
        float a5 = ahrhVar2.a(R.dimen.thumbnail_margin);
        float a6 = ahrhVar2.a(R.dimen.text_margin);
        float a7 = ahrhVar2.a(R.dimen.text_size_medium);
        float a8 = ahrhVar2.a(R.dimen.text_size_small);
        float a9 = ahrhVar2.a(R.dimen.watch_next_item_margin);
        float a10 = ahrhVar2.a(R.dimen.watch_next_item_margin);
        float a11 = ahom.a((a4 / 1.7777778f) + a5 + a5 + a6 + a6 + a7 + a8 + a9 + a10 + a10);
        ahrjVar.i = new ahlp(ahrjVar.e, ahrjVar.g, a3, a11, ahrjVar.f.clone(), c);
        ahrjVar.q(ahrjVar.i);
        ahrjVar.p(a3, a11);
        this.b.n(0.0f, -30.0f, 0.0f);
        ahobVar.d(this.b);
        ahrj ahrjVar2 = this.b;
        ahobVar.m = ahrjVar2;
        aubm[] aubmVarArr = this.c;
        if (aubmVarArr != null) {
            ahrjVar2.c(aubmVarArr);
        }
    }

    @Override // defpackage.ahku
    public final void qU() {
        this.b = null;
    }
}
