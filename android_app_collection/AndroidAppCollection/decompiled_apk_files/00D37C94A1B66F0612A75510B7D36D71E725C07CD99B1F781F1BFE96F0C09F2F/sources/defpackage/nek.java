package defpackage;

import android.content.Context;
import android.os.Handler;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.google.android.youtube.R;
import com.google.protos.youtube.api.innertube.SlimVideoMetadataRendererOuterClass;
/* compiled from: PG */
/* renamed from: nek  reason: default package */
/* loaded from: classes3.dex */
public final class nek extends nez {
    public final ViewGroup a;
    public final ViewGroup b;
    public final LinearLayout c;
    public final LinearLayout d;
    public boolean e = false;
    public final bnr f;
    public final aafo g;
    private final ajsa h;
    private final ajmy i;
    private final ViewGroup m;
    private final TextView n;
    private final TextView o;
    private final TextView p;
    private final ImageView q;
    private final View r;
    private final bnk s;
    private final Handler t;
    private final aagi u;
    private final aypf v;

    public nek(Handler handler, Context context, ajsa ajsaVar, aafo aafoVar, ajmy ajmyVar, aagi aagiVar) {
        this.g = aafoVar;
        this.t = handler;
        this.h = ajsaVar;
        this.i = ajmyVar;
        this.u = aagiVar;
        ViewGroup viewGroup = (ViewGroup) LayoutInflater.from(context).inflate(R.layout.slim_channel_metadata, (ViewGroup) null);
        this.a = viewGroup;
        this.m = (ViewGroup) viewGroup.findViewById(R.id.container);
        this.b = (ViewGroup) viewGroup.findViewById(R.id.inner_container);
        this.n = (TextView) viewGroup.findViewById(R.id.header_text);
        this.r = viewGroup.findViewById(R.id.expansion_icon);
        this.d = (LinearLayout) viewGroup.findViewById(R.id.slim_owners_container_for_expanded);
        this.c = (LinearLayout) viewGroup.findViewById(R.id.container_for_collapsed);
        this.q = (ImageView) viewGroup.findViewById(R.id.channel_owner_avatar);
        this.o = (TextView) viewGroup.findViewById(R.id.channel_name);
        this.p = (TextView) viewGroup.findViewById(R.id.collapsed_label);
        ((ViewGroup) viewGroup.findViewById(R.id.container_for_navigation_when_collapsed)).setOnClickListener(new neg(this));
        bnr bnrVar = new bnr();
        fqs fqsVar = new fqs();
        fqsVar.y(R.id.container);
        bnrVar.f(fqsVar);
        bne bneVar = new bne();
        bneVar.y(R.id.container_for_collapsed);
        bneVar.y(R.id.slim_owners_container_for_expanded);
        bnrVar.f(bneVar);
        frd frdVar = new frd();
        frdVar.y(R.id.expansion_icon);
        bnrVar.f(frdVar);
        this.s = bnrVar;
        bnr bnrVar2 = new bnr();
        fqs fqsVar2 = new fqs();
        fqsVar2.y(R.id.slim_owners_transition_container_for_expanded);
        fqsVar2.y(R.id.container);
        bnrVar2.f(fqsVar2);
        bnr bnrVar3 = new bnr(null);
        bnrVar3.K();
        bnrVar2.f(bnrVar3);
        bnrVar2.C(400L);
        this.f = bnrVar2;
        this.v = new aypf();
    }

    private final void h() {
        while (this.d.getChildCount() > 0) {
            View childAt = this.d.getChildAt(0);
            this.d.removeView(childAt);
            akel.j(childAt, this.h);
        }
    }

    private final boolean i() {
        auwu auwuVar = (auwu) this.k;
        return auwuVar.c && (auwuVar.b & 4) != 0;
    }

    @Override // defpackage.ajru
    public final View a() {
        return this.a;
    }

    @Override // defpackage.nez
    protected final void d() {
        this.j.a.u(new acte(((auwu) this.k).g), null);
        acti actiVar = this.j.a;
        actiVar.D(new acte(actj.SLIM_CHANNEL_METADATA_RENDERER_EXPAND_ELEMENTS));
        actiVar.D(new acte(actj.SLIM_CHANNEL_METADATA_RENDERER_COLLAPSE_ICON));
        auwu auwuVar = (auwu) this.k;
        if ((auwuVar.b & 2) == 0) {
            this.n.setVisibility(8);
        } else {
            TextView textView = this.n;
            arag aragVar = auwuVar.d;
            if (aragVar == null) {
                aragVar = arag.a;
            }
            textView.setText(ajgl.b(aragVar));
            this.n.setVisibility(0);
        }
        auwu auwuVar2 = (auwu) this.k;
        if ((auwuVar2.b & 1) == 0 || !auwuVar2.c) {
            f(true);
        } else {
            f(false);
        }
        if (i()) {
            this.m.setOnClickListener(new neg(this, 1));
        } else {
            this.m.setOnClickListener(null);
            this.m.setClickable(false);
        }
        auwu auwuVar3 = (auwu) this.k;
        if (!auwuVar3.c) {
            auww auwwVar = auwuVar3.e;
            if (auwwVar == null) {
                auwwVar = auww.a;
            }
            for (aunb aunbVar : auwwVar.b) {
                if (aunbVar.qn(SlimVideoMetadataRendererOuterClass.slimOwnerRenderer)) {
                    auxc auxcVar = (auxc) aunbVar.qm(SlimVideoMetadataRendererOuterClass.slimOwnerRenderer);
                    auxd auxdVar = auxcVar.p;
                    if (auxdVar == null) {
                        auxdVar = auxd.a;
                    }
                    if ((auxdVar.b & 1) != 0) {
                        auxd auxdVar2 = auxcVar.p;
                        if (auxdVar2 == null) {
                            auxdVar2 = auxd.a;
                        }
                        this.v.d(this.u.c().h(auxdVar2.c, true).I(kth.p).V(lyd.p).k(apjp.class).X(aypa.a()).as(new ayqb() { // from class: neh
                            @Override // defpackage.ayqb
                            public final void a(Object obj) {
                                boolean z;
                                nek nekVar = nek.this;
                                apjp apjpVar = (apjp) obj;
                                String d = apjpVar.d();
                                apjr visibilityState = apjpVar.getVisibilityState();
                                bno.b(nekVar.a, nekVar.f);
                                int i = 8;
                                int i2 = visibilityState == apjr.AUTOTAG_VISIBILITY_STATE_VISIBLE ? 0 : 8;
                                View findViewWithTag = nekVar.d.findViewWithTag(d);
                                if (findViewWithTag != null) {
                                    findViewWithTag.setVisibility(i2);
                                }
                                int i3 = 0;
                                while (true) {
                                    if (i3 >= nekVar.d.getChildCount()) {
                                        z = true;
                                        break;
                                    } else if (nekVar.d.getChildAt(i3).getVisibility() == 0) {
                                        z = false;
                                        break;
                                    } else {
                                        i3++;
                                    }
                                }
                                ViewGroup viewGroup = nekVar.b;
                                if (true != z) {
                                    i = 0;
                                }
                                viewGroup.setVisibility(i);
                            }
                        }));
                    }
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.nez
    public final void e() {
        bno.c(this.a);
        this.i.e(this.q);
        h();
        this.v.c();
    }

    /* JADX WARN: Removed duplicated region for block: B:68:0x0148  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void f(boolean r10) {
        /*
            Method dump skipped, instructions count: 377
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.nek.f(boolean):void");
    }
}
