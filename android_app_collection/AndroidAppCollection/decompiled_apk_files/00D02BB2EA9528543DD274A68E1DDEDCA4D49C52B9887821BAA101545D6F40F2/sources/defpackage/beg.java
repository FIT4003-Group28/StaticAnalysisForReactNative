package defpackage;

import android.content.Context;
/* compiled from: PG */
/* renamed from: beg  reason: default package */
/* loaded from: classes3.dex */
public final class beg implements bcx {
    private final Context a;

    static {
        bbz.f("SystemAlarmScheduler");
    }

    public beg(Context context) {
        this.a = context.getApplicationContext();
    }

    @Override // defpackage.bcx
    public final void b(bgh... bghVarArr) {
        for (bgh bghVar : bghVarArr) {
            bbz e = bbz.e();
            String str = bghVar.a;
            e.a(new Throwable[0]);
            this.a.startService(bdw.b(this.a, bghVar.a));
        }
    }

    @Override // defpackage.bcx
    public final void c(String str) {
        this.a.startService(bdw.d(this.a, str));
    }

    @Override // defpackage.bcx
    public final boolean d() {
        return true;
    }
}
