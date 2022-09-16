package defpackage;

import android.support.v7.widget.RecyclerView;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: stz  reason: default package */
/* loaded from: classes4.dex */
public final class stz extends ne {
    final /* synthetic */ tfw a;
    final /* synthetic */ tcu b;
    final /* synthetic */ tcr c;
    final /* synthetic */ tda d;
    final /* synthetic */ AtomicReference e;
    final /* synthetic */ AtomicBoolean f;
    final /* synthetic */ tfw g;
    final /* synthetic */ tfw h;
    final /* synthetic */ int i;

    public stz(tfw tfwVar, tcu tcuVar, tcr tcrVar, tda tdaVar, AtomicReference atomicReference, AtomicBoolean atomicBoolean, tfw tfwVar2, int i, tfw tfwVar3) {
        this.a = tfwVar;
        this.b = tcuVar;
        this.c = tcrVar;
        this.d = tdaVar;
        this.e = atomicReference;
        this.f = atomicBoolean;
        this.g = tfwVar2;
        this.i = i;
        this.h = tfwVar3;
    }

    @Override // defpackage.ne
    public final void j(RecyclerView recyclerView, int i, int i2) {
        tfw tfwVar = this.a;
        if (tfwVar != null) {
            tcu tcuVar = this.b;
            awmt a = tfwVar.a();
            tcr tcrVar = this.c;
            tda tdaVar = this.d;
            sub.a(recyclerView, tcuVar, a, tcrVar, tdaVar.u, tdaVar.r);
        }
        AtomicReference atomicReference = this.e;
        if (atomicReference == null || atomicReference.get() == null) {
            return;
        }
        ((tes) this.e.get()).b(recyclerView, i, i2);
    }

    @Override // defpackage.ne
    public final void i(RecyclerView recyclerView, int i) {
        tfw tfwVar;
        if (i != 0) {
            if (i != 1 || !this.f.compareAndSet(false, true) || (tfwVar = this.h) == null) {
                return;
            }
            tcu tcuVar = this.b;
            awmt a = tfwVar.a();
            tcr tcrVar = this.c;
            tda tdaVar = this.d;
            sub.a(recyclerView, tcuVar, a, tcrVar, tdaVar.u, tdaVar.r);
        } else if (!this.f.compareAndSet(true, false)) {
        } else {
            tfw tfwVar2 = this.g;
            if (tfwVar2 != null) {
                tcu tcuVar2 = this.b;
                awmt a2 = tfwVar2.a();
                tcr tcrVar2 = this.c;
                tda tdaVar2 = this.d;
                sub.a(recyclerView, tcuVar2, a2, tcrVar2, tdaVar2.u, tdaVar2.r);
            }
            if (this.i != 2) {
                return;
            }
            tda tdaVar3 = this.d;
            int i2 = sub.a;
            awoc c = tdaVar3.c();
            tee b = tdaVar3.b();
            if (b == null || c == null) {
                return;
            }
            b.a(c, 3);
        }
    }
}
