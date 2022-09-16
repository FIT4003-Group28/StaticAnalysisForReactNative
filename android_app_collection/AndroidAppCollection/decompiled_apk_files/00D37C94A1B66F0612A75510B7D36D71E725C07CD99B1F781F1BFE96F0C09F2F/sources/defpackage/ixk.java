package defpackage;

import android.content.Context;
import android.content.Intent;
import android.os.Handler;
import android.os.Looper;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.SeekBar;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.google.android.libraries.youtube.common.ui.YouTubeTextView;
import com.google.android.youtube.R;
/* compiled from: PG */
/* renamed from: ixk  reason: default package */
/* loaded from: classes3.dex */
public final class ixk extends bfl implements SeekBar.OnSeekBarChangeListener, adny, ynl {
    public final bhc Y;
    public final adgc Z;
    public final acti aa;
    public final advc ab;
    public final Handler ac;
    public ConstraintLayout ad;
    public SeekBar ae;
    public ProgressBar af;
    public Runnable ag;
    public int ah;
    public final advo ai;
    private final acwu aj;
    private final yni ak;
    private final adoa al;
    private final adof am;
    private ImageView an;
    private ImageButton ao;
    private TextView ap;
    private ImageButton aq;
    private TextView ar;
    private View as;
    private TextView at;
    private TextView au;
    private final acum av;
    private boolean aw;

    public ixk(Context context, int i, azqb azqbVar, azqb azqbVar2, azqb azqbVar3, azqb azqbVar4, acti actiVar, yni yniVar, azqb azqbVar5, azqb azqbVar6) {
        super(context, i);
        this.av = new acte(actj.CAST_DIALOG);
        this.ah = 2131232609;
        bhd.b(getContext());
        this.Y = bhd.j();
        azqbVar.getClass();
        this.aj = (acwu) azqbVar.get();
        azqbVar2.getClass();
        adgc adgcVar = (adgc) azqbVar2.get();
        adgcVar.getClass();
        this.Z = adgcVar;
        azqbVar3.getClass();
        adoa adoaVar = (adoa) azqbVar3.get();
        adoaVar.getClass();
        this.al = adoaVar;
        azqbVar4.getClass();
        adof adofVar = (adof) azqbVar4.get();
        adofVar.getClass();
        this.am = adofVar;
        actiVar.getClass();
        this.aa = actiVar;
        yniVar.getClass();
        this.ak = yniVar;
        this.ab = (advc) azqbVar5.get();
        this.ai = (advo) azqbVar6.get();
        this.ac = new Handler(Looper.getMainLooper());
    }

    private final void D(String str) {
        new Handler(Looper.getMainLooper()).post(new Runnable() { // from class: ixg
            @Override // java.lang.Runnable
            public final void run() {
                ixk.this.dismiss();
            }
        });
        boolean m = this.al.m();
        int i = this.al.f().a;
        String str2 = i != 0 ? i != 1 ? i != 2 ? i != 3 ? i != 4 ? "state not recognized" : "RECOVERY_COMPLETED" : "RECOVERY_ABORTED" : "RECOVERY_CANCELLED_BY_USER" : "RECOVERY_STARTED" : "IDLE";
        int d = this.al.d();
        int i2 = this.Y.h;
        StringBuilder sb = new StringBuilder(str.length() + 153 + str2.length());
        sb.append(str);
        sb.append("mdxSession isRecoveryInProgress: ");
        sb.append(m);
        sb.append(" | mdxSession recoveryState: ");
        sb.append(str2);
        sb.append(" | mdxSession connectionState: ");
        sb.append(d);
        sb.append(" | mdxRouteInfo connectionState: ");
        sb.append(i2);
        afus.b(1, 21, sb.toString());
    }

    private final void E() {
        adnt e = this.al.e();
        if (!this.aj.K || e == null || !e.af("cds") || !"DOES_NOT_MATCH_RECEIVER".equals(e.u()) || getContext().getResources().getConfiguration().orientation != 1) {
            this.aa.q(new acte(acuo.b(132424)), null);
            this.as.setVisibility(8);
            this.at.setVisibility(8);
            this.au.setVisibility(8);
            return;
        }
        this.as.setVisibility(0);
        this.at.setVisibility(0);
        this.au.setVisibility(0);
        this.aa.n(new acte(acuo.b(132424)));
        this.au.setOnClickListener(new ixf(this, 2));
    }

    private final void F() {
        adnt e = this.al.e();
        if (e == null) {
            D("The MDx session is null when trying to update smart remote visibility in the remote controller dialog. ");
            return;
        }
        int d = e.k().d();
        if (d != 2 || e.a() != 0) {
            if (d != 3 && d != 4 && (!e.af("dpa") || !e.af("mic"))) {
                return;
            }
            this.ao.setVisibility(0);
            this.ap.setVisibility(0);
            this.aq.setVisibility(0);
            this.ar.setVisibility(0);
            this.aa.o(new acte(actj.VOICE_SEARCH_IN_CAST_DIALOG), this.av);
            this.ao.setOnClickListener(new ixf(this, 3));
            this.aa.o(new acte(actj.SMART_REMOTE_DPAD_IN_CAST_DIALOG), this.av);
            this.aq.setOnClickListener(new ixf(this, 4));
            return;
        }
        this.al.g(this);
    }

