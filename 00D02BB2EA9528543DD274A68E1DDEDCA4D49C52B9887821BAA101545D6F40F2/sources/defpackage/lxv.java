package defpackage;

import java.util.IdentityHashMap;
import java.util.Map;
/* compiled from: PG */
/* renamed from: lxv  reason: default package */
/* loaded from: classes7.dex */
public final class lxv {
    @dzsi
    public kfe a;
    private final Map<Object, Void> b = new IdentityHashMap();
    private final bvrj c;

    public lxv(bvrj bvrjVar) {
        this.c = bvrjVar;
    }

    public final void a(Object obj) {
        this.c.c();
        dbsk.l(!this.b.containsKey(obj));
        this.b.put(obj, null);
    }

    public final void b(Object obj) {
        this.c.c();
        dbsk.l(this.b.containsKey(obj));
        this.b.remove(obj);
        if (this.a == null || !this.b.isEmpty()) {
            return;
        }
        kfe kfeVar = this.a;
        bvrj.UI_THREAD.c();
        if (kfeVar.e == 2) {
            return;
        }
        kfeVar.b = false;
        kfeVar.c(false);
    }
}
