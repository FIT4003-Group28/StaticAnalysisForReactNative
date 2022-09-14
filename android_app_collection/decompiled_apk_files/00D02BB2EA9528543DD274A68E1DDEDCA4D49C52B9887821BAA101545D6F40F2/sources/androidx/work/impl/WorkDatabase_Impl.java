package androidx.work.impl;

import java.util.HashMap;
/* compiled from: PG */
/* loaded from: classes2.dex */
public final class WorkDatabase_Impl extends WorkDatabase {
    private volatile bgi h;
    private volatile bfq i;
    private volatile bgv j;
    private volatile bfx k;
    private volatile bga l;
    private volatile bgf m;
    private volatile bft n;

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.bn
    public final avz b(ba baVar) {
        bq bqVar = new bq(baVar, new bdm(this), "cf029002fffdcadf079e8d0a1c9a70ac", "8aff2efc47fafe870c738f727dfcfc6e");
        avw a = avx.a(baVar.b);
        a.b = baVar.c;
        a.c = bqVar;
        return baVar.a.a(a.a());
    }

    @Override // defpackage.bn
    protected final bh c() {
        HashMap hashMap = new HashMap(0);
        new HashMap(0);
        return new bh(this, hashMap, "Dependency", "WorkSpec", "WorkTag", "SystemIdInfo", "WorkName", "WorkProgress", "Preference");
    }

    @Override // defpackage.bn
    public final void e() {
        throw null;
    }

    @Override // androidx.work.impl.WorkDatabase
    public final bgi t() {
        bgi bgiVar;
        if (this.h != null) {
            return this.h;
        }
        synchronized (this) {
            if (this.h == null) {
                this.h = new bgs(this);
            }
            bgiVar = this.h;
        }
        return bgiVar;
    }

    @Override // androidx.work.impl.WorkDatabase
    public final bfq u() {
        bfq bfqVar;
        if (this.i != null) {
            return this.i;
        }
        synchronized (this) {
            if (this.i == null) {
                this.i = new bfq(this);
            }
            bfqVar = this.i;
        }
        return bfqVar;
    }

    @Override // androidx.work.impl.WorkDatabase
    public final bgv v() {
        bgv bgvVar;
        if (this.j != null) {
            return this.j;
        }
        synchronized (this) {
            if (this.j == null) {
                this.j = new bgv(this);
            }
            bgvVar = this.j;
        }
        return bgvVar;
    }

    @Override // androidx.work.impl.WorkDatabase
    public final bfx w() {
        bfx bfxVar;
        if (this.k != null) {
            return this.k;
        }
        synchronized (this) {
            if (this.k == null) {
                this.k = new bfx(this);
            }
            bfxVar = this.k;
        }
        return bfxVar;
    }

    @Override // androidx.work.impl.WorkDatabase
    public final bga x() {
        bga bgaVar;
        if (this.l != null) {
            return this.l;
        }
        synchronized (this) {
            if (this.l == null) {
                this.l = new bga(this);
            }
            bgaVar = this.l;
        }
        return bgaVar;
    }

    @Override // androidx.work.impl.WorkDatabase
    public final bgf y() {
        bgf bgfVar;
        if (this.m != null) {
            return this.m;
        }
        synchronized (this) {
            if (this.m == null) {
                this.m = new bgf(this);
            }
            bgfVar = this.m;
        }
        return bgfVar;
    }

    @Override // androidx.work.impl.WorkDatabase
    public final bft z() {
        bft bftVar;
        if (this.n != null) {
            return this.n;
        }
        synchronized (this) {
            if (this.n == null) {
                this.n = new bft(this);
            }
            bftVar = this.n;
        }
        return bftVar;
    }
}
