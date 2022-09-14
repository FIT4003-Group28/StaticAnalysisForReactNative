package defpackage;

import java.io.File;
import java.util.Arrays;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: crdt  reason: default package */
/* loaded from: classes5.dex */
public final class crdt extends crbc {
    @dzsi
    public crbc a;
    public final int b;
    @dzsi
    private final File c;
    private int d;
    private final crco e;
    private final bvjj f;

    public crdt(File file, crco crcoVar, bvjj bvjjVar, boolean z) {
        this.c = file;
        this.e = crcoVar;
        this.f = bvjjVar;
        this.b = true == z ? 2 : 1;
    }

    @Override // defpackage.crbc
    public final boolean a() {
        crbc b = this.e.b(this.c, cres.a(this.f), this.b);
        this.a = b;
        if (b != null) {
            return b.a();
        }
        return false;
    }

    @Override // defpackage.crbc
    public final void b(crbb crbbVar) {
        crbc crbcVar = this.a;
        if (crbcVar == null) {
            crbbVar.b(this);
            return;
        }
        crbcVar.b(new crds(this, crbbVar));
        this.d++;
    }

    @Override // defpackage.crbc
    public final void c() {
        crbc crbcVar = this.a;
        if (crbcVar != null) {
            crbcVar.c();
        }
    }

    @Override // defpackage.crbc
    public final long d() {
        crbc crbcVar = this.a;
        if (crbcVar != null) {
            return crbcVar.d();
        }
        return -1L;
    }

    @Override // defpackage.crbc
    public final void e(cres cresVar) {
        crbc crbcVar = this.a;
        if (crbcVar != null) {
            crbcVar.e(cresVar);
        }
    }

    public final boolean equals(@dzsi Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof crdt)) {
            return false;
        }
        crdt crdtVar = (crdt) obj;
        return dbsd.a(this.c, crdtVar.c) && dbsd.a(this.a, crdtVar.a) && this.d == crdtVar.d;
    }

    @Override // defpackage.crbc
    public final int f() {
        return this.b;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.c, this.a, Integer.valueOf(this.d)});
    }
}
