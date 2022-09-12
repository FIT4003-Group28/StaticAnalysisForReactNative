package defpackage;

import java.util.ArrayDeque;
import java.util.Iterator;
/* compiled from: PG */
/* renamed from: phc  reason: default package */
/* loaded from: classes7.dex */
public final class phc<V> extends phh<pfo<V>> implements pfe<V> {
    private final pim<V> b;
    private final dbty<Boolean> c;
    private final boolean d;
    private final crzo<pfo<V>> a = new crzo<>();
    private final ArrayDeque<pfm<V>> e = new ArrayDeque<>();

    public phc(pim<V> pimVar, dbty<Boolean> dbtyVar, boolean z) {
        this.b = pimVar;
        this.c = dbtyVar;
        this.d = z;
    }

    @Override // defpackage.pfe
    public final void a(pfo<V> pfoVar) {
        dfoo dfooVar;
        pfm<V> peekLast;
        if (!this.d || this.c.a().booleanValue()) {
            pfm<V> pfmVar = pfoVar.a;
            if (pfmVar != null && (dfooVar = pfmVar.c) != null) {
                int a = dfon.a(dfooVar.b);
                if (a == 0 || a != 3) {
                    this.b.b(pfmVar);
                } else {
                    synchronized (this) {
                        pfn pfnVar = pfn.CONTEXT_STARTED;
                        int ordinal = pfoVar.b.ordinal();
                        if (ordinal == 0) {
                            this.e.offerLast(pfmVar);
                        } else if (ordinal == 1 && (peekLast = this.e.peekLast()) != null && peekLast.b.equals(pfmVar.b)) {
                            pfm<V> pollLast = this.e.pollLast();
                            dbsk.s(pollLast);
                            if (!(!dzvx.d(pollLast.b, pfmVar.b))) {
                                dfoo dfooVar2 = pfmVar.c;
                                dfoo dfooVar3 = null;
                                if (dfooVar2 != null) {
                                    long j = dfooVar2.d;
                                    dfoo dfooVar4 = pollLast.c;
                                    if (dfooVar4 != null) {
                                        dsqp dsqpVar = (dsqp) dfooVar4.cu(5);
                                        dsqpVar.bC(dfooVar4);
                                        dfol dfolVar = (dfol) dsqpVar;
                                        if (dfolVar != null) {
                                            if (dfolVar.c) {
                                                dfolVar.bF();
                                                dfolVar.c = false;
                                            }
                                            dfoo dfooVar5 = (dfoo) dfolVar.b;
                                            dfooVar5.b = 3;
                                            int i = dfooVar5.a | 1;
                                            dfooVar5.a = i;
                                            dfooVar5.a = i | 4;
                                            dfooVar5.d = j;
                                            dfooVar3 = dfolVar.bK();
                                        }
                                    }
                                }
                                pollLast = new pfm<>(pollLast.a, pollLast.b, dfooVar3, pollLast.d, pollLast.e);
                            }
                            this.b.b(pollLast);
                            pfoVar = new pfo<>(pollLast, pfn.CONTEXT_ENDED);
                        }
                    }
                }
            }
            d(pfoVar);
        }
    }

    @Override // defpackage.pfe
    public final void b() {
        synchronized (this) {
            Iterator<pfm<V>> it = this.e.iterator();
            while (it.hasNext()) {
                this.b.b(it.next());
            }
            this.e.clear();
        }
    }

    @Override // defpackage.pfh
    public final void c(pfg pfgVar) {
    }

    @Override // defpackage.pfh
    public final void e() {
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.phh
    public final void m(pfh<? super pfo<V>> pfhVar) {
        phb phbVar = new phb(pfhVar, this.a.a);
        pfhVar.c(phbVar);
        this.a.a.a(phbVar, dege.a);
    }

    @Override // defpackage.pfh
    /* renamed from: n */
    public final void d(pfo<V> pfoVar) {
        this.a.a(pfoVar);
    }
}
