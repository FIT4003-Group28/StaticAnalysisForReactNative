package defpackage;

import java.util.Collections;
import java.util.Set;
import java.util.WeakHashMap;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: crp  reason: default package */
/* loaded from: classes3.dex */
public final class crp implements csd {
    private final Set a = Collections.newSetFromMap(new WeakHashMap());
    private boolean b;
    private boolean c;

    @Override // defpackage.csd
    public final void a(cse cseVar) {
        this.a.add(cseVar);
        if (this.c) {
            cseVar.k();
        } else if (this.b) {
            cseVar.l();
        } else {
            cseVar.m();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void b() {
        this.c = true;
        for (cse cseVar : cvd.g(this.a)) {
            cseVar.k();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void c() {
        this.b = true;
        for (cse cseVar : cvd.g(this.a)) {
            cseVar.l();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void d() {
        this.b = false;
        for (cse cseVar : cvd.g(this.a)) {
            cseVar.m();
        }
    }

    @Override // defpackage.csd
    public final void e(cse cseVar) {
        this.a.remove(cseVar);
    }
}
