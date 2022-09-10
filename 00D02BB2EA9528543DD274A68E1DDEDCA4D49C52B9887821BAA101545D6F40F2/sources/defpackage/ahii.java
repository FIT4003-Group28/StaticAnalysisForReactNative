package defpackage;

import android.support.v7.widget.RecyclerView;
import java.lang.ref.WeakReference;
import java.util.List;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: ahii  reason: default package */
/* loaded from: classes2.dex */
public final class ahii implements degu<afzy> {
    final /* synthetic */ List a;
    final /* synthetic */ ahin b;

    public ahii(ahin ahinVar, List list) {
        this.b = ahinVar;
        this.a = list;
    }

    @Override // defpackage.degu
    public final void a(Throwable th) {
    }

    @Override // defpackage.degu
    public final /* bridge */ /* synthetic */ void b(afzy afzyVar) {
        final afzy afzyVar2 = afzyVar;
        ges gesVar = this.b.m.get();
        if (gesVar == null || !gesVar.aD) {
            return;
        }
        dbsk.s(afzyVar2);
        if (afzyVar2.a().d.isEmpty()) {
            return;
        }
        dlau dlauVar = afzyVar2.a().i;
        if (dlauVar == null) {
            dlauVar = dlau.e;
        }
        dsrj<dqau> dsrjVar = dlauVar.c;
        final List list = this.a;
        if (!dcft.j(dsrjVar, new dbsl(list) { // from class: ahig
            private final List a;

            {
                this.a = list;
            }

            @Override // defpackage.dbsl
            public final boolean a(Object obj) {
                List list2 = this.a;
                dqkn dqknVar = ((dqau) obj).b;
                if (dqknVar == null) {
                    dqknVar = dqkn.e;
                }
                return list2.contains(dqknVar.d);
            }
        })) {
            return;
        }
        this.b.n.g(new Runnable(this, afzyVar2) { // from class: ahih
            private final ahii a;
            private final afzy b;

            {
                this.a = this;
                this.b = afzyVar2;
            }

            @Override // java.lang.Runnable
            public final void run() {
                ahii ahiiVar = this.a;
                afzy afzyVar3 = this.b;
                ahin ahinVar = ahiiVar.b;
                WeakReference<RecyclerView> weakReference = ahinVar.p;
                RecyclerView recyclerView = weakReference == null ? null : weakReference.get();
                if (recyclerView == null) {
                    return;
                }
                recyclerView.n(0);
                recyclerView.postDelayed(new Runnable(ahinVar, afzyVar3) { // from class: ahib
                    private final ahin a;
                    private final afzy b;

                    {
                        this.a = ahinVar;
                        this.b = afzyVar3;
                    }

                    @Override // java.lang.Runnable
                    public final void run() {
                        ahin ahinVar2 = this.a;
                        afzy afzyVar4 = this.b;
                        ahinVar2.o.clear();
                        ahinVar2.E();
                        ahinVar2.K(afzyVar4);
                        ahinVar2.F(true);
                    }
                }, 500L);
            }
        });
    }
}
