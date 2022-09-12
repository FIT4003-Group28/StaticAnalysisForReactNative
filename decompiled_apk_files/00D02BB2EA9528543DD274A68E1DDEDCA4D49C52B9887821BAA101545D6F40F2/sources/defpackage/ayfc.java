package defpackage;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
/* compiled from: PG */
/* renamed from: ayfc  reason: default package */
/* loaded from: classes3.dex */
public final class ayfc {
    @dzsi
    public final baad a;
    public final Map<azxb, ayfb> b = new HashMap();
    private final Set<azxb> c = new HashSet();
    private final Set<azxb> d = new HashSet();
    @dzsi
    private dibc e = null;

    public ayfc(@dzsi baad baadVar) {
        this.a = baadVar;
    }

    @dzsi
    public final synchronized dibc a() {
        return this.e;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final synchronized void b(dibc dibcVar) {
        this.e = dibcVar;
    }

    public final synchronized dcep<azxb> c() {
        return dcep.K(this.b.keySet());
    }

    public final synchronized void d(azxb azxbVar, bnju bnjuVar) {
        dbsk.b(((azvk) azxbVar).a.isEmpty(), "MID must be empty to put a place metadata");
        this.b.put(azxbVar, new ayep(bnjuVar, null, dqhy.OK));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final synchronized void e(azxb azxbVar, diwb diwbVar) {
        dbsk.b(!((azvk) azxbVar).a.isEmpty(), "MID cannot be empty to put an experience metadata");
        this.b.put(azxbVar, new ayep(null, diwbVar, dqhy.OK));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final synchronized void f(azxb azxbVar, dqhy dqhyVar) {
        dbsk.b(dqhyVar != dqhy.OK, "Status code should not be used when metadata is successfully fetched");
        this.b.put(azxbVar, new ayep(null, null, dqhyVar));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final synchronized boolean g(azxb azxbVar) {
        return this.c.contains(azxbVar);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final synchronized void h(azxb azxbVar) {
        this.d.add(azxbVar);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final synchronized void i(azxb azxbVar) {
        this.c.add(azxbVar);
        this.d.remove(azxbVar);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final synchronized void j() {
        this.c.addAll(this.d);
        this.d.clear();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final synchronized boolean k() {
        return !this.c.isEmpty();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final synchronized boolean l() {
        return !this.d.isEmpty();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final dcep<azxb> m() {
        return dcep.K(this.d);
    }

    public final synchronized void n(azxb azxbVar) {
        this.b.remove(azxbVar);
        this.c.remove(azxbVar);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final synchronized void o() {
        this.b.clear();
        this.c.clear();
        this.e = null;
        p();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final synchronized void p() {
        this.d.clear();
    }
}
