package defpackage;

import android.app.Activity;
import java.util.ArrayList;
import java.util.Collection;
import java.util.concurrent.Executor;
/* compiled from: PG */
/* renamed from: bwoz  reason: default package */
/* loaded from: classes4.dex */
public final class bwoz implements avic {
    public Collection<dltm> a = dcdc.e();
    @dzsi
    public bwpv b;
    private final Activity c;
    private final eeu d;
    private final dzsj<avik> e;
    private final akfa f;
    private final btpc g;
    private final avzo h;
    private final avzp i;
    @dzsi
    private final bwnj j;

    public bwoz(Activity activity, eeu eeuVar, akfa akfaVar, btpc btpcVar, avij avijVar, dzsj<avik> dzsjVar, avzo avzoVar, avzp avzpVar, Executor executor, @dzsi bwnj bwnjVar, final bwoy bwoyVar) {
        this.c = activity;
        this.d = eeuVar;
        this.e = dzsjVar;
        this.h = avzoVar;
        this.i = avzpVar;
        this.f = akfaVar;
        this.g = btpcVar;
        this.j = bwnjVar;
        a();
        final crzm<avkr> C = avijVar.C();
        C.j().Pk(new Runnable(this, C, bwoyVar) { // from class: bwox
            private final bwoz a;
            private final crzm b;
            private final bwoy c;

            {
                this.a = this;
                this.b = C;
                this.c = bwoyVar;
            }

            @Override // java.lang.Runnable
            public final void run() {
                bwoz bwozVar = this.a;
                crzm crzmVar = this.b;
                bwoy bwoyVar2 = this.c;
                avkr avkrVar = (avkr) crzmVar.l();
                if (avkrVar != null) {
                    bwozVar.a = avkrVar.c().values();
                    bwozVar.a();
                    bwoyVar2.a();
                }
            }
        }, executor);
    }

    public static boolean b(bwnj bwnjVar) {
        return bwnjVar.d() && bwnjVar.b() == dtja.SEARCH;
    }

    public final void a() {
        bwnj bwnjVar;
        this.b = null;
        if (btlu.i(this.f.j()) == btlt.GOOGLE && (bwnjVar = this.j) != null && b(bwnjVar) && this.j.b() == dtja.SEARCH && !this.g.i()) {
            for (dltm dltmVar : this.a) {
                if (this.h.a(dltmVar)) {
                    this.a.size();
                    boolean z = this.j.b() == dtja.SEARCH;
                    Collection<dltm> collection = this.a;
                    ArrayList a = dchl.a();
                    for (dltm dltmVar2 : collection) {
                        if (!z || this.h.a(dltmVar2)) {
                            a.add(new bwpu(this.d, this.e, this.i, dltmVar2, z));
                        }
                    }
                    this.b = new bwpv(this.c, this.d, this.e, a, z);
                    return;
                }
            }
        }
    }
}
