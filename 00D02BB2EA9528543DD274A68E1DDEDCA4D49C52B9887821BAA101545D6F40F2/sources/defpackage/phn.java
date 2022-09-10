package defpackage;

import java.util.ArrayList;
import java.util.List;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: phn  reason: default package */
/* loaded from: classes7.dex */
public final class phn<T> extends phh<pfm<T>> implements pfg {
    public volatile boolean a;
    @dzsi
    dehn<List<pfm<T>>> b;
    private final pim<T> c;
    private final long d;

    public phn(pim<T> pimVar, long j) {
        this.c = pimVar;
        this.d = j;
    }

    @Override // defpackage.pfg
    public final void a() {
        dehn<List<pfm<T>>> dehnVar = this.b;
        if (dehnVar != null && !dehnVar.isDone()) {
            this.b.cancel(true);
        }
        this.b = null;
        this.a = true;
    }

    @Override // defpackage.pfg
    public final boolean b() {
        return this.a;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.phh
    public final void m(pfh<? super pfm<T>> pfhVar) {
        pfhVar.c(this);
        pim<T> pimVar = this.c;
        final long j = this.d;
        dehn<List<pfm<T>>> h = deew.h(pimVar.a(), new dbrn(j) { // from class: pik
            private final long a;

            {
                this.a = j;
            }

            @Override // defpackage.dbrn
            public final Object a(Object obj) {
                long j2 = this.a;
                dcdc dcdcVar = (dcdc) obj;
                ArrayList arrayList = new ArrayList();
                if (dcdcVar == null) {
                    return dcdc.e();
                }
                int size = dcdcVar.size();
                for (int i = 0; i < size; i++) {
                    pfm pfmVar = (pfm) dcdcVar.get(i);
                    if (pim.e(pfmVar == null ? null : pfmVar.c) >= j2) {
                        arrayList.add(pfmVar);
                    }
                }
                return dcdc.w(pim.g.c(), arrayList);
            }
        }, dege.a);
        this.b = h;
        deha.q(h, new phm(this, pfhVar), dege.a);
    }
}
