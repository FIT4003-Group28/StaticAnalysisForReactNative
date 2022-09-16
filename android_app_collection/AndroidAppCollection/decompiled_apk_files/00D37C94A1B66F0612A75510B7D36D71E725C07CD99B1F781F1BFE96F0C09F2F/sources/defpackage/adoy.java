package defpackage;

import android.os.Looper;
import android.text.TextUtils;
import com.google.android.libraries.youtube.mdx.model.ScreenId;
import com.google.android.libraries.youtube.mdx.remote.internal.MdxSessionFactory;
import j$.time.Duration;
import j$.util.Optional;
import java.util.concurrent.ScheduledFuture;
import org.json.JSONException;
import org.json.JSONObject;
/* compiled from: PG */
/* renamed from: adoy  reason: default package */
/* loaded from: classes.dex */
public final class adoy implements aczb {
    public final /* synthetic */ adoz a;

    public adoy(adoz adozVar) {
        this.a = adozVar;
    }

    @Override // defpackage.aczb
    public final void a(int i) {
        this.a.aM(adoz.am(i, atcv.MDX_SESSION_DISCONNECT_REASON_CAST_SDK_DISCONNECTED), i);
    }

    @Override // defpackage.aczb
    public final void b(qku qkuVar) {
        adoz adozVar = this.a;
        if (adozVar.l) {
            return;
        }
        adozVar.k = qkuVar.c();
        this.a.j = qkuVar;
        e("getMdxSessionStatus");
    }

    @Override // defpackage.aczb
    public final void c(int i) {
        if (this.a.aj.av && aczm.a.contains(Integer.valueOf(i))) {
            adoz adozVar = this.a;
            adnd adndVar = adozVar.n;
            String b = adozVar.c.b();
            dt dtVar = adndVar.c;
            if (dtVar != null) {
                adnc.aE(i, b).qv(dtVar.getSupportFragmentManager(), adnc.class.getCanonicalName());
            }
        }
        a(i);
    }

