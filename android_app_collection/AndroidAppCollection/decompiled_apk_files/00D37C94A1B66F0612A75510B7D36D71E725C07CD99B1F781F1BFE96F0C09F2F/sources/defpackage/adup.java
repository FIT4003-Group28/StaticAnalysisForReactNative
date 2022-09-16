package defpackage;

import android.net.Uri;
import android.os.Handler;
import android.text.TextUtils;
import com.google.android.libraries.youtube.mdx.model.AppStatus;
import com.google.android.libraries.youtube.mdx.model.AutoValue_AppStatus;
import com.google.android.youtube.R;
import java.util.Map;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicLong;
/* compiled from: PG */
/* renamed from: adup  reason: default package */
/* loaded from: classes.dex */
public final class adup {
    private static final String f = zep.a("MDX.PassiveAuthCodeRetriever");
    public final adas a;
    public final snc b;
    public final AtomicBoolean c = new AtomicBoolean(true);
    public final AtomicLong d = new AtomicLong(0);
    public ankt e;
    private final ScheduledExecutorService g;

    public adup(adas adasVar, snc sncVar, ScheduledExecutorService scheduledExecutorService) {
        this.a = adasVar;
        this.b = sncVar;
        this.g = scheduledExecutorService;
    }

    public final ankt a(final aduo aduoVar, long j) {
        try {
            ankt s = anlz.s(new aniq() { // from class: adun
                @Override // defpackage.aniq
                public final ankt a() {
                    ampq ampqVar;
                    Map map;
                    adup adupVar = adup.this;
                    aduo aduoVar2 = aduoVar;
                    if (adupVar.b.c() >= adupVar.d.get() + TimeUnit.SECONDS.toMillis(10L)) {
                        adupVar.b(aduoVar2);
                        return anlz.q(false);
                    } else if (!adupVar.c.get()) {
                        String str = aduoVar2.a;
                        AppStatus a = adupVar.a.a(Uri.parse(str));
                        if (a == null || (map = ((AutoValue_AppStatus) a).d) == null) {
                            String.format("No additional data found for screen [%s].", str);
                            ampqVar = amon.a;
                        } else {
                            String str2 = (String) map.get("passiveAuthCode");
                            String str3 = (String) map.get("authCode");
                            if (str2 == null || TextUtils.isEmpty(str2)) {
                                if (str3 == null || TextUtils.isEmpty(str3)) {
                                    String.format("No auth code found in additional data for screen [%s].", str);
                                    ampqVar = amon.a;
                                } else {
                                    ampqVar = ampq.j(str3);
                                }
                            } else {
                                ampqVar = ampq.j(str2);
                            }
                        }
                        if (ampqVar.h()) {
                            final aduh aduhVar = aduoVar2.b;
                            final String str4 = (String) ampqVar.c();
                            Handler handler = aduhVar.c.h;
                            final advb advbVar = aduhVar.a;
                            final String str5 = aduhVar.b;
                            handler.post(new Runnable() { // from class: adug
                                @Override // java.lang.Runnable
                                public final void run() {
                                    aduh aduhVar2 = aduh.this;
                                    advb advbVar2 = advbVar;
                                    String str6 = str4;
                                    String str7 = str5;
                                    advbVar2.e = str6;
                                    aduhVar2.c.a.l(advbVar2, str7);
                                    aduhVar2.c.b(false);
                                }
                            });
                            adupVar.c();
                            return anlz.q(true);
                        }
                        return adupVar.a(aduoVar2, 100L);
                    } else {
                        adupVar.b(aduoVar2);
                        return anlz.q(false);
                    }
                }
            }, j, TimeUnit.MILLISECONDS, this.g);
            this.e = s;
            return s;
        } catch (RejectedExecutionException unused) {
            zep.c(f, "Could not schedule an app status check.");
            b(aduoVar);
            return anlz.q(false);
        }
    }

    public final void b(aduo aduoVar) {
        zep.m(f, "Failed to get auth code.");
        final aduh aduhVar = aduoVar.b;
        aduhVar.c.h.post(new Runnable() { // from class: aduf
            @Override // java.lang.Runnable
            public final void run() {
                aduh aduhVar2 = aduh.this;
                aduhVar2.c.b(true);
                advo advoVar = aduhVar2.c.m;
                advoVar.b(advoVar.a.getString(R.string.passive_auth_code_time_out), actj.MDX_TV_SIGN_IN_SNACKBAR_ERROR);
            }
        });
        c();
    }

    public final void c() {
        this.c.set(true);
        this.d.set(0L);
        this.e = null;
    }
}
