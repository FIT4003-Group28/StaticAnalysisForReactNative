package defpackage;

import android.os.Bundle;
import com.google.android.gms.measurement.internal.ConditionalUserPropertyParcel;
import com.google.android.gms.measurement.internal.EventParcel;
import com.google.android.gms.measurement.internal.UserAttributeParcel;
import java.util.TreeSet;
/* compiled from: PG */
/* renamed from: rmw  reason: default package */
/* loaded from: classes4.dex */
public final class rmw implements Runnable {
    final /* synthetic */ Bundle a;
    final /* synthetic */ rng b;
    private final /* synthetic */ int c;

    public rmw(rng rngVar, Bundle bundle) {
        this.b = rngVar;
        this.a = bundle;
    }

    public /* synthetic */ rmw(rng rngVar, Bundle bundle, int i) {
        this.c = i;
        this.b = rngVar;
        this.a = bundle;
    }

    public rmw(rng rngVar, Bundle bundle, int i, byte[] bArr) {
        this.c = i;
        this.b = rngVar;
        this.a = bundle;
    }

    @Override // java.lang.Runnable
    public final void run() {
        UserAttributeParcel userAttributeParcel;
        int i = this.c;
        if (i == 0) {
            rng rngVar = this.b;
            Bundle bundle = this.a;
            rngVar.n();
            rngVar.a();
            String string = bundle.getString("name");
            String string2 = bundle.getString("origin");
            qnm.l(string);
            qnm.l(string2);
            qnm.b(bundle.get("value"));
            if (!rngVar.w.w()) {
                rngVar.aG().k.a("Conditional property not set since app measurement is disabled");
                return;
            }
            try {
                rngVar.l().v(new ConditionalUserPropertyParcel(bundle.getString("app_id"), string2, new UserAttributeParcel(string, bundle.getLong("triggered_timestamp"), bundle.get("value"), string2), bundle.getLong("creation_timestamp"), false, bundle.getString("trigger_event_name"), rngVar.N().aw(bundle.getString("app_id"), bundle.getString("timed_out_event_name"), bundle.getBundle("timed_out_event_params"), string2, 0L, true), bundle.getLong("trigger_timeout"), rngVar.N().aw(bundle.getString("app_id"), bundle.getString("triggered_event_name"), bundle.getBundle("triggered_event_params"), string2, 0L, true), bundle.getLong("time_to_live"), rngVar.N().aw(bundle.getString("app_id"), bundle.getString("expired_event_name"), bundle.getBundle("expired_event_params"), string2, 0L, true)));
            } catch (IllegalArgumentException unused) {
            }
        } else if (i != 1) {
            rng rngVar2 = this.b;
            Bundle bundle2 = this.a;
            rngVar2.n();
            rngVar2.a();
            qnm.l(bundle2.getString("name"));
            if (!rngVar2.w.w()) {
                rngVar2.aG().k.a("Conditional property not cleared since app measurement is disabled");
                return;
            }
            if (rngVar2.J().o(rkg.ap)) {
                userAttributeParcel = new UserAttributeParcel(bundle2.getString("name"), 0L, null, "");
            } else {
                userAttributeParcel = new UserAttributeParcel(bundle2.getString("name"), 0L, null, null);
            }
            UserAttributeParcel userAttributeParcel2 = userAttributeParcel;
            try {
                String str = "";
                EventParcel aw = rngVar2.N().aw(bundle2.getString("app_id"), bundle2.getString("expired_event_name"), bundle2.getBundle("expired_event_params"), rngVar2.J().o(rkg.ap) ? str : bundle2.getString("origin"), bundle2.getLong("creation_timestamp"), true);
                String string3 = bundle2.getString("app_id");
                if (!rngVar2.J().o(rkg.ap)) {
                    str = bundle2.getString("origin");
                }
                rngVar2.l().v(new ConditionalUserPropertyParcel(string3, str, userAttributeParcel2, bundle2.getLong("creation_timestamp"), bundle2.getBoolean("active"), bundle2.getString("trigger_event_name"), null, bundle2.getLong("trigger_timeout"), null, bundle2.getLong("time_to_live"), aw));
            } catch (IllegalArgumentException unused2) {
            }
        } else {
            rng rngVar3 = this.b;
            Bundle bundle3 = this.a;
            if (bundle3 == null) {
                rngVar3.M().v.b(new Bundle());
                return;
            }
            Bundle a = rngVar3.M().v.a();
            for (String str2 : bundle3.keySet()) {
                Object obj = bundle3.get(str2);
                if (obj == null || (obj instanceof String) || (obj instanceof Long) || (obj instanceof Double)) {
                    if (rps.an(str2)) {
                        rngVar3.aG().h.b("Invalid default event parameter name. Name", str2);
                    } else if (obj == null) {
                        a.remove(str2);
                    } else {
                        rps N = rngVar3.N();
                        rngVar3.J();
                        if (N.af("param", str2, 100, obj)) {
                            rngVar3.N().S(a, str2, obj);
                        }
                    }
                } else {
                    if (rngVar3.N().ak(obj)) {
                        rngVar3.N().H(rngVar3.e, 27, null, null, 0);
                    }
                    rngVar3.aG().h.c("Invalid default event parameter type. Name, value", str2, obj);
                }
            }
            rngVar3.N();
            int b = rngVar3.J().b();
            if (a.size() > b) {
                int i2 = 0;
                for (String str3 : new TreeSet(a.keySet())) {
                    i2++;
                    if (i2 > b) {
                        a.remove(str3);
                    }
                }
                rngVar3.N().H(rngVar3.e, 26, null, null, 0);
                rngVar3.aG().h.a("Too many default event parameters set. Discarding beyond event parameter limit");
            }
            rngVar3.M().v.b(a);
            rngVar3.l().x(a);
        }
    }
}
