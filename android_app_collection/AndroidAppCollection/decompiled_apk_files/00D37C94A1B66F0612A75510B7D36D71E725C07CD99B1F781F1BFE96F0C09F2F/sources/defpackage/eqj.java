package defpackage;

import com.google.protos.youtube.api.innertube.LikeEndpointOuterClass$LikeEndpoint;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
/* compiled from: PG */
/* renamed from: eqj  reason: default package */
/* loaded from: classes3.dex */
public final class eqj implements aafl {
    public final yzj a;
    public final aadd b;
    private final dt c;
    private final yni d;
    private final aaxt e;
    private final afwc f;
    private final afvn g;
    private final aafo h;
    private final aagi i;
    private final Executor j;

    public eqj(dt dtVar, yni yniVar, aaxt aaxtVar, yzj yzjVar, afwc afwcVar, afvn afvnVar, aafo aafoVar, aadd aaddVar, aagi aagiVar, Executor executor) {
        dtVar.getClass();
        this.c = dtVar;
        yniVar.getClass();
        this.d = yniVar;
        aaxtVar.getClass();
        this.e = aaxtVar;
        yzjVar.getClass();
        this.a = yzjVar;
        afwcVar.getClass();
        this.f = afwcVar;
        afvnVar.getClass();
        this.g = afvnVar;
        aafoVar.getClass();
        this.h = aafoVar;
        aaddVar.getClass();
        this.b = aaddVar;
        this.i = aagiVar;
        this.j = executor;
    }

    private final ankt f(apzg apzgVar) {
        aaxq a = this.e.a();
        a.t(apzgVar);
        return this.e.f(a, this.j);
    }

    private final ankt g(apzg apzgVar) {
        aaxr b = this.e.b();
        b.t(apzgVar);
        return this.e.h(b, this.j);
    }

    private final ankt h(apzg apzgVar) {
        aaxs d = this.e.d();
        d.t(apzgVar);
        return this.e.j(d, this.j);
    }

    public final ylw b(LikeEndpointOuterClass$LikeEndpoint likeEndpointOuterClass$LikeEndpoint, apzg apzgVar, Object obj, boolean z) {
        aspb aspbVar = aspb.LIKE;
        aspb b = aspb.b(likeEndpointOuterClass$LikeEndpoint.e);
        if (b == null) {
            b = aspb.LIKE;
        }
        int ordinal = b.ordinal();
        if (ordinal != 0) {
            if (ordinal == 1) {
                return new eqe(this, apzgVar, obj, z, 1);
            }
            return new eqe(this, apzgVar, obj, z, 2);
        }
        return new eqe(this, apzgVar, obj, z);
    }

    public final ayoc c(apzg apzgVar, Object obj, boolean z, LikeEndpointOuterClass$LikeEndpoint likeEndpointOuterClass$LikeEndpoint, final String str, final aajj aajjVar) {
        ayoc o;
        final aagh a = this.i.a(this.g.c());
        aajs c = a.c();
        asox f = asoy.f(str);
        aspb b = aspb.b(likeEndpointOuterClass$LikeEndpoint.e);
        if (b == null) {
            b = aspb.LIKE;
        }
        f.b(b);
        c.j(f);
        aynr b2 = c.b();
        aspb b3 = aspb.b(likeEndpointOuterClass$LikeEndpoint.e);
        if (b3 == null) {
            b3 = aspb.LIKE;
        }
        int ordinal = b3.ordinal();
        if (ordinal == 0) {
            o = zhn.a(g(apzgVar)).o(new eqf(this, likeEndpointOuterClass$LikeEndpoint, apzgVar, obj, z));
        } else if (ordinal == 1) {
            o = zhn.a(f(apzgVar)).o(new eqf(this, likeEndpointOuterClass$LikeEndpoint, apzgVar, obj, z, 1));
        } else {
            o = zhn.a(h(apzgVar)).o(new eqf(this, likeEndpointOuterClass$LikeEndpoint, apzgVar, obj, z, 2));
        }
        return b2.K(o.A(new ayqf() { // from class: eqh
            @Override // defpackage.ayqf
            public final boolean a(Object obj2) {
                eqj eqjVar = eqj.this;
                aajj aajjVar2 = aajjVar;
                aajl aajlVar = a;
                String str2 = str;
                Throwable th = (Throwable) obj2;
                zep.d("Error rating", th);
                eqjVar.a.e(th);
                if (eog.u(eqjVar.b)) {
                    if (aajjVar2 != null) {
                        aajs c2 = aajlVar.c();
                        c2.d(aajjVar2);
                        c2.b();
                        return true;
                    }
                    aajs c3 = aajlVar.c();
                    c3.g(str2);
                    c3.b();
                    return true;
                }
                return true;
            }
        }));
    }

