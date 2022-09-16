package defpackage;

import android.content.Context;
import android.os.Build;
import android.os.Handler;
import android.telephony.TelephonyManager;
/* compiled from: PG */
/* renamed from: ypq  reason: default package */
/* loaded from: classes4.dex */
public final class ypq {
    public final Context a;
    public final ypo b;
    public volatile boolean d;
    private final yme e;
    private final Handler f;
    private int i;
    private final Runnable g = new Runnable() { // from class: ypi
        @Override // java.lang.Runnable
        public final void run() {
            ypq ypqVar = ypq.this;
            TelephonyManager telephonyManager = (TelephonyManager) ypqVar.a.getSystemService("phone");
            if (telephonyManager == null) {
                ypqVar.d = false;
            } else {
                ypqVar.b.b(telephonyManager);
            }
        }
    };
    private ampq h = amon.a;
    public final azpb c = azpa.as(false).ax();

    public ypq(Context context, yme ymeVar, Handler handler) {
        ypo yplVar;
        this.a = context;
        this.e = ymeVar;
        this.f = handler;
        if (akg.e()) {
            yplVar = new ypn(this);
        } else {
            yplVar = Build.VERSION.SDK_INT >= 29 ? new ypl(this) : new ypj();
        }
        this.b = yplVar;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final aynx a() {
        return this.c.A();
    }

    public final synchronized void b() {
        if (!this.d) {
            this.f.removeCallbacks(this.g);
            this.b.a();
            this.d = this.f.postDelayed(this.g, this.i);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final boolean c() {
        return this.b.c();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final boolean d() {
        if (!this.h.h()) {
            if (Build.VERSION.SDK_INT < 29) {
                this.h = ampq.j(false);
            } else {
                this.i = this.e.c().q;
                this.h = ampq.j(Boolean.valueOf(this.e.c().p));
            }
        }
        return ((Boolean) this.h.c()).booleanValue();
    }
}
