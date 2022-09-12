package defpackage;

import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
/* compiled from: PG */
/* renamed from: bzfs  reason: default package */
/* loaded from: classes4.dex */
public class bzfs<T> {
    public final List<bzfr<T>> a = new CopyOnWriteArrayList();
    @dzsi
    public bzge b;

    public final void a() {
        synchronized (this) {
            bzge bzgeVar = this.b;
            if (bzgeVar == null) {
                return;
            }
            bzgeVar.a();
        }
    }

    public final void b(bzfq<T> bzfqVar, bzgj bzgjVar) {
        bzfr<T> bzfrVar = new bzfr<>(this, bzfqVar);
        bzgjVar.a(bzfrVar);
        this.a.add(bzfrVar);
        a();
    }
}
