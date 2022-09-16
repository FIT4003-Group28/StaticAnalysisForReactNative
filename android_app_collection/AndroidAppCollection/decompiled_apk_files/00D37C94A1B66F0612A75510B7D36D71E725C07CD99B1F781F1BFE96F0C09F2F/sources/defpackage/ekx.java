package defpackage;

import android.app.Activity;
import android.content.res.Resources;
import android.support.constraint.ConstraintLayout;
import android.util.DisplayMetrics;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.google.android.youtube.R;
import com.google.protos.youtube.api.innertube.ChannelReelAvatarRendererOuterClass$ChannelReelAvatarRenderer;
import com.google.protos.youtube.api.innertube.HintRendererOuterClass;
import com.google.protos.youtube.api.innertube.ShowPendingReelUploadsCommandOuterClass$ShowPendingReelUploadsCommand;
/* compiled from: PG */
/* renamed from: ekx  reason: default package */
/* loaded from: classes3.dex */
public final class ekx extends ajsl {
    private final ajmu A;
    private final LinearLayout B;
    private final gts C;
    private final gte D;
    private final ekw E;
    private eku F;
    private eku G;
    private eku H;
    private eku I;

    /* renamed from: J  reason: collision with root package name */
    private eku f203J;
    private final TextView K;
    private akbm L;
    private zdd M;
    private final TextView N;
    private akbm O;
    private zdd P;
    private View Q;
    public final Activity a;
    public final aafo b;
    public final Resources c;
    public final View d;
    public final TextView e;
    public final ImageView f;
    public final View g;
    public final fpa h;
    public final akfb i;
    public final fmh j;
    public final fnz k;
    public final ejk l;
    public final View m;
    public eir n;
    public boolean o = false;
    public final akbn p;
    public View q;
    public final sqn r;
    private final ajmy s;
    private final View t;
    private final View u;
    private final ImageView v;
    private final View x;
    private final xff y;
    private final ajmu z;

    public ekx(Activity activity, ajmy ajmyVar, aafo aafoVar, xff xffVar, fpa fpaVar, fmh fmhVar, ejk ejkVar, fnz fnzVar, sqn sqnVar, ekw ekwVar, gts gtsVar, gte gteVar, akfb akfbVar, akbn akbnVar, byte[] bArr) {
        this.a = activity;
        this.c = activity.getResources();
        ajmyVar.getClass();
        this.s = ajmyVar;
        this.b = aafoVar;
        xffVar.getClass();
        this.y = xffVar;
        fpaVar.getClass();
        this.h = fpaVar;
        this.C = gtsVar;
        this.D = gteVar;
        this.i = akfbVar;
        this.r = sqnVar;
        this.j = fmhVar;
        this.k = fnzVar;
        this.l = ejkVar;
        this.E = ekwVar;
        this.p = akbnVar;
        View inflate = LayoutInflater.from(activity).inflate(R.layout.channel_header, (ViewGroup) null);
        this.d = inflate;
        this.m = inflate.findViewById(R.id.channel_header_extra_info_layout);
        this.x = inflate.findViewById(R.id.channel_avatar_layout);
        this.v = (ImageView) inflate.findViewById(R.id.channel_avatar);
        this.u = inflate.findViewById(R.id.channel_banner_container);
        this.f = (ImageView) inflate.findViewById(R.id.channel_banner);
        TextView textView = (TextView) inflate.findViewById(R.id.channel_description);
        this.e = textView;
        textView.setOnClickListener(new ekr(this));
        this.t = inflate.findViewById(R.id.description_separator);
        this.g = inflate.findViewById(R.id.separator);
        ajmt b = ajmyVar.c().b();
        b.c = new ekv(this);
        this.z = b.a();
        ajmt b2 = ajmyVar.c().b();
        b2.b(2131232143);
        this.A = b2.a();
        this.B = (LinearLayout) inflate.findViewById(R.id.links);
        ConstraintLayout constraintLayout = (ConstraintLayout) inflate.findViewById(R.id.channel_page_navigation_view);
        this.K = (TextView) constraintLayout.findViewById(R.id.edit_channel_button);
        this.N = (TextView) constraintLayout.findViewById(R.id.manage_videos_button);
    }