    @Override // defpackage.aczb
    public final void d(String str) {
        long j;
        try {
            JSONObject jSONObject = new JSONObject(str);
            String string = jSONObject.getString("type");
            String str2 = "";
            if (!TextUtils.equals(string, "mdxSessionStatus")) {
                if (!TextUtils.equals(string, "loungeToken")) {
                    return;
                }
                try {
                    JSONObject jSONObject2 = jSONObject.getJSONObject("data");
                    str2 = jSONObject2.optString("loungeToken", str2);
                    j = jSONObject2.optLong("loungeTokenRefreshIntervalMs", -1L);
                } catch (JSONException e) {
                    String valueOf = String.valueOf(jSONObject);
                    StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 48);
                    sb.append("Cannot parse incoming LoungeToken Cast message: ");
                    sb.append(valueOf);
                    String sb2 = sb.toString();
                    afus.c(2, 21, sb2, e);
                    zep.o(adoz.a, sb2, e);
                    j = -1;
                }
                Optional empty = Optional.empty();
                if (!TextUtils.isEmpty(str2) && j != -1) {
                    empty = Optional.of(new adis(str2, 3, Duration.ofMillis(j)));
                    zep.h(adoz.a, String.format("Received valid LoungeToken from incoming LoungeToken message: %s, refresh interval: %s", empty.get(), ((adis) empty.get()).b));
                }
                for (aczf aczfVar : this.a.m) {
                    ScheduledFuture scheduledFuture = aczfVar.a.c;
                    if (scheduledFuture != null) {
                        scheduledFuture.cancel(true);
                    }
                    if (aczfVar.a.e == null) {
                        zep.c(aczg.a, "ShortLivedLoungeToken Response callback null when receiving LoungeToken message from Cast SDK.");
                    } else if (empty.isPresent()) {
                        zep.h(aczg.a, String.format("SUCCESS! Got new lounge token for Cast screen %s: %s, refresh interval: %s", aczfVar.a.b.b(), empty.get(), ((adis) empty.get()).b));
                        aczfVar.a.e.b((adis) empty.get());
                    } else {
                        zep.m(aczg.a, String.format("No proper Short Lived Lounge Token found in LoungeToken message from Cast SDK for screen %s.", aczfVar.a.b.b()));
                        aczfVar.a.e.a(adom.MISSING_LOUNGE_TOKEN);
                    }
                }
            } else if (!this.a.l) {
                try {
                    JSONObject jSONObject3 = jSONObject.getJSONObject("data");
                    String string2 = jSONObject3.getString("screenId");
                    String string3 = jSONObject3.getString("deviceId");
                    String optString = jSONObject3.optString("loungeToken", str2);
                    long optLong = jSONObject3.optLong("loungeTokenRefreshIntervalMs", -1L);
                    this.a.ak.c(9);
                    String valueOf2 = String.valueOf(string2);
                    if (valueOf2.length() != 0) {
                        "Connected to Cast screen. Initiating cloud connection to ".concat(valueOf2);
                    }
                    adia e2 = adib.e();
                    e2.b(new ScreenId(string2));
                    e2.d(new adit(string3));
                    e2.e(this.a.c.b());
                    e2.f(adim.CAST);
                    if (!TextUtils.isEmpty(optString) && optLong != -1) {
                        e2.c(new adis(optString, 3, Duration.ofMillis(optLong)));
                    }
                    adoz adozVar = this.a;
                    MdxSessionFactory mdxSessionFactory = adozVar.b;
                    adib a = e2.a();
                    adrk aK = this.a.aK();
                    adoz adozVar2 = this.a;
                    adnu adnuVar = adozVar2.ak;
                    acvg acvgVar = adozVar2.d;
                    acvg acvgVar2 = adozVar2.e;
                    int i = adozVar2.am.h;
                    ampq.j(adozVar2.am.g);
                    adoz adozVar3 = this.a;
                    adozVar.aO(mdxSessionFactory.h(a, aK, adnuVar, adozVar2, acvgVar, acvgVar2, new aczg(adozVar3.c, this, adozVar3.aj.af, adozVar3.i)));
                    this.a.l = true;
                } catch (JSONException e3) {
                    String valueOf3 = String.valueOf(jSONObject);
                    StringBuilder sb3 = new StringBuilder(String.valueOf(valueOf3).length() + 53);
                    sb3.append("Cannot parse incoming MdxSessionStatus Cast message: ");
                    sb3.append(valueOf3);
                    String sb4 = sb3.toString();
                    afus.c(2, 21, sb4, e3);
                    zep.o(adoz.a, sb4, e3);
                    this.a.ar();
                }
            }
        } catch (JSONException e4) {
            String valueOf4 = String.valueOf(str);
            String concat = valueOf4.length() != 0 ? "Cannot parse incoming Cast message: ".concat(valueOf4) : new String("Cannot parse incoming Cast message: ");
            afus.c(2, 21, concat, e4);
            zep.o(adoz.a, concat, e4);
            this.a.ar();
        }
    }

    public final void e(String str) {
        if (this.a.j == null) {
            return;
        }
        final JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("type", str);
            zep.h(adoz.a, str.length() != 0 ? "Sending outgoing Cast local channel message: ".concat(str) : new String("Sending outgoing Cast local channel message: "));
            if (Looper.myLooper() == Looper.getMainLooper()) {
                adoz adozVar = this.a;
                adozVar.j.k(adozVar.g, jSONObject.toString());
                return;
            }
            this.a.h.post(new Runnable() { // from class: adox
                @Override // java.lang.Runnable
                public final void run() {
                    adoy adoyVar = adoy.this;
                    JSONObject jSONObject2 = jSONObject;
                    adoz adozVar2 = adoyVar.a;
                    adozVar2.j.k(adozVar2.g, jSONObject2.toString());
                }
            });
        } catch (JSONException e) {
            String concat = str.length() != 0 ? "Could not create outgoing Cast local channel message: ".concat(str) : new String("Could not create outgoing Cast local channel message: ");
            afus.c(2, 21, concat, e);
            zep.f(adoz.a, concat, e);
        }
    }
}
