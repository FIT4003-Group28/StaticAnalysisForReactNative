package defpackage;

import com.google.android.gms.common.api.Status;
import java.util.concurrent.TimeUnit;
/* compiled from: PG */
/* renamed from: cpex  reason: default package */
/* loaded from: classes5.dex */
public final class cpex implements cnog {
    final /* synthetic */ cpey a;
    final /* synthetic */ cnoh b;
    final /* synthetic */ cpct c;

    public cpex(cpey cpeyVar, cnoh cnohVar, cpct cpctVar) {
        this.a = cpeyVar;
        this.b = cnohVar;
        this.c = cpctVar;
    }

    @Override // defpackage.cnog
    public final void a(Status status) {
        int i = status.g;
        if (status.d() || i == 4500 || i == 4501) {
            this.a.a = (cpdp) this.b.g(0L, TimeUnit.MILLISECONDS);
            this.c.a(this.a);
            return;
        }
        this.c.c(cntx.a(status));
    }
}
