package defpackage;

import com.google.android.libraries.elements.interfaces.IntersectionCriteria;
import com.google.android.libraries.elements.interfaces.IntersectionObserver;
import java.util.ArrayList;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;
/* compiled from: PG */
/* renamed from: sxp  reason: default package */
/* loaded from: classes4.dex */
public final class sxp extends IntersectionObserver {
    public final tcu a;
    public final tcs b;
    public tfw c;
    public boolean d;
    private final ArrayList e;
    private tfw f;
    private tfw g;
    private IntersectionCriteria h;
    private IntersectionCriteria i;
    private long j;
    private boolean k;
    private aypg l;

    public sxp(axmx axmxVar, tcu tcuVar, tcs tcsVar, tfy tfyVar) {
        int b;
        this.a = tcuVar;
        this.b = tcsVar;
        ArrayList arrayList = new ArrayList();
        this.e = arrayList;
        if (axmxVar.aG() != null) {
            IntersectionCriteria f = tfy.f(axmxVar.aG());
            this.h = f;
            arrayList.add(f);
        }
        if (axmxVar.aH() != null) {
            IntersectionCriteria f2 = tfy.f(axmxVar.aH());
            this.i = f2;
            arrayList.add(f2);
        }
        if (this.h == null || this.i == null) {
            arrayList.clear();
            return;
        }
        aodt aodtVar = new aodt();
        int b2 = axmxVar.b(8);
        aodt aodtVar2 = null;
        if (b2 != 0) {
            aodtVar.f(axmxVar.a(b2 + axmxVar.a), axmxVar.b);
        } else {
            aodtVar = null;
        }
        this.f = tfyVar.g(aodtVar);
        aodt aodtVar3 = new aodt();
        int b3 = axmxVar.b(10);
        if (b3 != 0) {
            aodtVar3.f(axmxVar.a(b3 + axmxVar.a), axmxVar.b);
        } else {
            aodtVar3 = null;
        }
        this.g = tfyVar.g(aodtVar3);
        aodt aodtVar4 = new aodt();
        int b4 = axmxVar.b(12);
        if (b4 != 0) {
            aodtVar4.f(axmxVar.a(b4 + axmxVar.a), axmxVar.b);
            aodtVar2 = aodtVar4;
        }
        this.c = tfyVar.g(aodtVar2);
        this.j = Math.max(axmxVar.b(14) != 0 ? axmxVar.b.getInt(b + axmxVar.a) & 4294967295L : 0L, 0L);
    }

    @Override // com.google.android.libraries.elements.interfaces.IntersectionObserver
    public final void criteriaMatched(ArrayList arrayList) {
        tfw tfwVar;
        if (arrayList.isEmpty()) {
            return;
        }
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            IntersectionCriteria intersectionCriteria = (IntersectionCriteria) arrayList.get(i);
            if (akzj.f(intersectionCriteria, this.h)) {
                if (!this.k) {
                    this.k = true;
                    tfw tfwVar2 = this.f;
                    if (tfwVar2 != null) {
                        this.a.b(tfwVar2.a(), this.b).B(azpj.c()).Q();
                    }
                    if (this.c != null) {
                        aypg as = ayoi.ai(this.j, TimeUnit.MILLISECONDS, azpj.a()).as(new ayqb() { // from class: sxo
                            @Override // defpackage.ayqb
                            public final void a(Object obj) {
                                sxp sxpVar = sxp.this;
                                Long l = (Long) obj;
                                tfw tfwVar3 = sxpVar.c;
                                if (tfwVar3 != null) {
                                    sxpVar.a.b(tfwVar3.a(), sxpVar.b).Q();
                                    sxpVar.d = true;
                                }
                            }
                        });
                        this.l = as;
                        ayqh ayqhVar = this.b.i.f;
                        if (ayqhVar != null) {
                            ayqhVar.d(as);
                        }
                    }
                }
            } else if (akzj.f(intersectionCriteria, this.i)) {
                aypg aypgVar = this.l;
                if (aypgVar != null) {
                    ayqi.c((AtomicReference) aypgVar);
                }
                if (this.k && !this.d && (tfwVar = this.g) != null) {
                    this.a.b(tfwVar.a(), this.b).Q();
                }
                this.k = false;
                this.d = false;
            }
        }
    }

    @Override // com.google.android.libraries.elements.interfaces.IntersectionObserver
    public final ArrayList getCriteriaList() {
        return this.e;
    }
}
