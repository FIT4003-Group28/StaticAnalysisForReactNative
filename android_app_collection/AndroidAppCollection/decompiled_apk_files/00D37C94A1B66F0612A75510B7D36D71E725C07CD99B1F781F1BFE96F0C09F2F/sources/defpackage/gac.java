package defpackage;

import android.app.Activity;
import com.google.protos.youtube.api.innertube.LikeEndpointOuterClass$LikeEndpoint;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Executor;
/* compiled from: PG */
/* renamed from: gac  reason: default package */
/* loaded from: classes3.dex */
public final class gac {
    public final yzj a;
    private final Activity b;
    private final afvn c;
    private final afwc d;
    private final aaxt e;
    private final yni f;
    private final yrj g;
    private final yzv h;
    private final aafo i;
    private final Executor j;

    public gac(Activity activity, afvn afvnVar, afwc afwcVar, aaxt aaxtVar, yzj yzjVar, yni yniVar, yrj yrjVar, yzv yzvVar, aafo aafoVar, Executor executor) {
        this.b = activity;
        this.c = afvnVar;
        this.d = afwcVar;
        this.e = aaxtVar;
        this.a = yzjVar;
        this.f = yniVar;
        this.g = yrjVar;
        this.h = yzvVar;
        this.i = aafoVar;
        this.j = executor;
    }

    public final void a(aspb aspbVar, asov asovVar, gab gabVar, gab gabVar2, gab gabVar3) {
        asovVar.getClass();
        if (!this.g.o()) {
            this.h.b();
        } else if (this.c.t()) {
            b(aspbVar, asovVar, false, gabVar, gabVar2, gabVar3);
        } else {
            this.d.c(this.b, null, new gaa(this, aspbVar, asovVar, gabVar, gabVar2, gabVar3));
        }
    }

    public final void b(aspb aspbVar, asov asovVar, boolean z, gab gabVar, gab gabVar2, gab gabVar3) {
        ampq ampqVar;
        Runnable runnable = anlf.a;
        Iterator it = Collections.unmodifiableList(((asov) ((aopc) asovVar.mo52toBuilder()).instance).p).iterator();
        while (true) {
            if (it.hasNext()) {
                apzg apzgVar = (apzg) it.next();
                if (apzgVar.qn(LikeEndpointOuterClass$LikeEndpoint.likeEndpoint)) {
                    aspb b = aspb.b(((LikeEndpointOuterClass$LikeEndpoint) apzgVar.qm(LikeEndpointOuterClass$LikeEndpoint.likeEndpoint)).e);
                    if (b == null) {
                        b = aspb.LIKE;
                    }
                    if (b.equals(aspbVar)) {
                        ampqVar = ampq.j(apzgVar);
                        break;
                    }
                }
            } else {
                ampqVar = amon.a;
                break;
            }
        }
        aspb c = abgb.c((aopc) asovVar.mo52toBuilder());
        aspb aspbVar2 = aspb.LIKE;
        int ordinal = aspbVar.ordinal();
        if (ordinal == 0) {
            aaxr b2 = this.e.b();
            if (!ampqVar.h()) {
                b2.k(asovVar.n.I());
                aspc aspcVar = asovVar.c;
                if (aspcVar == null) {
                    aspcVar = aspc.a;
                }
                b2.u(aspcVar);
            } else {
                b2.t((apzg) ampqVar.c());
            }
            gabVar.a(aspb.LIKE, asovVar);
            ylx.l(this.e.g(b2), this.j, new fzy(this, gabVar3, c, asovVar, 1), new fzz(this, asovVar, z, gabVar2), runnable);
        } else if (ordinal == 1) {
            aaxq a = this.e.a();
            if (!ampqVar.h()) {
                a.k(asovVar.n.I());
                aspc aspcVar2 = asovVar.c;
                if (aspcVar2 == null) {
                    aspcVar2 = aspc.a;
                }
                a.u(aspcVar2);
            } else {
                a.t((apzg) ampqVar.c());
            }
            gabVar.a(aspb.DISLIKE, asovVar);
            ylx.l(this.e.e(a), this.j, new fzy(this, gabVar3, c, asovVar), new fzz(this, asovVar, z, gabVar2, 1), runnable);
        } else {
            aaxs d = this.e.d();
            if (!ampqVar.h()) {
                d.k(asovVar.n.I());
                aspc aspcVar3 = asovVar.c;
                if (aspcVar3 == null) {
                    aspcVar3 = aspc.a;
                }
                d.u(aspcVar3);
            } else {
                d.t((apzg) ampqVar.c());
            }
            gabVar.a(aspb.INDIFFERENT, asovVar);
            ylx.l(this.e.i(d), this.j, new fzy(this, gabVar3, c, asovVar, 2), new fzz(this, asovVar, z, gabVar2, 2), runnable);
        }
    }

    public final void c(asov asovVar, aspb aspbVar, boolean z, List list, gab gabVar) {
        if (list != null && !list.isEmpty()) {
            this.i.b(list);
        }
        if ((asovVar.b & 1) != 0) {
            aspc aspcVar = asovVar.c;
            if (aspcVar == null) {
                aspcVar = aspc.a;
            }
            if (!aspcVar.d.isEmpty()) {
                yni yniVar = this.f;
                aspc aspcVar2 = asovVar.c;
                if (aspcVar2 == null) {
                    aspcVar2 = aspc.a;
                }
                yniVar.f(new gae(aspcVar2.d, aspbVar));
                return;
            }
        }
        yni yniVar2 = this.f;
        aspc aspcVar3 = asovVar.c;
        if (aspcVar3 == null) {
            aspcVar3 = aspc.a;
        }
        yniVar2.d(new gaf(aspcVar3.c, aspbVar, z));
        gabVar.a(aspbVar, asovVar);
    }
}