    public final void d(final apzg apzgVar, final Object obj, final boolean z) {
        final LikeEndpointOuterClass$LikeEndpoint likeEndpointOuterClass$LikeEndpoint = (LikeEndpointOuterClass$LikeEndpoint) apzgVar.qm(LikeEndpointOuterClass$LikeEndpoint.likeEndpoint);
        if (likeEndpointOuterClass$LikeEndpoint.g.size() != 0) {
            this.h.e(likeEndpointOuterClass$LikeEndpoint.g, obj);
        }
        if (eog.u(this.b)) {
            aspc aspcVar = likeEndpointOuterClass$LikeEndpoint.f;
            if (aspcVar == null) {
                aspcVar = aspc.a;
            }
            if ((aspcVar.b & 1) != 0) {
                aspc aspcVar2 = likeEndpointOuterClass$LikeEndpoint.f;
                if (aspcVar2 == null) {
                    aspcVar2 = aspc.a;
                }
                final String f = aakj.f(62, aspcVar2.c);
                this.i.a(this.g.c()).f(f).y(aypa.a()).t(new eqg(this, apzgVar, obj, z, likeEndpointOuterClass$LikeEndpoint, f, 1), new eqg(this, apzgVar, obj, z, likeEndpointOuterClass$LikeEndpoint, f), new Callable() { // from class: eqd
                    @Override // java.util.concurrent.Callable
                    public final Object call() {
                        return eqj.this.c(apzgVar, obj, z, likeEndpointOuterClass$LikeEndpoint, f, null);
                    }
                }).S();
                return;
            }
        }
        ylv ylvVar = new ylv() { // from class: eqc
            @Override // defpackage.zdt
            /* renamed from: b */
            public final void a(Throwable th) {
                eqj eqjVar = eqj.this;
                zep.d("Error rating", th);
                eqjVar.a.e(th);
            }
        };
        Runnable runnable = anlf.a;
        aspb aspbVar = aspb.LIKE;
        aspb b = aspb.b(likeEndpointOuterClass$LikeEndpoint.e);
        if (b == null) {
            b = aspb.LIKE;
        }
        int ordinal = b.ordinal();
        if (ordinal == 0) {
            ylx.l(g(apzgVar), anjk.a, ylvVar, b(likeEndpointOuterClass$LikeEndpoint, apzgVar, obj, z), runnable);
        } else if (ordinal == 1) {
            ylx.l(f(apzgVar), anjk.a, ylvVar, b(likeEndpointOuterClass$LikeEndpoint, apzgVar, obj, z), runnable);
        } else if (ordinal != 2) {
        } else {
            ylx.l(h(apzgVar), anjk.a, ylvVar, b(likeEndpointOuterClass$LikeEndpoint, apzgVar, obj, z), runnable);
        }
    }

    public final void e(apzg apzgVar, Object obj, List list, apzg apzgVar2, aspb aspbVar, boolean z) {
        if (list != null) {
            this.h.e(list, obj);
        }
        if (apzgVar2 != null) {
            this.h.c(apzgVar2, null);
        }
        LikeEndpointOuterClass$LikeEndpoint likeEndpointOuterClass$LikeEndpoint = (LikeEndpointOuterClass$LikeEndpoint) apzgVar.qm(LikeEndpointOuterClass$LikeEndpoint.likeEndpoint);
        aspc aspcVar = likeEndpointOuterClass$LikeEndpoint.f;
        if (aspcVar == null) {
            aspcVar = aspc.a;
        }
        if (aspcVar.c.isEmpty()) {
            aspc aspcVar2 = likeEndpointOuterClass$LikeEndpoint.f;
            if (aspcVar2 == null) {
                aspcVar2 = aspc.a;
            }
            if (aspcVar2.d.isEmpty()) {
                return;
            }
            yni yniVar = this.d;
            aspc aspcVar3 = likeEndpointOuterClass$LikeEndpoint.f;
            if (aspcVar3 == null) {
                aspcVar3 = aspc.a;
            }
            yniVar.f(new gae(aspcVar3.d, aspbVar));
            return;
        }
        yni yniVar2 = this.d;
        aspc aspcVar4 = likeEndpointOuterClass$LikeEndpoint.f;
        if (aspcVar4 == null) {
            aspcVar4 = aspc.a;
        }
        yniVar2.f(new gaf(aspcVar4.c, aspbVar, z));
    }

    @Override // defpackage.aafl
    public final void kD(apzg apzgVar, Map map) {
        Object I = zew.I(map, "com.google.android.libraries.youtube.innertube.endpoint.tag");
        if (this.g.t()) {
            d(apzgVar, I, false);
        } else {
            this.f.c(this.c, null, new eqi(this, apzgVar, I));
        }
    }
}
