package defpackage;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.google.android.apps.youtube.app.offline.ui.OfflineArrowView;
import com.google.android.youtube.R;
import java.util.Set;
/* compiled from: PG */
/* renamed from: jlg  reason: default package */
/* loaded from: classes3.dex */
public final class jlg implements View.OnClickListener, ajru, ynl {
    private final TextView A;
    private final TextView B;
    private final View C;
    private final View D;
    private final OfflineArrowView E;
    private String F;
    private int G;
    private acti H;
    public final Context a;
    public final azqb b;
    public final ajmy c;
    public final TextView d;
    public final View e;
    public final View f;
    public final ImageView g;
    public agqo h;
    public final jku i;
    public ggm j;
    public View k;
    public final fbj l;
    private final ajrx m;
    private final yni n;
    private final azqb o;
    private final jkv p;
    private final jkz q;
    private final aafo r;
    private final fcd s;
    private final ajyc t;
    private final jml u;
    private final snc v;
    private final fbx w;
    private final fbw x;
    private final fcc y;
    private final TextView z;

    public jlg(Context context, gem gemVar, yni yniVar, azqb azqbVar, azqb azqbVar2, ajmy ajmyVar, jkv jkvVar, jkz jkzVar, aafo aafoVar, fcd fcdVar, ajyc ajycVar, jml jmlVar, snc sncVar, fbx fbxVar, fbw fbwVar, fbj fbjVar, ViewGroup viewGroup) {
        this.a = context;
        this.m = gemVar;
        this.n = yniVar;
        this.b = azqbVar;
        this.o = azqbVar2;
        this.c = ajmyVar;
        this.p = jkvVar;
        this.q = jkzVar;
        this.r = aafoVar;
        this.s = fcdVar;
        this.t = ajycVar;
        this.u = jmlVar;
        this.v = sncVar;
        this.w = fbxVar;
        this.x = fbwVar;
        this.l = fbjVar;
        View inflate = LayoutInflater.from(context).inflate(R.layout.offline_video_item, viewGroup, false);
        this.C = inflate;
        TextView textView = (TextView) inflate.findViewById(R.id.title);
        this.d = textView;
        textView.setMaxLines(2);
        this.z = (TextView) inflate.findViewById(R.id.duration);
        this.A = (TextView) inflate.findViewById(R.id.author);
        TextView textView2 = (TextView) inflate.findViewById(R.id.details);
        this.B = textView2;
        textView2.setMaxLines(2);
        this.y = new fcc() { // from class: jlb
            @Override // defpackage.fcc
            public final void a() {
                jlg.this.g();
            }
        };
        View findViewById = inflate.findViewById(R.id.thumbnail_layout);
        this.e = findViewById;
        this.g = (ImageView) findViewById.findViewById(R.id.thumbnail);
        this.E = (OfflineArrowView) inflate.findViewById(R.id.offline_arrow);
        this.f = findViewById.findViewById(R.id.resume_playback_overlay);
        this.D = inflate.findViewById(R.id.contextual_menu_anchor);
        gemVar.c(inflate);
        gemVar.d(this);
        ViewStub viewStub = (ViewStub) inflate.findViewById(R.id.offline_badge);
        this.i = viewStub != null ? jkvVar.a(viewStub, null) : null;
    }

