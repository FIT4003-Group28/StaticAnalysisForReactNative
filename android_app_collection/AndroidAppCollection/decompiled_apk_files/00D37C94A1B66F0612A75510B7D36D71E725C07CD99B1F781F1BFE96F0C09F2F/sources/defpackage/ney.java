package defpackage;

import android.content.Context;
import android.graphics.Rect;
import android.os.Handler;
import android.view.LayoutInflater;
import android.view.TouchDelegate;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.widget.ImageView;
import android.widget.Space;
import android.widget.TextView;
import com.google.android.apps.youtube.app.ui.SlimVideoBadgeAndSubtitleFlexboxLayout;
import com.google.android.flexbox.FlexboxLayout;
import com.google.android.youtube.R;
import com.google.protos.youtube.api.innertube.ToggleEngagementPanelCommandOuterClass$ToggleEngagementPanelCommand;
import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicReference;
/* compiled from: PG */
/* renamed from: ney  reason: default package */
/* loaded from: classes3.dex */
public final class ney extends nez {
    private final aadd A;
    private final nml B;
    private final int C;
    private aypg D;
    private int E;
    public final aafo a;
    public final ViewGroup b;
    public final ImageView c;
    public final mra d;
    public final bnk e;
    public final int f;
    public final akfw g;
    public String h;
    public boolean i;
    private final Context m;
    private final Handler n;
    private final mrb o;
    private final kua p;
    private final TextView q;
    private final TextView r;
    private final TextView s;
    private final SlimVideoBadgeAndSubtitleFlexboxLayout t;
    private final akem u;
    private final String v;
    private final String w;
    private final Runnable x;
    private final ftb y;
    private final ajxz z;

