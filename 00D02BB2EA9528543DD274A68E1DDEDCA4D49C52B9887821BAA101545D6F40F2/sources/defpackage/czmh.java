package defpackage;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.Callable;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: czmh  reason: default package */
/* loaded from: classes5.dex */
public final class czmh implements deff<Object> {
    public List<defg<czmk, ?>> a;
    final /* synthetic */ czml b;

    public czmh(czml czmlVar) {
        this.b = czmlVar;
    }

    @Override // defpackage.deff
    public final dehn<Object> a() {
        czml czmlVar = this.b;
        dazg dazgVar = czmlVar.e;
        String valueOf = String.valueOf(czmlVar.a);
        dazk b = dazgVar.b(valueOf.length() != 0 ? "Initialize ".concat(valueOf) : new String("Initialize "), dbab.a);
        try {
            synchronized (this.b.d) {
                if (this.a == null) {
                    czml czmlVar2 = this.b;
                    this.a = czmlVar2.f;
                    czmlVar2.f = Collections.emptyList();
                }
            }
            ArrayList arrayList = new ArrayList(this.a.size());
            czmk czmkVar = new czmk(this.b);
            for (defg<czmk, ?> defgVar : this.a) {
                try {
                    arrayList.add(defgVar.a(czmkVar));
                } catch (Exception e) {
                    arrayList.add(deha.b(e));
                }
            }
            dehn<Object> b2 = deha.n(arrayList).b(new Callable(this) { // from class: czmg
                private final czmh a;

                {
                    this.a = this;
                }

                @Override // java.util.concurrent.Callable
                public final Object call() {
                    czmh czmhVar = this.a;
                    synchronized (czmhVar.b.d) {
                        czmhVar.a = null;
                    }
                    return null;
                }
            }, dege.a);
            b.a(b2);
            if (b != null) {
                b.close();
            }
            return b2;
        } catch (Throwable th) {
            if (b != null) {
                try {
                    b.close();
                } catch (Throwable th2) {
                    deki.a(th, th2);
                }
            }
            throw th;
        }
    }
}
