package defpackage;

import android.content.Context;
import android.content.res.Configuration;
import android.net.Uri;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import com.google.android.libraries.youtube.innertube.model.media.VideoStreamingData;
import com.google.android.libraries.youtube.innertube.model.player.PlayerResponseModel;
import com.google.android.youtube.R;
import java.util.concurrent.TimeUnit;
/* compiled from: PG */
/* renamed from: khk  reason: default package */
/* loaded from: classes3.dex */
public final class khk extends ahyf implements fqb, ynl {
    private static final long q = TimeUnit.SECONDS.toMillis(4);
    public final khj a;
    public final khj b;
    public final khj c;
    public khj d;
    public final azqb e;
    public final Runnable f;
    public final azqb g;
    public final boolean h;
    public ffr i;
    public boolean j;
    public khj k;
    public boolean l;
    public String m;
    public String n;
    public FrameLayout o;
    public ahhw p;
    private final ajod r;
    private boolean s;
    private TextView t;
    private View u;
    private View v;
    private View w;
    private View x;
    private View y;

    public khk(Context context, azqb azqbVar, ajod ajodVar, fqd fqdVar, azqb azqbVar2, aacz aaczVar) {
        super(context);
        khj a = new khi().a();
        this.a = a;
        khi khiVar = new khi();
        khiVar.b = 0;
        this.b = khiVar.a();
        khi khiVar2 = new khi();
        khiVar2.c = 0;
        this.c = khiVar2.a();
        khi khiVar3 = new khi();
        khiVar3.b();
        this.d = khiVar3.a();
        this.f = new Runnable() { // from class: khg
            @Override // java.lang.Runnable
            public final void run() {
                khk.this.kT();
            }
        };
        this.s = false;
        this.j = false;
        this.k = a;
        this.l = false;
        this.m = "";
        this.n = "";
        azqbVar.getClass();
        this.e = azqbVar;
        ajodVar.getClass();
        this.r = ajodVar;
        this.g = azqbVar2;
        this.h = eog.bg(aaczVar);
        fqdVar.f(this);
    }

    private final void m() {
        View view = this.v;
        if (view == null || this.u == null || this.w == null) {
            return;
        }
        view.setVisibility(this.k.a);
        this.u.setVisibility(this.k.b);
        this.w.setVisibility(this.k.c);
        this.o.setBackgroundColor(this.k.d);
        this.o.setOnClickListener(this.k.e);
        this.o.setClickable(this.k.e != null);
    }

    @Override // defpackage.ahyl
    public final View a(Context context) {
        FrameLayout frameLayout = (FrameLayout) View.inflate(context, R.layout.watch_in_vr_overlay, null);
        this.o = frameLayout;
        this.u = frameLayout.findViewById(R.id.watch_in_vr_chip);
        this.v = this.o.findViewById(R.id.magic_window_edu);
        this.w = this.o.findViewById(R.id.magic_window_mid_ui_edu);
        this.t = (TextView) this.o.findViewById(R.id.message_view);
        this.x = this.o.findViewById(R.id.close_button);
        this.y = this.o.findViewById(R.id.cardboard_button);
        ImageView imageView = (ImageView) this.o.findViewById(R.id.magic_window_edu_image);
        imageView.setContentDescription(this.m);
        ((TextView) this.o.findViewById(R.id.magic_window_edu_text)).setText(this.m);
        ((TextView) this.o.findViewById(R.id.magic_window_mid_ui_edu_text)).setText(this.m);
        if (!this.n.isEmpty()) {
            this.r.g(imageView, Uri.parse(this.n));
        }
        khj khjVar = this.k;
        khj khjVar2 = this.d;
        if (khjVar == khjVar2 && khjVar2.e == null) {
            khi khiVar = new khi();
            khiVar.b();
            khiVar.d = zhn.d(this.o.getContext(), R.attr.yt10PercentLayer);
            khiVar.e = new khh(this, 1);
            khj a = khiVar.a();
            this.d = a;
            this.k = a;
        }
        khh khhVar = new khh(this);
        this.t.setOnClickListener(khhVar);
        this.y.setOnClickListener(khhVar);
        this.x.setOnClickListener(new khh(this, 2));
        m();
        return this.o;
    }

    @Override // defpackage.aizf
    public final ViewGroup.LayoutParams c() {
        return new aizh(-1, -1, false);
    }

