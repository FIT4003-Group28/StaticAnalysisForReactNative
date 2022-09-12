package defpackage;

import androidx.work.impl.WorkDatabase;
/* compiled from: PG */
/* renamed from: bgz  reason: default package */
/* loaded from: classes3.dex */
final class bgz extends bha {
    final /* synthetic */ bdn a;
    final /* synthetic */ String b;
    final /* synthetic */ boolean c;

    public bgz(bdn bdnVar, String str, boolean z) {
        this.a = bdnVar;
        this.b = str;
        this.c = z;
    }

    @Override // defpackage.bha
    public final void a() {
        WorkDatabase workDatabase = this.a.c;
        workDatabase.F();
        try {
            for (String str : workDatabase.t().i(this.b)) {
                c(this.a, str);
            }
            workDatabase.l();
            workDatabase.k();
            if (!this.c) {
                return;
            }
            d(this.a);
        } catch (Throwable th) {
            workDatabase.k();
            throw th;
        }
    }
}
