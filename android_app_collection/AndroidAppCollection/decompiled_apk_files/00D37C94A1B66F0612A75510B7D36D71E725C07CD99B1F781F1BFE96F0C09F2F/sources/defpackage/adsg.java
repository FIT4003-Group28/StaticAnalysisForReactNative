package defpackage;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Build;
import android.os.Handler;
import android.text.Html;
import android.view.View;
import android.widget.ProgressBar;
import android.widget.TextView;
import android.widget.Toast;
import androidx.mediarouter.app.MediaRouteButton;
import com.google.android.libraries.youtube.mdx.smartremote.DpadView;
import com.google.android.libraries.youtube.mdx.smartremote.MdxSmartRemoteActivity;
import com.google.android.libraries.youtube.mdx.smartremote.MicrophoneView;
import com.google.android.youtube.R;
import java.util.Locale;
import java.util.Random;
/* compiled from: PG */
/* renamed from: adsg  reason: default package */
/* loaded from: classes.dex */
public final class adsg implements adny, adsn {
    public static final /* synthetic */ int E = 0;
    public int A;
    public boolean B;
    public boolean C;
    public int D;
    private final aacz F;
    public final dp a;
    public final adoa b;
    public adnt c;
    public final Handler d;
    public final adhf e;
    public final bgo f;
    public final SharedPreferences g;
    public final acti h;
    public final azqb i;
    public adso j;
    public boolean k;
    public Context l;
    public View m;
    public View n;
    public ProgressBar o;
    public TextView p;
    public TextView q;
    public MediaRouteButton r;
    public DpadView s;
    public TextView t;
    public TextView u;
    public MicrophoneView v;
    public View w;
    public View x;
    public final boolean y;
    public String[] z;

    static {
        zep.a("MDX.SmartRemoteController");
    }

    public adsg(dp dpVar, adoa adoaVar, Handler handler, adhf adhfVar, bgo bgoVar, acti actiVar, SharedPreferences sharedPreferences, acwu acwuVar, aacz aaczVar, azqb azqbVar) {
        this.a = dpVar;
        this.b = adoaVar;
        this.c = adoaVar.e();
        this.d = handler;
        this.e = adhfVar;
        this.f = bgoVar;
        this.g = sharedPreferences;
        this.h = actiVar;
        this.y = acwuVar.p;
        this.F = aaczVar;
        this.i = azqbVar;
    }

    public final int a() {
        return this.y ? 8 : 0;
    }

    public final void b(acup... acupVarArr) {
        for (acup acupVar : acupVarArr) {
            this.h.u(new acte(acupVar), null);
        }
    }

    @Override // defpackage.adsn
    public final void c(String str) {
        adnt adntVar = this.c;
        if (adntVar != null) {
            adntVar.Q(2, str, null);
        }
        this.B = true;
        this.t.setText(str);
        this.k = false;
        if (str.isEmpty()) {
            g();
            this.d.postDelayed(new adsb(this), 3500L);
            this.C = true;
        }
        n(5, true, str.isEmpty());
    }

    @Override // defpackage.adsn
    public final void d() {
        Toast.makeText(this.l, (int) R.string.mdx_smart_remote_speech_recognition_not_available, 0).show();
    }

    public final void e(int i, String str) {
        ankt b;
        if (i == 0) {
            n(2, false, false);
            this.p.setText(this.l.getString(R.string.mdx_connecting_to_screen, str));
        } else if (i != 1) {
        } else {
            n(this.D, false, false);
            dp dpVar = this.a;
            if (m()) {
                b = ylx.b(this.a, ((vne) this.i.get()).a(), adch.r);
            } else {
                b = ylx.b(this.a, anlz.q(Boolean.valueOf(this.g.getBoolean("MDx.SmartRemote.isPrivacyDialogShown", false))), adrz.b);
            }
            ylx.n(dpVar, b, aclb.e, new adse(this));
            this.q.setText(Html.fromHtml(this.l.getString(R.string.mdx_connected_to_screen, str)));
        }
    }

    public final void f() {
        nw nwVar = new nw(this.l, this.A);
        nwVar.n(R.string.mdx_smart_remote_privacy_dialog_title);
        nwVar.f(R.string.mdx_smart_remote_privacy_dialog_message);
        nwVar.h(R.string.mdx_smart_remote_privacy_dialog_close_button, null);
        nwVar.c(true);
        nwVar.q();
    }

    public final void g() {
        View view = this.m;
        if (view == null) {
            return;
        }
        aloh.n(view, R.string.mdx_smart_remote_voice_input_error_message).g();
        this.h.n(new acte(acuo.b(63270)));
    }

    public final void h() {
        if (!this.k) {
            if (ake.c(this.l, "android.permission.RECORD_AUDIO") != 0) {
                ake.i((MdxSmartRemoteActivity) this.a.mJ(), new String[]{"android.permission.RECORD_AUDIO"}, 1234);
                return;
            }
            adso adsoVar = this.j;
            if (adsoVar.c == null) {
                adsoVar.b.d();
            } else {
                Intent intent = new Intent("android.speech.action.RECOGNIZE_SPEECH");
                intent.putExtra("android.speech.extra.LANGUAGE_MODEL", "free_form");
                intent.putExtra("android.speech.extra.PARTIAL_RESULTS", true);
                adsoVar.c.startListening(intent);
            }
            n(3, false, false);
            adnt adntVar = this.c;
            if (adntVar != null) {
                adntVar.Q(0, null, null);
            }
            this.k = true;
            return;
        }
        this.j.g();
        n(5, false, false);
        adnt adntVar2 = this.c;
        if (adntVar2 != null) {
            adntVar2.Q(3, null, null);
        }
        this.k = false;
    }

