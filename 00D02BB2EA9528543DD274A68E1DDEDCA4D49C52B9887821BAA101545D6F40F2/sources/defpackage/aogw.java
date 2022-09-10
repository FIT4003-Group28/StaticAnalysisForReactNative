package defpackage;

import android.app.Application;
import android.net.Uri;
import com.google.android.apps.maps.R;
/* compiled from: PG */
/* renamed from: aogw  reason: default package */
/* loaded from: classes2.dex */
public class aogw {
    public final Uri a;
    private final boolean b;

    public aogw(boolean z, btvo btvoVar) {
        this.b = z;
        this.a = Uri.parse(btvoVar.getMapsActivitiesParameters().c);
    }

    public static String c(Application application, int i, dcdc<dqgf> dcdcVar) {
        if (dcdcVar.isEmpty()) {
            return cqrt.o(R.plurals.MAPS_ACTIVITY_RECEIPTS_COUNT, i, Integer.valueOf(i)).a(application).toString();
        }
        dccx F = dcdc.F();
        F.g(dcdcVar.get(0).a);
        if (dcdcVar.size() > 2) {
            F.g(application.getString(R.string.MAPS_ACTIVITY_RECEIPT_X_MORE, new Object[]{Integer.valueOf(dcdcVar.size() - 1)}));
        } else if (dcdcVar.size() > 1) {
            F.g(dcdcVar.get(1).a);
        }
        return dbrz.e("\n").g(F.f());
    }

    public final dcdc<dvan> a(dvay dvayVar) {
        dsrj<dvan> dsrjVar = dvayVar.j;
        dccx F = dcdc.F();
        for (dvan dvanVar : dsrjVar) {
            int i = dvanVar.a;
            if ((i & 2) != 0 && (this.b || (i & 1) != 0)) {
                F.g(dvanVar);
            }
        }
        return F.f();
    }

    public final boolean b(dcdc<dvan> dcdcVar) {
        return !dcdcVar.isEmpty() && (!this.b || !this.a.toString().isEmpty());
    }

    public final Uri d(String str) {
        return this.a.buildUpon().appendPath("receipt").appendPath(str).build();
    }

    public final Uri e() {
        return this.a.buildUpon().appendQueryParameter("alwaysShowWelcome", "true").build();
    }
}
