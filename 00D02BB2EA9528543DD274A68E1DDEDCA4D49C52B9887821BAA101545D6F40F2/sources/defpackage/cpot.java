package defpackage;

import java.util.ArrayList;
import java.util.List;
/* compiled from: PG */
/* renamed from: cpot  reason: default package */
/* loaded from: classes5.dex */
public final class cpot<T, D> {
    public final cpvi<T, D> a;
    public final cpvf<D> b;
    public final String c;
    public cpsk<Double> d;
    public cpsk<D> e;
    public cprr f;
    public final List<Double> g = new ArrayList();
    public final List<D> h = new ArrayList();

    public cpot(cpvi<T, D> cpviVar, String str, cpvf<D> cpvfVar) {
        this.a = cpviVar;
        this.c = str;
        this.b = cpvfVar;
    }

    public final cpve<T, D> a() {
        return (cpve<T, D>) this.a.d((cpvf<D>) this.b);
    }
}
