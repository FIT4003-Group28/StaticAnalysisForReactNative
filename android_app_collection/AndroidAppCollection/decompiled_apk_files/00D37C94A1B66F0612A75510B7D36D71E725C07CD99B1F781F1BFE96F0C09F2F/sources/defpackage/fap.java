package defpackage;

import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.content.Context;
import android.os.Build;
import android.text.TextUtils;
import java.util.concurrent.TimeUnit;
/* compiled from: PG */
/* renamed from: fap  reason: default package */
/* loaded from: classes3.dex */
public final class fap implements agbd {
    private final agcp a;
    private final snc b;
    private final aadd c;

    public fap(agcp agcpVar, snc sncVar, aadd aaddVar) {
        agcpVar.getClass();
        this.a = agcpVar;
        sncVar.getClass();
        this.b = sncVar;
        this.c = aaddVar;
    }

    @Override // defpackage.agbd
    public final long a() {
        agcp agcpVar = this.a;
        snc sncVar = this.b;
        ampq i = agcpVar.i();
        if (((Long) i.e(0L)).longValue() == 0) {
            return -1L;
        }
        return TimeUnit.MILLISECONDS.toSeconds(sncVar.c() - ((Long) i.c()).longValue());
    }

    @Override // defpackage.agbd
    public final /* synthetic */ ankt b(final Context context) {
        return anii.h(c(), new ampg() { // from class: agbb
            @Override // defpackage.ampg
            public final Object apply(Object obj) {
                agbd agbdVar = agbd.this;
                Context context2 = context;
                return new agbc(((Boolean) obj).booleanValue(), agel.e(context2), agbdVar.e(context2));
            }
        }, anjk.a);
    }

    @Override // defpackage.agbd
    public final ankt c() {
        return anlz.q(Boolean.valueOf(emn.B(this.a)));
    }

    @Override // defpackage.agbd
    public final boolean d(Context context) {
        return agel.e(context);
    }

    @Override // defpackage.agbd
    public final boolean e(Context context) {
        asxp asxpVar = this.c.a().e;
        if (asxpVar == null) {
            asxpVar = asxp.a;
        }
        String str = asxpVar.j;
        if (!TextUtils.isEmpty(str) && Build.VERSION.SDK_INT >= 26) {
            NotificationChannel notificationChannel = ((NotificationManager) context.getSystemService("notification")).getNotificationChannel(str);
            if (notificationChannel != null) {
                return (notificationChannel.getImportance() == 0 || notificationChannel.getImportance() == -1000) ? false : true;
            }
            String valueOf = String.valueOf(str);
            afus.b(1, 7, valueOf.length() != 0 ? "Android O+ Notification Channel does not exist: ".concat(valueOf) : new String("Android O+ Notification Channel does not exist: "));
        }
        return true;
    }
}
