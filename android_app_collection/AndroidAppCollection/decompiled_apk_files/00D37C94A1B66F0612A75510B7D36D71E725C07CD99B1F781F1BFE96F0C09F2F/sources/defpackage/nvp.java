package defpackage;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Rect;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.TextView;
import com.google.android.apps.youtube.app.common.player.overlay.InlineTimeBarWrapper;
import com.google.android.libraries.youtube.common.ui.YouTubeTextView;
import com.google.android.libraries.youtube.innertube.model.player.PlayerResponseModel;
import com.google.android.youtube.R;
import java.util.concurrent.TimeUnit;
/* compiled from: PG */
/* renamed from: nvp  reason: default package */
/* loaded from: classes3.dex */
public final class nvp implements nwa, ezg, adwm, xgn {
    public static final long a = TimeUnit.SECONDS.toMillis(1);
    public CharSequence A;
    public CharSequence B;
    public boolean C;
    public final aacz D;
    public final yye E;
    private final Context F;
    private final niw G;
    private final niz H;
    private final ViewGroup I;

    /* renamed from: J  reason: collision with root package name */
    private final ViewGroup f236J;
    private final View K;
    private final ImageView L;
    private final ghs M;
    private final boolean N;
    private final boolean O;
    private int P;
    public int b;
    public final azqb c;
    public final View d;
    public final int e;
    public final int f;
    public final TextView g;
    public final nvo h;
    public final nvw i;
    public final nwf j;
    public final adwt k;
    public final xgp l;
    public final ezh m;
    public final airw n;
    public final aypf o;
    public final aypf p;
    public final yni q;
    public final nvl r;
    public final Runnable s;
    public final azpb t;
    public final azpb u;
    public final azpb v;
    public final boolean w;
    public adwj x;
    public boolean y;
    public CharSequence z;

