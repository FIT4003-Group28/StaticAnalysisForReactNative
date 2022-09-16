package defpackage;

import android.content.Context;
import android.graphics.Rect;
import com.google.android.apps.youtube.app.watch.nextgenwatch.ui.DownAndOutController$LifecycleObserver;
import com.google.android.libraries.youtube.innertube.model.player.PlayerResponseModel;
/* compiled from: PG */
/* renamed from: nyv  reason: default package */
/* loaded from: classes3.dex */
public final class nyv implements kls {
    public final nzy a;
    public final airw b;
    public final DownAndOutController$LifecycleObserver c;
    public final nyx d;
    public final yni e;
    public final ghs f;
    public boolean g;
    public boolean h;
    public boolean i;
    public boolean j;
    private final Context k;
    private final boolean l;

    /* JADX WARN: Type inference failed for: r1v1, types: [com.google.android.apps.youtube.app.watch.nextgenwatch.ui.DownAndOutController$LifecycleObserver] */
    public nyv(Context context, aadd aaddVar, nzy nzyVar, airw airwVar, nyx nyxVar, yni yniVar, ghs ghsVar) {
        this.k = context;
        this.a = nzyVar;
        airwVar.getClass();
        this.b = airwVar;
        this.d = nyxVar;
        this.e = yniVar;
        this.f = ghsVar;
        this.c = new f() { // from class: com.google.android.apps.youtube.app.watch.nextgenwatch.ui.DownAndOutController$LifecycleObserver
            private final aypf b = new aypf();
            private final nyt c;

            {
                this.c = new nyt(nyv.this);
            }

            @Override // defpackage.f, defpackage.g
            public final /* synthetic */ void kG(apy apyVar) {
            }

            @Override // defpackage.f, defpackage.g
            public final /* synthetic */ void lc(apy apyVar) {
            }

            @Override // defpackage.f, defpackage.g
            public final /* synthetic */ void ld(apy apyVar) {
            }

            @Override // defpackage.g
            public final void nA(apy apyVar) {
                this.b.c();
                nyv.this.e.m(this.c);
            }

            @Override // defpackage.g
            public final /* synthetic */ void nv(apy apyVar) {
            }

            @Override // defpackage.f, defpackage.g
            public final void nz(apy apyVar) {
                this.b.c();
                aypf aypfVar = this.b;
                aynx G = nyv.this.b.ao().I().G(aypa.a());
                final nyv nyvVar = nyv.this;
                aypfVar.d(G.aa(new ayqb() { // from class: nyu
                    @Override // defpackage.ayqb
                    public final void a(Object obj) {
                        nyv nyvVar2 = nyv.this;
                        ahhm ahhmVar = (ahhm) obj;
                        PlayerResponseModel b = ahhmVar.b();
                        if (!ahhmVar.c().b(aijx.VIDEO_PLAYBACK_LOADED) || b == null) {
                            return;
                        }
                        nyvVar2.h = b.c().ax();
                        nyvVar2.i = b.c().ay();
                    }
                }, npy.l));
                nyv.this.e.g(this.c);
            }
        };
        asxp asxpVar = aaddVar.a().e;
        this.l = (asxpVar == null ? asxp.a : asxpVar).aa;
    }

    public final boolean a() {
        if (!this.l) {
            return false;
        }
        return zew.w(this.k) ? this.h : this.i;
    }

    public final boolean b(int i) {
        Rect a = this.a.a();
        return ((float) i) >= ((float) almu.u(a.width(), a.height(), zew.j(this.k))) * 0.3f;
    }

    @Override // defpackage.kls
    public final void e(int i, boolean z) {
        this.g = i == 2;
    }
}
