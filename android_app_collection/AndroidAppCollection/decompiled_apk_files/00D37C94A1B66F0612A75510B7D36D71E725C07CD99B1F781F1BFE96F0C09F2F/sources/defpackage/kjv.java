package defpackage;

import android.content.Intent;
import android.view.View;
import com.google.android.apps.youtube.app.player.overlay.accessibility.PlayerAccessibilitySettingsEduController$LifecycleObserver;
import com.google.android.youtube.R;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;
/* compiled from: PG */
/* renamed from: kjv  reason: default package */
/* loaded from: classes3.dex */
public final class kjv {
    public static final long a = TimeUnit.DAYS.toMillis(90);
    public final dt b;
    public final snc c;
    public final kjo d;
    public final akfd e;
    public final airw f;
    public final PlayerAccessibilitySettingsEduController$LifecycleObserver g;
    public final acti h;
    public final aacz i;
    public final kjn j;

    /* JADX WARN: Type inference failed for: r1v1, types: [com.google.android.apps.youtube.app.player.overlay.accessibility.PlayerAccessibilitySettingsEduController$LifecycleObserver] */
    public kjv(dt dtVar, kjn kjnVar, kjo kjoVar, aacz aaczVar, airw airwVar, akfd akfdVar, snc sncVar, acti actiVar) {
        dtVar.getClass();
        this.b = dtVar;
        this.j = kjnVar;
        this.d = kjoVar;
        this.i = aaczVar;
        this.f = airwVar;
        this.e = akfdVar;
        this.c = sncVar;
        this.h = actiVar;
        this.g = new f() { // from class: com.google.android.apps.youtube.app.player.overlay.accessibility.PlayerAccessibilitySettingsEduController$LifecycleObserver
            private aypg b;

            @Override // defpackage.f, defpackage.g
            public final /* synthetic */ void kG(apy apyVar) {
            }

            @Override // defpackage.f, defpackage.g
            public final /* synthetic */ void lc(apy apyVar) {
            }

            @Override // defpackage.f, defpackage.g
            public final /* synthetic */ void ld(apy apyVar) {
            }

            @Override // defpackage.g
            public final void nA(apy apyVar) {
                aypg aypgVar = this.b;
                if (aypgVar != null) {
                    azof.f((AtomicReference) aypgVar);
                    this.b = null;
                }
            }

            @Override // defpackage.g
            public final /* synthetic */ void nv(apy apyVar) {
            }

            @Override // defpackage.f, defpackage.g
            public final void nz(apy apyVar) {
                if (eog.aK(kjv.this.i)) {
                    final kjv kjvVar = kjv.this;
                    this.b = kjvVar.f.G().a.I().G(aypa.a()).aa(new ayqb() { // from class: kjs
                        @Override // defpackage.ayqb
                        public final void a(Object obj) {
                            final kjv kjvVar2 = kjv.this;
                            if (!((ahhw) obj).c().d() || !kjvVar2.d.b()) {
                                return;
                            }
                            ylx.n(kjvVar2.b, ((vne) kjvVar2.j.a.get()).a(), lcz.b, new zdt() { // from class: kjr
                                @Override // defpackage.zdt
                                public final void a(Object obj2) {
                                    akff e;
                                    kjv kjvVar3 = kjv.this;
                                    kkb kkbVar = (kkb) obj2;
                                    if (kkbVar == null || kkbVar.f >= 2) {
                                        return;
                                    }
                                    long j = kkbVar.e;
                                    if (j != 0) {
                                        long c = kjvVar3.c.c() - j;
                                        if (c < 0 || c < kjv.a) {
                                            return;
                                        }
                                    }
                                    if ((kkbVar.b & 1) != 0) {
                                        return;
                                    }
                                    akfd akfdVar2 = kjvVar3.e;
                                    if (!kjvVar3.d.b() || kjvVar3.d.c()) {
                                        akfe d = kjvVar3.e.l().d(2131232354);
                                        d.d = kjvVar3.b.getString(R.string.accessibility_settings_edu_opt_out_text);
                                        e = d.c(kjvVar3.b.getString(R.string.settings_button), kjvVar3.a()).a(kjvVar3.b.getString(R.string.dismiss), ija.f).e();
                                    } else {
                                        akfe d2 = kjvVar3.e.l().d(2131232354);
                                        d2.d = kjvVar3.b.getString(R.string.accessibility_settings_edu_opt_in_text);
                                        e = d2.a(kjvVar3.b.getString(R.string.settings_button), kjvVar3.a()).c(kjvVar3.b.getString(R.string.dismiss), ija.e).e();
                                    }
                                    akfdVar2.n(e);
                                    kjvVar3.h.n(new acte(actj.ACCESSIBILITY_SETTINGS_EDUACTION_BUTTON));
                                    kjn kjnVar2 = kjvVar3.j;
                                    ((vne) kjnVar2.a.get()).b(new kju(kjvVar3.c.c()), anjk.a).qY(bhj.f, anjk.a);
                                }
                            });
                        }
                    }, kjt.a);
                }
            }
        };
    }

    public final View.OnClickListener a() {
        return new View.OnClickListener() { // from class: kjq
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                kjv kjvVar = kjv.this;
                dt dtVar = kjvVar.b;
                dtVar.startActivity(new Intent().setClassName(dtVar, etk.e("settings.accessibility.AccessibilitySettingsActivity")).setFlags(335544320));
                kjvVar.h.H(3, new acte(actj.ACCESSIBILITY_SETTINGS_EDUACTION_BUTTON), null);
            }
        };
    }
}
