package defpackage;

import java.lang.ref.ReferenceQueue;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
/* compiled from: PG */
/* renamed from: cjl  reason: default package */
/* loaded from: classes2.dex */
public final class cjl {
    final Map a;
    public final ReferenceQueue b;
    public volatile boolean c;
    public volatile cjj d;
    public cki e;
    private final boolean f;

    public cjl(boolean z) {
        ExecutorService newSingleThreadExecutor = Executors.newSingleThreadExecutor(new cjh());
        this.a = new HashMap();
        this.b = new ReferenceQueue();
        this.f = z;
        newSingleThreadExecutor.execute(new cji(this));
    }

    public final synchronized cko a(chy chyVar) {
        cjk cjkVar = (cjk) this.a.get(chyVar);
        if (cjkVar == null) {
            return null;
        }
        cko ckoVar = (cko) cjkVar.get();
        if (ckoVar == null) {
            c(cjkVar);
        }
        return ckoVar;
    }

    public final synchronized void b(chy chyVar, cko ckoVar) {
        cjk cjkVar = (cjk) this.a.put(chyVar, new cjk(chyVar, ckoVar, this.b, this.f));
        if (cjkVar != null) {
            cjkVar.a();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void c(cjk cjkVar) {
        synchronized (this) {
            this.a.remove(cjkVar.a);
            if (cjkVar.b && cjkVar.c != null) {
                this.e.c(cjkVar.a, new cko(cjkVar.c, true, false, cjkVar.a, this.e));
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final synchronized void d(chy chyVar) {
        cjk cjkVar = (cjk) this.a.remove(chyVar);
        if (cjkVar != null) {
            cjkVar.a();
        }
    }
}
