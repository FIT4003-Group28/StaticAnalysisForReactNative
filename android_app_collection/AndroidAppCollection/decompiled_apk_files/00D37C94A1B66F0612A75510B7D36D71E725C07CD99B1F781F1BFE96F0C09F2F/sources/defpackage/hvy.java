package defpackage;

import android.app.Activity;
import android.content.Context;
import android.graphics.Typeface;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.text.Editable;
import android.view.View;
import android.view.ViewGroup;
import android.view.inputmethod.InputMethodManager;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.SeekBar;
import android.widget.TextView;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.google.android.libraries.youtube.edit.ui.RoundedCornersEditText;
import com.google.android.youtube.R;
import com.google.protos.youtube.api.innertube.UserMentionSuggestionsEndpointOuterClass$UserMentionSuggestionsEndpoint;
/* compiled from: PG */
/* renamed from: hvy  reason: default package */
/* loaded from: classes3.dex */
public final class hvy extends aljg implements View.OnClickListener, gtw, hvm {
    public static final /* synthetic */ int s = 0;
    private ImageView A;
    private View B;
    private View C;
    private LinearLayout D;
    private View E;
    private ImageView F;
    private SeekBar G;
    private CoordinatorLayout H;
    private boolean I;

    /* renamed from: J  reason: collision with root package name */
    private boolean f210J;
    private boolean K;
    private axbl L;
    private acti N;
    private boolean O;
    private apzg P;
    private final iia Q;
    private final vne R;
    public final Activity b;
    public final dp c;
    final hwk d;
    final gtx e;
    public final acti g;
    public final akge h;
    public final azpq i;
    public View j;
    public RoundedCornersEditText k;
    public TextView l;
    public boolean m;
    public hvz n;
    public xxe o;
    public actj p;
    public actj q;
    public actj r;
    private final zqw u;
    private final hvx v;
    private final hwh w;
    private final aadd x;
    private View y;
    private View z;
    static final Typeface a = Typeface.create("sans-serif-black", 0);
    private static final axak t = axak.CLASSIC;
    final hwb f = new hwb();
    private axak M = t;

    public hvy(dp dpVar, zqw zqwVar, hwk hwkVar, gtx gtxVar, hvx hvxVar, acti actiVar, aadd aaddVar, hwh hwhVar, akge akgeVar, vne vneVar, iia iiaVar) {
        this.u = zqwVar;
        this.d = hwkVar;
        this.e = gtxVar;
        gtxVar.d = this;
        this.v = hvxVar;
        this.c = dpVar;
        this.b = dpVar.mJ();
        this.g = actiVar;
        this.x = aaddVar;
        this.w = hwhVar;
        this.Q = iiaVar;
        this.h = akgeVar;
        this.R = vneVar;
        this.i = azpq.e();
    }

    private final apzg m(int i) {
        apzg apzgVar = apzg.a;
        acti actiVar = this.N;
        if (actiVar == null || ((acsx) actiVar).i == null) {
            return apzgVar;
        }
        aopa createBuilder = atnp.a.createBuilder();
        String str = ((acsx) this.N).i.a;
        createBuilder.copyOnWrite();
        atnp atnpVar = (atnp) createBuilder.instance;
        str.getClass();
        atnpVar.b |= 1;
        atnpVar.c = str;
        createBuilder.copyOnWrite();
        atnp atnpVar2 = (atnp) createBuilder.instance;
        atnpVar2.b |= 2;
        atnpVar2.d = i;
        aopc aopcVar = (aopc) apzgVar.mo52toBuilder();
        aopcVar.e(atno.b, (atnp) createBuilder.mo39build());
        aopcVar.copyOnWrite();
        apzg apzgVar2 = (apzg) aopcVar.instance;
        apzgVar2.b &= -2;
        apzgVar2.c = apzg.a.c;
        return (apzg) aopcVar.mo39build();
    }

    private final void n(int i) {
        if (i == 5) {
            this.F.setImageDrawable(this.b.getDrawable(2131232513));
            this.E.setContentDescription(this.b.getString(R.string.text_alignment_left));
            this.k.setTextAlignment(5);
            this.D.setGravity(19);
        } else if (i == 6) {
            this.F.setImageDrawable(this.b.getDrawable(2131232514));
            this.E.setContentDescription(this.b.getString(R.string.text_alignment_right));
            this.k.setTextAlignment(6);
            this.D.setGravity(21);
        } else {
            this.F.setImageDrawable(this.b.getDrawable(2131232512));
            this.E.setContentDescription(this.b.getString(R.string.text_alignment_center));
            this.k.setTextAlignment(4);
            this.D.setGravity(17);
        }
    }

