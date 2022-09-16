package defpackage;

import defpackage.aktj;
/* compiled from: PG */
/* renamed from: allw  reason: default package */
/* loaded from: classes2.dex */
public final class allw<T extends aktj<T, ?>> {
    @dzsi
    T a = null;
    @dzsi
    T b = null;
    @dzsi
    T c = null;
    private final allx d;

    public allw(allx allxVar) {
        this.d = allxVar;
    }

    public final void a(@dzsi T t) {
        synchronized (this.d) {
            T t2 = this.a;
            if (t != t2) {
                if (t2 != null && t2 != this.b && t2 != this.c) {
                    t2.j();
                }
                this.a = t;
            }
        }
    }
}
