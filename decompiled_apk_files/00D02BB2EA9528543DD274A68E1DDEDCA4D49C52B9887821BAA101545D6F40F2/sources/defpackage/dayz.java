package defpackage;

import defpackage.dazn;
import java.util.UUID;
/* compiled from: PG */
/* renamed from: dayz  reason: default package */
/* loaded from: classes.dex */
abstract class dayz<T extends dazn> implements dazn {
    private final T a;
    private final UUID b;
    private final String c;

    public dayz(String str, T t) {
        dbsk.s(str);
        this.c = str;
        this.a = t;
        this.b = t.b();
    }

    @Override // defpackage.dazn
    public final T a() {
        return this.a;
    }

    @Override // defpackage.dazn
    public final UUID b() {
        return this.b;
    }

    @Override // defpackage.dazn
    public final String c() {
        return this.c;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        dbaa.d(this);
    }

    public final String toString() {
        return dbaa.i(this);
    }

    public dayz(String str, UUID uuid) {
        dbsk.s(str);
        this.c = str;
        this.a = null;
        this.b = uuid;
    }
}
