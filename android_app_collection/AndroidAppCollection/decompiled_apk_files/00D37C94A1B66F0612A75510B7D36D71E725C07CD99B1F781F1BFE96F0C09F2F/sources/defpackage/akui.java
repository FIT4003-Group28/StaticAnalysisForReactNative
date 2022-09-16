package defpackage;

import android.os.Bundle;
import java.util.Set;
import java.util.concurrent.Executor;
/* compiled from: PG */
/* renamed from: akui  reason: default package */
/* loaded from: classes.dex */
public final class akui {
    public final azqb a;
    private final Executor b;
    private final ankw c;
    private final akvm d;

    public akui(azqb azqbVar, Executor executor, ankw ankwVar, akvm akvmVar) {
        this.a = azqbVar;
        this.b = executor;
        this.c = ankwVar;
        this.d = akvmVar;
    }

    public final void a(akuh akuhVar, Bundle bundle) {
        int i = 0;
        for (String str : bundle.keySet()) {
            i += bundle.getString(str, "").length();
        }
        ((vpd) this.d.q.get()).b(i, new Object[0]);
        akuhVar.a(bundle);
    }

    public final void b(akuh akuhVar) {
        c(null, akuhVar);
    }

    public final void c(String str, final akuh akuhVar) {
        final Bundle bundle = new Bundle();
        for (akuk akukVar : (Set) this.a.get()) {
            try {
                akukVar.a(str, bundle);
            } catch (Exception e) {
                zep.d("Failed to fill feedback.", e);
            }
        }
        ylx.k(this.c.qo(new Runnable() { // from class: akug
            @Override // java.lang.Runnable
            public final void run() {
                akui akuiVar = akui.this;
                Bundle bundle2 = bundle;
                for (akuk akukVar2 : (Set) akuiVar.a.get()) {
                    try {
                        akukVar2.d(bundle2);
                    } catch (Exception e2) {
                        zep.d("Failed to fill feedback.", e2);
                    }
                }
            }
        }), this.b, new ylv() { // from class: akue
            @Override // defpackage.zdt
            /* renamed from: b */
            public final void a(Throwable th) {
                akui akuiVar = akui.this;
                akuh akuhVar2 = akuhVar;
                Bundle bundle2 = bundle;
                zep.d("Failed to execute all psd fillers.", th);
                akuiVar.a(akuhVar2, bundle2);
            }
        }, new ylw() { // from class: akuf
            @Override // defpackage.ylw, defpackage.zdt
            public final void a(Object obj) {
                akui.this.a(akuhVar, bundle);
            }
        });
    }
}
