package defpackage;

import android.content.ServiceConnection;
import android.net.Uri;
import android.os.Bundle;
import android.os.Parcel;
/* compiled from: PG */
/* renamed from: rlg  reason: default package */
/* loaded from: classes4.dex */
final class rlg implements Runnable {
    final /* synthetic */ ServiceConnection a;
    final /* synthetic */ rlh b;
    final /* synthetic */ pyn c;

    public rlg(rlh rlhVar, pyn pynVar, ServiceConnection serviceConnection) {
        this.b = rlhVar;
        this.c = pynVar;
        this.a = serviceConnection;
    }

    @Override // java.lang.Runnable
    public final void run() {
        rlh rlhVar = this.b;
        rli rliVar = rlhVar.b;
        String str = rlhVar.a;
        pyn pynVar = this.c;
        ServiceConnection serviceConnection = this.a;
        rliVar.a.r();
        Bundle bundle = new Bundle();
        bundle.putString("package_name", str);
        Bundle bundle2 = null;
        try {
            Parcel pv = pynVar.pv();
            dve.g(pv, bundle);
            Parcel pw = pynVar.pw(1, pv);
            Bundle bundle3 = (Bundle) dve.a(pw, Bundle.CREATOR);
            pw.recycle();
            if (bundle3 == null) {
                rliVar.a.aG().c.a("Install Referrer Service returned a null response");
            } else {
                bundle2 = bundle3;
            }
        } catch (Exception e) {
            rliVar.a.aG().c.b("Exception occurred while retrieving the Install Referrer", e.getMessage());
        }
        rliVar.a.r();
        rlx.B();
        if (bundle2 != null) {
            long j = bundle2.getLong("install_begin_timestamp_seconds", 0L) * 1000;
            if (j == 0) {
                rliVar.a.aG().f.a("Service response is missing Install Referrer install timestamp");
            } else {
                String string = bundle2.getString("install_referrer");
                if (string == null || string.isEmpty()) {
                    rliVar.a.aG().c.a("No referrer defined in Install Referrer response");
                } else {
                    rliVar.a.aG().k.b("InstallReferrer API result", string);
                    Bundle u = rliVar.a.q().u(Uri.parse(string.length() != 0 ? "?".concat(string) : new String("?")));
                    if (u == null) {
                        rliVar.a.aG().c.a("No campaign params defined in Install Referrer result");
                    } else {
                        String string2 = u.getString("medium");
                        if (string2 != null && !"(not set)".equalsIgnoreCase(string2) && !"organic".equalsIgnoreCase(string2)) {
                            long j2 = bundle2.getLong("referrer_click_timestamp_seconds", 0L) * 1000;
                            if (j2 == 0) {
                                rliVar.a.aG().c.a("Install Referrer is missing click timestamp for ad campaign");
                            } else {
                                u.putLong("click_timestamp", j2);
                            }
                        }
                        if (j == rliVar.a.h().e.a()) {
                            rliVar.a.aG().k.a("Logging Install Referrer campaign from module while it may have already been logged.");
                        }
                        if (rliVar.a.w()) {
                            rliVar.a.h().e.b(j);
                            rliVar.a.aG().k.b("Logging Install Referrer campaign from gmscore with ", "referrer API v2");
                            u.putString("_cis", "referrer API v2");
                            rliVar.a.l().X("_cmp", u, str);
                        }
                    }
                }
            }
        }
        qyf.a().b(rliVar.a.a, serviceConnection);
    }
}
