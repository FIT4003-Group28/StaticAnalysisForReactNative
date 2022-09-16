package defpackage;

import com.google.android.libraries.elements.interfaces.Snapshot;
import java.util.concurrent.Callable;
import java.util.concurrent.atomic.AtomicReference;
/* compiled from: PG */
/* renamed from: aagm  reason: default package */
/* loaded from: classes.dex */
public final /* synthetic */ class aagm implements Callable {
    public final /* synthetic */ aagu a;
    public final /* synthetic */ String b;
    private final /* synthetic */ int c;

    public /* synthetic */ aagm(aagu aaguVar, String str) {
        this.a = aaguVar;
        this.b = str;
    }

    public /* synthetic */ aagm(aagu aaguVar, String str, int i) {
        this.c = i;
        this.a = aaguVar;
        this.b = str;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        int i = this.c;
        if (i == 0) {
            aagu aaguVar = this.a;
            String str = this.b;
            ayoi V = aagu.j(aaguVar.e, str).V(yps.r);
            azpx aO = azpt.e().aO();
            final aypg as = V.as(new aago(aO));
            return aO.ad(ampq.i(aaguVar.c.d(str))).D(new aypv() { // from class: aagl
                @Override // defpackage.aypv
                public final void a() {
                    ayqi.c((AtomicReference) aypg.this);
                }
            });
        } else if (i == 1) {
            aagu aaguVar2 = this.a;
            String str2 = this.b;
            aajy j = aagu.j(aaguVar2.e, str2);
            azpx aO2 = azpt.e().aO();
            final aypg as2 = j.as(new aago(aO2, 1));
            aagg aaggVar = aaguVar2.c;
            Snapshot a = aaggVar.a();
            aajj e = aaggVar.e(a, str2);
            aajn a2 = aajp.a();
            a2.c(str2);
            a2.b = e;
            awsz g = aaggVar.g(a, str2);
            if (g != null) {
                aqwb aqwbVar = g.c;
                if (aqwbVar == null) {
                    aqwbVar = aqwb.a;
                }
                a2.b(aajk.b(aqwbVar));
            }
            return aO2.ad(a2.a()).D(new aypv() { // from class: aagl
                @Override // defpackage.aypv
                public final void a() {
                    ayqi.c((AtomicReference) aypg.this);
                }
            }).R();
        } else {
            aagu aaguVar3 = this.a;
            return aaguVar3.c.d(this.b);
        }
    }
}
