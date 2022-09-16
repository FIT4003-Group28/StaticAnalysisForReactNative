package defpackage;

import android.content.Context;
import android.graphics.Rect;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.google.android.apps.youtube.app.watch.panel.ui.DefaultWatchPanelViewController;
import com.google.android.youtube.R;
import com.google.protos.youtube.api.innertube.ButtonRendererOuterClass;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
/* compiled from: PG */
/* renamed from: muh  reason: default package */
/* loaded from: classes3.dex */
public final class muh extends ajsl {
    public final aafo a;
    public final oet b;
    public final mun c;
    public final aagi d;
    public arbb e;
    public final View f;
    private final LayoutInflater g;
    private final mtz h;
    private final mue i;
    private acti j;
    private final TextView k;
    private final LinearLayout l;
    private final LinearLayout m;
    private final TextView n;
    private final Button o;
    private final Button p;
    private final Button q;
    private final Button r;
    private final List s;
    private final ViewGroup t;

    public muh(Context context, aafo aafoVar, oet oetVar, mun munVar, aagi aagiVar, mtz mtzVar, mue mueVar) {
        LayoutInflater from = LayoutInflater.from(context);
        this.g = from;
        this.a = aafoVar;
        this.b = oetVar;
        this.c = munVar;
        this.d = aagiVar;
        this.h = mtzVar;
        this.i = mueVar;
        View inflate = from.inflate(R.layout.formfill_form, (ViewGroup) null, false);
        this.f = inflate;
        this.l = (LinearLayout) inflate.findViewById(R.id.prefill_communication_container);
        this.k = (TextView) inflate.findViewById(R.id.instructions);
        this.m = (LinearLayout) inflate.findViewById(R.id.input_fields);
        this.n = (TextView) inflate.findViewById(R.id.disclaimer);
        Button button = (Button) inflate.findViewById(R.id.close_button);
        this.o = button;
        Button button2 = (Button) inflate.findViewById(R.id.submit_button);
        this.p = button2;
        Button button3 = (Button) inflate.findViewById(R.id.pre_submit_button);
        this.q = button3;
        Button button4 = (Button) inflate.findViewById(R.id.primary_cta_button);
        this.r = button4;
        this.s = Arrays.asList(button2, button3, button4);
        this.t = (ViewGroup) inflate.findViewById(R.id.lockup_holder);
        button.setOnClickListener(new mug(this, 1));
        button2.setOnClickListener(new mug(this, 2));
        button3.setOnClickListener(new View.OnClickListener() { // from class: muf
            /* JADX WARN: Removed duplicated region for block: B:40:0x012f  */
            /* JADX WARN: Removed duplicated region for block: B:46:0x0149  */
            @Override // android.view.View.OnClickListener
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final void onClick(android.view.View r17) {
                /*
                    Method dump skipped, instructions count: 391
                    To view this dump add '--comments-level debug' option
                */
                throw new UnsupportedOperationException("Method not decompiled: defpackage.muf.onClick(android.view.View):void");
            }
        });
        button4.setOnClickListener(new mug(this));
    }

    private final void k(aunb aunbVar, Button button) {
        arag aragVar;
        apoj apojVar = (apoj) aunbVar.qm(ButtonRendererOuterClass.buttonRenderer);
        button.setVisibility(0);
        for (Button button2 : this.s) {
            if (!button2.equals(button)) {
                button2.setVisibility(8);
            }
        }
        if ((apojVar.b & 256) != 0) {
            aragVar = apojVar.i;
            if (aragVar == null) {
                aragVar = arag.a;
            }
        } else {
            aragVar = null;
        }
        button.setText(ajgl.b(aragVar));
        this.j.u(new acte(apojVar.t), null);
    }

    @Override // defpackage.ajru
    public final View a() {
        return this.f;
    }

    /* JADX WARN: Removed duplicated region for block: B:259:0x0508 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:263:0x03c5 A[SYNTHETIC] */
    @Override // defpackage.ajsl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    protected final /* bridge */ /* synthetic */ void d(defpackage.ajrs r19, java.lang.Object r20) {
        /*
            Method dump skipped, instructions count: 1304
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.muh.d(ajrs, java.lang.Object):void");
    }

    @Override // defpackage.ajsl
    protected final /* bridge */ /* synthetic */ byte[] e(Object obj) {
        return ((arbb) obj).o.I();
    }

    public final RecyclerView f() {
        nml nmlVar = ((DefaultWatchPanelViewController) this.b.a).e;
        return (RecyclerView) nmlVar.b(nmlVar.i()).oX().findViewById(R.id.results);
    }

