package defpackage;

import io.grpc.Status;
import java.util.ArrayList;
import java.util.Collection;
/* compiled from: PG */
/* renamed from: ayiz  reason: default package */
/* loaded from: classes2.dex */
public final class ayiz implements Runnable {
    final /* synthetic */ ayje a;
    private final /* synthetic */ int b;

    public ayiz(ayje ayjeVar) {
        this.a = ayjeVar;
    }

    public ayiz(ayje ayjeVar, int i) {
        this.b = i;
        this.a = ayjeVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        ArrayList arrayList;
        int i = this.b;
        if (i != 0) {
            if (i == 1) {
                ayje ayjeVar = this.a;
                if (ayjeVar.c.w != null) {
                    return;
                }
                if (ayjeVar.a.get() == ayji.g) {
                    this.a.a.set(null);
                }
                this.a.c.z.a(ayji.d);
                return;
            }
            this.a.c.f();
            return;
        }
        if (this.a.a.get() == ayji.g) {
            this.a.a.set(null);
        }
        Collection<ayjd> collection = this.a.c.w;
        if (collection != null) {
            for (ayjd ayjdVar : collection) {
                ayjdVar.b("Channel is forcefully shutdown", null);
            }
        }
        ayjh ayjhVar = this.a.c.z;
        Status status = ayji.c;
        ayjhVar.a(status);
        synchronized (ayjhVar.a) {
            arrayList = new ArrayList(ayjhVar.b);
        }
        int size = arrayList.size();
        for (int i2 = 0; i2 < size; i2++) {
            ((ayeo) arrayList.get(i2)).c(status);
        }
        ayjhVar.d.y.k(status);
    }
}
