package defpackage;

import androidx.work.impl.WorkDatabase;
/* compiled from: PG */
/* renamed from: bgy  reason: default package */
/* loaded from: classes3.dex */
public final class bgy extends bha {
    final /* synthetic */ bdn a;
    final /* synthetic */ String b;

    public bgy(bdn bdnVar, String str) {
        this.a = bdnVar;
        this.b = str;
    }

    @Override // defpackage.bha
    public final void a() {
        WorkDatabase workDatabase = this.a.c;
        workDatabase.F();
        try {
            for (String str : workDatabase.t().h(this.b)) {
                c(this.a, str);
            }
            workDatabase.l();
            workDatabase.k();
            d(this.a);
        } catch (Throwable th) {
            workDatabase.k();
            throw th;
        }
    }
}
