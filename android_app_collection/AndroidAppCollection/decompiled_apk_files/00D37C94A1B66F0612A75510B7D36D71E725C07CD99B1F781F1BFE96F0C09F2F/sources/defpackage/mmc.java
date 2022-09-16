package defpackage;

import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.google.android.libraries.youtube.common.ui.FixedAspectRatioFrameLayout;
import com.google.android.youtube.R;
import com.google.protos.youtube.api.innertube.ButtonRendererOuterClass;
import java.util.HashMap;
/* compiled from: PG */
/* renamed from: mmc  reason: default package */
/* loaded from: classes3.dex */
public final class mmc extends ajsl implements ajrm, ajgy {
    private fjx A;
    private final int B;
    private final aacz C;
    public atph a;
    private final Context b;
    private final TextView c;
    private final TextView d;
    private final ImageView e;
    private final ImageView f;
    private final FrameLayout g;
    private final ImageView h;
    private final ajmy i;
    private final FixedAspectRatioFrameLayout j;
    private final ajyc k;
    private final ajrx l;
    private final aafo m;
    private final ajrp n;
    private final azqb o;
    private final acuh p;
    private apzg q;
    private final ImageView r;
    private final FrameLayout s;
    private final ImageView t;
    private final fjy u;
    private final aagi v;
    private final mmb x;
    private final ajgz y;
    private final int z;

