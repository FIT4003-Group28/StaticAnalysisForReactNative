package defpackage;

import j$.util.function.Consumer;
import java.util.Collection;
import java.util.Collections;
import java.util.Set;
import java.util.WeakHashMap;
import java.util.concurrent.CopyOnWriteArraySet;
/* compiled from: PG */
/* renamed from: zha  reason: default package */
/* loaded from: classes4.dex */
public final class zha {
    public final Set a;

    public zha() {
        this.a = Collections.newSetFromMap(new WeakHashMap());
    }

    public final void a(Consumer consumer) {
        consumer.getClass();
        for (Object obj : this.a) {
            consumer.accept(obj);
        }
    }

    public final void b(Object obj) {
        this.a.add(obj);
    }

    public final void c(Object obj) {
        this.a.remove(obj);
    }

    public zha(Collection collection) {
        CopyOnWriteArraySet copyOnWriteArraySet = new CopyOnWriteArraySet();
        this.a = copyOnWriteArraySet;
        collection.getClass();
        aqxo.p(!collection.contains(null));
        copyOnWriteArraySet.addAll(collection);
    }
}
