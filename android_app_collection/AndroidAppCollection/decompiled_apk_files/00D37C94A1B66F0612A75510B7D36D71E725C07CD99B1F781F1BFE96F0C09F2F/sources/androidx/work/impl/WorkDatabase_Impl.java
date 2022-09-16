package androidx.work.impl;

import java.util.HashMap;
/* compiled from: PG */
/* loaded from: classes.dex */
public final class WorkDatabase_Impl extends WorkDatabase {
    private volatile bun j;
    private volatile btt k;
    private volatile bva l;
    private volatile bua m;
    private volatile bud n;
    private volatile bui o;
    private volatile btw p;

    @Override // defpackage.bks
    protected final bkp a() {
        HashMap hashMap = new HashMap(0);
        new HashMap(0);
        return new bkp(this, hashMap, "Dependency", "WorkSpec", "WorkTag", "SystemIdInfo", "WorkName", "WorkProgress", "Preference");
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.bks
    public final blr b(bkl bklVar) {
        bln blnVar = new bln(bklVar, new brp(this));
        blo a = blp.a(bklVar.b);
        a.b = bklVar.c;
        a.c = blnVar;
        return bklVar.a.a(a.a());
    }

    @Override // androidx.work.impl.WorkDatabase
    public final bun n() {
        bun bunVar;
        if (this.j != null) {
            return this.j;
        }
        synchronized (this) {
            if (this.j == null) {
                this.j = new bux(this);
            }
            bunVar = this.j;
        }
        return bunVar;
    }

    @Override // androidx.work.impl.WorkDatabase
    public final btt p() {
        btt bttVar;
        if (this.k != null) {
            return this.k;
        }
        synchronized (this) {
            if (this.k == null) {
                this.k = new btt(this);
            }
            bttVar = this.k;
        }
        return bttVar;
    }

    @Override // androidx.work.impl.WorkDatabase
    public final btw q() {
        btw btwVar;
        if (this.p != null) {
            return this.p;
        }
        synchronized (this) {
            if (this.p == null) {
                this.p = new btw(this);
            }
            btwVar = this.p;
        }
        return btwVar;
    }

    @Override // androidx.work.impl.WorkDatabase
    public final bua r() {
        bua buaVar;
        if (this.m != null) {
            return this.m;
        }
        synchronized (this) {
            if (this.m == null) {
                this.m = new bua(this);
            }
            buaVar = this.m;
        }
        return buaVar;
    }

    @Override // androidx.work.impl.WorkDatabase
    public final bud s() {
        bud budVar;
        if (this.n != null) {
            return this.n;
        }
        synchronized (this) {
            if (this.n == null) {
                this.n = new bud(this);
            }
            budVar = this.n;
        }
        return budVar;
    }

    @Override // androidx.work.impl.WorkDatabase
    public final bui t() {
        bui buiVar;
        if (this.o != null) {
            return this.o;
        }
        synchronized (this) {
            if (this.o == null) {
                this.o = new bui(this);
            }
            buiVar = this.o;
        }
        return buiVar;
    }

    @Override // androidx.work.impl.WorkDatabase
    public final bva u() {
        bva bvaVar;
        if (this.l != null) {
            return this.l;
        }
        synchronized (this) {
            if (this.l == null) {
                this.l = new bva(this);
            }
            bvaVar = this.l;
        }
        return bvaVar;
    }
}
