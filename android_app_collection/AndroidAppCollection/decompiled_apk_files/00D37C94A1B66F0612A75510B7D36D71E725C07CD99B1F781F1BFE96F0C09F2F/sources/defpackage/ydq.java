package defpackage;

import java.util.Collections;
import java.util.HashSet;
import java.util.Set;
/* compiled from: PG */
/* renamed from: ydq  reason: default package */
/* loaded from: classes4.dex */
public final class ydq {
    final Set a = Collections.synchronizedSet(new HashSet());

    public final void a() {
        for (ydp ydpVar : this.a) {
            ydpVar.mE();
        }
    }

    public final void b() {
        for (ydp ydpVar : this.a) {
            ydpVar.h();
        }
    }

    @Deprecated
    public final void c(ashn ashnVar) {
        for (ydp ydpVar : this.a) {
            ydpVar.mF(ashnVar);
        }
    }

    public final void d(ydp ydpVar) {
        this.a.add(ydpVar);
    }

    public final void e(ydp ydpVar) {
        this.a.remove(ydpVar);
    }
}
