package defpackage;

import java.util.Collections;
import java.util.List;
/* compiled from: PG */
/* renamed from: dcwg  reason: default package */
/* loaded from: classes5.dex */
public final class dcwg<Data> {
    public final List<dcwf<Data>> a = dchl.a();
    private boolean b = true;

    public static <Data> dcwf<Data> d(dcwa dcwaVar, Data data) {
        return new dcwf<>(dcvf.b(dcwaVar), dcwaVar, data);
    }

    public final dcvr<dcwf<Data>> a() {
        if (!this.b) {
            Collections.sort(this.a);
            this.b = true;
        }
        return dcvr.a(this.a);
    }

    public final void b(dcwa dcwaVar, Data data) {
        dcwf<Data> d = d(dcwaVar, data);
        this.b = false;
        this.a.add(d);
    }

    public final void c() {
        this.b = true;
        this.a.clear();
    }

    public final void e(dcwa dcwaVar, Data data) {
        f(d(dcwaVar, data));
    }

    public final void f(dcwf<Data> dcwfVar) {
        this.a.remove(dcwfVar);
    }
}
