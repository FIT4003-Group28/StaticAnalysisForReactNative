package defpackage;

import android.accounts.Account;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
/* compiled from: PG */
/* renamed from: wfy  reason: default package */
/* loaded from: classes4.dex */
public final class wfy implements wfz {
    public final whp a;
    public final vzk b;
    public final afzf c;
    public final long d;
    public final yjs e;
    private final Executor f;

    public wfy(afvn afvnVar, Executor executor, whp whpVar, aafo aafoVar, wge wgeVar, vzk vzkVar, yjs yjsVar, wga wgaVar, aacz aaczVar, dt dtVar) {
        this.a = whpVar;
        this.f = executor;
        this.b = vzkVar;
        this.e = yjsVar;
        this.c = new wfx(afvnVar, wgeVar, aafoVar, dtVar);
        wgaVar.a.add(this);
        aovy aovyVar = aaczVar.b().i;
        aovyVar = aovyVar == null ? aovy.a : aovyVar;
        if ((aovyVar.b & 16) == 0) {
            this.d = TimeUnit.MINUTES.toSeconds(60L);
        } else {
            this.d = TimeUnit.MINUTES.toSeconds(aovyVar.c);
        }
    }

    public final void a() {
        this.f.execute(new Runnable() { // from class: wfw
            @Override // java.lang.Runnable
            public final void run() {
                Account[] h;
                int i;
                wfy wfyVar = wfy.this;
                whp whpVar = wfyVar.a;
                try {
                } catch (Exception unused) {
                }
                for (Account account : whpVar.h()) {
                    if (!whpVar.g(account) && !whpVar.f(account)) {
                    }
                    if (wfyVar.d <= 0) {
                        return;
                    }
                    wfyVar.b.b(null, wfyVar.c);
                    wfyVar.e.e("modular_onboarding_check", wfyVar.d, true, 1, null, null, false);
                    return;
                }
            }
        });
    }

    @Override // defpackage.wfz
    public final void b() {
        a();
    }
}
