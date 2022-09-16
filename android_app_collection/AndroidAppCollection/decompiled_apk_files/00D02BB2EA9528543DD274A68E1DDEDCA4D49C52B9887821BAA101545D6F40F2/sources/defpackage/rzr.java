package defpackage;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;
/* compiled from: PG */
/* renamed from: rzr  reason: default package */
/* loaded from: classes7.dex */
public class rzr {
    private final rzq a;
    private final Set<Runnable> b = new HashSet();

    public rzr(rzq rzqVar) {
        this.a = rzqVar;
    }

    public final void a(Runnable runnable) {
        boolean isEmpty;
        synchronized (this.b) {
            synchronized (this.b) {
                isEmpty = this.b.isEmpty();
            }
            this.b.add(runnable);
        }
        if (isEmpty) {
            this.a.a();
        }
    }

    public final void b() {
        synchronized (this.b) {
            this.b.clear();
        }
    }

    public final void c() {
        ArrayList arrayList;
        synchronized (this.b) {
            arrayList = new ArrayList(this.b);
            this.b.clear();
        }
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            ((Runnable) arrayList.get(i)).run();
        }
    }
}
