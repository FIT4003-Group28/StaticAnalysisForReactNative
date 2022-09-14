package defpackage;

import java.lang.ref.ReferenceQueue;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;
import java.util.logging.Logger;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: dysh  reason: default package */
/* loaded from: classes6.dex */
public final class dysh extends dyon {
    private final dysg e;
    private static final ReferenceQueue<dysh> c = new ReferenceQueue<>();
    private static final ConcurrentMap<dysg, dysg> d = new ConcurrentHashMap();
    public static final Logger b = Logger.getLogger(dysh.class.getName());

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dysh(dyhi dyhiVar) {
        super(dyhiVar);
        ReferenceQueue<dysh> referenceQueue = c;
        ConcurrentMap<dysg, dysg> concurrentMap = d;
        this.e = new dysg(this, dyhiVar, referenceQueue, concurrentMap);
    }

    @Override // defpackage.dyon, defpackage.dyhi
    public final void f() {
        dysg dysgVar = this.e;
        int i = dysg.a;
        dysgVar.a();
        ((dyrz) this.a).f();
    }

    @Override // defpackage.dyon, defpackage.dyhi
    public final void g() {
        dysg dysgVar = this.e;
        int i = dysg.a;
        dysgVar.a();
        ((dyrz) this.a).g();
    }
}
