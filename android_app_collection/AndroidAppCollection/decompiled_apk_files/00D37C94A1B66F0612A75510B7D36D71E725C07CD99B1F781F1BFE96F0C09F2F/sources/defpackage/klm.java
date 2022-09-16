package defpackage;

import android.graphics.Rect;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
/* compiled from: PG */
/* renamed from: klm  reason: default package */
/* loaded from: classes3.dex */
public final class klm {
    public final RecyclerView a;
    public final ajsm b;
    public final Rect c;
    public final int d;
    public final int e;
    public final axnm f;
    public final aadd g;
    public asjj h;

    public klm(klh klhVar, klj kljVar, klj kljVar2, ajsg ajsgVar, azqb azqbVar, axnm axnmVar, aadd aaddVar, RecyclerView recyclerView, byte[] bArr) {
        this.a = recyclerView;
        this.f = axnmVar;
        this.g = aaddVar;
        ajsm ajsmVar = new ajsm();
        this.b = ajsmVar;
        this.c = new Rect();
        this.d = recyclerView.getPaddingLeft();
        this.e = recyclerView.getPaddingRight();
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager();
        linearLayoutManager.ab(0);
        recyclerView.ag(linearLayoutManager);
        ajqw ajqwVar = new ajqw();
        ajqwVar.f(arbl.class, klhVar);
        ajqwVar.f(arbh.class, kljVar);
        ajqwVar.f(aqtb.class, kljVar2);
        ajqwVar.f(ajhh.class, new ajsc(azqbVar));
        ajsf a = ajsgVar.a(ajqwVar);
        a.h(ajsmVar);
        a.q(true);
        recyclerView.s = true;
        recyclerView.ad(a);
        a.rZ(new ajrt() { // from class: kll
            @Override // defpackage.ajrt
            public final void a(ajrs ajrsVar, ajqm ajqmVar, int i) {
                asjj asjjVar;
                klm klmVar = klm.this;
                if (ajqmVar.c(i) instanceof arbl) {
                    ajrsVar.f("ITEM_COUNT", Integer.valueOf(ajqmVar.a()));
                } else if (!(ajqmVar.c(i) instanceof arbh) || (asjjVar = klmVar.h) == null) {
                } else {
                    ajrsVar.c = asjjVar;
                }
            }
        });
    }
}
