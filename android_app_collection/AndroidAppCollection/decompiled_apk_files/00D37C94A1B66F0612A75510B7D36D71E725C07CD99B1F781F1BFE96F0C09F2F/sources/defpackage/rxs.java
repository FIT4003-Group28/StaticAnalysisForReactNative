package defpackage;

import android.accounts.Account;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import com.google.android.libraries.accountlinking.activity.AccountLinkingActivity;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Random;
import java.util.Set;
/* compiled from: PG */
/* renamed from: rxs  reason: default package */
/* loaded from: classes4.dex */
public final class rxs {
    public static final amup a;
    public final Context b;
    public final rxu c;
    public final rzo d;
    public final rzd e;
    private final rzs f;

    static {
        amum h = amup.h();
        h.f(rxx.APP_FLIP, aoet.MOBILE_APP_REDIRECT_FLOW);
        h.f(rxx.STREAMLINED_LINK_ACCOUNT, aoet.GSI_OAUTH_LINKING_FLOW);
        h.f(rxx.STREAMLINED_CREATE_ACCOUNT, aoet.GSI_OAUTH_CREATION_FLOW);
        h.f(rxx.WEB_OAUTH, aoet.OAUTH2_FLOW);
        a = h.b();
        amum h2 = amup.h();
        h2.f(aoeu.DATA_USAGE_NOTICE_TYPE_LINKING_INFO, rxw.LINKING_INFO);
        h2.f(aoeu.DATA_USAGE_NOTICE_TYPE_CAPABILITY_CONSENT, rxw.CAPABILITY_CONSENT);
        h2.b();
    }

    public rxs(Context context, rxu rxuVar) {
        this.b = context;
        this.c = rxuVar;
        try {
            rzs f = rwd.f(context, rxuVar.c, 443);
            this.f = f;
            rzr rzrVar = (rzr) f;
            rzo rzoVar = new rzo(context, rzrVar.a, rzrVar.b, ampq.i(null), ampq.i(null));
            this.d = rzoVar;
            this.e = new rzd(rzoVar);
        } catch (IllegalStateException e) {
            throw new rxv(1, "Initialization failed", e);
        }
    }

    public static int a() {
        return new Random().nextInt(2147483646) + 1;
    }

    public static List b(Set set) {
        return amtf.d(set).f(meo.r).g();
    }

    public final void c() {
        this.f.a();
    }

    public final ankt d(ankt anktVar, final Account account, final String str, final int i, final Set set, final Set set2) {
        return anii.h(anktVar, new ampg() { // from class: rxr
            @Override // defpackage.ampg
            public final Object apply(Object obj) {
                rxs rxsVar = rxs.this;
                Account account2 = account;
                String str2 = str;
                int i2 = i;
                Set set3 = set;
                Set set4 = set2;
                aoft aoftVar = (aoft) obj;
                ryk rykVar = new ryk();
                rykVar.c = account2;
                rykVar.i = str2;
                rykVar.e = i2;
                ArrayList arrayList = new ArrayList();
                if (aoftVar.f != null) {
                    arrayList.add(rxx.APP_FLIP);
                }
                if (aoftVar.c != null || aoftVar.d != null) {
                    arrayList.add(rxx.STREAMLINED_LINK_ACCOUNT);
                }
                if (aoftVar.b != null) {
                    arrayList.add(rxx.WEB_OAUTH);
                }
                rykVar.d(arrayList);
                rykVar.g = rxsVar.c.c;
                rykVar.h = 443;
                rykVar.f = null;
                rykVar.b(set3);
                rykVar.e(set4);
                rykVar.k = aoftVar;
                aofk aofkVar = aoftVar.f;
                if (aofkVar != null) {
                    rykVar.f(new HashSet(aofkVar.d));
                }
                if (aoftVar.g != null) {
                    rykVar.c(new ArrayList());
                }
                Intent intent = new Intent(rxsVar.b, AccountLinkingActivity.class);
                ryl a2 = rykVar.a();
                Bundle bundle = new Bundle();
                bundle.putStringArrayList("scopes", new ArrayList<>(a2.a));
                bundle.putStringArrayList("capabilities", new ArrayList<>(a2.b));
                bundle.putParcelable("account", a2.c);
                bundle.putBoolean("using_custom_dependency_supplier", a2.d);
                bundle.putInt("session_id", a2.e);
                String str3 = a2.f;
                if (str3 != null) {
                    bundle.putString("bucket", str3);
                }
                bundle.putString("service_host", a2.g);
                bundle.putInt("service_port", a2.h);
                bundle.putString("service_id", a2.i);
                bundle.putStringArrayList("flows", new ArrayList<>(amtf.d(a2.j).f(ryj.b).g()));
                bundle.putByteArray("linking_session", a2.k.toByteArray());
                bundle.putStringArrayList("google_scopes", new ArrayList<>(a2.l));
                bundle.putBoolean("two_way_account_linking", a2.m);
                bundle.putInt("account_linking_entry_point", a2.n);
                bundle.putStringArrayList("data_usage_notices", new ArrayList<>(amtf.d(a2.o).f(meo.u).g()));
                bundle.putStringArrayList("experiment_server_tokens", new ArrayList<>(a2.p));
                intent.putExtras(bundle);
                return intent;
            }
        }, anjk.a);
    }
}
