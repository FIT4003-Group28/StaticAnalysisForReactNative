package defpackage;

import androidx.work.impl.WorkDatabase;
import java.util.UUID;
/* compiled from: PG */
/* renamed from: bvb  reason: default package */
/* loaded from: classes2.dex */
public final class bvb extends bve {
    final /* synthetic */ brq a;
    final /* synthetic */ UUID b;

    public bvb(brq brqVar, UUID uuid) {
        this.a = brqVar;
        this.b = uuid;
    }

    @Override // defpackage.bve
    public final void a() {
        WorkDatabase workDatabase = this.a.d;
        workDatabase.f();
        try {
            c(this.a, this.b.toString());
            workDatabase.h();
            workDatabase.g();
            d(this.a);
        } catch (Throwable th) {
            workDatabase.g();
            throw th;
        }
    }
}
