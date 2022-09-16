package defpackage;

import android.os.Bundle;
import java.util.concurrent.TimeUnit;
/* compiled from: PG */
/* renamed from: aggt  reason: default package */
/* loaded from: classes.dex */
public final class aggt implements agxc {
    public static final long a = TimeUnit.HOURS.toSeconds(4);
    private final agvq b;
    private final yjs c;

    public aggt(yjs yjsVar, agvq agvqVar) {
        agvqVar.getClass();
        this.b = agvqVar;
        yjsVar.getClass();
        this.c = yjsVar;
    }

    @Override // defpackage.agxc
    public final void a(String str) {
        d();
        this.b.F(str, 0L);
    }

    @Override // defpackage.agxc
    public final void b(String str) {
        long q = this.b.q(str);
        if (q > 0) {
            yjs yjsVar = this.c;
            long j = a;
            yjsVar.d("offline_pas", q + j, j, false, 1, true, aggv.a(str), aggv.b);
        }
    }

    @Override // defpackage.agxc
    public final void c(String str, long j) {
        yjs yjsVar = this.c;
        long j2 = a;
        yjsVar.d("offline_pas", j + j2, j2, true, 1, true, aggv.a(str), aggv.b);
        this.b.F(str, j);
    }

    @Override // defpackage.agxc
    public final void d() {
        this.c.c("offline_pas");
    }

    @Override // defpackage.agxc
    public final void e(String str) {
        Bundle a2 = aggv.a(str);
        a2.putBoolean("forceSync", false);
        this.c.e("offline_pas", 0L, true, 1, a2, null, false);
    }
}
