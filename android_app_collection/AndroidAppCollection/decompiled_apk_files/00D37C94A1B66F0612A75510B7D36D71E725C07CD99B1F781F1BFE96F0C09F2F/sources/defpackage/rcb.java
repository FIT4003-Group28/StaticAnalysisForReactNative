package defpackage;

import android.os.Bundle;
import android.util.Log;
import com.google.android.gms.mobiledataplan.MdpCarrierPlanIdResponse;
import java.io.IOException;
import java.util.concurrent.Executor;
/* compiled from: PG */
/* renamed from: rcb  reason: default package */
/* loaded from: classes4.dex */
public final /* synthetic */ class rcb implements rui {
    private final /* synthetic */ int g;
    public static final /* synthetic */ rcb f = new rcb(6);
    public static final /* synthetic */ rcb e = new rcb(5);
    public static final /* synthetic */ rcb d = new rcb(4);
    public static final /* synthetic */ rcb c = new rcb(2);
    public static final /* synthetic */ rcb b = new rcb(1);
    public static final /* synthetic */ rcb a = new rcb();

    private /* synthetic */ rcb() {
    }

    public /* synthetic */ rcb(int i) {
        this.g = i;
    }

    @Override // defpackage.rui
    public final Object a(rve rveVar) {
        switch (this.g) {
            case 0:
                return Boolean.valueOf(rveVar.k());
            case 1:
                Executor executor = qrl.a;
                if (!rveVar.k()) {
                    throw new IOException("SERVICE_NOT_AVAILABLE", rveVar.f());
                }
                return (Bundle) rveVar.g();
            case 2:
                int i = zim.c;
                if (!rveVar.k() || ((MdpCarrierPlanIdResponse) rveVar.g()).f == null) {
                    throw new zil(rveVar.f());
                }
                String.valueOf(String.valueOf(rveVar.g())).length();
                return new zii(((MdpCarrierPlanIdResponse) rveVar.g()).e, ((MdpCarrierPlanIdResponse) rveVar.g()).f);
            case 3:
                Bundle bundle = (Bundle) rveVar.h(IOException.class);
                if (bundle == null) {
                    throw new IOException("SERVICE_NOT_AVAILABLE");
                }
                String string = bundle.getString("registration_id");
                if (string != null || (string = bundle.getString("unregistered")) != null) {
                    return string;
                }
                String string2 = bundle.getString("error");
                if ("RST".equals(string2)) {
                    throw new IOException("INSTANCE_ID_RESET");
                }
                if (string2 != null) {
                    throw new IOException(string2);
                }
                String valueOf = String.valueOf(bundle);
                StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 21);
                sb.append("Unexpected response: ");
                sb.append(valueOf);
                Log.w("FirebaseInstanceId", sb.toString(), new Throwable());
                throw new IOException("SERVICE_NOT_AVAILABLE");
            case 4:
                return ((anzu) rveVar.g()).a;
            case 5:
                return -1;
            case 6:
                return 403;
            default:
                Bundle bundle2 = (Bundle) rveVar.h(IOException.class);
                if (bundle2 == null) {
                    throw new IOException("SERVICE_NOT_AVAILABLE");
                }
                String string3 = bundle2.getString("registration_id");
                if (string3 != null || (string3 = bundle2.getString("unregistered")) != null) {
                    return string3;
                }
                String string4 = bundle2.getString("error");
                if ("RST".equals(string4)) {
                    throw new IOException("INSTANCE_ID_RESET");
                }
                if (string4 != null) {
                    throw new IOException(string4);
                }
                String valueOf2 = String.valueOf(bundle2);
                StringBuilder sb2 = new StringBuilder(String.valueOf(valueOf2).length() + 21);
                sb2.append("Unexpected response: ");
                sb2.append(valueOf2);
                Log.w("FirebaseMessaging", sb2.toString(), new Throwable());
                throw new IOException("SERVICE_NOT_AVAILABLE");
        }
    }
}
