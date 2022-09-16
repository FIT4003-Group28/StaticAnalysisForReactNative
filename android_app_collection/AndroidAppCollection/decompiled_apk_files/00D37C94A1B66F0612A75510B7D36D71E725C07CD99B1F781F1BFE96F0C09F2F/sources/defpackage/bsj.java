package defpackage;

import android.content.Context;
/* compiled from: PG */
/* renamed from: bsj  reason: default package */
/* loaded from: classes2.dex */
public final class bsj implements bqz {
    private final Context a;

    static {
        bqf.b("SystemAlarmScheduler");
    }

    public bsj(Context context) {
        this.a = context.getApplicationContext();
    }

    @Override // defpackage.bqz
    public final void b(String str) {
        this.a.startService(brz.g(this.a, str));
    }

    @Override // defpackage.bqz
    public final void c(bum... bumVarArr) {
        for (bum bumVar : bumVarArr) {
            bqf a = bqf.a();
            String.format("Scheduling work with workSpecId %s", bumVar.c);
            a.d(new Throwable[0]);
            this.a.startService(brz.f(this.a, bumVar.c));
        }
    }

    @Override // defpackage.bqz
    public final boolean d() {
        return true;
    }
}
