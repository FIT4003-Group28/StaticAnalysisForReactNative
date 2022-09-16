package defpackage;

import android.app.Activity;
import android.support.v7.widget.RecyclerView;
import android.text.TextUtils;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import com.google.android.apps.youtube.app.common.ui.OverScrollLinearLayoutManager;
import com.google.android.libraries.youtube.innertube.model.WatchNextResponseModel;
import com.google.android.libraries.youtube.player.model.PlaybackStartDescriptor;
import com.google.android.libraries.youtube.rendering.ui.widget.loadingframe.LoadingFrameLayout;
import com.google.android.youtube.R;
/* compiled from: PG */
/* renamed from: ocv  reason: default package */
/* loaded from: classes3.dex */
public final class ocv implements ocr, oeh, oej {
    private final Activity a;
    private final ocz b;
    private final oeg c;
    private final acti d;
    private final oer e;
    private final oek f;
    private final aadd g;
    private final LoadingFrameLayout h;
    private final TextView i;
    private final TextView j;
    private final ImageView k;
    private final View l;
    private final boolean m;
    private boolean n;
    private String o;
    private int p;
    private String q;
    private audg r;
    private oeq s;
    private jo t;
    private jo u;

    public ocv(Activity activity, ocz oczVar, oer oerVar, aacz aaczVar, oek oekVar, oei oeiVar, aadd aaddVar, final oeg oegVar, View view, View view2, acti actiVar) {
        this.a = activity;
        this.e = oerVar;
        this.b = oczVar;
        this.m = eog.aL(aaczVar);
        this.f = oekVar;
        this.c = oegVar;
        this.g = aaddVar;
        this.d = actiVar;
        this.l = view;
        this.i = (TextView) view.findViewById(R.id.set_title);
        this.j = (TextView) view.findViewById(R.id.set_subtitle);
        this.k = (ImageView) view.findViewById(R.id.set_expand_button);
        view.setOnClickListener(new View.OnClickListener() { // from class: ocs
            @Override // android.view.View.OnClickListener
            public final void onClick(View view3) {
                ocv.this.f(!oegVar.k(4), true);
            }
        });
        this.h = (LoadingFrameLayout) view2;
        this.n = false;
        oczVar.a(this);
        oeiVar.a(this);
        if (i()) {
            this.t = new oct(activity);
            this.u = new ocu(activity);
        }
        oekVar.a(this);
    }

    private final void g() {
        if (!this.n) {
            return;
        }
        oeq oeqVar = this.s;
        if (oeqVar != null) {
            oeqVar.c(null);
        }
        this.h.c();
        this.i.setText((CharSequence) null);
        this.j.setText((CharSequence) null);
        this.j.setVisibility(8);
    }

    private final void h(CharSequence charSequence) {
        this.j.setText(charSequence);
        if (TextUtils.isEmpty(charSequence)) {
            this.j.setVisibility(8);
        } else {
            this.j.setVisibility(0);
        }
    }

    private final boolean i() {
        arhd a = this.g.a();
        if (a != null) {
            asxp asxpVar = a.e;
            if (asxpVar == null) {
                asxpVar = asxp.a;
            }
            return asxpVar.T;
        }
        return false;
    }

    private static boolean l(audg audgVar) {
        return !adwa.a(audgVar.k);
    }

    @Override // defpackage.oej
    public final void a(boolean z) {
        if (i()) {
            jo joVar = z ? this.t : this.u;
            if (joVar == null) {
                return;
            }
            lj.M(this.l, joVar);
        }
    }

    final void b() {
        this.c.c(2);
        this.f.b();
    }

    @Override // defpackage.ocr
    public final void c() {
        b();
    }

    @Override // defpackage.ocr
    public final /* synthetic */ void d() {
    }

