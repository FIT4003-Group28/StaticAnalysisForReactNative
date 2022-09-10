package defpackage;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
/* compiled from: PG */
/* renamed from: acmx  reason: default package */
/* loaded from: classes2.dex */
public final class acmx<T, D> {
    @dzsi
    public cprx<D> a;
    @dzsi
    public cpru<D> b;
    @dzsi
    public cpre<D> c;
    public int d;
    @dzsi
    public cpsm e;
    @dzsi
    public cptb<T, D> f;
    public boolean g;
    @dzsi
    public Integer h;
    @dzsi
    public Integer i;
    @dzsi
    public cprj j;
    private final HashMap<String, cpqf<T, D>> k = new HashMap<>();
    private final List<cpvi<T, D>> l = new ArrayList();
    private final HashMap<String, cppu<T, D>> m = new HashMap<>();

    public final acmy<T, D> a() {
        return new acmy<>(this.k, this.l, this.m, this.b, this.a, this.c, this.i, this.h, this.j, this.d, this.e, this.f, this.g);
    }

    public final void b(cppu<T, D> cppuVar, String str) {
        this.m.put(str, cppuVar);
    }

    public final void c(String str, cpqf<T, D> cpqfVar) {
        this.k.put(str, cpqfVar);
    }

    public final <S extends cpvi<T, D>> void d(String str, S s) {
        s.g = str;
        this.l.add(s);
    }
}