    public mmc(Context context, ajmy ajmyVar, final aafo aafoVar, gem gemVar, ajyc ajycVar, azqb azqbVar, fjy fjyVar, acuh acuhVar, aagi aagiVar, mmb mmbVar, ajgz ajgzVar, aacz aaczVar) {
        this.b = context;
        this.i = ajmyVar;
        this.l = gemVar;
        this.k = ajycVar;
        this.m = aafoVar;
        this.o = azqbVar;
        this.u = fjyVar;
        this.p = acuhVar;
        this.v = aagiVar;
        this.x = mmbVar;
        this.y = ajgzVar;
        this.C = aaczVar;
        LinearLayout linearLayout = (LinearLayout) View.inflate(context, R.layout.notification_inbox_item, null);
        this.c = (TextView) linearLayout.findViewById(R.id.short_message);
        this.d = (TextView) linearLayout.findViewById(R.id.sent_time);
        this.e = (ImageView) linearLayout.findViewById(R.id.notification_thumbnail);
        this.f = (ImageView) linearLayout.findViewById(R.id.notification_video_thumbnail);
        this.j = (FixedAspectRatioFrameLayout) linearLayout.findViewById(R.id.notification_video_thumbnail_layout);
        this.g = (FrameLayout) linearLayout.findViewById(R.id.button);
        this.s = (FrameLayout) linearLayout.findViewById(R.id.contextual_menu_anchor_container);
        this.r = (ImageView) linearLayout.findViewById(R.id.contextual_menu_anchor);
        ImageView imageView = (ImageView) linearLayout.findViewById(R.id.close_button);
        this.t = imageView;
        imageView.setOnClickListener(new View.OnClickListener() { // from class: mlz
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                apzg apzgVar;
                mmc mmcVar = mmc.this;
                aafo aafoVar2 = aafoVar;
                HashMap hashMap = new HashMap();
                hashMap.put("com.google.android.libraries.youtube.innertube.action.HideEnclosingAction.tag", mmcVar.a);
                atph atphVar = mmcVar.a;
                if (atphVar.c == 24) {
                    apzgVar = (apzg) atphVar.d;
                } else {
                    apzgVar = apzg.a;
                }
                aafoVar2.c(apzgVar, hashMap);
            }
        });
        this.h = (ImageView) linearLayout.findViewById(R.id.new_content_indicator);
        this.z = zew.i(context.getResources().getDisplayMetrics(), 720);
        this.B = context.getResources().getDimensionPixelSize(R.dimen.notification_inbox_vertical_padding);
        gemVar.c(linearLayout);
        this.n = new ajrp(aafoVar, gemVar, this);
    }

    @Override // defpackage.ajru
    public final View a() {
        return ((gem) this.l).b;
    }

    @Override // defpackage.ajsl
    protected final /* bridge */ /* synthetic */ void d(ajrs ajrsVar, Object obj) {
        apzg apzgVar;
        arag aragVar;
        ates atesVar;
        ates atesVar2;
        ates atesVar3;
        ates atesVar4;
        ates atesVar5;
        ates atesVar6;
        int i;
        atph atphVar = (atph) obj;
        this.a = atphVar;
        asxj asxjVar = this.C.b().e;
        if (asxjVar == null) {
            asxjVar = asxj.a;
        }
        if (asxjVar.ci) {
            int i2 = zew.i(this.b.getResources().getDisplayMetrics(), this.b.getResources().getConfiguration().screenWidthDp);
            int i3 = this.z;
            if (i2 > i3) {
                double d = i2 - i3;
                Double.isNaN(d);
                i = (int) (d / 2.0d);
            } else {
                i = 0;
            }
            View view = ((gem) this.l).b;
            int i4 = this.B;
            view.setPadding(i, i4, i, i4);
        }
        ajrp ajrpVar = this.n;
        acti actiVar = ajrsVar.a;
        argj argjVar = null;
        if ((atphVar.b & 64) != 0) {
            apzgVar = atphVar.i;
            if (apzgVar == null) {
                apzgVar = apzg.a;
            }
        } else {
            apzgVar = null;
        }
        ajrpVar.a(actiVar, apzgVar, ajrsVar.e());
        TextView textView = this.c;
        arag aragVar2 = atphVar.g;
        if (aragVar2 == null) {
            aragVar2 = arag.a;
        }
        zag.m(textView, ajgl.b(aragVar2));
        TextView textView2 = this.d;
        if ((atphVar.b & 32) != 0) {
            aragVar = atphVar.h;
            if (aragVar == null) {
                aragVar = arag.a;
            }
        } else {
            aragVar = null;
        }
        zag.m(textView2, ajgl.b(aragVar));
        ajmy ajmyVar = this.i;
        ImageView imageView = this.f;
        avhn avhnVar = atphVar.f;
        if (avhnVar == null) {
            avhnVar = avhn.a;
        }
        ajmyVar.h(imageView, avhnVar);
        avhn avhnVar2 = atphVar.f;
        if (avhnVar2 == null) {
            avhnVar2 = avhn.a;
        }
        boolean A = akel.A(avhnVar2);
        zag.o(this.f, A);
        avhn avhnVar3 = atphVar.f;
        if (avhnVar3 == null) {
            avhnVar3 = avhn.a;
        }
        float p = akel.p(avhnVar3);
        if (p != -1.0f) {
            this.j.a = p;
        }
        zag.o(this.j, A);
        ajmy ajmyVar2 = this.i;
        ImageView imageView2 = this.e;
        avhn avhnVar4 = atphVar.e;
        if (avhnVar4 == null) {
            avhnVar4 = avhn.a;
        }
        ajmyVar2.h(imageView2, avhnVar4);
        ImageView imageView3 = this.e;
        avhn avhnVar5 = atphVar.e;
        if (avhnVar5 == null) {
            avhnVar5 = avhn.a;
        }
        imageView3.setVisibility(true != akel.A(avhnVar5) ? 8 : 0);
        apzg apzgVar2 = atphVar.j;
        if (apzgVar2 == null) {
            apzgVar2 = apzg.a;
        }
        this.q = apzgVar2;
        aagh c = this.v.c();
        int ay = akel.ay(atphVar.k);
        int i5 = 2;
        if (ay == 0 || ay != 2) {
            f();
            ((aagu) c).c().g(atphVar.m);
        } else {
            c.f(jac.b(atphVar.m)).y(aypa.a()).n(new aypw() { // from class: mma
                @Override // defpackage.aypw
                public final void a(Object obj2, Object obj3) {
                    mmc mmcVar = mmc.this;
                    aajj aajjVar = (aajj) obj2;
                    Throwable th = (Throwable) obj3;
                    if (aajjVar != null) {
                        if (!(aajjVar instanceof jac) || !((jac) aajjVar).b) {
                            mmcVar.f();
                            return;
                        } else {
                            mmcVar.g();
                            return;
                        }
                    }
                    mmcVar.g();
                }
            }).S();
        }
        this.t.setVisibility(8);
        this.r.setVisibility(4);
        int i6 = atphVar.c;
        if (i6 == 0) {
            i5 = 3;
        } else if (i6 == 11) {
            i5 = 1;
        } else if (i6 != 24) {
            i5 = 0;
        }
        int i7 = i5 - 1;
        if (i5 != 0) {
            if (i7 == 0) {
                if (i6 == 11) {
                    atesVar = (ates) atphVar.d;
                } else {
                    atesVar = ates.a;
                }
                if ((atesVar.b & 1) != 0) {
                    if (atphVar.c == 11) {
                        atesVar2 = (ates) atphVar.d;
                    } else {
                        atesVar2 = ates.a;
                    }
                    atep atepVar = atesVar2.c;
                    if (atepVar == null) {
                        atepVar = atep.a;
                    }
                    if (atepVar.f) {
                        if (this.x.a.get(atphVar.m) != null) {
                            aopa mo52toBuilder = atepVar.mo52toBuilder();
                            mo52toBuilder.copyOnWrite();
                            atep atepVar2 = (atep) mo52toBuilder.instance;
                            atepVar2.b |= 16;
                            atepVar2.f = false;
                            atepVar = (atep) mo52toBuilder.mo39build();
                        } else {
                            this.x.a.put(atphVar.m, true);
                        }
                    }
                    this.k.e(this.s, this.r, atepVar, atphVar, ajrsVar.a);
                }
            } else if (i7 == 1) {
                this.r.setVisibility(8);
                this.t.setVisibility(0);
            }
            aunb aunbVar = atphVar.n;
            if (aunbVar == null) {
                aunbVar = aunb.a;
            }
            if (aunbVar.qn(ButtonRendererOuterClass.buttonRenderer)) {
                aunb aunbVar2 = atphVar.n;
                if (aunbVar2 == null) {
                    aunbVar2 = aunb.a;
                }
                apoj apojVar = (apoj) aunbVar2.qm(ButtonRendererOuterClass.buttonRenderer);
                if (this.A == null) {
                    this.A = this.u.b(null, null, R.layout.wide_button);
                }
                this.A.oK(ajrsVar, apojVar);
                this.g.removeAllViews();
                this.g.addView(this.A.b);
                this.g.setVisibility(0);
            } else {
                this.g.setVisibility(8);
            }
            if (ajrsVar.b("position", -1) == 1) {
                if (atphVar.c == 11) {
                    atesVar3 = (ates) atphVar.d;
                } else {
                    atesVar3 = ates.a;
                }
                atep atepVar3 = atesVar3.c;
                if (atepVar3 == null) {
                    atepVar3 = atep.a;
                }
                if (!atepVar3.f) {
                    akfb akfbVar = (akfb) this.o.get();
                    if (atphVar.c == 11) {
                        atesVar4 = (ates) atphVar.d;
                    } else {
                        atesVar4 = ates.a;
                    }
                    atep atepVar4 = atesVar4.c;
                    if (atepVar4 == null) {
                        atepVar4 = atep.a;
                    }
                    atel atelVar = atepVar4.h;
                    if (atelVar == null) {
                        atelVar = atel.a;
                    }
                    if (atelVar.b == 102716411) {
                        if (atphVar.c == 11) {
                            atesVar6 = (ates) atphVar.d;
                        } else {
                            atesVar6 = ates.a;
                        }
                        atep atepVar5 = atesVar6.c;
                        if (atepVar5 == null) {
                            atepVar5 = atep.a;
                        }
                        atel atelVar2 = atepVar5.h;
                        if (atelVar2 == null) {
                            atelVar2 = atel.a;
                        }
                        if (atelVar2.b == 102716411) {
                            argjVar = (argj) atelVar2.c;
                        } else {
                            argjVar = argj.a;
                        }
                    }
                    ImageView imageView4 = this.r;
                    if (atphVar.c == 11) {
                        atesVar5 = (ates) atphVar.d;
                    } else {
                        atesVar5 = ates.a;
                    }
                    atep atepVar6 = atesVar5.c;
                    if (atepVar6 == null) {
                        atepVar6 = atep.a;
                    }
                    akfbVar.b(argjVar, imageView4, atepVar6, ajrsVar.a);
                }
            }
            if ((atphVar.b & 2097152) != 0 && !this.p.b(atphVar)) {
                this.p.a(atphVar);
                aafo aafoVar = this.m;
                apzg apzgVar3 = atphVar.o;
                if (apzgVar3 == null) {
                    apzgVar3 = apzg.a;
                }
                aafoVar.a(apzgVar3);
            }
            this.y.a(this);
            this.l.e(ajrsVar);
            return;
        }
        throw null;
    }

    @Override // defpackage.ajsl
    protected final /* bridge */ /* synthetic */ byte[] e(Object obj) {
        return ((atph) obj).l.I();
    }

    public final void f() {
        this.h.setVisibility(4);
    }

    public final void g() {
        this.h.setVisibility(0);
    }

    @Override // defpackage.ajrm
    public final boolean h(View view) {
        apzg apzgVar = this.q;
        if (apzgVar != null) {
            this.m.c(apzgVar, null);
        }
        this.h.setVisibility(4);
        if (this.a != null) {
            aahb c = ((aagu) this.v.c()).c();
            String b = jac.b(this.a.m);
            jab jabVar = new jab();
            jabVar.c(b);
            jabVar.d(false);
            c.d(jabVar.b());
            c.b();
        }
        return false;
    }

    @Override // defpackage.ajgy
    public final void lL() {
        this.k.h();
    }

    @Override // defpackage.ajru
    public final void qZ(ajsa ajsaVar) {
        this.n.c();
        this.g.removeAllViews();
        fjx fjxVar = this.A;
        if (fjxVar != null) {
            fjxVar.qZ(ajsaVar);
        }
        this.y.d(this);
    }
}
