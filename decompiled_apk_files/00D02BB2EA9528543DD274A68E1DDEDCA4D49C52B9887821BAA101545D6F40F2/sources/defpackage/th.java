package defpackage;

import java.util.Collections;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.Executor;
/* compiled from: PG */
/* renamed from: th  reason: default package */
/* loaded from: classes7.dex */
public final class th<T> {
    private static final Executor g = new tg();
    public final ty a;
    final tc<T> b;
    public List<T> d;
    int f;
    private final List<ti> h = new CopyOnWriteArrayList();
    public List<T> e = Collections.emptyList();
    final Executor c = g;

    public th(ty tyVar, tc<T> tcVar) {
        this.a = tyVar;
        this.b = tcVar;
    }

    public final void a(ti tiVar) {
        this.h.add(tiVar);
    }

    public final void b() {
        for (ti tiVar : this.h) {
        }
    }
}
