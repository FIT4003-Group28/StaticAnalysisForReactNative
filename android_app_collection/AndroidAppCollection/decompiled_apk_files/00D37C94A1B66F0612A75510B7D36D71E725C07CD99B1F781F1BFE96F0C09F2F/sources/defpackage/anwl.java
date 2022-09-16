package defpackage;

import android.os.Bundle;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Random;
/* compiled from: PG */
/* renamed from: anwl  reason: default package */
/* loaded from: classes.dex */
public final class anwl implements rnh {
    final /* synthetic */ rir a;

    public anwl(rir rirVar) {
        this.a = rirVar;
    }

    @Override // defpackage.rnh
    public final int a(String str) {
        rir rirVar = this.a;
        rhi rhiVar = new rhi(null);
        rirVar.c(new rie(rirVar, str, rhiVar));
        Integer num = (Integer) rhi.d(rhiVar.b(10000L), Integer.class);
        if (num == null) {
            return 25;
        }
        return num.intValue();
    }

    @Override // defpackage.rnh
    public final long b() {
        rir rirVar = this.a;
        rhi rhiVar = new rhi(null);
        rirVar.c(new rhy(rirVar, rhiVar));
        Long l = (Long) rhi.d(rhiVar.b(500L), Long.class);
        if (l == null) {
            long nextLong = new Random(System.nanoTime() ^ System.currentTimeMillis()).nextLong();
            int i = rirVar.d + 1;
            rirVar.d = i;
            return nextLong + i;
        }
        return l.longValue();
    }

    @Override // defpackage.rnh
    public final String c() {
        rir rirVar = this.a;
        rhi rhiVar = new rhi(null);
        rirVar.c(new rhx(rirVar, rhiVar));
        return rhiVar.c(50L);
    }

    @Override // defpackage.rnh
    public final String d() {
        rir rirVar = this.a;
        rhi rhiVar = new rhi(null);
        rirVar.c(new ria(rirVar, rhiVar));
        return rhiVar.c(500L);
    }

    @Override // defpackage.rnh
    public final String e() {
        rir rirVar = this.a;
        rhi rhiVar = new rhi(null);
        rirVar.c(new rhz(rirVar, rhiVar));
        return rhiVar.c(500L);
    }

    @Override // defpackage.rnh
    public final String f() {
        rir rirVar = this.a;
        rhi rhiVar = new rhi(null);
        rirVar.c(new rhw(rirVar, rhiVar));
        return rhiVar.c(500L);
    }

    @Override // defpackage.rnh
    public final List g(String str, String str2) {
        rir rirVar = this.a;
        rhi rhiVar = new rhi(null);
        rirVar.c(new rhq(rirVar, str, str2, rhiVar));
        List list = (List) rhi.d(rhiVar.b(5000L), List.class);
        return list == null ? Collections.emptyList() : list;
    }

    @Override // defpackage.rnh
    public final Map h(String str, String str2, boolean z) {
        rir rirVar = this.a;
        rhi rhiVar = new rhi(null);
        rirVar.c(new rib(rirVar, str, str2, z, rhiVar));
        Bundle b = rhiVar.b(5000L);
        if (b == null || b.size() == 0) {
            return Collections.emptyMap();
        }
        HashMap hashMap = new HashMap(b.size());
        for (String str3 : b.keySet()) {
            Object obj = b.get(str3);
            if ((obj instanceof Double) || (obj instanceof Long) || (obj instanceof String)) {
                hashMap.put(str3, obj);
            }
        }
        return hashMap;
    }

    @Override // defpackage.rnh
    public final void i(String str) {
        rir rirVar = this.a;
        rirVar.c(new rhu(rirVar, str));
    }

    @Override // defpackage.rnh
    public final void j(String str, String str2, Bundle bundle) {
        rir rirVar = this.a;
        rirVar.c(new rhp(rirVar, str, str2, bundle));
    }

    @Override // defpackage.rnh
    public final void k(String str) {
        rir rirVar = this.a;
        rirVar.c(new rhv(rirVar, str));
    }

    @Override // defpackage.rnh
    public final void l(String str, String str2, Bundle bundle) {
        this.a.b(str, str2, bundle);
    }

    @Override // defpackage.rnh
    public final void m(Bundle bundle) {
        rir rirVar = this.a;
        rirVar.c(new rho(rirVar, bundle));
    }
}
