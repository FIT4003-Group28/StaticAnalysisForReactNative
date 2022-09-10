package defpackage;

import android.content.Context;
import android.content.Intent;
/* compiled from: PG */
/* renamed from: dalf  reason: default package */
/* loaded from: classes5.dex */
final class dalf implements dakq {
    final /* synthetic */ dame a;
    final /* synthetic */ Intent b;
    final /* synthetic */ Context c;
    final /* synthetic */ dalh d;

    public dalf(dalh dalhVar, dame dameVar, Intent intent, Context context) {
        this.d = dalhVar;
        this.a = dameVar;
        this.b = intent;
        this.c = context;
    }

    @Override // defpackage.dakq
    public final void a() {
        this.d.g(this.a, 5, 0);
    }

    @Override // defpackage.dakq
    public final void b() {
        if (!this.b.getBooleanExtra("triggered_from_app_after_verification", false)) {
            this.b.putExtra("triggered_from_app_after_verification", true);
            this.c.sendBroadcast(this.b);
            return;
        }
        this.d.a.b("Splits copied and verified more than once.", new Object[0]);
    }

    @Override // defpackage.dakq
    public final void c(int i) {
        this.d.g(this.a, 6, i);
    }
}
