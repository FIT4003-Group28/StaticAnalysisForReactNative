package defpackage;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.atomic.AtomicReference;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: anwd  reason: default package */
/* loaded from: classes.dex */
public final class anwd implements qtr {
    public static final AtomicReference a = new AtomicReference();

    @Override // defpackage.qtr
    public final void a(boolean z) {
        synchronized (anwg.a) {
            Iterator it = new ArrayList(anwg.b.values()).iterator();
            while (it.hasNext()) {
                anwg anwgVar = (anwg) it.next();
                if (anwgVar.d.get()) {
                    for (anwc anwcVar : anwgVar.e) {
                        anwcVar.a();
                    }
                }
            }
        }
    }
}