    public ney(Context context, Handler handler, aafo aafoVar, mrb mrbVar, kua kuaVar, ftb ftbVar, akem akemVar, ajxz ajxzVar, aadd aaddVar, nml nmlVar, akfw akfwVar) {
        this.m = context;
        this.n = handler;
        this.a = aafoVar;
        this.o = mrbVar;
        this.p = kuaVar;
        this.y = ftbVar;
        this.u = akemVar;
        this.z = ajxzVar;
        this.A = aaddVar;
        this.g = akfwVar;
        this.B = nmlVar;
        ViewGroup viewGroup = (ViewGroup) LayoutInflater.from(context).inflate(R.layout.slim_video_information_reduced_margins, (ViewGroup) null);
        this.b = viewGroup;
        this.q = (TextView) viewGroup.findViewById(R.id.title);
        ImageView imageView = (ImageView) viewGroup.findViewById(R.id.expansion_icon);
        this.c = imageView;
        this.r = (TextView) viewGroup.findViewById(R.id.collapsed_subtitle);
        this.s = (TextView) viewGroup.findViewById(R.id.expanded_subtitle);
        ViewStub viewStub = (ViewStub) viewGroup.findViewById(R.id.standalone_collection_badge);
        viewStub.getClass();
        Context context2 = (Context) mrbVar.a.get();
        context2.getClass();
        aafo aafoVar2 = (aafo) mrbVar.b.get();
        aafoVar2.getClass();
        ajxz ajxzVar2 = (ajxz) mrbVar.c.get();
        ajxzVar2.getClass();
        this.d = new mra(viewStub, context2, aafoVar2, ajxzVar2);
        SlimVideoBadgeAndSubtitleFlexboxLayout slimVideoBadgeAndSubtitleFlexboxLayout = (SlimVideoBadgeAndSubtitleFlexboxLayout) viewGroup.findViewById(R.id.badge_and_subtitle_container);
        this.t = slimVideoBadgeAndSubtitleFlexboxLayout;
        this.C = slimVideoBadgeAndSubtitleFlexboxLayout.getChildCount();
        this.v = context.getString(R.string.load_more_label);
        this.w = context.getString(R.string.load_less_label);
        bnr bnrVar = new bnr();
        fqs fqsVar = new fqs();
        fqsVar.y(R.id.container);
        bnrVar.f(fqsVar);
        frd frdVar = new frd();
        frdVar.y(R.id.expansion_icon);
        bnrVar.f(frdVar);
        bnb bnbVar = new bnb();
        bnbVar.y(R.id.title);
        bnbVar.y(R.id.standalone_collection_badge);
        bnbVar.y(R.id.badge_and_subtitle_container);
        bnrVar.f(bnbVar);
        this.e = bnrVar;
        this.f = context.getResources().getDimensionPixelSize(R.dimen.standalone_collection_badge_expansion_amount);
        this.x = new Runnable() { // from class: neu
            @Override // java.lang.Runnable
            public final void run() {
                View view;
                ney neyVar = ney.this;
                ViewGroup viewGroup2 = neyVar.b;
                mra mraVar = neyVar.d;
                int i = neyVar.f;
                zde zdeVar = null;
                if (mraVar.g() && mraVar.a.isLaidOut() && (view = mraVar.f) != null) {
                    Rect rect = new Rect();
                    mraVar.a.getHitRect(rect);
                    viewGroup2.offsetDescendantRectToMyCoords(view, rect);
                    int i2 = -i;
                    rect.inset(i2, i2);
                    zdeVar = new zde(rect, mraVar.a, viewGroup2);
                }
                viewGroup2.setTouchDelegate(zdeVar);
            }
        };
        viewGroup.setOnClickListener(new View.OnClickListener() { // from class: ner
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                ney neyVar = ney.this;
                if (!neyVar.l.f) {
                    neyVar.j.a.H(3, new acte(actj.SLIM_VIDEO_METADATA_RENDERER_EXPAND_BUTTON), null);
                } else {
                    neyVar.j.a.H(3, new acte(actj.SLIM_VIDEO_METADATA_RENDERER_COLLAPSE_BUTTON), null);
                }
                auxm auxmVar = (auxm) neyVar.k;
                if ((auxmVar.b & 256) == 0) {
                    neyVar.l.f();
                    return;
                }
                aafo aafoVar3 = neyVar.a;
                apzg apzgVar = auxmVar.j;
                if (apzgVar == null) {
                    apzgVar = apzg.a;
                }
                aafoVar3.c(apzgVar, null);
            }
        });
        imageView.setAccessibilityDelegate(new nex());
        this.E = 1;
        View findViewById = viewGroup.findViewById(R.id.channel_navigation_container);
        akemVar.b(findViewById, akemVar.a(findViewById, null));
    }

    private final int i(boolean z) {
        asxp asxpVar = this.A.a().e;
        if (asxpVar == null) {
            asxpVar = asxp.a;
        }
        if ((asxpVar.f & 32768) == 0) {
            return z ? 4 : 2;
        }
        asxp asxpVar2 = this.A.a().e;
        if (asxpVar2 == null) {
            asxpVar2 = asxp.a;
        }
        int i = asxpVar2.ax;
        return z ? Math.max(i, 4) : i;
    }

    private final Space j() {
        Space space = new Space(this.m);
        FlexboxLayout.LayoutParams layoutParams = new FlexboxLayout.LayoutParams(this.m.getResources().getDimensionPixelSize(R.dimen.under_title_standalone_badge_space_size));
        layoutParams.q();
        space.setLayoutParams(layoutParams);
        return space;
    }

    private final void k() {
        acti actiVar = this.j.a;
        if (this.l.f) {
            actiVar.u(new acte(actj.SLIM_VIDEO_METADATA_RENDERER_COLLAPSE_BUTTON), null);
            actiVar.q(new acte(actj.SLIM_VIDEO_METADATA_RENDERER_EXPAND_BUTTON), null);
            return;
        }
        actiVar.u(new acte(actj.SLIM_VIDEO_METADATA_RENDERER_EXPAND_BUTTON), null);
        actiVar.q(new acte(actj.SLIM_VIDEO_METADATA_RENDERER_COLLAPSE_BUTTON), null);
    }

    private final void l() {
        int i;
        amuk r;
        auxm auxmVar = (auxm) this.k;
        LayoutInflater from = LayoutInflater.from(this.m);
        int childCount = this.t.getChildCount();
        int i2 = this.C;
        if (childCount > i2) {
            this.t.removeViews(i2, childCount - i2);
        }
        SlimVideoBadgeAndSubtitleFlexboxLayout slimVideoBadgeAndSubtitleFlexboxLayout = this.t;
        boolean z = true;
        if (this.l.f) {
            i = -1;
        } else {
            asxp asxpVar = this.A.a().e;
            if (asxpVar == null) {
                asxpVar = asxp.a;
            }
            if ((asxpVar.f & 33554432) != 0) {
                asxp asxpVar2 = this.A.a().e;
                if (asxpVar2 == null) {
                    asxpVar2 = asxp.a;
                }
                i = asxpVar2.aA;
            } else {
                i = 1;
            }
        }
        if (slimVideoBadgeAndSubtitleFlexboxLayout.a != i) {
            slimVideoBadgeAndSubtitleFlexboxLayout.a = i;
            slimVideoBadgeAndSubtitleFlexboxLayout.requestLayout();
        }
        apmg apmgVar = auxmVar.g;
        if (apmgVar == null) {
            apmgVar = apmg.a;
        }
        if ((apmgVar.b & 2) != 0) {
            View inflate = from.inflate(R.layout.standalone_red_badge, (ViewGroup) this.t, false);
            kua kuaVar = this.p;
            ajxz ajxzVar = (ajxz) kuaVar.a.get();
            ajxzVar.getClass();
            Context context = (Context) kuaVar.b.get();
            context.getClass();
            inflate.getClass();
            ktz ktzVar = new ktz(ajxzVar, context, inflate);
            apmg apmgVar2 = auxmVar.g;
            if (apmgVar2 == null) {
                apmgVar2 = apmg.a;
            }
            apmi apmiVar = apmgVar2.d;
            if (apmiVar == null) {
                apmiVar = apmi.a;
            }
            ktzVar.a(apmiVar);
            this.t.addView(inflate);
            this.t.addView(j());
        } else {
            apmg apmgVar3 = auxmVar.g;
            if (apmgVar3 == null) {
                apmgVar3 = apmg.a;
            }
            if ((apmgVar3.b & 8) != 0) {
                View inflate2 = from.inflate(R.layout.metadata_badge, (ViewGroup) this.t, false);
                fta a = this.y.a(this.m, inflate2);
                apmg apmgVar4 = auxmVar.g;
                if (apmgVar4 == null) {
                    apmgVar4 = apmg.a;
                }
                atfh atfhVar = apmgVar4.f;
                if (atfhVar == null) {
                    atfhVar = atfh.a;
                }
                a.f(atfhVar);
                this.t.addView(inflate2);
                this.t.addView(j());
            } else {
                apmg apmgVar5 = auxmVar.g;
                if (apmgVar5 == null) {
                    apmgVar5 = apmg.a;
                }
                if ((apmgVar5.b & 1) != 0) {
                    View inflate3 = from.inflate(R.layout.standalone_ypc_badge, (ViewGroup) this.t, false);
                    inflate3.getClass();
                    ftc ftcVar = new ftc(inflate3, 1);
                    apmg apmgVar6 = auxmVar.g;
                    if (apmgVar6 == null) {
                        apmgVar6 = apmg.a;
                    }
                    apmk apmkVar = apmgVar6.c;
                    if (apmkVar == null) {
                        apmkVar = apmk.a;
                    }
                    ftcVar.a(apmkVar);
                    this.t.addView(inflate3);
                    this.t.addView(j());
                }
            }
        }
        for (aplw aplwVar : auxmVar.h) {
            int i3 = aplwVar.b;
            if ((i3 & 1) != 0) {
                TextView textView = (TextView) from.inflate(R.layout.text_badge, (ViewGroup) this.t, false);
                apmm apmmVar = aplwVar.c;
                if (apmmVar == null) {
                    apmmVar = apmm.a;
                }
                arag aragVar = apmmVar.b;
                if (aragVar == null) {
                    aragVar = arag.a;
                }
                textView.setText(ajgl.b(aragVar));
                this.t.addView(textView);
                this.t.addView(j());
            } else if ((i3 & 256) != 0) {
                ImageView imageView = (ImageView) from.inflate(R.layout.slim_privacy_badge, (ViewGroup) this.t, false);
                Context context2 = this.m;
                imageView.getClass();
                context2.getClass();
                mnk mnkVar = new mnk(imageView, context2);
                apmf apmfVar = aplwVar.e;
                if (apmfVar == null) {
                    apmfVar = apmf.a;
                }
                mnkVar.a(apmfVar);
                this.t.addView(imageView);
                this.t.addView(j());
            }
        }
        apmg apmgVar7 = auxmVar.g;
        if (apmgVar7 == null) {
            apmgVar7 = apmg.a;
        }
        if ((apmgVar7.b & 4) == 0) {
            if (this.b.getTouchDelegate() instanceof zdf) {
                this.b.setTouchDelegate(null);
            }
        } else {
            apmg apmgVar8 = auxmVar.g;
            if (apmgVar8 == null) {
                apmgVar8 = apmg.a;
            }
            apmh apmhVar = apmgVar8.e;
            if (apmhVar == null) {
                apmhVar = apmh.a;
            }
            if (apmhVar == null) {
                r = amuk.q();
            } else {
                if ((apmhVar.b & 2) != 0) {
                    arag aragVar2 = apmhVar.d;
                    if (aragVar2 == null) {
                        aragVar2 = arag.a;
                    }
                    if (aragVar2 != null) {
                        int i4 = 0;
                        for (arai araiVar : aragVar2.c) {
                            if ((araiVar.b & 512) != 0 && (i4 = i4 + 1) > 1) {
                                ArrayList arrayList = new ArrayList();
                                aopa aopaVar = null;
                                aopc aopcVar = null;
                                int i5 = 0;
                                while (true) {
                                    arag aragVar3 = apmhVar.d;
                                    if (aragVar3 == null) {
                                        aragVar3 = arag.a;
                                    }
                                    if (i5 >= aragVar3.c.size()) {
                                        break;
                                    }
                                    arag aragVar4 = apmhVar.d;
                                    if (aragVar4 == null) {
                                        aragVar4 = arag.a;
                                    }
                                    arai araiVar2 = (arai) aragVar4.c.get(i5);
                                    if ((araiVar2.b & 512) != 0) {
                                        if (aopaVar != null && aopcVar != null) {
                                            arag aragVar5 = (arag) aopcVar.mo39build();
                                            aopaVar.copyOnWrite();
                                            apmh apmhVar2 = (apmh) aopaVar.instance;
                                            aragVar5.getClass();
                                            apmhVar2.d = aragVar5;
                                            apmhVar2.b |= 2;
                                            arrayList.add((apmh) aopaVar.mo39build());
                                        }
                                        aopaVar = apmh.a.createBuilder(apmhVar);
                                        arag aragVar6 = apmhVar.d;
                                        if (aragVar6 == null) {
                                            aragVar6 = arag.a;
                                        }
                                        aopcVar = (aopc) arag.a.createBuilder(aragVar6);
                                        aopcVar.copyOnWrite();
                                        ((arag) aopcVar.instance).c = arag.emptyProtobufList();
                                    }
                                    aopcVar.ch(araiVar2);
                                    i5++;
                                }
                                if (aopaVar != null && aopcVar != null) {
                                    arag aragVar7 = (arag) aopcVar.mo39build();
                                    aopaVar.copyOnWrite();
                                    apmh apmhVar3 = (apmh) aopaVar.instance;
                                    aragVar7.getClass();
                                    apmhVar3.d = aragVar7;
                                    apmhVar3.b |= 2;
                                    arrayList.add((apmh) aopaVar.mo39build());
                                }
                                r = amuk.o(arrayList);
                            }
                        }
                    }
                }
                r = amuk.r(apmhVar);
            }
            this.t.setPadding(0, 0, 0, this.f);
            int size = r.size();
            for (int i6 = 0; i6 < size; i6++) {
                View inflate4 = LayoutInflater.from(this.m).inflate(R.layout.standalone_collection_badge, (ViewGroup) this.t, false);
                ((FlexboxLayout.LayoutParams) inflate4.getLayoutParams()).q();
                TextView textView2 = (TextView) inflate4.findViewById(R.id.collection_badge_label);
                ((TextView) inflate4.findViewById(R.id.collection_badge_icon)).setTextSize(0, this.r.getTextSize());
                textView2.setTextSize(0, this.r.getTextSize());
                akem akemVar = this.u;
                akemVar.c(textView2, akemVar.a(textView2, null));
                mrb mrbVar = this.o;
                inflate4.getClass();
                Context context3 = (Context) mrbVar.a.get();
                context3.getClass();
                aafo aafoVar = (aafo) mrbVar.b.get();
                aafoVar.getClass();
                ajxz ajxzVar2 = (ajxz) mrbVar.c.get();
                ajxzVar2.getClass();
                final mra mraVar = new mra(inflate4, context3, aafoVar, ajxzVar2);
                mraVar.f((apmh) r.get(i6), this.j.a);
                this.t.addView(inflate4);
                this.n.post(new Runnable() { // from class: nev
                    @Override // java.lang.Runnable
                    public final void run() {
                        View view;
                        ney neyVar = ney.this;
                        mra mraVar2 = mraVar;
                        ViewGroup viewGroup = neyVar.b;
                        int i7 = neyVar.f;
                        if (!mraVar2.g() || !mraVar2.a.isLaidOut() || (view = mraVar2.f) == null) {
                            return;
                        }
                        Rect rect = new Rect();
                        mraVar2.a.getHitRect(rect);
                        viewGroup.offsetDescendantRectToMyCoords(view, rect);
                        int i8 = -i7;
                        rect.inset(i8, i8);
                        TextView textView3 = mraVar2.a;
                        zdf.b(viewGroup, textView3, new TouchDelegate(rect, textView3));
                    }
                });
            }
        }
        SlimVideoBadgeAndSubtitleFlexboxLayout slimVideoBadgeAndSubtitleFlexboxLayout2 = this.t;
        if (slimVideoBadgeAndSubtitleFlexboxLayout2.getChildCount() <= 0) {
            z = false;
        }
        zag.o(slimVideoBadgeAndSubtitleFlexboxLayout2, z);
    }

    private final void n() {
        arag aragVar;
        auxm auxmVar = (auxm) this.k;
        TextView textView = this.q;
        if ((auxmVar.b & 1) != 0) {
            aragVar = auxmVar.c;
            if (aragVar == null) {
                aragVar = arag.a;
            }
        } else {
            aragVar = null;
        }
        textView.setText(aafv.a(aragVar, this.a, false));
        this.q.setMaxLines(i(this.l.f));
    }

    @Override // defpackage.ajru
    public final View a() {
        return this.b;
    }

    @Override // defpackage.nez
    protected final void d() {
        odl odlVar = this.l;
        int i = 1;
        if (!odlVar.g) {
            auxn auxnVar = odlVar.c;
            if ((auxnVar.b & 2) != 0) {
                odlVar.b.b(auxnVar.d, odlVar);
                aafo aafoVar = odlVar.a;
                apzg apzgVar = odlVar.c.e;
                if (apzgVar == null) {
                    apzgVar = apzg.a;
                }
                aafoVar.c(apzgVar, null);
                odlVar.g = true;
            }
        }
        acti actiVar = this.j.a;
        auxm auxmVar = (auxm) this.k;
        actiVar.u(new acte(auxmVar.i), null);
        actiVar.D(new acte(actj.SLIM_VIDEO_METADATA_RENDERER_EXPAND_BUTTON));
        actiVar.D(new acte(actj.SLIM_VIDEO_METADATA_RENDERER_COLLAPSE_BUTTON));
        arag aragVar = auxmVar.c;
        if (aragVar == null) {
            aragVar = arag.a;
        }
        aczo.d(aragVar, actiVar);
        if ((auxmVar.b & 512) != 0) {
            int aS = awwc.aS(auxmVar.k);
            if (aS != 0) {
                i = aS;
            }
            this.E = i;
        } else {
            auxl auxlVar = auxmVar.m;
            if (auxlVar == null) {
                auxlVar = auxl.a;
            }
            if ((auxlVar.b & 1) != 0) {
                auxl auxlVar2 = auxmVar.m;
                if (auxlVar2 == null) {
                    auxlVar2 = auxl.a;
                }
                int aS2 = awwc.aS(auxlVar2.c);
                if (aS2 != 0) {
                    i = aS2;
                }
                this.E = i;
            }
        }
        h();
        m();
        auxm auxmVar2 = (auxm) this.k;
        apmg apmgVar = auxmVar2.f;
        if (apmgVar == null) {
            apmgVar = apmg.a;
        }
        if ((apmgVar.b & 4) != 0) {
            asxp asxpVar = this.A.a().e;
            if (asxpVar == null) {
                asxpVar = asxp.a;
            }
            if (asxpVar.bj) {
                this.d.b = this.r.getTextSize();
            }
            mra mraVar = this.d;
            apmg apmgVar2 = auxmVar2.f;
            if (apmgVar2 == null) {
                apmgVar2 = apmg.a;
            }
            apmh apmhVar = apmgVar2.e;
            if (apmhVar == null) {
                apmhVar = apmh.a;
            }
            mraVar.f(apmhVar, this.j.a);
            this.n.post(this.x);
        } else {
            this.d.a(null);
            this.b.setTouchDelegate(null);
        }
        l();
        apzg apzgVar2 = auxmVar.j;
        if (apzgVar2 == null) {
            apzgVar2 = apzg.a;
        }
        String f = ntr.f((ToggleEngagementPanelCommandOuterClass$ToggleEngagementPanelCommand) apzgVar2.qm(ToggleEngagementPanelCommandOuterClass$ToggleEngagementPanelCommand.toggleEngagementPanelCommand));
        this.h = f;
        if (f != null) {
            this.D = this.B.g().c.C(new ayqe() { // from class: net
                @Override // defpackage.ayqe
                public final Object a(Object obj) {
                    aqvq l;
                    ney neyVar = ney.this;
                    nmc nmcVar = (nmc) ((ampq) obj).f();
                    String str = neyVar.h;
                    boolean z = false;
                    if (str != null && nmcVar != null && (l = nmcVar.l()) != null) {
                        z = str.equals(ntr.d(l));
                    }
                    return Boolean.valueOf(z);
                }
            }).n().Z(new ayqb() { // from class: nes
                @Override // defpackage.ayqb
                public final void a(Object obj) {
                    ney neyVar = ney.this;
                    Boolean bool = (Boolean) obj;
                    if (bool.booleanValue() == neyVar.i) {
                        return;
                    }
                    neyVar.i = bool.booleanValue();
                    bno.b(neyVar.b, neyVar.e);
                    neyVar.h();
                }
            });
        }
    }

    @Override // defpackage.nez
    protected final void e() {
        bno.c(this.b);
        this.n.removeCallbacks(this.x);
        auxm auxmVar = (auxm) this.k;
        if (auxmVar != null) {
            auxl auxlVar = auxmVar.m;
            if (auxlVar == null) {
                auxlVar = auxl.a;
            }
            if ((auxlVar.b & 4) != 0) {
                akfw akfwVar = this.g;
                auxl auxlVar2 = auxmVar.m;
                if (auxlVar2 == null) {
                    auxlVar2 = auxl.a;
                }
                akfwVar.g(auxlVar2.e);
            }
        }
        this.h = null;
        aypg aypgVar = this.D;
        if (aypgVar != null) {
            azof.f((AtomicReference) aypgVar);
            this.D = null;
        }
    }

    @Override // defpackage.nez, defpackage.odj
    public final void oT() {
        bno.b(this.b, this.e);
        h();
        m();
        l();
    }

    @Override // defpackage.nez, defpackage.odj
    public final void oU() {
        m();
    }

    public final void h() {
        int i = this.E;
        arag aragVar = null;
        if (i == 0) {
            throw null;
        }
        boolean z = false;
        if (i == 3) {
            auxm auxmVar = (auxm) this.k;
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) this.q.getLayoutParams();
            marginLayoutParams.setMarginEnd(this.m.getResources().getDimensionPixelSize(R.dimen.video_title_margin));
            this.q.setLayoutParams(marginLayoutParams);
            TextView textView = this.q;
            if ((1 & auxmVar.b) != 0 && (aragVar = auxmVar.c) == null) {
                aragVar = arag.a;
            }
            textView.setText(aafv.a(aragVar, this.a, false));
            this.q.setMaxLines(i(false));
            this.c.setVisibility(8);
        } else if (i == 4) {
            n();
            auxm auxmVar2 = (auxm) this.k;
            if ((auxmVar2.b & 1024) != 0) {
                ImageView imageView = this.c;
                ajxz ajxzVar = this.z;
                arhr b = arhr.b(auxmVar2.l);
                if (b == null) {
                    b = arhr.UNKNOWN;
                }
                imageView.setImageResource(ajxzVar.a(b));
            } else {
                auxl auxlVar = auxmVar2.m;
                if (auxlVar == null) {
                    auxlVar = auxl.a;
                }
                if ((auxlVar.b & 2) != 0) {
                    ImageView imageView2 = this.c;
                    ajxz ajxzVar2 = this.z;
                    auxl auxlVar2 = auxmVar2.m;
                    if (auxlVar2 == null) {
                        auxlVar2 = auxl.a;
                    }
                    arhr b2 = arhr.b(auxlVar2.d);
                    if (b2 == null) {
                        b2 = arhr.UNKNOWN;
                    }
                    imageView2.setImageResource(ajxzVar2.a(b2));
                }
            }
            this.c.setContentDescription(this.l.f ? this.w : this.v);
            k();
        } else {
            n();
            if (this.l.f || this.i) {
                z = true;
            }
            this.c.setRotation(true != z ? 360.0f : 180.0f);
            this.c.setContentDescription(z ? this.w : this.v);
            k();
        }
        final auxm auxmVar3 = (auxm) this.k;
        auxl auxlVar3 = auxmVar3.m;
        if (auxlVar3 == null) {
            auxlVar3 = auxl.a;
        }
        if ((auxlVar3.b & 4) == 0) {
            return;
        }
        this.c.post(new Runnable() { // from class: new
            @Override // java.lang.Runnable
            public final void run() {
                ney neyVar = ney.this;
                auxm auxmVar4 = auxmVar3;
                akfw akfwVar = neyVar.g;
                auxl auxlVar4 = auxmVar4.m;
                if (auxlVar4 == null) {
                    auxlVar4 = auxl.a;
                }
                akfwVar.d(auxlVar4.e, neyVar.c);
            }
        });
    }

    private final void m() {
        odl odlVar = this.l;
        if (odlVar == null) {
            return;
        }
        awbn awbnVar = odlVar.j;
        if (awbnVar != null) {
            if (odlVar.f || odlVar.g) {
                if ((awbnVar.b.b & 2) != 0) {
                    zag.m(this.s, ajgl.b(awbnVar.getViewCount()));
                    zag.o(this.r, false);
                    return;
                }
            } else if ((awbnVar.b.b & 4) != 0) {
                zag.m(this.r, ajgl.b(awbnVar.getShortViewCount()));
                zag.o(this.s, false);
                return;
            }
        }
        awbf awbfVar = odlVar.i;
        if (awbfVar == null) {
            auxm auxmVar = (auxm) this.k;
            arag aragVar = null;
            if (odlVar.f || odlVar.g) {
                TextView textView = this.s;
                if ((auxmVar.b & 4) != 0 && (aragVar = auxmVar.e) == null) {
                    aragVar = arag.a;
                }
                zag.m(textView, ajgl.b(aragVar));
                zag.o(this.r, false);
                return;
            }
            TextView textView2 = this.r;
            if ((auxmVar.b & 2) != 0 && (aragVar = auxmVar.d) == null) {
                aragVar = arag.a;
            }
            zag.m(textView2, ajgl.b(aragVar));
            zag.o(this.s, false);
            return;
        }
        TextView textView3 = this.s;
        arag aragVar2 = awbfVar.c;
        if (aragVar2 == null) {
            aragVar2 = arag.a;
        }
        zag.m(textView3, ajgl.b(aragVar2));
        zag.o(this.r, false);
    }
}