    public final void A(int i) {
        Context context = getContext();
        Intent c = aefn.c(context);
        c.setFlags(268435456);
        c.putExtra("com.google.android.libraries.youtube.mdx.smartremote.startingUiMode", i);
        c.putExtra("com.google.android.libraries.youtube.mdx.smartremote.dialogStyle", ixl.aH(context));
        dismiss();
        context.startActivity(c);
    }

    public final void B(int i) {
        int i2 = i == 0 ? 2131232611 : 2131232609;
        if (this.ah == i2) {
            return;
        }
        this.an.setImageResource(i2);
        this.ah = i2;
    }

    @Override // defpackage.ov, android.app.Dialog, android.content.DialogInterface
    public final void dismiss() {
        super.dismiss();
        Runnable runnable = this.ag;
        if (runnable != null) {
            runnable.run();
            this.ag = null;
        }
    }

    @Override // defpackage.adny
    public final void j(adnt adntVar) {
        F();
        E();
        this.al.i(this);
    }

    @Override // defpackage.adny
    public final void k(adnt adntVar) {
    }

    @Override // defpackage.ynl
    public final Class[] ky(Class cls, Object obj, int i) {
        if (i != -1) {
            if (i == 0) {
                int a = ((adoo) obj).a();
                B(a);
                SeekBar seekBar = this.ae;
                if (seekBar == null) {
                    return null;
                }
                seekBar.setProgress(a);
                return null;
            }
            StringBuilder sb = new StringBuilder(32);
            sb.append("unsupported op code: ");
            sb.append(i);
            throw new IllegalStateException(sb.toString());
        }
        return new Class[]{adoo.class};
    }

    @Override // defpackage.adny
    public final void l(adnt adntVar) {
    }

    @Override // android.widget.SeekBar.OnSeekBarChangeListener
    public final void onProgressChanged(SeekBar seekBar, int i, boolean z) {
        if (!z || seekBar != this.ae) {
            return;
        }
        B(i);
        this.am.b(i);
    }

    @Override // android.widget.SeekBar.OnSeekBarChangeListener
    public final void onStartTrackingTouch(SeekBar seekBar) {
    }

    @Override // android.widget.SeekBar.OnSeekBarChangeListener
    public final void onStopTrackingTouch(SeekBar seekBar) {
        if (seekBar == this.ae) {
            this.aa.H(2049, new acte(actj.CAST_DIALOG_VOLUME_BAR), null);
        }
    }

    @Override // android.app.Dialog, android.view.Window.Callback
    public final void onWindowAttributesChanged(WindowManager.LayoutParams layoutParams) {
        super.onWindowAttributesChanged(layoutParams);
        if (this.aw) {
            E();
        }
    }

    @Override // defpackage.bfl
    public final View z() {
        adnt e = this.al.e();
        if (e == null) {
            D("The MDx session is null when trying to open the remote controller dialog.");
            return null;
        }
        View inflate = getLayoutInflater().inflate(R.layout.next_gen_fiji_mdx_media_route_controller_dialog_fragment, (ViewGroup) null);
        this.ak.g(this);
        findViewById(R.id.buttonPanel).setVisibility(8);
        findViewById(R.id.mr_title_bar).setVisibility(8);
        findViewById(R.id.mr_default_control).setVisibility(8);
        this.aa.n(this.av);
        YouTubeTextView youTubeTextView = (YouTubeTextView) inflate.findViewById(R.id.connected_device_name);
        if (e.k() != null && !e.k().b().isEmpty() && youTubeTextView != null) {
            youTubeTextView.setText(e.k().b());
        }
        this.ad = (ConstraintLayout) inflate.findViewById(R.id.mdx_controller_buttons_layout);
        this.ae = (SeekBar) inflate.findViewById(R.id.volume_bar);
        this.aa.o(new acte(actj.CAST_DIALOG_VOLUME_BAR), this.av);
        this.ae.setOnSeekBarChangeListener(this);
        this.an = (ImageView) inflate.findViewById(R.id.volume_icon);
        int b = e.b();
        B(b);
        this.ae.setProgress(b);
        this.ao = (ImageButton) inflate.findViewById(R.id.voice_search_button);
        this.ap = (TextView) inflate.findViewById(R.id.voice_search_text);
        this.aq = (ImageButton) inflate.findViewById(R.id.tv_remote_button);
        this.ar = (TextView) inflate.findViewById(R.id.tv_remote_text);
        this.as = inflate.findViewById(R.id.sign_in_divider);
        this.at = (TextView) inflate.findViewById(R.id.sign_in_desc);
        this.au = (TextView) inflate.findViewById(R.id.sign_in_button);
        this.af = (ProgressBar) inflate.findViewById(R.id.sign_in_loading_spinner);
        F();
        E();
        this.aa.o(new acte(actj.CAST_DIALOG_CLOSE_BUTTON), this.av);
        ((YouTubeTextView) inflate.findViewById(R.id.close_button)).setOnClickListener(new ixf(this, 1));
        this.aa.o(new acte(actj.MEDIA_ROUTE_DISCONNECT_BUTTON), this.av);
        ((YouTubeTextView) inflate.findViewById(R.id.stop_casting_button)).setOnClickListener(new ixf(this));
        inflate.setBackgroundColor(zhn.d(getContext(), R.attr.ytBrandBackgroundSolid));
        this.aw = true;
        return inflate;
    }
}
