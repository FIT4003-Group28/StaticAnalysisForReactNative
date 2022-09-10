package defpackage;

import java.lang.ref.ReferenceQueue;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
/* compiled from: PG */
/* renamed from: bvn  reason: default package */
/* loaded from: classes.dex */
public final class bvn {
    final Map<btw, bvm> a;
    public final ReferenceQueue<bwv<?>> b;
    public volatile boolean c;
    public volatile bvl d;

    public bvn() {
        ExecutorService newSingleThreadExecutor = Executors.newSingleThreadExecutor(new bvj());
        this.a = new HashMap();
        this.b = new ReferenceQueue<>();
        newSingleThreadExecutor.execute(new bvk(this));
    }

    public final synchronized void a(btw btwVar, bwv<?> bwvVar) {
        bvm put = this.a.put(btwVar, new bvm(btwVar, bwvVar, this.b));
        if (put != null) {
            put.a();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final synchronized void b(btw btwVar) {
        bvm remove = this.a.remove(btwVar);
        if (remove != null) {
            remove.a();
        }
    }

    public final synchronized bwv<?> c(btw btwVar) {
        bvm bvmVar = this.a.get(btwVar);
        if (bvmVar == null) {
            return null;
        }
        bwv<?> bwvVar = (bwv) bvmVar.get();
        if (bwvVar == null) {
            d(bvmVar);
        }
        return bwvVar;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void d(bvm bvmVar) {
        synchronized (this) {
            this.a.remove(bvmVar.a);
            if (bvmVar.b) {
                bxd<?> bxdVar = bvmVar.c;
            }
        }
    }
}
