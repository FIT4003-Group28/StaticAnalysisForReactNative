package defpackage;

import android.util.Rational;
import com.google.android.apps.youtube.app.common.ui.pip.DefaultPipController;
/* compiled from: PG */
/* renamed from: etg  reason: default package */
/* loaded from: classes3.dex */
public final /* synthetic */ class etg implements zdt {
    private final /* synthetic */ int v;
    public static final /* synthetic */ etg u = new etg(20);
    public static final /* synthetic */ etg t = new etg(19);
    public static final /* synthetic */ etg s = new etg(18);
    public static final /* synthetic */ etg r = new etg(17);
    public static final /* synthetic */ etg q = new etg(16);
    public static final /* synthetic */ etg p = new etg(15);
    public static final /* synthetic */ etg o = new etg(14);
    public static final /* synthetic */ etg n = new etg(13);
    public static final /* synthetic */ etg m = new etg(12);
    public static final /* synthetic */ etg l = new etg(11);
    public static final /* synthetic */ etg k = new etg(10);
    public static final /* synthetic */ etg j = new etg(9);
    public static final /* synthetic */ etg i = new etg(8);
    public static final /* synthetic */ etg h = new etg(7);
    public static final /* synthetic */ etg g = new etg(6);
    public static final /* synthetic */ etg f = new etg(5);
    public static final /* synthetic */ etg e = new etg(4);
    public static final /* synthetic */ etg d = new etg(3);
    public static final /* synthetic */ etg c = new etg(2);
    public static final /* synthetic */ etg b = new etg(1);
    public static final /* synthetic */ etg a = new etg();

    private /* synthetic */ etg() {
    }

    private /* synthetic */ etg(int i2) {
        this.v = i2;
    }

    @Override // defpackage.zdt
    public final void a(Object obj) {
        switch (this.v) {
            case 0:
                zep.d("Failed to disable offline button poor connectivity tooltip disabled.", (Throwable) obj);
                return;
            case 1:
                String valueOf = String.valueOf((Throwable) obj);
                StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 48);
                sb.append("Error reading incognito_promotion_already_shown.");
                sb.append(valueOf);
                zep.b(sb.toString());
                return;
            case 2:
                zep.d("Failed to update offline stream snackbar impressions and offline stream snackbar last shown.", (Throwable) obj);
                return;
            case 3:
                zep.d("Failed to read notification settings.", (Throwable) obj);
                return;
            case 4:
                zep.d("Failed to set active state and notify listeners", (Throwable) obj);
                return;
            case 5:
                Rational rational = DefaultPipController.a;
                zep.d("Exception when trying to fetch pip setting", (Throwable) obj);
                return;
            case 6:
                int i2 = gim.c;
                zep.d("accountIdResolver.get() failed", (Throwable) obj);
                afus.b(2, 25, "[Clockwork][AppSettingsCommandResolver] accountIdResolver.get() failed.");
                return;
            case 7:
                Throwable th = (Throwable) obj;
                actj actjVar = gvt.a;
                return;
            case 8:
                Throwable th2 = (Throwable) obj;
                actj actjVar2 = gvt.a;
                return;
            case 9:
                pkl pklVar = (pkl) obj;
                if (pklVar == null) {
                    return;
                }
                pklVar.M();
                pklVar.J(null);
                pklVar.y(0, 0);
                return;
            case 10:
                pkl pklVar2 = (pkl) obj;
                if (pklVar2 == null) {
                    return;
                }
                pklVar2.z(false);
                return;
            case 11:
                pkl pklVar3 = (pkl) obj;
                if (pklVar3 == null || pklVar3.g()) {
                    return;
                }
                pklVar3.z(true);
                return;
            case 12:
                Throwable th3 = (Throwable) obj;
                zep.b("EffectsControlInputStateManager load enhance value from data store failed");
                return;
            case 13:
                Throwable th4 = (Throwable) obj;
                amuk amukVar = hes.a;
                zep.b("Can't write to ProtoDataStore");
                return;
            case 14:
                Void r5 = (Void) obj;
                amuk amukVar2 = hes.a;
                return;
            case 15:
                int i3 = hml.ax;
                zep.d("Failed to load PDS", (Throwable) obj);
                return;
            case 16:
                int i4 = hml.ax;
                zep.d("Can't write to ProtoDataStore", (Throwable) obj);
                return;
            case 17:
                Void r52 = (Void) obj;
                int i5 = hml.ax;
                return;
            case 18:
                zep.d("Failed to load PDS", (Throwable) obj);
                return;
            case 19:
                Throwable th5 = (Throwable) obj;
                zep.b("Can't write to ProtoDataStore");
                return;
            default:
                Throwable th6 = (Throwable) obj;
                zep.b("Can't write to ProtoDataStore");
                return;
        }
    }
}
