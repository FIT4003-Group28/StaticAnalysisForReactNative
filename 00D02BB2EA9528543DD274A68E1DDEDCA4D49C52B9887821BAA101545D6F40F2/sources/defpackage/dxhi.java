package defpackage;

import com.spotify.protocol.types.Types;
/* compiled from: PG */
/* renamed from: dxhi  reason: default package */
/* loaded from: classes6.dex */
public final class dxhi<T> {
    public final Types.RequestId a;
    public final dxgl<T> b;
    private final Class<T> c;

    public dxhi(Types.RequestId requestId, dxgl<T> dxglVar, Class<T> cls) {
        this.c = cls;
        this.a = requestId;
        this.b = dxglVar;
    }

    public final void a(dxhq dxhqVar) {
        try {
            this.b.f(dxhe.b(dxhqVar.a(this.c)));
        } catch (Exception e) {
            this.b.g(e);
        }
    }

    public final boolean equals(Object obj) {
        if (obj instanceof dxhi) {
            return this.a.equals(((dxhi) obj).a);
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
