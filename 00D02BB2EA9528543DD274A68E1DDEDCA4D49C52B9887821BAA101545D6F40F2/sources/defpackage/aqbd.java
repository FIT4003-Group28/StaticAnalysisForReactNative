package defpackage;

import java.util.logging.Level;
/* compiled from: PG */
/* renamed from: aqbd  reason: default package */
/* loaded from: classes2.dex */
final class aqbd<V> implements degu<V> {
    private static final dcqe a = dcqe.c("aqbd");
    private final Level b;
    private final String c;

    public aqbd(Level level, String str) {
        this.b = level;
        this.c = str;
    }

    @Override // defpackage.degu
    public final void a(Throwable th) {
        a.d(this.b).n(th).t(3222).q("%s", this.c);
    }

    @Override // defpackage.degu
    public final void b(@dzsi V v) {
    }
}
