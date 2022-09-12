package defpackage;

import java.util.ArrayList;
import java.util.List;
/* compiled from: PG */
/* renamed from: cwuc  reason: default package */
/* loaded from: classes.dex */
public final class cwuc {
    final List<cwud> a = new ArrayList();
    public volatile boolean b;

    public final synchronized void a() {
        if (!this.b) {
            this.b = true;
            synchronized (this.a) {
                for (cwud cwudVar : this.a) {
                    try {
                        cwudVar.Sz();
                    } catch (RuntimeException unused) {
                    }
                }
                this.a.clear();
            }
        }
    }

    public final boolean b(cwud cwudVar) {
        synchronized (this.a) {
            if (!this.b) {
                List<cwud> list = this.a;
                dbsk.s(cwudVar);
                list.add(cwudVar);
                return true;
            }
            return false;
        }
    }

    public final void c(cwud cwudVar) {
        if (!b(cwudVar)) {
            cwudVar.Sz();
        }
    }
}
