package defpackage;

import j$.util.DesugarCollections;
import java.util.List;
import java.util.Map;
import java.util.WeakHashMap;
/* compiled from: PG */
/* renamed from: ajxt  reason: default package */
/* loaded from: classes.dex */
public final class ajxt {
    public final Map a = DesugarCollections.synchronizedMap(new WeakHashMap());

    public final argv a(argv argvVar) {
        return this.a.containsKey(argvVar) ? (argv) this.a.get(argvVar) : argvVar;
    }

    public final List b(argv argvVar) {
        return a(argvVar).d;
    }
}
