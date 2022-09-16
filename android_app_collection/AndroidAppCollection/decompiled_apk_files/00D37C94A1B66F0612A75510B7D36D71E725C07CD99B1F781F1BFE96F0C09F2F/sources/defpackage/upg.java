package defpackage;

import android.app.Application;
import android.content.Context;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
/* compiled from: PG */
/* renamed from: upg  reason: default package */
/* loaded from: classes4.dex */
public final class upg {
    public final amqo a;
    public boolean b = true;
    private final ScheduledExecutorService c;

    public upg(final Context context, final ScheduledExecutorService scheduledExecutorService) {
        this.a = aqxo.i(new amqo() { // from class: uoz
            @Override // defpackage.amqo
            public final Object get() {
                ScheduledExecutorService scheduledExecutorService2 = scheduledExecutorService;
                Context context2 = context;
                return new upi(scheduledExecutorService2, new vpb(context2, "STREAMZ_ONEGOOGLE_ANDROID"), context2 instanceof Application ? (Application) context2 : null);
            }
        });
        this.c = scheduledExecutorService;
    }

    public final void a(final String str, final String str2) {
        f(new Runnable() { // from class: upd
            @Override // java.lang.Runnable
            public final void run() {
                ((vpg) ((upi) upg.this.a.get()).f.get()).b(str, str2);
            }
        });
    }

    public final void b(final String str, final String str2, final String str3, final String str4, final boolean z) {
        f(new Runnable() { // from class: upf
            @Override // java.lang.Runnable
            public final void run() {
                ((vpg) ((upi) upg.this.a.get()).c.get()).b(str, str2, str3, str4, Boolean.valueOf(z));
            }
        });
    }

    public final void c(final String str, final String str2, final int i, final String str3, final boolean z) {
        f(new Runnable() { // from class: upe
            @Override // java.lang.Runnable
            public final void run() {
                ((vpg) ((upi) upg.this.a.get()).b.get()).b(str, str2, Integer.valueOf(i), str3, Boolean.valueOf(z));
            }
        });
    }

    public final void d(final double d, final String str, final String str2, final String str3, final String str4, final boolean z) {
        f(new Runnable() { // from class: upc
            @Override // java.lang.Runnable
            public final void run() {
                ((vpd) ((upi) upg.this.a.get()).e.get()).b(d, str, str2, str3, str4, Boolean.valueOf(z));
            }
        });
    }

    public final void e(final double d, final String str, final String str2, final int i, final String str3, final boolean z) {
        f(new Runnable() { // from class: upb
            @Override // java.lang.Runnable
            public final void run() {
                upg upgVar = upg.this;
                ((vpd) ((upi) upgVar.a.get()).d.get()).b(d, str, str2, Integer.valueOf(i), str3, Boolean.valueOf(z));
            }
        });
    }

    public final void f(final Runnable runnable) {
        if (this.b) {
            this.c.schedule(new Runnable() { // from class: upa
                @Override // java.lang.Runnable
                public final void run() {
                    upg upgVar = upg.this;
                    runnable.run();
                    upgVar.b = false;
                }
            }, 5L, TimeUnit.SECONDS);
        } else {
            runnable.run();
        }
    }
}