    public nvp(Context context, azqb azqbVar, final acti actiVar, final niy niyVar, final niw niwVar, niz nizVar, ahix ahixVar, xga xgaVar, ahig ahigVar, wzx wzxVar, nwg nwgVar, aacz aaczVar, airw airwVar, adwt adwtVar, xgp xgpVar, yni yniVar, ezh ezhVar, nvx nvxVar, boolean z, ghs ghsVar, nvz nvzVar) {
        nvr nvrVar = new nvr();
        nvs nvsVar = new nvs();
        ffh ffhVar = ((InlineTimeBarWrapper) nvzVar.c()).a;
        Context context2 = (Context) nwgVar.a.get();
        context2.getClass();
        aacz aaczVar2 = (aacz) nwgVar.b.get();
        aaczVar2.getClass();
        airw airwVar2 = (airw) nwgVar.c.get();
        airwVar2.getClass();
        yni yniVar2 = (yni) nwgVar.d.get();
        yniVar2.getClass();
        ffhVar.getClass();
        nwf nwfVar = new nwf(context2, aaczVar2, airwVar2, yniVar2, ffhVar);
        View b = nvzVar.b();
        ImageView imageView = (ImageView) b.findViewById(R.id.floaty_play_pause_button);
        ProgressBar progressBar = (ProgressBar) b.findViewById(R.id.progress_bar);
        nvg nvgVar = new nvg(azqbVar, actiVar);
        imageView.getClass();
        progressBar.getClass();
        adoa adoaVar = (adoa) nvxVar.a.get();
        adoaVar.getClass();
        nvw nvwVar = new nvw(imageView, progressBar, nvgVar, adoaVar);
        this.b = -1;
        this.y = false;
        this.F = context;
        this.G = niwVar;
        this.H = nizVar;
        this.D = aaczVar;
        this.c = azqbVar;
        this.j = nwfVar;
        this.i = nvwVar;
        this.n = airwVar;
        this.k = adwtVar;
        this.l = xgpVar;
        this.q = yniVar;
        this.m = ezhVar;
        this.N = z;
        this.M = ghsVar;
        this.O = eog.aB(aaczVar);
        this.o = new aypf();
        this.p = new aypf();
        this.r = new nvl(this);
        this.s = new nvj(this);
        asxj asxjVar = aaczVar.b().e;
        this.w = (asxjVar == null ? asxj.a : asxjVar).ac;
        View b2 = nvzVar.b();
        this.d = b2;
        ViewGroup viewGroup = (ViewGroup) b2.findViewById(R.id.floaty_bar_controls_view);
        this.I = viewGroup;
        viewGroup.setOnClickListener(new View.OnClickListener() { // from class: nvf
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                acti actiVar2 = acti.this;
                niy niyVar2 = niyVar;
                actiVar2.H(3, new acte(actj.MINI_PLAYER_EXPAND_BUTTON), null);
                niyVar2.q();
            }
        });
        viewGroup.findViewById(R.id.floaty_close_button).setOnClickListener(new View.OnClickListener() { // from class: nve
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                acti actiVar2 = acti.this;
                niw niwVar2 = niwVar;
                actiVar2.H(3, new acte(actj.MINI_PLAYER_DISMISSAL_BUTTON), null);
                niwVar2.f();
            }
        });
        Resources resources = context.getResources();
        this.f = resources.getDimensionPixelSize(R.dimen.floaty_bar_height);
        this.e = resources.getDimensionPixelSize(R.dimen.floaty_bar_height) + resources.getDimensionPixelOffset(R.dimen.floaty_bar_start_bottom_padding);
        this.g = (TextView) viewGroup.findViewById(R.id.floaty_title);
        this.h = new nvo((TextView) viewGroup.findViewById(R.id.floaty_subtitle));
        this.f236J = (ViewGroup) viewGroup.findViewById(R.id.controls_layout);
        this.K = viewGroup.findViewById(R.id.play_pause_layout);
        this.L = (ImageView) viewGroup.findViewById(R.id.floaty_close_button);
        viewGroup.setTag(viewGroup.getId(), new Object[]{nvrVar, nvsVar});
        nvsVar.b = this;
        xgaVar.c(nvrVar);
        ahixVar.a(nvsVar);
        nvsVar.a.add(ahigVar);
        nvw nvwVar2 = nvsVar.c;
        if (nvwVar2 != null) {
            nvwVar2.a(ahigVar);
        }
        nvrVar.b = true;
        nvrVar.a = new xih(actiVar, wzxVar);
        nvrVar.a.c(nvwVar.f);
        this.E = new yye((YouTubeTextView) viewGroup.findViewById(R.id.ad_badge));
        nvsVar.d = true;
        nvsVar.c = nvwVar;
        int i = 0;
        while (true) {
            afy afyVar = nvsVar.a;
            if (i < afyVar.b) {
                nvwVar.a((ahig) afyVar.b(i));
                i++;
            } else {
                nvzVar.d(this);
                this.t = azpa.as(false);
                this.u = azpd.ar();
                this.v = azpa.as(false);
                h(2, adwtVar.i);
                return;
            }
        }
    }

    public static boolean g(Context context) {
        return zew.v(context);
    }

    private final boolean i() {
        return this.O ? this.M.e : this.N;
    }

    @Override // defpackage.xgn
    public final /* synthetic */ void a(wxp wxpVar) {
    }

    @Override // defpackage.xgn
    public final void b(wxr wxrVar) {
        String string = this.d.getResources().getString(R.string.advertisement_assurance);
        if (!TextUtils.equals(this.B, string)) {
            this.B = string;
            if (this.b == 1) {
                f(string);
            }
        }
        if (TextUtils.equals(null, null) || this.b != 1) {
            return;
        }
        this.h.b(null);
    }

    public final int c(boolean z, boolean z2) {
        if (z) {
            return 1;
        }
        return !z2 ? 2 : 4;
    }

    public final void d() {
        if (this.b != 0) {
            return;
        }
        f(this.z);
        if (this.x.j != 2) {
            return;
        }
        this.h.b(this.A);
    }

    @Override // defpackage.oar
    public final void e(int i, int i2) {
    }

    public final void f(CharSequence charSequence) {
        this.g.setText(charSequence);
    }

    @Override // defpackage.adwm
    public final void h(int i, adwj adwjVar) {
        this.x = adwjVar;
        atcj atcjVar = this.D.b().n;
        if (atcjVar == null) {
            atcjVar = atcj.a;
        }
        boolean z = atcjVar.k;
        if (z) {
            if (adwjVar.a == 4) {
                this.i.c(true);
                PlayerResponseModel playerResponseModel = adwjVar.k.a;
                if (playerResponseModel != null) {
                    f(playerResponseModel.A());
                }
            } else {
                this.i.c(false);
                f(adwjVar.b);
                nvo nvoVar = this.h;
                adwj adwjVar2 = this.x;
                int i2 = adwjVar2.e;
                int i3 = adwjVar2.d;
                nvoVar.b((i2 >= i3 || i3 == 0) ? "" : this.F.getString(R.string.floaty_bar_queue_status, String.valueOf(i2 + 1), String.valueOf(this.x.d)));
            }
        }
        ezx g = this.m.g();
        int i4 = adwjVar.j;
        if (i4 != 0) {
            if (i4 != 1 || !z || g.f() || adwjVar.d <= 0) {
                return;
            }
            this.H.r(1, 1);
        } else if (!z || !g.j()) {
        } else {
            this.G.f();
        }
    }

    @Override // defpackage.ezg
    public final void pa(ezx ezxVar) {
        if (ezxVar == ezx.WATCH_WHILE_MINIMIZED) {
            this.I.sendAccessibilityEvent(8);
        }
    }

    @Override // defpackage.ezg
    public final /* synthetic */ void pb(ezx ezxVar, ezx ezxVar2) {
        hqb.m(this, ezxVar2);
    }

    @Override // defpackage.oak
    public final void pg(oan oanVar, oan oanVar2) {
    }

    @Override // defpackage.nxd
    public final void ph(nxe nxeVar) {
        float m = nxeVar.m();
        float n = nxeVar.n();
        this.I.setAlpha(m);
        this.f236J.setAlpha(n);
        this.j.a.setAlpha(n * m);
        if (this.f236J.getLayoutParams() instanceof ViewGroup.MarginLayoutParams) {
            if (i()) {
                Rect t = nxeVar.t();
                if (this.O) {
                    zgd.t(this.f236J, zgd.m(0, t.height(), 0, 0), ViewGroup.MarginLayoutParams.class);
                } else {
                    zgd.t(this.f236J, zgd.p(t.height()), ViewGroup.MarginLayoutParams.class);
                }
            } else {
                Rect t2 = nxeVar.t();
                if (this.O) {
                    zgd.t(this.f236J, zgd.m(t2.width(), 0, 0, 0), ViewGroup.MarginLayoutParams.class);
                } else {
                    zgd.t(this.f236J, zgd.l(t2.width()), ViewGroup.MarginLayoutParams.class);
                }
            }
            int dimensionPixelSize = this.F.getResources().getDimensionPixelSize(true != i() ? R.dimen.floaty_bar_button_top_margin : R.dimen.floaty_box_button_top_margin);
            if (this.P == dimensionPixelSize) {
                return;
            }
            this.P = dimensionPixelSize;
            zgd.t(this.K, zgd.p(dimensionPixelSize), ViewGroup.MarginLayoutParams.class);
            zgd.t(this.L, zgd.p(dimensionPixelSize), ViewGroup.MarginLayoutParams.class);
        }
    }
}
