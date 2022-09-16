package defpackage;

import com.google.android.apps.maps.R;
import java.util.concurrent.TimeoutException;
/* compiled from: PG */
/* renamed from: bakf  reason: default package */
/* loaded from: classes3.dex */
final class bakf implements degu<Boolean> {
    final /* synthetic */ boolean a;
    final /* synthetic */ String b;
    final /* synthetic */ bakg c;

    public bakf(bakg bakgVar, boolean z, String str) {
        this.c = bakgVar;
        this.a = z;
        this.b = str;
    }

    @Override // defpackage.degu
    public final void a(Throwable th) {
        if (th instanceof TimeoutException) {
            ckos.b(this.c.a.findViewById(16908290), R.string.SYNC_SWITCHING_ACCOUNTS_TIMEOUT, 0).c();
        }
    }

    @Override // defpackage.degu
    public final /* bridge */ /* synthetic */ void b(Boolean bool) {
        Boolean bool2 = bool;
        if (this.c.a.aZ && !bool2.booleanValue()) {
            if (this.a) {
                this.c.a.C(bakb.q(1, null), gfu.DIALOG_FRAGMENT, new gfs[0]);
                return;
            }
            gga ggaVar = this.c.a;
            String str = this.b;
            dbsk.s(str);
            ggaVar.C(bakb.q(2, str), gfu.DIALOG_FRAGMENT, new gfs[0]);
            this.c.b.a().q();
        }
    }
}
