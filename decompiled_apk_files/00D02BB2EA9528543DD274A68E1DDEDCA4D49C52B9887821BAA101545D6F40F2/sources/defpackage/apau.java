package defpackage;

import android.view.View;
import java.util.BitSet;
import java.util.HashSet;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: apau  reason: default package */
/* loaded from: classes2.dex */
public final class apau implements ango {
    final /* synthetic */ BitSet a;
    final /* synthetic */ aoyg b;
    final /* synthetic */ HashSet c;
    final /* synthetic */ apav d;

    public apau(apav apavVar, BitSet bitSet, aoyg aoygVar, HashSet hashSet) {
        this.d = apavVar;
        this.a = bitSet;
        this.b = aoygVar;
        this.c = hashSet;
    }

    @Override // defpackage.ango
    public final void c(dcdc dcdcVar) {
    }

    @Override // defpackage.ango
    public final void d(dcdc dcdcVar) {
    }

    @Override // defpackage.ango
    public final void e(duyc duycVar, duye duyeVar) {
        gga ggaVar = this.d.af;
        final BitSet bitSet = this.a;
        ggaVar.runOnUiThread(new Runnable(this, bitSet) { // from class: apas
            private final apau a;
            private final BitSet b;

            {
                this.a = this;
                this.b = bitSet;
            }

            @Override // java.lang.Runnable
            public final void run() {
                this.a.d.g.d(this.b.cardinality());
            }
        });
    }

    @Override // defpackage.ango
    public final void f(duyc duycVar) {
        gga ggaVar = this.d.af;
        final BitSet bitSet = this.a;
        final aoyg aoygVar = this.b;
        final HashSet hashSet = this.c;
        ggaVar.runOnUiThread(new Runnable(this, bitSet, aoygVar, hashSet) { // from class: apar
            private final apau a;
            private final BitSet b;
            private final aoyg c;
            private final HashSet d;

            {
                this.a = this;
                this.b = bitSet;
                this.c = aoygVar;
                this.d = hashSet;
            }

            @Override // java.lang.Runnable
            public final void run() {
                final apau apauVar = this.a;
                BitSet bitSet2 = this.b;
                aoyg aoygVar2 = this.c;
                HashSet hashSet2 = this.d;
                apauVar.d.am = (BitSet) bitSet2.clone();
                for (int i = 0; i < aoygVar2.c().size(); i++) {
                    if (bitSet2.get(i)) {
                        hashSet2.remove(aoygVar2.c().get(i).a().ai());
                    }
                }
                apauVar.d.g.e(bitSet2.cardinality(), new View.OnClickListener(apauVar) { // from class: apat
                    private final apau a;

                    {
                        this.a = apauVar;
                    }

                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        this.a.d.aJ();
                    }
                });
                apauVar.d.q();
            }
        });
    }
}
