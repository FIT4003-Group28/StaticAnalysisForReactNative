package defpackage;

import java.util.ArrayList;
import java.util.concurrent.CancellationException;
import java.util.concurrent.TimeoutException;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: clko  reason: default package */
/* loaded from: classes5.dex */
public final class clko implements degu<Void> {
    final /* synthetic */ clkq a;
    final /* synthetic */ clks b;

    public clko(clks clksVar, clkq clkqVar) {
        this.b = clksVar;
        this.a = clkqVar;
    }

    @Override // defpackage.degu
    public final void a(Throwable th) {
        ArrayList arrayList;
        if (th instanceof TimeoutException) {
            this.b.b(this.a);
        } else if (!(th instanceof CancellationException)) {
            clks clksVar = this.b;
            synchronized (clksVar.i) {
                arrayList = new ArrayList(clksVar.h);
                clksVar.h.clear();
            }
            int size = arrayList.size();
            for (int i = 0; i < size; i++) {
                ((degp) arrayList.get(i)).cancel(true);
            }
        } else {
            this.b.a();
        }
    }

    @Override // defpackage.degu
    public final /* bridge */ /* synthetic */ void b(Void r2) {
        this.b.b(this.a);
    }
}
