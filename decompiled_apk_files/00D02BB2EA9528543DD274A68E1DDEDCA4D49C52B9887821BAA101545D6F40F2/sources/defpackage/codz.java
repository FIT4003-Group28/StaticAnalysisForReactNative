package defpackage;

import android.util.Pair;
/* compiled from: PG */
/* renamed from: codz  reason: default package */
/* loaded from: classes5.dex */
final class codz implements Runnable {
    final /* synthetic */ coea a;

    public codz(coea coeaVar) {
        this.a = coeaVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (!this.a.a()) {
            return;
        }
        codr.b(cnxl.b(Pair.create("gms:googlehelp:sync_help_psd_failure", "timeout")), this.a.a);
        coea coeaVar = this.a;
        coeaVar.b.a(coeaVar.a);
    }
}