    private final int j(TextView textView) {
        DisplayMetrics displayMetrics = this.c.getDisplayMetrics();
        int minHeight = textView.getMinHeight();
        int i = zew.i(displayMetrics, 48);
        if (minHeight < i) {
            double d = i - minHeight;
            Double.isNaN(d);
            return (int) Math.ceil(d * 0.5d);
        }
        return 0;
    }

    private final eku k() {
        if (this.F == null) {
            ViewStub viewStub = (ViewStub) this.d.findViewById(R.id.channel_info_stub);
            if (viewStub == null) {
                eku ekuVar = new eku(this, this.d);
                this.F = ekuVar;
                this.H = ekuVar;
            } else {
                viewStub.setLayoutResource(R.layout.channel_header_info);
                this.F = new eku(this, viewStub.inflate());
            }
        }
        return this.F;
    }

    private final eku m() {
        if (this.H == null) {
            ViewStub viewStub = (ViewStub) this.d.findViewById(R.id.channel_info_stub_with_sponsorship);
            if (viewStub == null) {
                eku ekuVar = new eku(this, this.d);
                this.H = ekuVar;
                this.F = ekuVar;
            } else {
                viewStub.setLayoutResource(R.layout.channel_header_info_with_sponsorship);
                this.H = new eku(this, viewStub.inflate());
            }
        }
        return this.H;
    }

    @Override // defpackage.ajru
    public final View a() {
        return this.d;
    }

    /* JADX WARN: Code restructure failed: missing block: B:80:0x01a8, code lost:
        if (r6 != false) goto L229;
     */
    /* JADX WARN: Removed duplicated region for block: B:104:0x01ff  */
    /* JADX WARN: Removed duplicated region for block: B:112:0x0213  */
    /* JADX WARN: Removed duplicated region for block: B:120:0x023f  */
    /* JADX WARN: Removed duplicated region for block: B:123:0x024a  */
    /* JADX WARN: Removed duplicated region for block: B:131:0x0276  */
    /* JADX WARN: Removed duplicated region for block: B:135:0x028a  */
    /* JADX WARN: Removed duplicated region for block: B:142:0x02a1  */
    /* JADX WARN: Removed duplicated region for block: B:143:0x02d0  */
    /* JADX WARN: Removed duplicated region for block: B:146:0x02f4  */
    /* JADX WARN: Removed duplicated region for block: B:147:0x02fa  */
    /* JADX WARN: Removed duplicated region for block: B:153:0x0318  */
    /* JADX WARN: Removed duplicated region for block: B:156:0x031f  */
    /* JADX WARN: Removed duplicated region for block: B:162:0x032c  */
    /* JADX WARN: Removed duplicated region for block: B:165:0x0331  */
    /* JADX WARN: Removed duplicated region for block: B:168:0x0338  */
    /* JADX WARN: Removed duplicated region for block: B:174:0x0345  */
    /* JADX WARN: Removed duplicated region for block: B:176:0x0348  */
    /* JADX WARN: Removed duplicated region for block: B:194:0x03c0  */
    /* JADX WARN: Removed duplicated region for block: B:204:0x03e3  */
    /* JADX WARN: Removed duplicated region for block: B:205:0x03f6  */
    /* JADX WARN: Removed duplicated region for block: B:209:0x040c  */
    /* JADX WARN: Removed duplicated region for block: B:220:0x042e  */
    /* JADX WARN: Removed duplicated region for block: B:230:0x0456  */
    /* JADX WARN: Removed duplicated region for block: B:233:0x045d  */
    /* JADX WARN: Removed duplicated region for block: B:254:0x04d2  */
    /* JADX WARN: Removed duplicated region for block: B:268:0x052c  */
    /* JADX WARN: Removed duplicated region for block: B:271:0x0539  */
    /* JADX WARN: Removed duplicated region for block: B:286:0x0593  */
    /* JADX WARN: Removed duplicated region for block: B:289:0x029e A[SYNTHETIC] */
    @Override // defpackage.ajsl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    protected final /* bridge */ /* synthetic */ void d(defpackage.ajrs r17, java.lang.Object r18) {
        /*
            Method dump skipped, instructions count: 1433
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ekx.d(ajrs, java.lang.Object):void");
    }

    @Override // defpackage.ajsl
    protected final /* bridge */ /* synthetic */ byte[] e(Object obj) {
        return ((appd) obj).r.I();
    }

