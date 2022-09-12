package defpackage;

import android.app.Application;
import com.google.android.apps.gmm.map.model.location.GmmLocation;
/* compiled from: PG */
/* renamed from: ahtd  reason: default package */
/* loaded from: classes2.dex */
public final class ahtd {
    private final axru a;
    private final ahjq b;
    private final ahte c;

    public ahtd(axru axruVar, ahjq ahjqVar, ahte ahteVar) {
        this.a = axruVar;
        this.b = ahjqVar;
        this.c = ahteVar;
    }

    public final dehn<GmmLocation> a() {
        return b(true);
    }

    public final dehn<GmmLocation> b(boolean z) {
        GmmLocation a;
        if (!this.a.a("android.permission.ACCESS_COARSE_LOCATION")) {
            return deha.b(new IllegalStateException("location permision not granted"));
        }
        if (!z || !this.b.d() || (a = this.b.a()) == null) {
            Application a2 = this.c.a.a();
            ahte.a(a2);
            ahtc ahtcVar = new ahtc(a2);
            if (ahtcVar.a.isConnected() || ahtcVar.a.isConnecting() || ahtcVar.c.isDone()) {
                return ahtcVar.c;
            }
            ahtcVar.a.connect();
            return ahtcVar.c;
        }
        return deha.a(a);
    }
}
