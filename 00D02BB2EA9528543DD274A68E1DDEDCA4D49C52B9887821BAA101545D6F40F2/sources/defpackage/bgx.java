package defpackage;

import androidx.work.impl.WorkDatabase;
import java.util.UUID;
/* compiled from: PG */
/* renamed from: bgx  reason: default package */
/* loaded from: classes3.dex */
public final class bgx extends bha {
    final /* synthetic */ bdn a;
    final /* synthetic */ UUID b;

    public bgx(bdn bdnVar, UUID uuid) {
        this.a = bdnVar;
        this.b = uuid;
    }

    @Override // defpackage.bha
    public final void a() {
        WorkDatabase workDatabase = this.a.c;
        workDatabase.F();
        try {
            c(this.a, this.b.toString());
            workDatabase.l();
            workDatabase.k();
            d(this.a);
        } catch (Throwable th) {
            workDatabase.k();
            throw th;
        }
    }
}
