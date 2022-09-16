package defpackage;

import com.spotify.protocol.types.Types;
/* compiled from: PG */
/* renamed from: dxhj  reason: default package */
/* loaded from: classes6.dex */
public final class dxhj<T> {
    public final Types.RequestId a;
    public final dxhh<T> b;
    final Class<T> c;

    public dxhj(Types.RequestId requestId, dxhh<T> dxhhVar, Class<T> cls) {
        this.c = cls;
        this.a = requestId;
        this.b = dxhhVar;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof dxhj) {
            return this.a.equals(((dxhj) obj).a);
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
