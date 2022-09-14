package com.google.android.gms.common.api.internal;

import android.util.Log;
import com.google.android.gms.common.api.a;
import com.google.android.gms.common.api.internal.e;
import java.util.Map;
/* loaded from: classes.dex */
final class a0 implements Runnable {

    /* renamed from: b  reason: collision with root package name */
    private final /* synthetic */ com.google.android.gms.common.b f6829b;

    /* renamed from: c  reason: collision with root package name */
    private final /* synthetic */ e.b f6830c;

    /* JADX INFO: Access modifiers changed from: package-private */
    public a0(e.b bVar, com.google.android.gms.common.b bVar2) {
        this.f6830c = bVar;
        this.f6829b = bVar2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        b bVar;
        a.f fVar;
        a.f fVar2;
        a.f fVar3;
        Map map = e.this.i;
        bVar = this.f6830c.f6870b;
        e.a aVar = (e.a) map.get(bVar);
        if (aVar == null) {
            return;
        }
        if (!this.f6829b.u()) {
            aVar.a(this.f6829b);
            return;
        }
        this.f6830c.f6873e = true;
        fVar = this.f6830c.f6869a;
        if (fVar.j()) {
            this.f6830c.a();
            return;
        }
        try {
            fVar2 = this.f6830c.f6869a;
            fVar3 = this.f6830c.f6869a;
            fVar2.a(null, fVar3.b());
        } catch (SecurityException e2) {
            Log.e("GoogleApiManager", "Failed to get service from broker. ", e2);
            aVar.a(new com.google.android.gms.common.b(10));
        }
    }
}