    @Override // defpackage.ahyl
    public final void d(Context context, View view) {
        if (aa(1)) {
            zgd.t(this.u, zgd.e(context.getResources().getDimensionPixelOffset(R.dimen.watch_in_vr_overlay_margin_bottom)), ViewGroup.MarginLayoutParams.class);
        }
    }

    @Override // defpackage.fqb
    public final void g(Configuration configuration) {
        Y(1);
    }

    @Override // defpackage.ynl
    public final Class[] ky(Class cls, Object obj, int i) {
        String str;
        boolean z = false;
        if (i != -1) {
            if (i != 0) {
                if (i == 1) {
                    ahhx ahhxVar = (ahhx) obj;
                    boolean z2 = this.j;
                    if (ahhxVar != null && ahhxVar.g() <= 3000) {
                        z = true;
                    }
                    this.j = z;
                    if (z2 == z) {
                        return null;
                    }
                    X();
                    return null;
                }
                StringBuilder sb = new StringBuilder(32);
                sb.append("unsupported op code: ");
                sb.append(i);
                throw new IllegalStateException(sb.toString());
            }
            ahhw ahhwVar = (ahhw) obj;
            if (ahhwVar == null || ahhwVar.c() == null) {
                return null;
            }
            this.p = ahhwVar;
            if (this.h) {
                String T = (ahhwVar == null || ahhwVar.c().g() || this.p.c() == aika.ENDED || this.p.b() == null || !this.p.b().c().al() || (!this.p.b().c().aD() && (this.p.b().c == null || !this.p.b().c.H()))) ? null : this.p.b().c().T();
                ffr ffrVar = this.i;
                if (ffrVar != null && !TextUtils.equals(T, ffrVar.a)) {
                    ((ffs) this.g.get()).a(this.i);
                    this.i = null;
                }
                if (this.i == null && T != null) {
                    this.i = ffr.a(T);
                }
                if (this.i != null) {
                    ((ffs) this.g.get()).nB(this.i);
                }
            }
            if (ahhwVar.c() != aika.VIDEO_PLAYING || !this.j) {
                if (!ahhwVar.c().a(aika.VIDEO_REQUESTED, aika.ENDED, aika.INTERSTITIAL_REQUESTED)) {
                    return null;
                }
                l(this.a);
                kT();
                X();
                return null;
            }
            this.l = ((ahso) this.e.get()).j();
            PlayerResponseModel b = ahhwVar.b();
            khj khjVar = this.a;
            if (b != null) {
                if (b.c().al()) {
                    this.m = b.c().T();
                    atzv atzvVar = b.c().c;
                    if ((atzvVar.c & 1) != 0) {
                        awbw awbwVar = atzvVar.v;
                        if (awbwVar == null) {
                            awbwVar = awbw.a;
                        }
                        str = awbwVar.l;
                    } else {
                        str = "";
                    }
                    this.n = str;
                    khjVar = this.d;
                } else if (b.c().ak()) {
                    atzv atzvVar2 = b.c().c;
                    if ((atzvVar2.c & 1) != 0) {
                        awbw awbwVar2 = atzvVar2.v;
                        if (awbwVar2 == null) {
                            awbwVar2 = awbw.a;
                        }
                        if (awbwVar2.g) {
                            khjVar = this.b;
                        }
                    }
                }
            }
            l(khjVar);
            kU();
            X();
            return null;
        }
        return new Class[]{ahhw.class, ahhx.class};
    }

    public final void l(khj khjVar) {
        this.k = khjVar;
        m();
    }

    @Override // defpackage.ahyl
    public final boolean mZ() {
        VideoStreamingData videoStreamingData;
        ahhw ahhwVar = this.p;
        if ((ahhwVar != null && this.j) || this.s) {
            PlayerResponseModel b = ahhwVar.b();
            boolean g = this.p.c().g();
            if (this.k != this.a && this.l && !g) {
                VideoStreamingData videoStreamingData2 = null;
                if (b != null && (videoStreamingData = b.c) != null) {
                    videoStreamingData2 = videoStreamingData;
                }
                boolean z = videoStreamingData2 != null && videoStreamingData2.H();
                return this.k == this.b ? z || (videoStreamingData2 != null && videoStreamingData2.w()) : z;
            }
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.ahyf
    public final void na(int i) {
        if (i == 2) {
            this.s = true;
            if (this.k == this.c) {
                return;
            }
            this.o.postOnAnimationDelayed(this.f, q);
        }
    }
}
