package defpackage;

import android.widget.ImageView;
import com.google.android.apps.gmm.ar.api.ArLauncherParams;
import com.google.android.apps.gmm.ar.api.AutoValue_ArLauncherParams;
import java.util.List;
/* compiled from: PG */
/* renamed from: czb  reason: default package */
/* loaded from: classes5.dex */
public final class czb extends czp {
    public czh a;
    public Iterable<dcvs> b;
    public ImageView.ScaleType c;
    private dcdc<czq> d;
    private Boolean e;
    private Boolean f;
    private Boolean g;
    private Boolean h;
    private Boolean i;
    private Boolean j;
    private doi k;
    private dcdg<czq, String> l;
    private dcdn<czq, String> m;
    private dcdg<czq, String> n;
    private dcdn<czq, String> o;
    private dcdg<czq, String> p;
    private dcdn<czq, String> q;

    public czb() {
    }

    public czb(ArLauncherParams arLauncherParams) {
        this.a = arLauncherParams.a();
        this.b = arLauncherParams.b();
        this.d = arLauncherParams.c();
        this.e = Boolean.valueOf(arLauncherParams.d());
        this.f = Boolean.valueOf(arLauncherParams.e());
        this.g = Boolean.valueOf(arLauncherParams.f());
        this.h = Boolean.valueOf(arLauncherParams.g());
        this.i = Boolean.valueOf(arLauncherParams.h());
        this.j = Boolean.valueOf(arLauncherParams.i());
        this.k = arLauncherParams.j();
        this.c = arLauncherParams.k();
        this.m = arLauncherParams.l();
        this.o = arLauncherParams.m();
        this.q = arLauncherParams.n();
    }

    @Override // defpackage.czp
    public final dcdg<czq, String> a() {
        if (this.l == null) {
            if (this.m == null) {
                this.l = dcdn.p();
            } else {
                dcdg<czq, String> p = dcdn.p();
                this.l = p;
                p.c(this.m);
                this.m = null;
            }
        }
        return this.l;
    }

    @Override // defpackage.czp
    public final dcdg<czq, String> b() {
        if (this.n == null) {
            if (this.o == null) {
                this.n = dcdn.p();
            } else {
                dcdg<czq, String> p = dcdn.p();
                this.n = p;
                p.c(this.o);
                this.o = null;
            }
        }
        return this.n;
    }

    @Override // defpackage.czp
    public final dcdg<czq, String> c() {
        if (this.p == null) {
            if (this.q == null) {
                this.p = dcdn.p();
            } else {
                dcdg<czq, String> p = dcdn.p();
                this.p = p;
                p.c(this.q);
                this.q = null;
            }
        }
        return this.p;
    }

    @Override // defpackage.czp
    public final ArLauncherParams d() {
        dcdg<czq, String> dcdgVar = this.l;
        if (dcdgVar != null) {
            this.m = dcdgVar.b();
        } else if (this.m == null) {
            this.m = dcmn.a;
        }
        dcdg<czq, String> dcdgVar2 = this.n;
        if (dcdgVar2 != null) {
            this.o = dcdgVar2.b();
        } else if (this.o == null) {
            this.o = dcmn.a;
        }
        dcdg<czq, String> dcdgVar3 = this.p;
        if (dcdgVar3 != null) {
            this.q = dcdgVar3.b();
        } else if (this.q == null) {
            this.q = dcmn.a;
        }
        String str = this.a == null ? " featureType" : "";
        if (this.b == null) {
            str = str.concat(" latLngs");
        }
        if (this.d == null) {
            str = String.valueOf(str).concat(" showOnboarding");
        }
        if (this.e == null) {
            str = String.valueOf(str).concat(" onboardingShown");
        }
        if (this.f == null) {
            str = String.valueOf(str).concat(" nightModeWarningShown");
        }
        if (this.g == null) {
            str = String.valueOf(str).concat(" lowEndDeviceWarningShown");
        }
        if (this.h == null) {
            str = String.valueOf(str).concat(" indoorWarningShown");
        }
        if (this.i == null) {
            str = String.valueOf(str).concat(" showOnboardingCancelButton");
        }
        if (this.j == null) {
            str = String.valueOf(str).concat(" incognitoWarningShown");
        }
        if (this.k == null) {
            str = String.valueOf(str).concat(" onboardingLottieAsset");
        }
        if (!str.isEmpty()) {
            String valueOf = String.valueOf(str);
            throw new IllegalStateException(valueOf.length() != 0 ? "Missing required properties:".concat(valueOf) : new String("Missing required properties:"));
        }
        return new AutoValue_ArLauncherParams(this.a, this.b, this.d, this.e.booleanValue(), this.f.booleanValue(), this.g.booleanValue(), this.h.booleanValue(), this.i.booleanValue(), this.j.booleanValue(), this.k, this.c, this.m, this.o, this.q);
    }

    @Override // defpackage.czp
    public final void e(boolean z) {
        this.j = Boolean.valueOf(z);
    }

    @Override // defpackage.czp
    public final void f(boolean z) {
        this.h = Boolean.valueOf(z);
    }

    @Override // defpackage.czp
    public final void g(boolean z) {
        this.g = Boolean.valueOf(z);
    }

    @Override // defpackage.czp
    public final void h(boolean z) {
        this.f = Boolean.valueOf(z);
    }

    @Override // defpackage.czp
    public final void i(@dzsi ImageView.ScaleType scaleType) {
        this.c = scaleType;
    }

    @Override // defpackage.czp
    public final void j(doi doiVar) {
        if (doiVar != null) {
            this.k = doiVar;
            return;
        }
        throw new NullPointerException("Null onboardingLottieAsset");
    }

    @Override // defpackage.czp
    public final void k(boolean z) {
        this.e = Boolean.valueOf(z);
    }

    @Override // defpackage.czp
    public final void l(List<czq> list) {
        this.d = dcdc.r(list);
    }

    @Override // defpackage.czp
    public final void m(boolean z) {
        this.i = Boolean.valueOf(z);
    }
}
