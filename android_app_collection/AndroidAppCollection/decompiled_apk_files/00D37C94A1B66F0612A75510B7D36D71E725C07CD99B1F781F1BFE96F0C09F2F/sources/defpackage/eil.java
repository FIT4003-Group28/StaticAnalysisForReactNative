package defpackage;

import android.content.Context;
import android.content.IntentFilter;
import android.os.Bundle;
import android.util.Log;
import java.util.concurrent.Executor;
/* compiled from: PG */
/* renamed from: eil  reason: default package */
/* loaded from: classes3.dex */
public final class eil {
    public final azqb a;
    public final ehj b;
    public final Executor d;
    public final aacz e;
    public final azpm c = azpm.aI(false);
    private final azpm f = azpm.aI(eik.NOT_SUPPORTED);

    public eil(Context context, azqb azqbVar, aacz aaczVar, final efz efzVar, Executor executor, final ayor ayorVar) {
        this.a = azqbVar;
        this.e = aaczVar;
        this.d = executor;
        this.b = new ehj(context, this);
        if (eog.av(aaczVar)) {
            executor.execute(new Runnable() { // from class: eij
                @Override // java.lang.Runnable
                public final void run() {
                    eil.this.c(efzVar, ayorVar);
                }
            });
            return;
        }
        azqbVar.get();
        c(efzVar, ayorVar);
    }

    public final ayoi a() {
        return this.f.R().B();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void b() {
        eik eikVar;
        int i = -1;
        try {
            Bundle call = ((vwj) this.a.get()).a.getContentResolver().call(vwi.a, "get_wind_down_state", (String) null, (Bundle) null);
            if (call != null) {
                i = call.getInt("state", -1);
            }
        } catch (Throwable th) {
            Log.w("WindDownApi", "Unexpected error calling Digital Wellbeing", th);
        }
        azpm azpmVar = this.f;
        if (i == 1) {
            eikVar = eik.IN_BEDTIME;
        } else if (i == 0) {
            eikVar = eik.NOT_IN_BEDTIME;
        } else if (i == -2) {
            eikVar = eik.NO_ACCESS;
        } else {
            eikVar = eik.NOT_SUPPORTED;
        }
        azpmVar.c(eikVar);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void c(efz efzVar, ayor ayorVar) {
        if (!eog.av(this.e) || eog.aw(this.e)) {
            efzVar.b().B(ayorVar).R(new aypv() { // from class: eih
                @Override // defpackage.aypv
                public final void a() {
                    eil eilVar = eil.this;
                    if (!eog.aw(eilVar.e)) {
                        return;
                    }
                    ehj ehjVar = eilVar.b;
                    if (!ehjVar.b) {
                        ehjVar.b = true;
                        ehjVar.a.registerReceiver(ehjVar, new IntentFilter("com.google.android.apps.wellbeing.action.ACTION_WIND_DOWN_STATE_CHANGED"));
                    }
                    eilVar.b();
                }
            });
        }
    }
}