    private final asvv h() {
        aopc aopcVar = (aopc) asvv.b.createBuilder();
        aopa createBuilder = apxf.a.createBuilder();
        int i = this.G;
        createBuilder.copyOnWrite();
        apxf apxfVar = (apxf) createBuilder.instance;
        apxfVar.b |= 4;
        apxfVar.e = i;
        int i2 = actj.OFFLINE_COMPACT_VIDEO.II;
        createBuilder.copyOnWrite();
        apxf apxfVar2 = (apxf) createBuilder.instance;
        apxfVar2.b |= 1;
        apxfVar2.c = i2;
        aopa createBuilder2 = apxg.a.createBuilder();
        aopa createBuilder3 = apxl.a.createBuilder();
        aoob z = aoob.z(this.h.f());
        createBuilder3.copyOnWrite();
        apxl apxlVar = (apxl) createBuilder3.instance;
        apxlVar.b |= 1;
        apxlVar.c = z;
        createBuilder2.copyOnWrite();
        apxg apxgVar = (apxg) createBuilder2.instance;
        apxl apxlVar2 = (apxl) createBuilder3.mo39build();
        apxlVar2.getClass();
        apxgVar.d = apxlVar2;
        apxgVar.b |= 2;
        apxg apxgVar2 = (apxg) createBuilder2.mo39build();
        createBuilder.copyOnWrite();
        apxf apxfVar3 = (apxf) createBuilder.instance;
        apxgVar2.getClass();
        apxfVar3.f = apxgVar2;
        apxfVar3.b |= 8;
        aopcVar.copyOnWrite();
        asvv asvvVar = (asvv) aopcVar.instance;
        apxf apxfVar4 = (apxf) createBuilder.mo39build();
        apxfVar4.getClass();
        asvvVar.h = apxfVar4;
        asvvVar.c |= 8;
        int[] iArr = {1, 4};
        aopa createBuilder4 = awbr.a.createBuilder();
        for (int i3 = 0; i3 < 2; i3++) {
            int i4 = iArr[i3];
            long j = ((awbr) createBuilder4.instance).c;
            if (i4 != 0) {
                createBuilder4.copyOnWrite();
                awbr awbrVar = (awbr) createBuilder4.instance;
                awbrVar.b |= 1;
                awbrVar.c = j | i4;
            } else {
                throw null;
            }
        }
        awbr awbrVar2 = (awbr) createBuilder4.mo39build();
        aopcVar.copyOnWrite();
        asvv asvvVar2 = (asvv) aopcVar.instance;
        awbrVar2.getClass();
        asvvVar2.e = awbrVar2;
        asvvVar2.c |= 2;
        return (asvv) aopcVar.mo39build();
    }

    @Override // defpackage.ajru
    public final View a() {
        return ((gem) this.m).b;
    }

    public final void d(agqv agqvVar) {
        boolean z = true;
        jjj c = this.q.c(1, agqvVar);
        StringBuilder sb = new StringBuilder();
        int i = 0;
        while (true) {
            String[] strArr = c.c;
            if (i >= strArr.length) {
                break;
            }
            sb.append(strArr[i]);
            if (i < c.c.length - 1) {
                sb.append('\n');
                i = 0;
            }
            i++;
        }
        this.B.setText(sb.toString());
        this.B.setTextColor(zhn.j(this.a, c.a).orElse(0));
        TextView textView = this.B;
        textView.setTypeface(textView.getTypeface(), 0);
        agqp i2 = agqvVar == null ? agqp.DELETED : agqvVar.i();
        if (i2 == agqp.PLAYABLE) {
            this.g.setAlpha(1.0f);
            this.d.setTextColor(zhn.j(this.a, R.attr.ytTextPrimary).orElse(0));
            this.z.setVisibility(0);
            this.E.setVisibility(8);
        } else if (i2.x || i2 == agqp.TRANSFER_PENDING_USER_APPROVAL) {
            boolean z2 = agqvVar == null || agqvVar.y();
            if (i2 == agqp.DELETED) {
                this.g.setAlpha(0.0f);
            } else {
                this.g.setAlpha(0.2f);
            }
            this.d.setTextColor(zhn.j(this.a, R.attr.ytTextSecondary).orElse(0));
            this.z.setVisibility(8);
            this.E.setVisibility(0);
            this.E.k();
            int ordinal = i2.ordinal();
            if (ordinal == 0) {
                this.E.b(2131231736);
            } else if (ordinal == 5) {
                this.E.c(2131231739);
            } else if (z2) {
                this.E.b(2131231736);
            } else {
                this.E.b(2131231720);
            }
        } else if (agqvVar != null) {
            this.z.setVisibility(8);
            this.E.setVisibility(0);
            OfflineArrowView offlineArrowView = this.E;
            offlineArrowView.d = 2;
            offlineArrowView.i(agqvVar.c());
            if (agqvVar.v()) {
                this.E.f();
                this.g.setAlpha(1.0f);
                this.d.setTextColor(zhn.j(this.a, R.attr.ytTextPrimary).orElse(0));
                this.z.setVisibility(0);
            } else {
                this.g.setAlpha(0.2f);
                this.d.setTextColor(zhn.j(this.a, R.attr.ytTextSecondary).orElse(0));
                int ordinal2 = agqvVar.i().ordinal();
                if (ordinal2 == 3) {
                    this.E.g();
                } else if (ordinal2 == 4 || ordinal2 == 8) {
                    this.E.h();
                } else if (ordinal2 == 10) {
                    this.E.b(2131231727);
                    this.E.k();
                } else {
                    this.E.e();
                }
            }
        } else {
            zep.b("video snapshot is null.");
        }
        if (this.k != null) {
            zag.o(this.k, i2 == agqp.PLAYABLE || (agqvVar != null && agqvVar.v() && agqvVar.q((adzz) this.o.get())));
        }
        TextView textView2 = this.A;
        if (c.c.length > 1 || amps.e(textView2.getText().toString())) {
            z = false;
        }
        zag.o(textView2, z);
    }

