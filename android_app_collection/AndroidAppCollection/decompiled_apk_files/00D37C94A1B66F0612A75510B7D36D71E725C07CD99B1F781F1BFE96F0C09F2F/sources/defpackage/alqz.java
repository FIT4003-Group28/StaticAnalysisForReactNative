package defpackage;

import android.app.Activity;
import android.content.Context;
import android.os.Handler;
import android.os.Looper;
/* compiled from: PG */
/* renamed from: alqz  reason: default package */
/* loaded from: classes.dex */
public final class alqz implements alqy {
    private final alri a;
    private final alqx b;
    private final Context c;

    public alqz(alri alriVar, alqx alqxVar, Context context) {
        new Handler(Looper.getMainLooper());
        this.a = alriVar;
        this.b = alqxVar;
        this.c = context;
    }

    @Override // defpackage.alqy
    public final alvd a() {
        alri alriVar = this.a;
        String packageName = this.c.getPackageName();
        if (alriVar.b == null) {
            return alri.c();
        }
        alvg alvgVar = new alvg();
        alriVar.b.b(new alre(alriVar, alvgVar, packageName, alvgVar), alvgVar);
        return alvgVar.a;
    }

    @Override // defpackage.alqy
    public final synchronized void b(alrt alrtVar) {
        this.b.b(alrtVar);
    }

    @Override // defpackage.alqy
    public final synchronized void c(alrt alrtVar) {
        this.b.c(alrtVar);
    }

    @Override // defpackage.alqy
    public final void d() {
        alri alriVar = this.a;
        String packageName = this.c.getPackageName();
        if (alriVar.b == null) {
            alri.c();
            return;
        }
        alvg alvgVar = new alvg();
        alriVar.b.b(new alrf(alriVar, alvgVar, alvgVar, packageName), alvgVar);
    }

    @Override // defpackage.alqy
    public final void e(alqw alqwVar, int i, Activity activity) {
        alrd a = alrd.a(i);
        if (alqwVar == null || alqwVar.a(a) == null || alqwVar.c) {
            return;
        }
        alqwVar.c = true;
        activity.startIntentSenderForResult(alqwVar.a(a).getIntentSender(), 2400, null, 0, 0, 0, null);
    }
}
