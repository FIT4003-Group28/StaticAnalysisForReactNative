package defpackage;

import android.text.TextUtils;
import com.google.protos.youtube.api.innertube.CreateCommentEndpointOuterClass$CreateCommentEndpoint;
import com.google.protos.youtube.api.innertube.CreateCommentReplyEndpointOuterClass$CreateCommentReplyEndpoint;
import java.util.Map;
import java.util.concurrent.Executor;
/* compiled from: PG */
/* renamed from: xod  reason: default package */
/* loaded from: classes4.dex */
public final class xod implements aafl {
    public static final /* synthetic */ int c = 0;
    public final xna a;
    public final azqb b;
    private final aavc d;
    private final acth e;
    private final aagi f;
    private final dt g;
    private final Executor h;
    private final /* synthetic */ int i;

    public xod(aavc aavcVar, xna xnaVar, acth acthVar, azqb azqbVar, aagi aagiVar, Executor executor, dt dtVar, int i) {
        this.i = i;
        aavcVar.getClass();
        this.d = aavcVar;
        this.a = xnaVar;
        this.e = acthVar;
        this.b = azqbVar;
        this.f = aagiVar;
        this.h = executor;
        this.g = dtVar;
    }

    private final acti b() {
        return this.e.oi();
    }

    private final acti c() {
        return this.e.oi();
    }

    public xod(aavc aavcVar, xna xnaVar, acth acthVar, azqb azqbVar, aagi aagiVar, dt dtVar, Executor executor) {
        aavcVar.getClass();
        this.d = aavcVar;
        this.a = xnaVar;
        this.e = acthVar;
        this.b = azqbVar;
        this.f = aagiVar;
        this.g = dtVar;
        this.h = executor;
    }

