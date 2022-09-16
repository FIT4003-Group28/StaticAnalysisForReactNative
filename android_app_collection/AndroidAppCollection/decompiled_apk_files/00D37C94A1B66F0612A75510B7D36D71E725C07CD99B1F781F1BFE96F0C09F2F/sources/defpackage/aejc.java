package defpackage;

import android.content.Context;
import android.os.Handler;
import android.telephony.TelephonyManager;
/* compiled from: PG */
/* renamed from: aejc  reason: default package */
/* loaded from: classes.dex */
public final class aejc {
    public final Handler a;
    public final yrj b;
    private final Context d;
    private final snc e;
    private final afjz g;
    private long f = 0;
    public boolean c = false;

    public aejc(Context context, snc sncVar, afjz afjzVar, Handler handler, yrj yrjVar) {
        this.d = context;
        this.e = sncVar;
        this.g = afjzVar;
        this.a = handler;
        this.b = yrjVar;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static zdt a(final aypw aypwVar) {
        return new zdt() { // from class: aeiw
            @Override // defpackage.zdt
            public final void a(Object obj) {
                aypw aypwVar2 = aypw.this;
                String str = (String) obj;
                try {
                    if (str != null) {
                        if (str.equals("5g")) {
                            aypwVar2.a("cat", new aest("5g"));
                            return;
                        } else {
                            aypwVar2.a("connt", new aest(str));
                            return;
                        }
                    }
                    afki afkiVar = afki.ABR;
                } catch (Exception unused) {
                    afki afkiVar2 = afki.ABR;
                }
            }
        };
    }

    public final void b(final aetv aetvVar) {
        try {
            if (this.g.l() > 0 && !this.b.r()) {
                if (this.f > 0 && this.e.c() - this.f < this.g.l()) {
                    return;
                }
                this.f = this.e.c();
                this.a.postDelayed(new Runnable() { // from class: aeiz
                    @Override // java.lang.Runnable
                    public final void run() {
                        aejc aejcVar = aejc.this;
                        final aetv aetvVar2 = aetvVar;
                        aetvVar2.getClass();
                        aejcVar.c(aejc.a(new aypw() { // from class: aeix
                            @Override // defpackage.aypw
                            public final void a(Object obj, Object obj2) {
                                aetv.this.i((String) obj, (aest) obj2);
                            }
                        }));
                    }
                }, this.g.o().Q);
            }
        } catch (RuntimeException unused) {
            afki afkiVar = afki.ABR;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void c(zdt zdtVar) {
        boolean z;
        TelephonyManager telephonyManager = (TelephonyManager) this.d.getSystemService("phone");
        if (telephonyManager == null) {
            return;
        }
        synchronized (this) {
            if (!this.c) {
                this.c = true;
                z = true;
            } else {
                z = false;
            }
        }
        if (!z) {
            return;
        }
        telephonyManager.listen(new aejb(this, telephonyManager, zdtVar), 1);
    }
}