    public final void g(apoj apojVar, boolean z) {
        Map map;
        if ((apojVar.b & 16384) != 0) {
            if (z) {
                arbb arbbVar = this.e;
                mun munVar = this.c;
                aopa createBuilder = asjj.a.createBuilder();
                asjg asjgVar = asjg.a;
                asip asipVar = asip.a;
                for (mum mumVar : munVar.c) {
                    asjgVar = mumVar.a.c(asjgVar);
                    asipVar = mumVar.a.b(asipVar);
                }
                aopa createBuilder2 = asit.a.createBuilder();
                createBuilder2.copyOnWrite();
                asit asitVar = (asit) createBuilder2.instance;
                asipVar.getClass();
                asitVar.d = asipVar;
                asitVar.c = 6;
                createBuilder.copyOnWrite();
                asjj asjjVar = (asjj) createBuilder.instance;
                asit asitVar2 = (asit) createBuilder2.mo39build();
                asitVar2.getClass();
                asjjVar.t = asitVar2;
                asjjVar.c |= 1024;
                createBuilder.copyOnWrite();
                asjj asjjVar2 = (asjj) createBuilder.instance;
                asjgVar.getClass();
                asjjVar2.n = asjgVar;
                asjjVar2.b |= 131072;
                map = actk.g(arbbVar, (asjj) createBuilder.mo39build());
            } else {
                map = null;
            }
            aafo aafoVar = this.a;
            apzg apzgVar = apojVar.o;
            if (apzgVar == null) {
                apzgVar = apzg.a;
            }
            aafoVar.c(apzgVar, map);
        }
    }

    public final void h(apoj apojVar) {
        if ((apojVar.b & 8192) != 0) {
            Map h = actk.h(this.e, false);
            h.put("FORM_RESULTS_ARG", this.c.a());
            mun munVar = this.c;
            ArrayList arrayList = new ArrayList();
            for (mum mumVar : munVar.c) {
                if (mumVar.a.h()) {
                    arbc arbcVar = mumVar.b;
                    if ((arbcVar.b & 8) != 0) {
                        apzg apzgVar = arbcVar.f;
                        if (apzgVar == null) {
                            apzgVar = apzg.a;
                        }
                        arrayList.add(apzgVar);
                    }
                }
            }
            h.put("SUBMIT_COMMANDS_ARG", arrayList);
            aafo aafoVar = this.a;
            apzg apzgVar2 = apojVar.n;
            if (apzgVar2 == null) {
                apzgVar2 = apzg.a;
            }
            aafoVar.c(apzgVar2, h);
        }
    }

    public final boolean j(final RecyclerView recyclerView, apoj apojVar) {
        mun munVar = this.c;
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        final View view = null;
        boolean z = false;
        for (mum mumVar : munVar.c) {
            muj mujVar = mumVar.a;
            mui e = mujVar.e(mumVar.b.e);
            mujVar.g(!e.a);
            if (!e.a) {
                arbc arbcVar = mumVar.b;
                if ((arbcVar.b & 16) != 0) {
                    apzg apzgVar = arbcVar.g;
                    if (apzgVar == null) {
                        apzgVar = apzg.a;
                    }
                    arrayList.add(apzgVar);
                }
                apzg apzgVar2 = e.b;
                if (apzgVar2 != null) {
                    arrayList.add(apzgVar2);
                }
                asir asirVar = e.c;
                if (asirVar != null) {
                    arrayList2.add(asirVar);
                }
                if (view == null) {
                    view = mujVar.a();
                }
                z = true;
            }
        }
        if (view != null) {
            view.requestFocus();
            if (recyclerView != null) {
                recyclerView.postDelayed(new Runnable() { // from class: muk
                    @Override // java.lang.Runnable
                    public final void run() {
                        View view2 = view;
                        RecyclerView recyclerView2 = recyclerView;
                        Rect rect = new Rect();
                        view2.getDrawingRect(rect);
                        recyclerView2.offsetDescendantRectToMyCoords(view2, rect);
                        recyclerView2.aj(0, rect.top);
                    }
                }, 100L);
            }
        }
        mul mulVar = new mul(!z, amuk.o(arrayList), amuk.o(arrayList2));
        boolean z2 = mulVar.a;
        if (!z2) {
            this.a.d(mulVar.b, null);
            aafo aafoVar = this.a;
            apzg apzgVar3 = this.e.p;
            if (apzgVar3 == null) {
                apzgVar3 = apzg.a;
            }
            aafoVar.c(apzgVar3, null);
            if (this.j != null && !mulVar.c.isEmpty()) {
                acti actiVar = this.j;
                acte acteVar = new acte(apojVar.t);
                amuk amukVar = mulVar.c;
                aopa createBuilder = asjj.a.createBuilder();
                aopa createBuilder2 = asit.a.createBuilder();
                aopa createBuilder3 = asis.a.createBuilder();
                createBuilder3.ao(amukVar);
                createBuilder2.copyOnWrite();
                asit asitVar = (asit) createBuilder2.instance;
                asis asisVar = (asis) createBuilder3.mo39build();
                asisVar.getClass();
                asitVar.d = asisVar;
                asitVar.c = 1;
                createBuilder.copyOnWrite();
                asjj asjjVar = (asjj) createBuilder.instance;
                asit asitVar2 = (asit) createBuilder2.mo39build();
                asitVar2.getClass();
                asjjVar.t = asitVar2;
                asjjVar.c |= 1024;
                actiVar.H(3, acteVar, (asjj) createBuilder.mo39build());
                return false;
            }
        }
        return z2;
    }

    @Override // defpackage.ajru
    public final void qZ(ajsa ajsaVar) {
        mun munVar = this.c;
        munVar.c.clear();
        munVar.f.removeAllViews();
        ViewGroup viewGroup = this.h.c;
        if (viewGroup != null) {
            viewGroup.removeAllViews();
        }
        ViewGroup viewGroup2 = this.i.c;
        if (viewGroup2 != null) {
            viewGroup2.removeAllViews();
        }
    }
}
