package com.google.android.gms.common.api.internal;

import com.google.android.gms.common.api.Status;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.WeakHashMap;
/* loaded from: classes.dex */
public final class z0 {

    /* renamed from: a  reason: collision with root package name */
    private final Map<BasePendingResult<?>, Boolean> f6937a = Collections.synchronizedMap(new WeakHashMap());

    /* renamed from: b  reason: collision with root package name */
    private final Map<c.e.a.b.g.i<?>, Boolean> f6938b = Collections.synchronizedMap(new WeakHashMap());

    private final void a(boolean z, Status status) {
        HashMap hashMap;
        HashMap hashMap2;
        synchronized (this.f6937a) {
            hashMap = new HashMap(this.f6937a);
        }
        synchronized (this.f6938b) {
            hashMap2 = new HashMap(this.f6938b);
        }
        for (Map.Entry entry : hashMap.entrySet()) {
            if (z || ((Boolean) entry.getValue()).booleanValue()) {
                ((BasePendingResult) entry.getKey()).b(status);
            }
        }
        for (Map.Entry entry2 : hashMap2.entrySet()) {
            if (z || ((Boolean) entry2.getValue()).booleanValue()) {
                ((c.e.a.b.g.i) entry2.getKey()).b((Exception) new com.google.android.gms.common.api.b(status));
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final <TResult> void a(c.e.a.b.g.i<TResult> iVar, boolean z) {
        this.f6938b.put(iVar, Boolean.valueOf(z));
        iVar.a().a(new p(this, iVar));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final boolean a() {
        return !this.f6937a.isEmpty() || !this.f6938b.isEmpty();
    }

    public final void b() {
        a(false, e.n);
    }

    public final void c() {
        a(true, n0.f6907a);
    }
}
