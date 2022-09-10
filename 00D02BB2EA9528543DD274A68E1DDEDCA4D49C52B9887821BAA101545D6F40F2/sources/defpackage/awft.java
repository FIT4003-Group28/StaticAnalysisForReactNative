package defpackage;

import android.widget.TextView;
import androidx.preference.Preference;
import androidx.preference.PreferenceScreen;
import androidx.preference.TwoStatePreference;
import com.google.android.apps.maps.R;
import java.util.concurrent.Executor;
/* compiled from: PG */
/* renamed from: awft  reason: default package */
/* loaded from: classes3.dex */
final class awft implements degu<Boolean> {
    final /* synthetic */ PreferenceScreen a;
    final /* synthetic */ awfw b;

    public awft(awfw awfwVar, PreferenceScreen preferenceScreen) {
        this.b = awfwVar;
        this.a = preferenceScreen;
    }

    @Override // defpackage.degu
    public final void a(Throwable th) {
    }

    @Override // defpackage.degu
    public final /* bridge */ /* synthetic */ void b(Boolean bool) {
        final Boolean bool2 = bool;
        Executor executor = this.b.ap;
        final PreferenceScreen preferenceScreen = this.a;
        executor.execute(new Runnable(this, preferenceScreen, bool2) { // from class: awfs
            private final awft a;
            private final PreferenceScreen b;
            private final Boolean c;

            {
                this.a = this;
                this.b = preferenceScreen;
                this.c = bool2;
            }

            @Override // java.lang.Runnable
            public final void run() {
                this.a.c(this.b, this.c);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final /* synthetic */ void c(PreferenceScreen preferenceScreen, Boolean bool) {
        final awfw awfwVar = this.b;
        boolean booleanValue = bool.booleanValue();
        if (awfwVar.A == null) {
            return;
        }
        final awfv aX = awfwVar.aX();
        aX.m(awfwVar.af.d());
        aX.t(R.string.OFFLINE_MAPS_SETTINGS_AUTOMATICALLY_UPDATE_TITLE);
        cjta b = cjtd.b();
        b.d = dtxx.bs;
        aX.c = b.a();
        aX.x(R.string.OFFLINE_MAPS_SETTINGS_AUTOMATICALLY_UPDATE_SUMMARY);
        aX.o = new auc(awfwVar, aX) { // from class: awfp
            private final awfw a;
            private final awfv b;

            {
                this.a = awfwVar;
                this.b = aX;
            }

            @Override // defpackage.auc
            public final boolean a(Preference preference) {
                boolean z;
                awfw awfwVar2 = this.a;
                awfv awfvVar = this.b;
                if (awfwVar2.aX && (z = ((TwoStatePreference) awfvVar).a) != awfwVar2.af.d()) {
                    awfwVar2.aT(awfvVar, z);
                    awfwVar2.af.a.S(bvjk.eo, z);
                    return true;
                }
                return false;
            }
        };
        preferenceScreen.aj(aX);
        final awfv aX2 = awfwVar.aX();
        aX2.t(R.string.OFFLINE_AUTODOWNLOAD_SETTING);
        aX2.m(awfwVar.aS());
        aX2.c = cjtd.a(dtxx.br);
        aX2.o = new auc(awfwVar, aX2) { // from class: awfo
            private final awfw a;
            private final awfv b;

            {
                this.a = awfwVar;
                this.b = aX2;
            }

            @Override // defpackage.auc
            public final boolean a(Preference preference) {
                boolean z;
                awfw awfwVar2 = this.a;
                awfv awfvVar = this.b;
                if (awfwVar2.aX && (z = ((TwoStatePreference) awfvVar).a) != awfwVar2.aS()) {
                    awfwVar2.aT(awfvVar, z);
                    awfwVar2.af.a.T(bvjk.ez, awfwVar2.ai.a().j(), z);
                    return true;
                }
                return false;
            }
        };
        preferenceScreen.aj(aX2);
        final awfu aW = awfwVar.aW();
        aW.t(R.string.OFFLINE_MAPS_SETTINGS_DOWNLOAD_PREFERENCE_TITLE);
        aW.x(awfwVar.aU());
        aW.a = cjtd.a(dtxx.bt);
        aW.o = new auc(awfwVar, aW) { // from class: awfn
            private final awfw a;
            private final awfu b;

            {
                this.a = awfwVar;
                this.b = aW;
            }

            @Override // defpackage.auc
            public final boolean a(Preference preference) {
                final awfw awfwVar2 = this.a;
                final awfu awfuVar = this.b;
                if (!awfwVar2.aX) {
                    return false;
                }
                cjtd cjtdVar = awfuVar.a;
                TextView textView = awfuVar.b;
                cjql e = textView == null ? null : cjqg.e(textView);
                if (cjtdVar != null && e != null) {
                    awfwVar2.aj.j(e, cjtdVar);
                }
                awfk a = awfwVar2.am.a();
                a.h = new Runnable(awfwVar2, awfuVar) { // from class: awfq
                    private final awfw a;
                    private final Preference b;

                    {
                        this.a = awfwVar2;
                        this.b = awfuVar;
                    }

                    @Override // java.lang.Runnable
                    public final void run() {
                        this.b.x(this.a.aU());
                    }
                };
                awgb awgbVar = a.c;
                awgbVar.e(a.e.getString(R.string.OFFLINE_MAPS_SETTINGS_DOWNLOAD_PREFERENCE_TITLE));
                awgbVar.d(a.e.getString(R.string.CANCEL_BUTTON), awfi.a, null);
                awgbVar.c(a.e.getString(R.string.SAVE), new awfj(a), null);
                awgbVar.m();
                cjqp f = a.g.f(a.c.l());
                a.i = f.d(awfk.a);
                a.j = f.d(awfk.b);
                return true;
            }
        };
        preferenceScreen.aj(aW);
        if (booleanValue) {
            final awfu aW2 = awfwVar.aW();
            aW2.t(R.string.OFFLINE_MAPS_SETTINGS_STORAGE_SETTINGS_TITLE);
            aW2.x(awfwVar.aV());
            aW2.o = new auc(awfwVar, aW2) { // from class: awfm
                private final awfw a;
                private final awfu b;

                {
                    this.a = awfwVar;
                    this.b = aW2;
                }

                @Override // defpackage.auc
                public final boolean a(Preference preference) {
                    final awfw awfwVar2 = this.a;
                    final awfu awfuVar = this.b;
                    if (!awfwVar2.aX) {
                        return false;
                    }
                    awga a = awfwVar2.al.a();
                    awgb awgbVar = a.a;
                    awgbVar.e(a.d.getString(R.string.OFFLINE_MAPS_SETTINGS_STORAGE_SETTINGS_TITLE));
                    awgbVar.f(a.d.getString(R.string.OFFLINE_MAPS_SETTINGS_STORAGE_SETTINGS_DESCRIPTION));
                    awgbVar.d(a.d.getString(R.string.CANCEL_BUTTON), awfx.a, null);
                    awgbVar.c(a.d.getString(R.string.SAVE), new awfz(a), null);
                    a.h = cjtd.a(dtxx.by);
                    a.i = cjtd.a(dtxx.bw);
                    a.j = cjtd.a(dtxx.bx);
                    a.g = new Runnable(awfwVar2, awfuVar) { // from class: awfr
                        private final awfw a;
                        private final Preference b;

                        {
                            this.a = awfwVar2;
                            this.b = awfuVar;
                        }

                        @Override // java.lang.Runnable
                        public final void run() {
                            this.b.x(this.a.aV());
                        }
                    };
                    a.a();
                    return true;
                }
            };
            preferenceScreen.aj(aW2);
        }
        boolean z = awfwVar.ag.getOfflineMapsParameters().A;
        awfu aW3 = awfwVar.aW();
        aW3.t(R.string.OFFLINE_MAPS_SETTINGS_ABOUT_TITLE);
        aW3.x(R.string.OFFLINE_MAPS_SETTINGS_ABOUT_DESCRIPTION);
        aW3.a = cjtd.a(dtxx.bq);
        aW3.o = new auc(awfwVar) { // from class: awfl
            private final awfw a;

            {
                this.a = awfwVar;
            }

            @Override // defpackage.auc
            public final boolean a(Preference preference) {
                awfw awfwVar2 = this.a;
                if (!awfwVar2.aX) {
                    return false;
                }
                awfwVar2.ah.a("android_offline_maps");
                return true;
            }
        };
        preferenceScreen.aj(aW3);
    }
}
