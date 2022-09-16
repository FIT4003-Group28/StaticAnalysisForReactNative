package defpackage;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import com.google.android.youtube.R;
import java.util.concurrent.ExecutionException;
/* compiled from: PG */
/* renamed from: afpw  reason: default package */
/* loaded from: classes.dex */
public final class afpw implements afpu {
    public final aksj a;
    ajzq b;
    private final Context c;
    private final ajsg d;
    private final ajyi e;
    private final ajyx f;
    private final acth g;
    private final yzj h;
    private final aadd i;
    private final aynx j;
    private final aksg k;
    private final yni l;
    private final akaq m;
    private final acsf n;
    private final zfq o;
    private afqb p;
    private RecyclerView q;
    private String r;

    public afpw(ajsg ajsgVar, ajyi ajyiVar, ajyx ajyxVar, yni yniVar, akar akarVar, acth acthVar, yzj yzjVar, aadd aaddVar, aynx aynxVar, aksk akskVar, acsf acsfVar, zfq zfqVar, Context context, aksg aksgVar, akst akstVar) {
        this.c = context;
        this.d = ajsgVar;
        this.e = ajyiVar;
        this.f = ajyxVar;
        this.l = yniVar;
        this.m = akarVar.a(aari.n, acthVar.oi());
        this.g = acthVar;
        this.h = yzjVar;
        this.i = aaddVar;
        this.j = aynxVar;
        this.n = acsfVar;
        this.o = zfqVar;
        aksj a = akskVar.a(akstVar);
        this.a = a;
        this.k = aksgVar;
        a.a().at(new ayqb() { // from class: afpv
            @Override // defpackage.ayqb
            public final void a(Object obj) {
                afpw.this.i((aksu) obj);
            }
        }, new aaga(8));
    }

    private static boolean j(aksu aksuVar) {
        if (aksuVar == null || aksuVar.a() == null || aksuVar.a().a().isEmpty()) {
            return true;
        }
        if (aksuVar.a().a().size() == 1 && (aksuVar.a().a().get(0) instanceof aakq)) {
            return ((aakq) aksuVar.a().a().get(0)).b().isEmpty();
        }
        return false;
    }

    private final void k(int i) {
        l(i, -1);
    }

    private final void l(int i, int i2) {
        acsd acsdVar = new acsd(i - 1, 15);
        if (i2 != -1) {
            aopa createBuilder = aqyu.a.createBuilder();
            aopa createBuilder2 = arfr.a.createBuilder();
            createBuilder2.copyOnWrite();
            arfr arfrVar = (arfr) createBuilder2.instance;
            arfrVar.b |= 1;
            arfrVar.c = i2;
            createBuilder.copyOnWrite();
            aqyu aqyuVar = (aqyu) createBuilder.instance;
            arfr arfrVar2 = (arfr) createBuilder2.mo39build();
            arfrVar2.getClass();
            aqyuVar.h = arfrVar2;
            aqyuVar.b |= 256;
            acsdVar.a = (aqyu) createBuilder.mo39build();
        }
        this.n.c(acsdVar, aqzj.FLOW_TYPE_HASHTAG_SUGGESTIONS, this.r);
    }

    @Override // defpackage.afpu
    public final afpy a(int i) {
        if (i < 0 || i >= ((ajwb) this.b).e.a()) {
            return null;
        }
        return new afpz(((ajhh) ((ajwb) this.b).e.c(i)).a);
    }

    @Override // defpackage.afpu
    public final void b(String str) {
        this.a.c(str);
        k(6);
    }

    @Override // defpackage.afpu
    public final void c(int i) {
        l(4, i);
    }

    /* JADX WARN: Type inference failed for: r14v0, types: [java.lang.Object, ajsa] */
    @Override // defpackage.afpu
    public final void d(afqb afqbVar, RecyclerView recyclerView) {
        this.p = afqbVar;
        this.q = recyclerView;
        this.q.setPadding(0, this.c.getResources().getDimensionPixelSize(R.dimen.user_mention_suggestions_list_padding_top), 0, 0);
        this.q.setClipToPadding(false);
        this.q.af(null);
        this.q.setMotionEventSplittingEnabled(false);
        this.b = new ajzq(null, this.q, this.d, this.f, aari.n, this.l, this.m, this.h, this.g.oi(), this.e.get(), akai.Ws, ajzs.d, this.i, this.j);
    }

    @Override // defpackage.afpu
    public final void e() {
        this.r = this.o.b(16);
        k(2);
        try {
            aksu aksuVar = (aksu) ((ankq) this.k.a("")).b;
            if (j(aksuVar)) {
                return;
            }
            i(aksuVar);
        } catch (InterruptedException | ExecutionException unused) {
        }
    }

    @Override // defpackage.afpu
    public final void f() {
        this.a.b();
        k(3);
    }

    @Override // defpackage.afpu
    public final boolean g() {
        return true;
    }

    @Override // defpackage.afpu
    public final boolean h() {
        return false;
    }

    public final void i(aksu aksuVar) {
        boolean isEmpty = ((ajwb) this.b).e.isEmpty();
        boolean j = j(aksuVar);
        if (j) {
            this.q.setVisibility(4);
            this.b.h();
        } else {
            this.q.setVisibility(0);
            this.b.K(aksuVar.a());
        }
        this.p.d(j);
        if (isEmpty && !j) {
            k(5);
        }
        k(7);
    }
}