    private final void o(int i) {
        this.w.e.setVisibility(i);
        SeekBar seekBar = this.G;
        if (seekBar != null) {
            seekBar.setVisibility(i);
        }
    }

    private final void q(boolean z) {
        this.j.animate().alpha(true != z ? 0.0f : 1.0f).setDuration(250L).setListener(new hvv(this, z)).start();
    }

    private final void r(hwl hwlVar) {
        ImageView imageView = this.A;
        int i = hwlVar.b;
        imageView.setBackgroundResource(i != 0 ? i != 1 ? 2131231348 : 2131231347 : 2131231346);
        View view = this.z;
        Activity activity = this.b;
        int i2 = hwlVar.b;
        view.setContentDescription(activity.getString(i2 != 0 ? i2 != 1 ? R.string.text_background_translucent : R.string.text_background_on : R.string.text_background_off));
    }

    private static final axbl s(axbm axbmVar) {
        if (axbmVar == null) {
            return axbm.j();
        }
        return (axbl) axbmVar.mo52toBuilder();
    }

    @Override // defpackage.hvm
    public final void a(axaj axajVar) {
    }

    @Override // defpackage.aljg
    public final void b(View view, int i) {
        ihz ihzVar;
        axbz axbzVar;
        if (i == 5) {
            zgd.v(this.D, -1, -1);
            o(0);
            if (!this.m || (axbzVar = (ihzVar = (ihz) this.o).m) == null) {
                return;
            }
            ihzVar.d(axbzVar.d, axbzVar.c, axbzVar.e, axbzVar.f);
            ihzVar.m = null;
            return;
        }
        o(8);
        if (i != 2) {
            return;
        }
        zgd.t(this.D, zgd.h(this.H.getHeight() / 2), ViewGroup.LayoutParams.class);
    }

    public final ayoi c() {
        return this.i.R();
    }

