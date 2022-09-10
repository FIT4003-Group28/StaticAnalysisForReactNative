package defpackage;

import com.google.android.apps.gmm.map.model.location.GmmLocation;
import java.util.Iterator;
/* compiled from: PG */
/* renamed from: ahpp  reason: default package */
/* loaded from: classes2.dex */
public final class ahpp implements ahog {
    private static final dcqe a = dcqe.c("ahpp");
    private final cqat b;
    private final ckcw c;
    @dzsi
    private final ahoh d;
    private amuh e = amuh.b;

    public ahpp(cqat cqatVar, ckcw ckcwVar, @dzsi ahoh ahohVar) {
        this.b = cqatVar;
        this.c = ckcwVar;
        this.d = ahohVar;
    }

    @Override // defpackage.ahog
    @dzsi
    public final GmmLocation a(long j) {
        dbsk.s(this.d);
        ahoh ahohVar = this.d;
        dbsk.l(ahohVar.d());
        long j2 = ahohVar.c;
        boolean z = ahohVar.a;
        try {
            dlym dlymVar = (dlym) dsqw.cr(dlym.P, ahohVar.nativeGetRouteLocationAsProto(j2, j, false), dsqa.c());
            GmmLocation a2 = ahof.a(this.b, dlymVar, this.e, j);
            if (a2 != null && !a2.e()) {
                amvs A = a2.A();
                Iterator<amub> it = this.e.iterator();
                while (it.hasNext()) {
                    amub next = it.next();
                    if (next.h != dqvj.TRANSIT && a2.y(next.W)) {
                        A.y(next.W, dcyn.a);
                    }
                }
                a2 = A.d();
            }
            ahof.c(this.c, dlymVar.O);
            return a2;
        } catch (dsrm e) {
            bvoo.h("Failed to parse LocationIntegratorResultProto %s", e);
            return null;
        }
    }

    @Override // defpackage.ahog
    public final void b(amuh amuhVar) {
        ahoh ahohVar = this.d;
        if (ahohVar == null) {
            return;
        }
        this.e = amuhVar;
        ahohVar.n(ahof.b(amuhVar, false).bS());
    }

    @Override // defpackage.ahog
    public final void c() {
    }

    @Override // defpackage.ahog
    public final void d() {
        this.e = amuh.b;
        ahoh ahohVar = this.d;
        if (ahohVar == null) {
            return;
        }
        ahohVar.c();
    }

    @Override // defpackage.ahqd
    public final void r(ahqe ahqeVar) {
        bvrj.LOCATION_DISPATCHER.c();
        ahoh ahohVar = this.d;
        if (ahohVar == null || !ahohVar.d()) {
            return;
        }
        ahqeVar.c(this.d);
    }

    @Override // defpackage.ahqd
    public final long s() {
        bvrj.LOCATION_DISPATCHER.c();
        ahoh ahohVar = this.d;
        if (ahohVar == null || !ahohVar.d()) {
            return 0L;
        }
        return this.d.e();
    }
}
