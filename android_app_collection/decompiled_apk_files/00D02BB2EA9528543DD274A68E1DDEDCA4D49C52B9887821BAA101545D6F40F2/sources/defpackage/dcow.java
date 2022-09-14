package defpackage;

import java.io.Serializable;
/* compiled from: PG */
/* renamed from: dcow  reason: default package */
/* loaded from: classes5.dex */
final class dcow<R, C, V> extends dcov<R, C, V> implements Serializable {
    private static final long serialVersionUID = 0;
    private final R a;
    private final C b;
    private final V c;

    public dcow(R r, C c, V v) {
        this.a = r;
        this.b = c;
        this.c = v;
    }

    @Override // defpackage.dcot
    public final R a() {
        return this.a;
    }

    @Override // defpackage.dcot
    public final C b() {
        return this.b;
    }

    @Override // defpackage.dcot
    public final V c() {
        return this.c;
    }
}