    public final void e(agqv agqvVar) {
        this.z.setText(agqvVar.n());
        if (this.A != null) {
            agqa h = agqvVar.h();
            if (h == null) {
                zag.m(this.A, null);
            } else {
                zag.m(this.A, h.b);
            }
        }
        this.c.h(this.g, agqvVar.k());
    }

    public final void g() {
        if (this.h != null) {
            d(((agrf) this.b.get()).a().m().e(this.h.f()));
        }
    }

    @Override // defpackage.ajru
    public final /* bridge */ /* synthetic */ void oK(final ajrs ajrsVar, Object obj) {
        acti actiVar;
        final agqo agqoVar = (agqo) obj;
        this.n.g(this);
        agqoVar.getClass();
        this.h = agqoVar;
        this.H = ajrsVar.a;
        ((RelativeLayout.LayoutParams) this.e.getLayoutParams()).width = this.a.getResources().getDimensionPixelSize(R.dimen.offline_video_item_thumbnail_width);
        agvx a = ((agrf) this.b.get()).a();
        this.F = ajrsVar.k("OfflineVideoPresenter.playlistId");
        final agqv e = a.m().e(agqoVar.f());
        aopa createBuilder = atep.a.createBuilder();
        ater d = this.u.d(agqoVar, this.F);
        if (d != null) {
            aopa createBuilder2 = aten.a.createBuilder();
            createBuilder2.copyOnWrite();
            aten atenVar = (aten) createBuilder2.instance;
            atenVar.d = d;
            atenVar.b |= 2;
            createBuilder.aC(createBuilder2);
        }
        this.t.e(this.C, this.D, (atep) createBuilder.mo39build(), agqoVar, ajrsVar.a);
        this.G = ajrsVar.b("position", 0);
        ajrsVar.f("VideoPresenterConstants.VIDEO_ID", agqoVar.f());
        if (this.x.a() && (actiVar = this.H) != null) {
            actiVar.n(new acte(h()));
        }
        this.l.a().E(new ayqe() { // from class: jlf
            @Override // defpackage.ayqe
            public final Object a(Object obj2) {
                return Boolean.valueOf(((amvn) obj2).contains(agqo.this.f()));
            }
        }).S(new ayqb() { // from class: jld
            @Override // defpackage.ayqb
            public final void a(Object obj2) {
                jlg jlgVar = jlg.this;
                agqv agqvVar = e;
                ajrs ajrsVar2 = ajrsVar;
                if (!((Boolean) obj2).booleanValue()) {
                    if (agqvVar != null) {
                        TextView textView = jlgVar.d;
                        if (textView != null) {
                            textView.setText(agqvVar.o(jlgVar.a));
                        }
                        jlgVar.e(agqvVar);
                    } else {
                        jlgVar.d.setText(jlgVar.h.j());
                    }
                    jku jkuVar = jlgVar.i;
                    if (jkuVar != null) {
                        jkuVar.b(ajrsVar2);
                    }
                    if (jlgVar.f != null) {
                        int g = agqvVar != null ? nni.g(agqvVar.f(), agqvVar.h) : 0;
                        aopa createBuilder3 = avha.a.createBuilder();
                        createBuilder3.copyOnWrite();
                        avha avhaVar = (avha) createBuilder3.instance;
                        avhaVar.b |= 1;
                        avhaVar.c = g;
                        avha avhaVar2 = (avha) createBuilder3.mo39build();
                        if (jlgVar.j == null) {
                            jlgVar.j = new ggm((ViewStub) jlgVar.f);
                        }
                        jlgVar.j.a(avhaVar2);
                        jlgVar.k = jlgVar.e.findViewById(R.id.resume_playback_inflated_overlay);
                    }
                    jlgVar.d(agqvVar);
                    return;
                }
                TextView textView2 = jlgVar.d;
                if (textView2 != null && agqvVar != null) {
                    textView2.setText(agqvVar.o(jlgVar.a));
                }
                jlgVar.d(null);
            }
        });
        this.s.a(this.y);
        this.m.e(ajrsVar);
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        int i;
        apzg g;
        int i2;
        acti actiVar;
        String str = null;
        if (this.x.a() && (actiVar = this.H) != null) {
            actiVar.H(3, new acte(h()), null);
        }
        if (this.h != null) {
            agvx a = ((agrf) this.b.get()).a();
            String f = this.h.f();
            agqv e = a.m().e(f);
            String str2 = "PPSV";
            if (e != null && (e.i() == agqp.PLAYABLE || e.v())) {
                String str3 = this.F;
                if (str3 == null) {
                    if (!e.e) {
                        Set n = a.i().n(f);
                        if (!n.isEmpty()) {
                            str = (String) n.iterator().next();
                        }
                        str2 = str;
                    }
                    i2 = -1;
                } else {
                    i2 = this.G;
                    str2 = str3;
                }
                if (str2 != null) {
                    float f2 = nni.f(e.f(), e.h);
                    if (this.w.b()) {
                        ampq u = nni.u(e, false, this.v, f2, i2, str2);
                        if (u.h()) {
                            this.r.a((apzg) u.c());
                            return;
                        } else {
                            this.r.a(aijk.g(f, str2, i2, f2));
                            return;
                        }
                    }
                    this.r.a(aijk.g(f, str2, i2, f2));
                    return;
                }
                String valueOf = String.valueOf(f);
                zep.b(valueOf.length() != 0 ? "Trying to play video that is not single nor in a list: ".concat(valueOf) : new String("Trying to play video that is not single nor in a list: "));
            } else if (!this.w.b() || e == null || e.i() != agqp.ERROR_POLICY) {
                this.r.a(aijk.f(f, this.F, this.G));
            } else {
                String str4 = this.F;
                if (str4 == null) {
                    if (!e.e) {
                        Set n2 = a.i().n(f);
                        if (!n2.isEmpty()) {
                            str = (String) n2.iterator().next();
                        }
                        str2 = str;
                    }
                    i = -1;
                } else {
                    i = this.G;
                    str2 = str4;
                }
                if (str2 == null) {
                    return;
                }
                float f3 = nni.f(e.f(), e.h);
                aafo aafoVar = this.r;
                ampq u2 = nni.u(e, false, this.v, f3, i, str2);
                if (u2.h()) {
                    g = (apzg) u2.c();
                } else {
                    g = aijk.g(f, str2, i, f3);
                }
                aafoVar.a(g);
            }
        }
    }