    public final fny f() {
        eku ekuVar = this.f203J;
        if (ekuVar != null) {
            return ekuVar.f;
        }
        return null;
    }

    public final void g() {
        this.f.setBackgroundResource(R.drawable.ic_default_channel_placeholder);
        this.f.setImageDrawable(null);
    }

    public final void h(final ChannelReelAvatarRendererOuterClass$ChannelReelAvatarRenderer channelReelAvatarRendererOuterClass$ChannelReelAvatarRenderer, final acti actiVar) {
        final View findViewById = this.d.findViewById(R.id.channel_avatar_ring);
        if (findViewById == null) {
            return;
        }
        int bP = awwc.bP(channelReelAvatarRendererOuterClass$ChannelReelAvatarRenderer.e);
        if (bP == 0) {
            bP = 1;
        }
        if (bP == 3 || (channelReelAvatarRendererOuterClass$ChannelReelAvatarRenderer.b & 2) == 0) {
            zag.o(findViewById, false);
        } else {
            if (bP != 2) {
                gts gtsVar = this.C;
                apzg apzgVar = channelReelAvatarRendererOuterClass$ChannelReelAvatarRenderer.d;
                if (apzgVar == null) {
                    apzgVar = apzg.a;
                }
                if (!gtsVar.f(apzgVar)) {
                    zag.o(findViewById, true);
                    findViewById.setEnabled(true);
                }
            }
            zag.o(findViewById, true);
            findViewById.setEnabled(false);
        }
        apzg apzgVar2 = channelReelAvatarRendererOuterClass$ChannelReelAvatarRenderer.d;
        if (apzgVar2 == null) {
            apzgVar2 = apzg.a;
        }
        if (!apzgVar2.qn(ShowPendingReelUploadsCommandOuterClass$ShowPendingReelUploadsCommand.showPendingReelUploadsCommand)) {
            return;
        }
        ylx.i(this.D.a(), new ylw() { // from class: ekp
            @Override // defpackage.ylw, defpackage.zdt
            public final void a(Object obj) {
                ekx ekxVar = ekx.this;
                View view = findViewById;
                ChannelReelAvatarRendererOuterClass$ChannelReelAvatarRenderer channelReelAvatarRendererOuterClass$ChannelReelAvatarRenderer2 = channelReelAvatarRendererOuterClass$ChannelReelAvatarRenderer;
                acti actiVar2 = actiVar;
                boolean z = !((amuk) obj).isEmpty();
                if (z) {
                    zag.o(view, true);
                    view.setEnabled(true);
                }
                if ((channelReelAvatarRendererOuterClass$ChannelReelAvatarRenderer2.b & 32) != 0) {
                    aunb aunbVar = channelReelAvatarRendererOuterClass$ChannelReelAvatarRenderer2.g;
                    if (aunbVar == null) {
                        aunbVar = aunb.a;
                    }
                    argj argjVar = (argj) ajjh.l(aunbVar, HintRendererOuterClass.hintRenderer);
                    if (argjVar == null) {
                        return;
                    }
                    int bP2 = awwc.bP(channelReelAvatarRendererOuterClass$ChannelReelAvatarRenderer2.e);
                    if (bP2 != 0 && bP2 == 3 && !z) {
                        return;
                    }
                    ekxVar.i.b(argjVar, ekxVar.q, channelReelAvatarRendererOuterClass$ChannelReelAvatarRenderer2, actiVar2);
                }
            }
        });
    }

    @Override // defpackage.ajru
    public final void qZ(ajsa ajsaVar) {
        eku ekuVar = this.f203J;
        if (ekuVar != null) {
            ekuVar.e.d();
        }
        View view = this.q;
        if (view != null) {
            view.setOnClickListener(null);
            this.q.setClickable(false);
            this.q.setContentDescription(null);
        }
        this.C.d(this.d);
    }
}