    @Override // defpackage.ocr
    public final void e(WatchNextResponseModel watchNextResponseModel) {
        CharSequence c;
        arag aragVar;
        if (TextUtils.isEmpty(this.q) || TextUtils.isEmpty(watchNextResponseModel.b) || this.q.equals(watchNextResponseModel.b)) {
            audg audgVar = watchNextResponseModel.g;
            this.r = audgVar;
            if (audgVar == null || !l(audgVar)) {
                b();
                return;
            }
            boolean z = true;
            if (!this.n) {
                RecyclerView recyclerView = (RecyclerView) this.h.findViewById(R.id.set_list);
                OverScrollLinearLayoutManager overScrollLinearLayoutManager = new OverScrollLinearLayoutManager(null);
                overScrollLinearLayoutManager.ab(1);
                recyclerView.ag(overScrollLinearLayoutManager);
                recyclerView.setNestedScrollingEnabled(this.m);
                oer oerVar = this.e;
                acti actiVar = this.d;
                yni yniVar = (yni) oerVar.a.get();
                yniVar.getClass();
                aafo aafoVar = (aafo) oerVar.b.get();
                aafoVar.getClass();
                abeb abebVar = (abeb) oerVar.c.get();
                abebVar.getClass();
                yzj yzjVar = (yzj) oerVar.d.get();
                yzjVar.getClass();
                ajsg ajsgVar = (ajsg) oerVar.e.get();
                ajsgVar.getClass();
                ajsi ajsiVar = (ajsi) oerVar.f.get();
                ajsiVar.getClass();
                oeq oeqVar = new oeq(yniVar, aafoVar, abebVar, yzjVar, ajsgVar, ajsiVar, actiVar);
                this.s = oeqVar;
                oeqVar.f(recyclerView);
                this.s.d(this.h);
                this.j.setVisibility(8);
                this.n = true;
                g();
            }
            audg audgVar2 = this.r;
            String str = audgVar2.g;
            aaks aaksVar = watchNextResponseModel.h;
            this.i.setText(zgh.d(str));
            if (audgVar2 == null) {
                h(null);
                this.s.c(null);
            } else {
                if (aaksVar == null || (!aaksVar.c() && !aaksVar.d())) {
                    c = ohn.c(audgVar2);
                } else {
                    CharSequence[] charSequenceArr = new CharSequence[2];
                    if ((audgVar2.c & 128) != 0) {
                        aragVar = audgVar2.n;
                        if (aragVar == null) {
                            aragVar = arag.a;
                        }
                    } else {
                        aragVar = null;
                    }
                    charSequenceArr[0] = ajgl.b(aragVar);
                    charSequenceArr[1] = ohn.c(audgVar2);
                    c = ajgl.k(null, charSequenceArr);
                }
                h(c);
                this.s.c(new mfc(audgVar2, aaksVar));
            }
            this.s.e(this.r);
            audg audgVar3 = watchNextResponseModel.g;
            if (audgVar3 == null || audgVar3.i.size() == 0) {
                this.h.c();
            }
            boolean k = this.c.k(4);
            int ce = awwc.ce(this.r.w);
            if (ce == 0) {
                ce = 1;
            }
            int i = ce - 1;
            if (i != 2) {
                z = i != 3 ? k : false;
            }
            if (!this.b.c()) {
                return;
            }
            f(z, false);
        }
    }

    public final void f(boolean z, boolean z2) {
        this.c.f(2);
        if (z) {
            this.f.c(true);
        } else {
            this.f.b();
        }
        float f = true != z ? 360.0f : 180.0f;
        if (z2) {
            this.k.animate().rotation(f).start();
        } else {
            this.k.setRotation(f);
        }
    }

    @Override // defpackage.ocr
    public final void j(fgh fghVar) {
        if (fghVar == null) {
            return;
        }
        PlaybackStartDescriptor a = fghVar.a();
        this.q = a.l();
        String k = a.k();
        int a2 = a.a();
        if (!TextUtils.equals(this.o, k)) {
            this.r = null;
            if (TextUtils.isEmpty(k)) {
                b();
            }
            g();
            oeq oeqVar = this.s;
            if (oeqVar != null) {
                oeqVar.a();
            }
        } else if (this.p == a2) {
            return;
        } else {
            if (this.n) {
                asxp asxpVar = this.g.a().e;
                if (asxpVar == null) {
                    asxpVar = asxp.a;
                }
                if (asxpVar.Z) {
                    oeq oeqVar2 = this.s;
                    String l = a.l();
                    ajsm ajsmVar = oeqVar2.e;
                    if (oeqVar2.g && !akzj.f(oeqVar2.d.a, l) && ajsmVar != null) {
                        oeqVar2.d.a(l);
                        Integer num = (Integer) oeqVar2.b.get(l);
                        if (num != null && num.intValue() >= 0 && num.intValue() < ajsmVar.size() && (ajsmVar.get(num.intValue()) instanceof audk)) {
                            oeqVar2.b(num.intValue(), true);
                        }
                    }
                } else {
                    this.h.c();
                }
            }
        }
        this.o = k;
        this.p = a2;
    }

    @Override // defpackage.oeh
    public final void k() {
        if (this.n) {
            this.h.c();
        }
    }

    @Override // defpackage.ocy
    public final void pm(boolean z) {
        audg audgVar;
        if (!z || (audgVar = this.r) == null || !l(audgVar)) {
            b();
        } else {
            f(this.c.k(4), true);
        }
    }
}
