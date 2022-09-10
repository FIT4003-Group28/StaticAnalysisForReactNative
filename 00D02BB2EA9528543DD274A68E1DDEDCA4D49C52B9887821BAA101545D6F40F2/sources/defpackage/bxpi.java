package defpackage;

import android.app.Activity;
import com.google.android.apps.maps.R;
import java.util.concurrent.Executor;
/* compiled from: PG */
/* renamed from: bxpi  reason: default package */
/* loaded from: classes4.dex */
public class bxpi implements bxny {
    public final avij a;
    public final Executor d;
    public final akpm e;
    public final ahjq f;
    private final Activity h;
    private final cztz i;
    private final avzp j;
    @dzsi
    private dltm g = null;
    public Boolean b = false;
    public boolean c = false;

    public bxpi(cqhn cqhnVar, avij avijVar, akpm akpmVar, ahjq ahjqVar, Activity activity, Executor executor, cztz cztzVar, avzp avzpVar) {
        this.a = avijVar;
        this.h = activity;
        this.d = executor;
        this.e = akpmVar;
        this.f = ahjqVar;
        this.i = cztzVar;
        this.j = avzpVar;
    }

    @Override // defpackage.bxny
    public Boolean a() {
        boolean z = false;
        if (this.g != null && !this.b.booleanValue() && !this.c) {
            z = true;
        }
        return Boolean.valueOf(z);
    }

    @Override // defpackage.bxny
    public CharSequence b() {
        long j;
        dltm dltmVar = this.g;
        if (dltmVar != null) {
            avzp avzpVar = this.j;
            long j2 = dltmVar.i;
            dlug dlugVar = dltmVar.c;
            if (dlugVar == null) {
                dlugVar = dlug.c;
            }
            j = avzpVar.e(j2, dlugVar);
        } else {
            j = 0;
        }
        return this.h.getString(R.string.OFFLINE_ONBOARDING_SEARCH_SUGGEST_PROMO_SUBTEXT, new Object[]{Long.valueOf(j)});
    }

    @Override // defpackage.bxny
    public CharSequence c() {
        dltm dltmVar = this.g;
        return dltmVar != null ? this.h.getString(R.string.OFFLINE_ONBOARDING_SEARCH_SUGGEST_PROMO_TEXT, new Object[]{dltmVar.a}) : "";
    }

    @Override // defpackage.bxny
    public cqkl d() {
        cztq a = cztt.a(this.i);
        a.d(cztr.LONG);
        a.c = this.h.getString(R.string.OFFLINE_ONBOARDING_SEARCH_SUGGEST_YOU_WILL_BE_NOTIFIED);
        a.c();
        dltm dltmVar = this.g;
        if (dltmVar != null) {
            this.a.n(dltmVar.b, new avif(this) { // from class: bxpg
                private final bxpi a;

                {
                    this.a = this;
                }

                @Override // defpackage.avif
                public final void a() {
                    final bxpi bxpiVar = this.a;
                    bxpiVar.d.execute(new Runnable(bxpiVar) { // from class: bxph
                        private final bxpi a;

                        {
                            this.a = bxpiVar;
                        }

                        @Override // java.lang.Runnable
                        public final void run() {
                            bxpi bxpiVar2 = this.a;
                            bxpiVar2.b = true;
                            cqkx.p(bxpiVar2);
                        }
                    });
                }
            });
        }
        return cqkl.a;
    }

    public void e(dltm dltmVar) {
        this.g = dltmVar;
    }
}