    @Override // defpackage.aafl
    public final void kD(apzg apzgVar, Map map) {
        int i = 0;
        if (this.i == 0) {
            final xmx xmxVar = (xmx) zew.K(map, "com.google.android.libraries.youtube.innertube.endpoint.tag", xmx.class);
            if (xmxVar == null || !TextUtils.isEmpty(xmxVar.c()) || !TextUtils.isEmpty(null)) {
                aavc aavcVar = this.d;
                aavd aavdVar = new aavd(aavcVar.e, aavcVar.a.c());
                final CreateCommentReplyEndpointOuterClass$CreateCommentReplyEndpoint createCommentReplyEndpointOuterClass$CreateCommentReplyEndpoint = (CreateCommentReplyEndpointOuterClass$CreateCommentReplyEndpoint) apzgVar.qm(CreateCommentReplyEndpointOuterClass$CreateCommentReplyEndpoint.createCommentReplyEndpoint);
                aavdVar.a = aavd.g(createCommentReplyEndpointOuterClass$CreateCommentReplyEndpoint.c);
                aavdVar.j(aafx.a(apzgVar));
                if (apzgVar.qn(auqs.b)) {
                    auqr auqrVar = (auqr) apzgVar.qm(auqs.b);
                    if (!auqrVar.c.isEmpty()) {
                        aavdVar.l(auqrVar.c);
                    }
                }
                if (xmxVar != null) {
                    aavdVar.t(xmxVar.c());
                    aavdVar.b = aavd.g(null);
                } else if ((createCommentReplyEndpointOuterClass$CreateCommentReplyEndpoint.b & 8) != 0) {
                    arag aragVar = createCommentReplyEndpointOuterClass$CreateCommentReplyEndpoint.d;
                    if (aragVar == null) {
                        aragVar = arag.a;
                    }
                    StringBuilder sb = new StringBuilder();
                    while (i < aragVar.c.size()) {
                        sb.append(((arai) aragVar.c.get(i)).c);
                        i++;
                    }
                    aavdVar.t(sb.toString());
                    if (createCommentReplyEndpointOuterClass$CreateCommentReplyEndpoint.e && b() != null) {
                        b().q(new acte(actj.CIVILITY_REMINDER_DIALOG), null);
                        b().H(3, new acte(actj.CIVILITY_REMINDER_POST_ANYWAY_BUTTON), null);
                    }
                }
                final aagh c2 = this.f.c();
                dt dtVar = this.g;
                aavc aavcVar2 = this.d;
                ylx.n(dtVar, aavcVar2.g.b(aavdVar, this.h), new zdt() { // from class: xob
                    @Override // defpackage.zdt
                    public final void a(Object obj) {
                        xmx xmxVar2 = xmx.this;
                        CreateCommentReplyEndpointOuterClass$CreateCommentReplyEndpoint createCommentReplyEndpointOuterClass$CreateCommentReplyEndpoint2 = createCommentReplyEndpointOuterClass$CreateCommentReplyEndpoint;
                        aajl aajlVar = c2;
                        Throwable th = (Throwable) obj;
                        int i2 = xod.c;
                        if (xmxVar2 != null) {
                            xmxVar2.g((cff) th);
                        }
                        if ((createCommentReplyEndpointOuterClass$CreateCommentReplyEndpoint2.b & 64) != 0) {
                            xxs.f(aajlVar, createCommentReplyEndpointOuterClass$CreateCommentReplyEndpoint2.g);
                        }
                    }
                }, new zdt() { // from class: xoc
                    @Override // defpackage.zdt
                    public final void a(Object obj) {
                        xod xodVar = xod.this;
                        xmx xmxVar2 = xmxVar;
                        CreateCommentReplyEndpointOuterClass$CreateCommentReplyEndpoint createCommentReplyEndpointOuterClass$CreateCommentReplyEndpoint2 = createCommentReplyEndpointOuterClass$CreateCommentReplyEndpoint;
                        aajl aajlVar = c2;
                        arnw arnwVar = (arnw) obj;
                        ((aafo) xodVar.b.get()).b(arnwVar.g);
                        if (xmxVar2 != null) {
                            xmxVar2.h(arnwVar);
                            return;
                        }
                        arnx arnxVar = arnwVar.d;
                        if (arnxVar == null) {
                            arnxVar = arnx.a;
                        }
                        if (arnxVar.b != 153515154) {
                            return;
                        }
                        xodVar.a.a(arnwVar);
                        if ((createCommentReplyEndpointOuterClass$CreateCommentReplyEndpoint2.b & 32) != 0) {
                            xxs.e(aajlVar, createCommentReplyEndpointOuterClass$CreateCommentReplyEndpoint2.f);
                        }
                        if ((createCommentReplyEndpointOuterClass$CreateCommentReplyEndpoint2.b & 64) == 0) {
                            return;
                        }
                        xxs.f(aajlVar, createCommentReplyEndpointOuterClass$CreateCommentReplyEndpoint2.g);
                    }
                });
                return;
            }
            xmxVar.g(null);
            return;
        }
        final aavf aavfVar = (aavf) zew.K(map, "com.google.android.libraries.youtube.innertube.endpoint.tag", aavf.class);
        if (aavfVar == null || !TextUtils.isEmpty(aavfVar.c()) || !TextUtils.isEmpty(aavfVar.a().g) || !TextUtils.isEmpty(aavfVar.a().f) || abgc.k(aavfVar.a().j)) {
            aavc aavcVar3 = this.d;
            aave aaveVar = new aave(aavcVar3.e, aavcVar3.a.c());
            final CreateCommentEndpointOuterClass$CreateCommentEndpoint createCommentEndpointOuterClass$CreateCommentEndpoint = (CreateCommentEndpointOuterClass$CreateCommentEndpoint) apzgVar.qm(CreateCommentEndpointOuterClass$CreateCommentEndpoint.createCommentEndpoint);
            aaveVar.u(createCommentEndpointOuterClass$CreateCommentEndpoint.c);
            aaveVar.j(apzgVar.c);
            if (aavfVar != null) {
                aaveVar.t(aavfVar.c());
                aaveVar.z = aavfVar.b();
                aavi a = aavfVar.a();
                if (a != null) {
                    aaveVar.a = a.b;
                    aaveVar.b = a.g;
                    aaveVar.c = a.e;
                    aaveVar.d = a.f;
                    aaveVar.s = a.c;
                    aaveVar.t = a.h;
                    aaveVar.u = a.i;
                    aaveVar.x = a.d;
                    aaveVar.y = a.j;
                    aaveVar.A = a.k;
                }
            } else if ((createCommentEndpointOuterClass$CreateCommentEndpoint.b & 2) != 0) {
                arag aragVar2 = createCommentEndpointOuterClass$CreateCommentEndpoint.d;
                if (aragVar2 == null) {
                    aragVar2 = arag.a;
                }
                StringBuilder sb2 = new StringBuilder();
                while (i < aragVar2.c.size()) {
                    sb2.append(((arai) aragVar2.c.get(i)).c);
                    i++;
                }
                aaveVar.t(sb2.toString());
                if (createCommentEndpointOuterClass$CreateCommentEndpoint.e && c() != null) {
                    c().q(new acte(actj.CIVILITY_REMINDER_DIALOG), null);
                    c().H(3, new acte(actj.CIVILITY_REMINDER_POST_ANYWAY_BUTTON), null);
                }
            }
            final aagh c3 = this.f.c();
            ylx.n(this.g, this.d.d(aaveVar, this.h), new zdt() { // from class: xnz
                @Override // defpackage.zdt
                public final void a(Object obj) {
                    aavf aavfVar2 = aavf.this;
                    CreateCommentEndpointOuterClass$CreateCommentEndpoint createCommentEndpointOuterClass$CreateCommentEndpoint2 = createCommentEndpointOuterClass$CreateCommentEndpoint;
                    aajl aajlVar = c3;
                    Throwable th = (Throwable) obj;
                    int i2 = xod.c;
                    if (aavfVar2 != null) {
                        aavfVar2.e((cff) th);
                    }
                    if ((createCommentEndpointOuterClass$CreateCommentEndpoint2.b & 16) != 0) {
                        xxs.f(aajlVar, createCommentEndpointOuterClass$CreateCommentEndpoint2.g);
                    }
                }
            }, new zdt(aavfVar, createCommentEndpointOuterClass$CreateCommentEndpoint, c3, null) { // from class: xny
                public final /* synthetic */ aavf a;
                public final /* synthetic */ CreateCommentEndpointOuterClass$CreateCommentEndpoint b;
                public final /* synthetic */ aajl c;

                @Override // defpackage.zdt
                public final void a(Object obj) {
                    xod xodVar = xod.this;
                    aavf aavfVar2 = this.a;
                    CreateCommentEndpointOuterClass$CreateCommentEndpoint createCommentEndpointOuterClass$CreateCommentEndpoint2 = this.b;
                    aajl aajlVar = this.c;
                    arnz arnzVar = (arnz) obj;
                    ((aafo) xodVar.b.get()).b(arnzVar.e);
                    if (aavfVar2 != null) {
                        aavfVar2.f(arnzVar);
                        return;
                    }
                    aroa aroaVar = arnzVar.d;
                    if (aroaVar == null) {
                        aroaVar = aroa.a;
                    }
                    if (aroaVar.b != 153515154) {
                        return;
                    }
                    amzs it = xodVar.a.b.iterator();
                    while (it.hasNext()) {
                        ((xmz) it.next()).t(arnzVar);
                    }
                    if ((createCommentEndpointOuterClass$CreateCommentEndpoint2.b & 8) != 0) {
                        xxs.e(aajlVar, createCommentEndpointOuterClass$CreateCommentEndpoint2.f);
                    }
                    if ((createCommentEndpointOuterClass$CreateCommentEndpoint2.b & 16) == 0) {
                        return;
                    }
                    xxs.f(aajlVar, createCommentEndpointOuterClass$CreateCommentEndpoint2.g);
                }
            });
            return;
        }
        aavfVar.e(null);
    }
}
