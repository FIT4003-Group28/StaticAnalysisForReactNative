package defpackage;

import java.lang.ref.Reference;
import java.lang.ref.ReferenceQueue;
import java.util.ArrayList;
/* compiled from: PG */
/* renamed from: agbv  reason: default package */
/* loaded from: classes2.dex */
public class agbv<K> {
    private static final dcqe a = dcqe.c("agbv");
    private final dccg<K, agbu<K>> b = dccg.O();
    private final ReferenceQueue<agbt<? super K>> c = new ReferenceQueue<>();

    public final synchronized void a(K k, agbt<? super K> agbtVar) {
        this.b.n(k, new agbu<>(k, agbtVar, this.c));
        c();
    }

    public final void b(K k) {
        ArrayList arrayList = new ArrayList();
        synchronized (this) {
            arrayList.addAll(this.b.f(k));
        }
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            agbt agbtVar = (agbt) ((agbu) arrayList.get(i)).get();
            if (agbtVar != null) {
                agbtVar.a(k);
            }
        }
    }

    public final synchronized void c() {
        while (true) {
            Reference<? extends agbt<? super K>> poll = this.c.poll();
            if (poll != null) {
                agbu agbuVar = (agbu) poll;
                if (!this.b.G(agbuVar.a, agbuVar)) {
                    Object[] objArr = new Object[1];
                    Object obj = agbuVar.a;
                    if (obj == null) {
                        obj = "null";
                    }
                    objArr[0] = obj;
                    bvoo.h("Failed to unregister subscriber for key: %s", objArr);
                }
            }
        }
    }
}
