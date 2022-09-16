package defpackage;

import android.content.Context;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.DisplayMetrics;
import android.view.View;
import android.widget.TextView;
import com.google.android.libraries.youtube.rendering.ui.widget.loadingframe.LoadingFrameLayout;
import com.google.android.youtube.R;
import com.google.protos.youtube.api.innertube.ButtonRendererOuterClass;
import java.util.Map;
import java.util.concurrent.Executor;
/* compiled from: PG */
/* renamed from: kpz  reason: default package */
/* loaded from: classes3.dex */
public final class kpz implements ynl {
    public final yzj a;
    public final Context b;
    public final acth c;
    public final aadd d;
    public final akbm e;
    public final akbm f;
    public final LoadingFrameLayout g;
    public final View h;
    public final TextView i;
    public final TextView j;
    public final TextView k;
    public final ajzq l;
    public final kpy m;
    public final yni n;
    private final azqb o;
    private final Executor p;
    private final RecyclerView q;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r9v0, types: [java.lang.Object, ajsa] */
    public kpz(azqb azqbVar, yzj yzjVar, Context context, Executor executor, akbn akbnVar, ajyi ajyiVar, akar akarVar, gew gewVar, yni yniVar, tdu tduVar, acth acthVar, LoadingFrameLayout loadingFrameLayout, kpy kpyVar, aadd aaddVar) {
        this.o = azqbVar;
        this.a = yzjVar;
        this.b = context;
        this.p = executor;
        this.c = acthVar;
        this.g = loadingFrameLayout;
        loadingFrameLayout.f(new akgj() { // from class: kpx
            @Override // defpackage.akgj
            public final void qX() {
                kpz.this.a();
            }
        });
        this.h = loadingFrameLayout.findViewById(R.id.suggested_videos_header);
        TextView textView = (TextView) loadingFrameLayout.findViewById(R.id.close_button);
        this.j = textView;
        this.e = akbnVar.a(textView);
        TextView textView2 = (TextView) loadingFrameLayout.findViewById(R.id.next_button);
        this.k = textView2;
        this.f = akbnVar.a(textView2);
        this.i = (TextView) loadingFrameLayout.findViewById(R.id.title);
        RecyclerView recyclerView = (RecyclerView) loadingFrameLayout.findViewById(R.id.suggested_videos_list);
        this.q = recyclerView;
        recyclerView.ag(new LinearLayoutManager());
        kqr kqrVar = (kqr) acthVar;
        this.l = gewVar.a(null, null, recyclerView, (aari) azqbVar.get(), akarVar.a((aari) azqbVar.get(), kqrVar.ag), kqrVar.ag, ajyiVar.get(), akai.Ws, ajzs.d, ajkb.SUGGESTED_PLAYLIST, tduVar, context);
        this.n = yniVar;
        this.m = kpyVar;
        this.d = aaddVar;
    }

    public final void a() {
        this.g.c();
        this.h.setVisibility(8);
        abax f = ((abaz) this.o.get()).f();
        f.i();
        ylx.k(((abaz) this.o.get()).g.b(f, this.p), anjk.a, new ylv() { // from class: kpu
            @Override // defpackage.zdt
            /* renamed from: b */
            public final void a(Throwable th) {
                kpz kpzVar = kpz.this;
                zep.d("Error requesting suggested playlist videos.", th);
                kpzVar.g.b(kpzVar.a.b(th), true);
            }
        }, new ylw() { // from class: kpv
            @Override // defpackage.ylw, defpackage.zdt
            public final void a(Object obj) {
                final kpz kpzVar = kpz.this;
                aruh aruhVar = (aruh) obj;
                aruf arufVar = aruhVar.d;
                if (arufVar == null) {
                    arufVar = aruf.a;
                }
                int i = 0;
                if ((arufVar.b & 1) == 0) {
                    kpzVar.g.b(kpzVar.b.getString(R.string.error_generic), false);
                    return;
                }
                kpzVar.g.a();
                kpzVar.h.setVisibility(0);
                if ((aruhVar.b & 8) != 0) {
                    ((acsx) ((kqr) kpzVar.c).ag).D(new acte(aruhVar.f.I()));
                }
                aruf arufVar2 = aruhVar.d;
                if (arufVar2 == null) {
                    arufVar2 = aruf.a;
                }
                auqh auqhVar = arufVar2.c;
                if (auqhVar == null) {
                    auqhVar = auqh.a;
                }
                auqg auqgVar = auqhVar.g;
                if (auqgVar == null) {
                    auqgVar = auqg.a;
                }
                if (auqgVar == null || auqgVar.b != 222895468) {
                    kpzVar.h.setVisibility(8);
                } else {
                    ardr ardrVar = (ardr) auqgVar.c;
                    aunb aunbVar = ardrVar.d;
                    if (aunbVar == null) {
                        aunbVar = aunb.a;
                    }
                    kpzVar.b(aunbVar, kpzVar.e, kpzVar.j);
                    aunb aunbVar2 = ardrVar.c;
                    if (aunbVar2 == null) {
                        aunbVar2 = aunb.a;
                    }
                    kpzVar.b(aunbVar2, kpzVar.f, kpzVar.k);
                    if (kpzVar.k.getVisibility() == 0) {
                        kpzVar.f.e = new akbh() { // from class: kpw
                            @Override // defpackage.akbh
                            public final Map a() {
                                return amup.k("PLAYLIST_CREATION_LISTENER_KEY", new kpt(kpz.this));
                            }
                        };
                    }
                    arag aragVar = ardrVar.b;
                    if (aragVar == null) {
                        aragVar = arag.a;
                    }
                    kpzVar.i.setText(ajgl.b(aragVar));
                    kpzVar.i.setContentDescription(ajgl.i(aragVar));
                    View view = kpzVar.h;
                    DisplayMetrics displayMetrics = kpzVar.b.getResources().getDisplayMetrics();
                    if (true != eog.W(kpzVar.d.a())) {
                        i = 4;
                    }
                    view.setElevation(zew.i(displayMetrics, i));
                }
                aruf arufVar3 = aruhVar.d;
                if (arufVar3 == null) {
                    arufVar3 = aruf.a;
                }
                auqh auqhVar2 = arufVar3.c;
                if (auqhVar2 == null) {
                    auqhVar2 = auqh.a;
                }
                kpzVar.l.K(new aakw(auqhVar2));
            }
        });
    }

    public final void b(aunb aunbVar, akbm akbmVar, TextView textView) {
        if (aunbVar.qn(ButtonRendererOuterClass.buttonRenderer)) {
            akbmVar.g();
            akbmVar.b((apoj) aunbVar.qm(ButtonRendererOuterClass.buttonRenderer), ((kqr) this.c).ag);
            textView.setVisibility(0);
            return;
        }
        textView.setVisibility(8);
    }

    @Override // defpackage.ynl
    public final Class[] ky(Class cls, Object obj, int i) {
        if (i != -1) {
            if (i == 0) {
                kqd kqdVar = (kqd) obj;
                ((kqr) this.m).dismiss();
                return null;
            }
            StringBuilder sb = new StringBuilder(32);
            sb.append("unsupported op code: ");
            sb.append(i);
            throw new IllegalStateException(sb.toString());
        }
        return new Class[]{kqd.class};
    }
}