    /* JADX WARN: Removed duplicated region for block: B:70:0x0505  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x05c0  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void d() {
        /*
            Method dump skipped, instructions count: 1542
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.hvy.d():void");
    }

    /* JADX WARN: Removed duplicated region for block: B:47:0x01b2  */
    /* JADX WARN: Removed duplicated region for block: B:49:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void e(int r7, defpackage.axak r8, float r9, final java.lang.String r10, final int r11, int r12, final java.util.Collection r13) {
        /*
            Method dump skipped, instructions count: 474
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.hvy.e(int, axak, float, java.lang.String, int, int, java.util.Collection):void");
    }

    public final void f() {
        this.k.setEnabled(false);
        hwk hwkVar = this.d;
        View view = hwkVar.e;
        view.getClass();
        hwkVar.c.getClass();
        hwkVar.f.getClass();
        view.removeOnLayoutChangeListener(hwkVar);
        hwkVar.c.removeOnLayoutChangeListener(hwkVar);
        this.e.a();
        ((InputMethodManager) this.b.getSystemService("input_method")).hideSoftInputFromWindow(this.k.getWindowToken(), 2);
        q(false);
        this.g.t();
        this.v.aK(false);
    }

    public final void g(View view, View view2, View view3, boolean z, boolean z2, boolean z3, acti actiVar) {
        this.j = view;
        this.I = z;
        this.N = actiVar;
        this.O = actiVar != null;
        RoundedCornersEditText roundedCornersEditText = (RoundedCornersEditText) view.findViewById(R.id.add_text_input);
        this.k = roundedCornersEditText;
        if (roundedCornersEditText.a != z2) {
            roundedCornersEditText.a = z2;
            if (z2) {
                roundedCornersEditText.getLayoutParams().width = -1;
            } else {
                roundedCornersEditText.getLayoutParams().width = -2;
            }
            roundedCornersEditText.invalidate();
        }
        view.setOnClickListener(this);
        this.D = (LinearLayout) view.findViewById(R.id.text_input_container);
        this.m = z3;
        arhd a2 = this.x.a();
        if (a2 != null) {
            avyk avykVar = a2.s;
            if (avykVar == null) {
                avykVar = avyk.a;
            }
            this.f210J = avykVar.b;
            avyk avykVar2 = a2.s;
            if (avykVar2 == null) {
                avykVar2 = avyk.a;
            }
            this.K = avykVar2.c;
        }
        if (this.I) {
            View findViewById = view.findViewById(R.id.advanced_text_options_bar);
            this.z = view.findViewById(R.id.advanced_text_background_color_toggle);
            this.A = (ImageView) view.findViewById(R.id.advanced_text_background_color_toggle_image);
            this.E = view.findViewById(R.id.advanced_text_alignment_toggle);
            this.F = (ImageView) view.findViewById(R.id.advanced_text_alignment_toggle_image);
            n(4);
            this.l = (TextView) view.findViewById(R.id.advanced_text_font_toggle);
            findViewById.setVisibility(0);
            View findViewById2 = view.findViewById(R.id.advanced_text_done);
            this.C = findViewById2;
            findViewById2.setOnClickListener(this);
            this.E.setOnClickListener(this);
            this.l.setOnClickListener(this);
            SeekBar seekBar = (SeekBar) view.findViewById(R.id.seekBar);
            this.G = seekBar;
            seekBar.setVisibility(0);
            this.D.setPaddingRelative(0, 0, (int) this.b.getResources().getDimension(R.dimen.advanced_text_seekbar_padding), 0);
            this.G.setOnSeekBarChangeListener(new hvu(this));
            this.f.put((hwb) axak.CLASSIC, (axak) new hwa(R.string.reel_advanced_text_font_classic, ampq.j(Float.valueOf(0.16666667f)), amon.a));
            this.f.put((hwb) axak.LIGHT, (axak) new hwa(R.string.reel_advanced_text_font_light, ampq.j(Float.valueOf(0.1f)), ampq.j("name=Quicksand")));
            this.f.put((hwb) axak.HEAVY, (axak) new hwa(R.string.reel_advanced_text_font_heavy, amon.a, ampq.j("name=Oswald&weight=700")));
            hwb hwbVar = this.f;
            axak axakVar = axak.MARKER;
            Float valueOf = Float.valueOf(0.25f);
            hwbVar.put((hwb) axakVar, (axak) new hwa(R.string.reel_advanced_text_font_marker, ampq.j(valueOf), ampq.j("name=Permanent Marker")));
            this.f.put((hwb) axak.BRUSH, (axak) new hwa(R.string.reel_advanced_text_font_brush, ampq.j(valueOf), ampq.j("name=Pacifico")));
            this.f.put((hwb) axak.TYPEWRITER, (axak) new hwa(R.string.reel_advanced_text_font_typewriter, amon.a, ampq.j("name=Cutive Mono")));
            this.f.b(axak.CLASSIC, a);
            hvz hvzVar = new hvz(this.f, new hvo(this));
            this.n = hvzVar;
            hvzVar.execute(this.b);
            j();
        } else {
            this.z = view.findViewById(R.id.text_background_color_toggle);
            this.A = (ImageView) view.findViewById(R.id.text_background_color_toggle_image);
            this.z.setVisibility(0);
        }
        hwh hwhVar = this.w;
        Activity activity = this.b;
        ViewGroup viewGroup = (ViewGroup) view;
        RoundedCornersEditText roundedCornersEditText2 = this.k;
        boolean z4 = this.K;
        hvp hvpVar = new hvp(this);
        hwhVar.c = activity;
        hwhVar.f = roundedCornersEditText2;
        hwhVar.h = z4;
        hwhVar.i = hvpVar;
        hwhVar.e = (ViewGroup) viewGroup.findViewById(R.id.text_color_picker_holder);
        hwhVar.b.a = z4;
        if (z4) {
            hwhVar.d = (ViewGroup) viewGroup.findViewById(R.id.text_color_picker_paged);
            RecyclerView recyclerView = (RecyclerView) hwhVar.d;
            recyclerView.s = true;
            recyclerView.ag(new LinearLayoutManager(0));
            new hwi().e(recyclerView);
            hwd hwdVar = hwhVar.a;
            hwdVar.f = hwhVar;
            recyclerView.ad(hwdVar);
        } else {
            hwhVar.d = (ViewGroup) viewGroup.findViewById(R.id.text_color_picker);
            hwhVar.d.setOnTouchListener(hwhVar);
        }
        hwhVar.d.setVisibility(0);
        this.y = hwhVar.d;
        this.z.setOnClickListener(this);
        this.B = view3;
        view3.setOnClickListener(this);
        hwk hwkVar = this.d;
        RoundedCornersEditText roundedCornersEditText3 = this.k;
        LinearLayout linearLayout = this.D;
        View view4 = this.y;
        roundedCornersEditText3.getClass();
        hwkVar.c = roundedCornersEditText3;
        linearLayout.getClass();
        hwkVar.d = linearLayout;
        view.getClass();
        hwkVar.e = view;
        view4.getClass();
        hwkVar.f = view4;
        this.e.c(view2);
        if (z3) {
            this.H = (CoordinatorLayout) this.j.findViewById(R.id.reel_add_text_coordinator_layout);
            ViewGroup viewGroup2 = (ViewGroup) this.j.findViewById(R.id.user_mention_suggestions_bottom_sheet);
            viewGroup2.setBackgroundColor(0);
            viewGroup2.findViewById(R.id.user_mention_suggestions_top_bar).setBackgroundColor(zhn.d(this.b, R.attr.ytStaticBrandWhite));
            aopc aopcVar = (aopc) apzg.a.createBuilder();
            aopcVar.e(UserMentionSuggestionsEndpointOuterClass$UserMentionSuggestionsEndpoint.userMentionSuggestionsEndpoint, UserMentionSuggestionsEndpointOuterClass$UserMentionSuggestionsEndpoint.a);
            apzg apzgVar = (apzg) aopcVar.mo39build();
            iia iiaVar = this.Q;
            CoordinatorLayout coordinatorLayout = this.H;
            RoundedCornersEditText roundedCornersEditText4 = this.k;
            acti actiVar2 = this.g;
            avvq avvqVar = avvq.USER_MENTION_AUTO_COMPLETE_SOURCE_STORIES_TEXT_STICKER;
            Context context = (Context) iiaVar.a.get();
            context.getClass();
            iim iimVar = (iim) iiaVar.b.get();
            iimVar.getClass();
            coordinatorLayout.getClass();
            roundedCornersEditText4.getClass();
            viewGroup2.getClass();
            apzgVar.getClass();
            avvqVar.getClass();
            this.o = new ihz(context, iimVar, coordinatorLayout, roundedCornersEditText4, viewGroup2, apzgVar, actiVar2, avvqVar, this);
        }
    }

    public final void h(boolean z) {
        axca axcaVar;
        axbl axblVar = this.L;
        if (axblVar == null) {
            return;
        }
        axbk i = ((axbm) axblVar.instance).i();
        if (i.c == 1) {
            axcaVar = (axca) i.d;
        } else {
            axcaVar = axca.a;
        }
        aopa mo52toBuilder = axcaVar.mo52toBuilder();
        mo52toBuilder.copyOnWrite();
        axca axcaVar2 = (axca) mo52toBuilder.instance;
        axcaVar2.b |= 16384;
        axcaVar2.k = z;
        axca axcaVar3 = (axca) mo52toBuilder.mo39build();
        aopa mo52toBuilder2 = ((axbm) this.L.instance).i().mo52toBuilder();
        mo52toBuilder2.copyOnWrite();
        axbk axbkVar = (axbk) mo52toBuilder2.instance;
        axcaVar3.getClass();
        axbkVar.d = axcaVar3;
        axbkVar.c = 1;
        axbl axblVar2 = this.L;
        axblVar2.copyOnWrite();
        ((axbm) axblVar2.instance).F((axbk) mo52toBuilder2.mo39build());
        this.L = axblVar2;
    }

    public final void i(apzg apzgVar) {
        this.L = s(null);
        if (apzgVar != null) {
            this.P = apzgVar;
        }
        p(true);
    }

    public final void j() {
        if (this.f.get(this.M) != null) {
            ampq ampqVar = ((hwa) this.f.get(this.M)).b;
            if (ampqVar.h()) {
                RoundedCornersEditText roundedCornersEditText = this.k;
                roundedCornersEditText.a((int) (roundedCornersEditText.getTextSize() * ((Float) ampqVar.c()).floatValue()));
                return;
            }
            this.k.a(0);
        }
    }

    @Override // defpackage.aljg
    public final void ms(View view, float f) {
    }

    @Override // defpackage.hvm
    public final void mt(axbm axbmVar) {
        axca axcaVar;
        axbl s2 = s(axbmVar);
        this.L = s2;
        axbk i = ((axbm) s2.instance).i();
        if (i.c == 1) {
            axcaVar = (axca) i.d;
        } else {
            axcaVar = axca.a;
        }
        boolean isEmpty = axcaVar.c.isEmpty();
        if (this.O) {
            apzg apzgVar = null;
            if (isEmpty) {
                actj actjVar = this.r;
                if (actjVar != null) {
                    apzgVar = m(actjVar.II);
                }
                this.P = apzgVar;
            } else {
                actj actjVar2 = this.q;
                if (actjVar2 != null) {
                    apzgVar = m(actjVar2.II);
                }
                this.P = apzgVar;
            }
        }
        p(isEmpty);
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        axca axcaVar;
        if (view != this.B) {
            if (view == this.j || view == this.C) {
                d();
                return;
            }
            boolean z = false;
            int i = 0;
            if (view == this.z) {
                h(false);
                hwh hwhVar = this.w;
                hwl hwlVar = hwhVar.b;
                int i2 = hwlVar.b;
                if (i2 == 0) {
                    hwlVar.b = 1;
                } else if (i2 != 1) {
                    hwlVar.b = 0;
                } else {
                    if (true == hwlVar.a) {
                        i = 2;
                    }
                    hwlVar.b = i;
                }
                hwhVar.b(hwhVar.g);
                r(hwhVar.b);
                return;
            } else if (view == this.E) {
                h(false);
                Editable text = this.k.getText();
                if (this.k.getTextAlignment() == 4) {
                    n(5);
                } else if (this.k.getTextAlignment() == 5) {
                    n(6);
                } else {
                    n(4);
                }
                this.k.setText(text);
                this.k.setSelection(text.length());
                return;
            } else if (view != this.l) {
                return;
            } else {
                h(false);
                if (this.L == null) {
                    return;
                }
                axak axakVar = t;
                amuk o = amuk.o(this.f.keySet());
                int indexOf = o.indexOf(this.M);
                if (this.f.size() != 0) {
                    z = true;
                }
                aqxo.z(z, "Fonts not initialized");
                for (int size = (indexOf + 1) % o.size(); size != indexOf; size = (size + 1) % o.size()) {
                    axakVar = (axak) o.get(size);
                    if (this.f.a(axakVar) != null) {
                        break;
                    }
                }
                if (this.f.get(axakVar) == null) {
                    zep.c("AddTextController", "fontMap.get(newFont) is null. Using default font.");
                    axakVar = t;
                }
                this.k.setTypeface(this.f.a(axakVar));
                this.l.setText(((hwa) this.f.get(axakVar)).a);
                axbk i3 = ((axbm) this.L.instance).i();
                if (i3.c == 1) {
                    axcaVar = (axca) i3.d;
                } else {
                    axcaVar = axca.a;
                }
                aopa mo52toBuilder = axcaVar.mo52toBuilder();
                mo52toBuilder.copyOnWrite();
                axca axcaVar2 = (axca) mo52toBuilder.instance;
                axcaVar2.i = axakVar.h;
                axcaVar2.b |= 512;
                axca axcaVar3 = (axca) mo52toBuilder.mo39build();
                axbl axblVar = this.L;
                aopa mo52toBuilder2 = ((axbm) axblVar.instance).i().mo52toBuilder();
                mo52toBuilder2.copyOnWrite();
                axbk axbkVar = (axbk) mo52toBuilder2.instance;
                axcaVar3.getClass();
                axbkVar.d = axcaVar3;
                axbkVar.c = 1;
                axblVar.copyOnWrite();
                ((axbm) axblVar.instance).F((axbk) mo52toBuilder2.mo39build());
                this.M = axakVar;
                j();
                return;
            }
        }
        if (!this.O) {
            this.g.H(3, new acte(acuo.b(37172)), null);
        } else {
            actj actjVar = this.p;
            this.P = actjVar != null ? m(actjVar.II) : null;
        }
        i(null);
    }

    private final void p(boolean z) {
        axca axcaVar;
        int i;
        if (z && this.f210J) {
            ylx.b(this.c, this.R.a(), new hvs(this));
            return;
        }
        axbl axblVar = this.L;
        if (axblVar == null) {
            return;
        }
        axbk i2 = ((axbm) axblVar.instance).i();
        if (i2.c == 1) {
            axcaVar = (axca) i2.d;
        } else {
            axcaVar = axca.a;
        }
        awzo b = awzo.b(axcaVar.h);
        if (b == null) {
            b = awzo.ALIGN_HORIZONTAL_UNSPECIFIED;
        }
        if (b == awzo.ALIGN_LEFT) {
            i = 5;
        } else {
            i = b == awzo.ALIGN_RIGHT ? 6 : 4;
        }
        axak b2 = axak.b(axcaVar.i);
        if (b2 == null) {
            b2 = axak.FONT_FAMILY_UNSPECIFIED;
        }
        axak axakVar = b2;
        float f = axcaVar.j;
        String str = axcaVar.c;
        aotk aotkVar = axcaVar.e;
        if (aotkVar == null) {
            aotkVar = aotk.a;
        }
        int h = hqs.h(aotkVar);
        aotk aotkVar2 = axcaVar.f;
        if (aotkVar2 == null) {
            aotkVar2 = aotk.a;
        }
        e(i, axakVar, f, str, h, hqs.h(aotkVar2), axcaVar.l);
    }
}
