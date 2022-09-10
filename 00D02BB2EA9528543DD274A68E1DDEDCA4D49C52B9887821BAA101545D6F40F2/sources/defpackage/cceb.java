package defpackage;

import android.app.Application;
import android.widget.Toast;
import java.util.concurrent.Executor;
/* compiled from: PG */
/* renamed from: cceb  reason: default package */
/* loaded from: classes4.dex */
public final class cceb implements bvby {
    public final Application a;

    public cceb(Application application) {
        this.a = application;
    }

    @Override // defpackage.btzp
    public final /* bridge */ /* synthetic */ btzc a(dhwa dhwaVar, btzi<dhwa, dhwc> btziVar, bvrj bvrjVar) {
        throw new UnsupportedOperationException("Deprecated interface method so not supported.");
    }

    @Override // defpackage.btzp
    public final /* bridge */ /* synthetic */ btzc b(dhwa dhwaVar, final btzi<dhwa, dhwc> btziVar, Executor executor) {
        final dhwa dhwaVar2 = dhwaVar;
        executor.execute(new Runnable(this, dhwaVar2, btziVar) { // from class: ccdz
            private final cceb a;
            private final dhwa b;
            private final btzi c;

            {
                this.a = this;
                this.b = dhwaVar2;
                this.c = btziVar;
            }

            /* JADX WARN: Type inference failed for: r1v0, types: [dhwa, I] */
            @Override // java.lang.Runnable
            public final void run() {
                cceb ccebVar = this.a;
                ?? r1 = this.b;
                btzi btziVar2 = this.c;
                Toast.makeText(ccebVar.a, "Info card dismissal request is not sent since the Fake Ugc Info Card Dismissal setting is enabled", 1).show();
                btzq a = btzr.a();
                a.a = r1;
                btzq.b(1);
                a.e = new btzw(null);
                btziVar2.QZ(a.a(), dhwc.a);
            }
        });
        return ccea.a;
    }

    @Override // defpackage.btzp
    public final dehn<btzx<dhwa, dhwc>> c(dhwa dhwaVar) {
        throw null;
    }
}