    @Override // defpackage.ajru
    public final void qZ(ajsa ajsaVar) {
        this.n.m(this);
        this.s.b(this.y);
        this.F = null;
    }

    @Override // defpackage.ynl
    public final Class[] ky(Class cls, Object obj, int i) {
        agqv e;
        switch (i) {
            case -1:
                return new Class[]{jiy.class, jiz.class, ypy.class, agnj.class, agnz.class, agog.class};
            case 0:
                if (!this.h.f().equals(((jiy) obj).a)) {
                    return null;
                }
                d(null);
                return null;
            case 1:
                jiz jizVar = (jiz) obj;
                if (!this.h.f().equals(jizVar.a) || (e = ((agrf) this.b.get()).a().m().e(jizVar.a)) == null) {
                    return null;
                }
                e(e);
                d(e);
                return null;
            case 2:
                ypy ypyVar = (ypy) obj;
                g();
                return null;
            case 3:
                agnj agnjVar = (agnj) obj;
                g();
                return null;
            case 4:
                agnz agnzVar = (agnz) obj;
                if (!this.h.f().equals(agnzVar.a.m())) {
                    return null;
                }
                e(agnzVar.a);
                d(agnzVar.a);
                return null;
            case 5:
                final agog agogVar = (agog) obj;
                if (!this.h.f().equals(agogVar.a.m())) {
                    return null;
                }
                if (this.g.getDrawable() == null) {
                    this.c.h(this.g, agogVar.a.k());
                }
                this.l.a().E(new ayqe() { // from class: jle
                    @Override // defpackage.ayqe
                    public final Object a(Object obj2) {
                        return Boolean.valueOf(((amvn) obj2).contains(agog.this.a.m()));
                    }
                }).S(new ayqb() { // from class: jlc
                    @Override // defpackage.ayqb
                    public final void a(Object obj2) {
                        jlg jlgVar = jlg.this;
                        agog agogVar2 = agogVar;
                        if (!((Boolean) obj2).booleanValue()) {
                            jlgVar.d(agogVar2.a);
                        }
                    }
                });
                return null;
            default:
                StringBuilder sb = new StringBuilder(32);
                sb.append("unsupported op code: ");
                sb.append(i);
                throw new IllegalStateException(sb.toString());
        }
    }
}
