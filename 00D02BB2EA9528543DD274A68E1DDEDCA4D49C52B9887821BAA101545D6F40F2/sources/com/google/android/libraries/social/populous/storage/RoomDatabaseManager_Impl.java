package com.google.android.libraries.social.populous.storage;

import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
/* compiled from: PG */
/* loaded from: classes5.dex */
public final class RoomDatabaseManager_Impl extends RoomDatabaseManager {
    private volatile cyri h;
    private volatile cyrn i;
    private volatile cysd j;
    private volatile cyry k;
    private volatile cyrv l;

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.bn
    public final avz b(ba baVar) {
        bq bqVar = new bq(baVar, new cyrx(this), "2a8ea406c25e0b55c6dc52862be9aa2a", "61c86c30fdbb09b696012aa4efc52a9a");
        avw a = avx.a(baVar.b);
        a.b = baVar.c;
        a.c = bqVar;
        return baVar.a.a(a.a());
    }

    @Override // defpackage.bn
    protected final bh c() {
        HashMap hashMap = new HashMap(2);
        hashMap.put("ContextualCandidateTokens", "ContextualCandidateTokens_content");
        hashMap.put("Tokens", "Tokens_content");
        new HashMap(0);
        return new bh(this, hashMap, "CacheInfo", "Contacts", "ContextualCandidateContexts", "ContextualCandidates", "ContextualCandidateInfo", "ContextualCandidateTokens", "RpcCache", "Tokens");
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.bn
    public final Map<Class<?>, List<Class<?>>> d() {
        HashMap hashMap = new HashMap();
        hashMap.put(cyri.class, Collections.emptyList());
        hashMap.put(cyrn.class, Collections.emptyList());
        hashMap.put(cysd.class, Collections.emptyList());
        hashMap.put(cyry.class, Collections.emptyList());
        hashMap.put(cyrv.class, Collections.emptyList());
        hashMap.put(cyrs.class, Collections.emptyList());
        hashMap.put(cyrr.class, Collections.emptyList());
        hashMap.put(cyrt.class, Collections.emptyList());
        hashMap.put(cyru.class, Collections.emptyList());
        return hashMap;
    }

    @Override // defpackage.bn
    public final void e() {
        super.D();
        avu b = this.c.b();
        try {
            super.F();
            b.h("DELETE FROM `CacheInfo`");
            b.h("DELETE FROM `Contacts`");
            b.h("DELETE FROM `ContextualCandidateContexts`");
            b.h("DELETE FROM `ContextualCandidates`");
            b.h("DELETE FROM `ContextualCandidateInfo`");
            b.h("DELETE FROM `ContextualCandidateTokens`");
            b.h("DELETE FROM `RpcCache`");
            b.h("DELETE FROM `Tokens`");
            super.l();
            super.k();
            b.f("PRAGMA wal_checkpoint(FULL)").close();
            if (b.e()) {
                return;
            }
            b.h("VACUUM");
        } catch (Throwable th) {
            super.k();
            b.f("PRAGMA wal_checkpoint(FULL)").close();
            if (!b.e()) {
                b.h("VACUUM");
            }
            throw th;
        }
    }

    @Override // com.google.android.libraries.social.populous.storage.RoomDatabaseManager, defpackage.cyqp
    /* renamed from: r */
    public final cyri g() {
        cyri cyriVar;
        if (this.h != null) {
            return this.h;
        }
        synchronized (this) {
            if (this.h == null) {
                this.h = new cyrl(this);
            }
            cyriVar = this.h;
        }
        return cyriVar;
    }

    @Override // com.google.android.libraries.social.populous.storage.RoomDatabaseManager, defpackage.cyqp
    /* renamed from: s */
    public final cyrn a() {
        cyrn cyrnVar;
        if (this.i != null) {
            return this.i;
        }
        synchronized (this) {
            if (this.i == null) {
                this.i = new cyrq(this);
            }
            cyrnVar = this.i;
        }
        return cyrnVar;
    }

    @Override // com.google.android.libraries.social.populous.storage.RoomDatabaseManager, defpackage.cyqp
    /* renamed from: t */
    public final cysd f() {
        cysd cysdVar;
        if (this.j != null) {
            return this.j;
        }
        synchronized (this) {
            if (this.j == null) {
                this.j = new cysg(this);
            }
            cysdVar = this.j;
        }
        return cysdVar;
    }

    @Override // com.google.android.libraries.social.populous.storage.RoomDatabaseManager, defpackage.cyqp
    /* renamed from: u */
    public final cyry h() {
        cyry cyryVar;
        if (this.k != null) {
            return this.k;
        }
        synchronized (this) {
            if (this.k == null) {
                this.k = new cysc(this);
            }
            cyryVar = this.k;
        }
        return cyryVar;
    }

    @Override // com.google.android.libraries.social.populous.storage.RoomDatabaseManager, defpackage.cyqp
    /* renamed from: v */
    public final cyrv i() {
        cyrv cyrvVar;
        if (this.l != null) {
            return this.l;
        }
        synchronized (this) {
            if (this.l == null) {
                this.l = new cyrw(this);
            }
            cyrvVar = this.l;
        }
        return cyrvVar;
    }
}
