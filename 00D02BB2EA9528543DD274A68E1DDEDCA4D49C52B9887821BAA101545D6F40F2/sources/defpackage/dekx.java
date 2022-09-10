package defpackage;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.atomic.AtomicReference;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: dekx  reason: default package */
/* loaded from: classes6.dex */
public final class dekx implements cnpe {
    public static final AtomicReference<dekx> a = new AtomicReference<>();

    @Override // defpackage.cnpe
    public final void a(boolean z) {
        synchronized (dela.a) {
            Iterator it = new ArrayList(dela.b.values()).iterator();
            while (it.hasNext()) {
                dela delaVar = (dela) it.next();
                if (delaVar.d.get()) {
                    for (dekw dekwVar : delaVar.e) {
                        dekwVar.a();
                    }
                }
            }
        }
    }
}