    public final boolean i() {
        if (Build.VERSION.SDK_INT >= 24) {
            return this.l.getResources().getConfiguration().getLocales().get(0).getLanguage().equals(Locale.ENGLISH.getLanguage());
        }
        return this.l.getResources().getConfiguration().locale.getLanguage().equals(Locale.ENGLISH.getLanguage());
    }

    @Override // defpackage.adny
    public final void j(adnt adntVar) {
        this.c = adntVar;
        e(1, adntVar.k().b());
    }

    @Override // defpackage.adny
    public final void k(adnt adntVar) {
        this.c = null;
        this.a.mJ().finish();
    }

    @Override // defpackage.adny
    public final void l(adnt adntVar) {
        this.c = adntVar;
        e(0, adntVar.k().b());
    }

    public final boolean m() {
        athd athdVar = this.F.b().o;
        if (athdVar == null) {
            athdVar = athd.a;
        }
        aujq aujqVar = athdVar.g;
        if (aujqVar == null) {
            aujqVar = aujq.a;
        }
        return aujqVar.b;
    }

    public final void n(final int i, boolean z, final boolean z2) {
        this.d.postDelayed(new Runnable() { // from class: adsc
            @Override // java.lang.Runnable
            public final void run() {
                adsg adsgVar = adsg.this;
                int i2 = i;
                boolean z3 = z2;
                int i3 = i2 - 1;
                adrt adrtVar = adrt.UP;
                if (i2 != 0) {
                    int i4 = 8;
                    if (i3 == 0) {
                        adsgVar.o.setVisibility(8);
                        adsgVar.p.setVisibility(8);
                        adsgVar.q.setVisibility(adsgVar.a());
                        adsgVar.r.setVisibility(adsgVar.a());
                        adsgVar.s.setVisibility(8);
                        adsgVar.t.setVisibility(8);
                        adsgVar.u.setVisibility(8);
                        adsgVar.v.setVisibility(8);
                        adsgVar.w.setVisibility(8);
                        adsgVar.x.setVisibility(8);
                        return;
                    } else if (i3 == 1) {
                        adsgVar.o.setVisibility(0);
                        adsgVar.p.setVisibility(0);
                        adsgVar.q.setVisibility(8);
                        adsgVar.r.setVisibility(8);
                        adsgVar.s.setVisibility(8);
                        adsgVar.t.setVisibility(8);
                        adsgVar.u.setVisibility(8);
                        adsgVar.v.setVisibility(8);
                        adsgVar.w.setVisibility(8);
                        adsgVar.x.setVisibility(8);
                        return;
                    } else if (i3 == 2) {
                        adsgVar.o.setVisibility(8);
                        adsgVar.p.setVisibility(8);
                        adsgVar.q.setVisibility(adsgVar.a());
                        adsgVar.r.setVisibility(adsgVar.a());
                        adsgVar.s.setVisibility(8);
                        adsgVar.t.setVisibility(8);
                        adsgVar.u.setVisibility(true != adsgVar.i() ? 8 : 0);
                        TextView textView = adsgVar.u;
                        String[] strArr = adsgVar.z;
                        Random random = new Random();
                        int length = adsgVar.z.length;
                        textView.setText(Html.fromHtml(strArr[random.nextInt(14)]));
                        adsgVar.v.setVisibility(0);
                        MicrophoneView microphoneView = adsgVar.v;
                        microphoneView.c = 2;
                        microphoneView.a();
                        adsgVar.w.setVisibility(8);
                        adsgVar.x.setVisibility(8);
                        adsgVar.b(acuo.b(61407));
                        return;
                    } else if (i3 != 3) {
                        if (i3 != 4) {
                            return;
                        }
                        adsgVar.o.setVisibility(8);
                        adsgVar.p.setVisibility(8);
                        adsgVar.q.setVisibility(adsgVar.a());
                        adsgVar.r.setVisibility(adsgVar.a());
                        adsgVar.s.setVisibility(0);
                        adsgVar.t.setVisibility(8);
                        adsgVar.u.setVisibility(8);
                        adsgVar.v.setVisibility(0);
                        adsgVar.v.b();
                        adsgVar.w.setVisibility(0);
                        View view = adsgVar.x;
                        if (true != z3) {
                            i4 = 0;
                        }
                        view.setVisibility(i4);
                        adsgVar.b(acuo.b(61406), acuo.b(61409), acuo.b(61410), acuo.b(61404), acuo.b(61405), acuo.b(61401), acuo.b(61407));
                        return;
                    } else {
                        adsgVar.o.setVisibility(8);
                        adsgVar.p.setVisibility(8);
                        adsgVar.q.setVisibility(adsgVar.a());
                        adsgVar.r.setVisibility(adsgVar.a());
                        adsgVar.s.setVisibility(8);
                        adsgVar.t.setVisibility(8);
                        adsgVar.u.setVisibility(true != adsgVar.i() ? 8 : 0);
                        TextView textView2 = adsgVar.u;
                        String[] strArr2 = adsgVar.z;
                        Random random2 = new Random();
                        int length2 = adsgVar.z.length;
                        textView2.setText(Html.fromHtml(strArr2[random2.nextInt(14)]));
                        adsgVar.v.setVisibility(0);
                        adsgVar.v.b();
                        adsgVar.w.setVisibility(8);
                        View view2 = adsgVar.x;
                        if (true != z3) {
                            i4 = 0;
                        }
                        view2.setVisibility(i4);
                        adsgVar.b(acuo.b(61407));
                        return;
                    }
                }
                throw null;
            }
        }, true != z ? 0L : 1000L);
    }
}
