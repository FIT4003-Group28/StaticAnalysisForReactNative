package defpackage;

import android.content.Intent;
import android.os.Handler;
import android.text.TextUtils;
import com.google.android.apps.youtube.app.common.ui.navigation.panels.PanelsConfiguration;
import com.google.android.apps.youtube.app.fragments.panels.AutoValue_PanelFragmentDescriptor;
import com.google.android.apps.youtube.app.fragments.panels.PanelFragmentDescriptor;
import com.google.android.apps.youtube.app.settings.GeneralPrefsFragment;
import com.google.android.apps.youtube.app.settings.SettingsActivity;
import com.google.android.youtube.R;
import j$.util.Optional;
import j$.util.function.Consumer;
import java.util.concurrent.Executor;
/* compiled from: PG */
/* renamed from: lhe  reason: default package */
/* loaded from: classes3.dex */
public final class lhe extends lhf implements amau {
    public final SettingsActivity a;
    public final gfu b;
    public final fqd c;
    public final axnm d;
    public final Executor e;
    public final aavp f;
    public final Handler g;
    public final yvs h;
    public final axnm i;
    public final axnm j;
    public final axnm k;
    public final wgz l;
    public final aadd m;
    public final fud n;
    public final gfs p;
    public boolean r;
    public aby s;
    private final whe u;
    private final ljo v;
    public final abq o = new lhd(this);
    public String q = "";

    public lhe(SettingsActivity settingsActivity, gfu gfuVar, fqd fqdVar, axnm axnmVar, Executor executor, aavp aavpVar, Handler handler, yvs yvsVar, axnm axnmVar2, axnm axnmVar3, fud fudVar, ljo ljoVar, axnm axnmVar4, aadd aaddVar, wgz wgzVar, whe wheVar) {
        this.a = settingsActivity;
        this.b = gfuVar;
        this.c = fqdVar;
        this.d = axnmVar;
        this.e = executor;
        this.f = aavpVar;
        this.g = handler;
        this.h = yvsVar;
        this.i = axnmVar2;
        this.j = axnmVar3;
        this.n = fudVar;
        this.v = ljoVar;
        this.k = axnmVar4;
        this.l = wgzVar;
        this.u = wheVar;
        this.m = aaddVar;
        gfs a = gfuVar.a();
        this.p = a;
        boolean X = eog.X(aaddVar.a());
        if (a == gfs.DARK) {
            if (X) {
                settingsActivity.setTheme(2132083927);
                return;
            } else {
                settingsActivity.setTheme(2132083926);
                return;
            }
        }
        if (X) {
            settingsActivity.setTheme(2132083928);
        } else {
            settingsActivity.setTheme(2132083925);
        }
        emn.D(settingsActivity);
    }

    @Override // defpackage.amau
    public final void a(amas amasVar) {
        if (this.l.a()) {
            this.u.b(11, 2, 2);
            ((gbv) this.i.get()).b(PanelsConfiguration.c(new AutoValue_PanelFragmentDescriptor(lhk.class, amasVar.a()), PanelFragmentDescriptor.e(GeneralPrefsFragment.class)));
            this.a.getOnBackPressedDispatcher().b(this.a, this.o);
            g(this.a.getIntent());
        }
    }

    @Override // defpackage.amau
    public final void b(Throwable th) {
        String.valueOf(String.valueOf(th)).length();
        if (this.l.a()) {
            afus.c(2, 25, "[Clockwork][SettingsActivityPeer] onAccountError()", th);
            this.u.c(11, th);
            this.a.finish();
        }
    }

    @Override // defpackage.amau
    public final /* synthetic */ void c() {
    }

    @Override // defpackage.amau
    public final /* synthetic */ void d() {
        answ.m(this);
    }

    public final lhp e() {
        lhp lhpVar = (lhp) this.a.getSupportFragmentManager().f(f());
        lhpVar.getClass();
        return lhpVar;
    }

    public final String f() {
        if (this.l.a()) {
            return lhk.class.getName();
        }
        return lhj.class.getName();
    }

    public final void g(Intent intent) {
        Optional map = Optional.of(intent).map(jsa.k).map(jsa.l).map(jsa.m);
        final lhp e = e();
        map.ifPresent(new Consumer() { // from class: lhb
            @Override // j$.util.function.Consumer
            public final void accept(Object obj) {
                lhp.this.ag.a((apzg) obj);
            }

            @Override // j$.util.function.Consumer
            public final /* synthetic */ Consumer andThen(Consumer consumer) {
                return consumer.getClass();
            }
        });
    }

    @Override // defpackage.lhf
    public final void h(CharSequence charSequence) {
        if (TextUtils.isEmpty(charSequence) || i()) {
            super.h(this.a.getString(R.string.settings));
        } else {
            super.h(charSequence);
        }
    }

    public final boolean i() {
        return ((gbv) this.i.get()).d();
    }

    public final boolean j(String str) {
        if (str != null) {
            try {
                this.v.d = !str.equals("com.google.android.apps.youtube.app.settings.datasaving.DataSavingPrefsFragment");
                ((gbv) this.i.get()).c(PanelFragmentDescriptor.e(Class.forName(str)), true);
                return true;
            } catch (Exception unused) {
                return false;
            }
        }
        return false;
    }
}
