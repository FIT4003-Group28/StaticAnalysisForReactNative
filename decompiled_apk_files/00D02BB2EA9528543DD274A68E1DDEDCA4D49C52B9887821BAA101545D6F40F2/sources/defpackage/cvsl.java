package defpackage;

import java.util.concurrent.TimeUnit;
/* compiled from: PG */
/* renamed from: cvsl  reason: default package */
/* loaded from: classes5.dex */
final class cvsl<T> implements dbty<T> {
    private final dbty<T> a;
    private dbty<T> b = null;
    private long c;

    private cvsl(dbty<T> dbtyVar) {
        this.a = dbtyVar;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static <T> dbty<T> b(dbty<T> dbtyVar) {
        return new cvsl(dbtyVar);
    }

    private final boolean c() {
        return this.b == null || this.c != dxxh.b();
    }

    @Override // defpackage.dbty
    public final T a() {
        if (c()) {
            synchronized (this) {
                if (c()) {
                    long b = dxxh.b();
                    this.c = b;
                    if (b > 0) {
                        this.b = new dbtz(this.a, b, TimeUnit.MILLISECONDS);
                    } else {
                        this.b = this.a;
                    }
                }
            }
        }
        return this.b.a();
    }
}
