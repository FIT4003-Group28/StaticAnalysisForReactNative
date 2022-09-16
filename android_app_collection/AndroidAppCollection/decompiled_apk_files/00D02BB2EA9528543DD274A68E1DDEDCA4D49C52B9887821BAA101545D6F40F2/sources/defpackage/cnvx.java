package defpackage;

import com.google.android.gms.common.api.Status;
import java.util.concurrent.TimeUnit;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: cnvx  reason: default package */
/* loaded from: classes5.dex */
public final class cnvx implements cnog {
    final /* synthetic */ cnoh a;
    final /* synthetic */ cpct b;
    final /* synthetic */ cnwa c;

    public cnvx(cnoh cnohVar, cpct cpctVar, cnwa cnwaVar) {
        this.a = cnohVar;
        this.b = cpctVar;
        this.c = cnwaVar;
    }

    @Override // defpackage.cnog
    public final void a(Status status) {
        if (status.d()) {
            this.b.a(this.c.a(this.a.g(0L, TimeUnit.MILLISECONDS)));
            return;
        }
        this.b.c(cntx.a(status));
    }
}
