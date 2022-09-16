package defpackage;

import com.google.protos.youtube.api.innertube.PerformCommentActionEndpointOuterClass$PerformCommentActionEndpoint;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Executor;
/* compiled from: PG */
/* renamed from: xoh  reason: default package */
/* loaded from: classes4.dex */
public final class xoh implements aafl {
    public static final /* synthetic */ int a = 0;
    private final aavc b;
    private final azqb c;
    private final Executor d;
    private final xmn e;
    private final aacz f;

    public xoh(aavc aavcVar, azqb azqbVar, xmn xmnVar, aacz aaczVar, Executor executor) {
        this.e = xmnVar;
        aavcVar.getClass();
        this.b = aavcVar;
        azqbVar.getClass();
        this.c = azqbVar;
        aaczVar.getClass();
        this.f = aaczVar;
        this.d = executor;
    }

    @Override // defpackage.aafl
    public final void kD(apzg apzgVar, Map map) {
        afzf afzfVar = (afzf) zew.K(map, "com.google.android.libraries.youtube.innertube.endpoint.tag", afzf.class);
        xmn xmnVar = afzfVar;
        if (afzfVar == null) {
            xmn xmnVar2 = this.e;
            if (xmnVar2 == null) {
                xmnVar = afzj.a(new cfa() { // from class: afzh
                    @Override // defpackage.cfa
                    public final void lG(Object obj) {
                        String valueOf = String.valueOf(r1.getCanonicalName());
                        if (valueOf.length() != 0) {
                            "Successful volley request for type ".concat(valueOf);
                        }
                    }
                }, new cez() { // from class: afzg
                    @Override // defpackage.cez
                    public final void kV(cff cffVar) {
                        String valueOf = String.valueOf(r1.getCanonicalName());
                        zep.d(valueOf.length() != 0 ? "Volley request failed for type ".concat(valueOf) : new String("Volley request failed for type "), cffVar);
                    }
                });
            } else {
                xmnVar2.a = map;
                xmnVar = xmnVar2;
            }
        }
        Object I = zew.I(map, "com.google.android.libraries.youtube.comment.action_tag");
        PerformCommentActionEndpointOuterClass$PerformCommentActionEndpoint performCommentActionEndpointOuterClass$PerformCommentActionEndpoint = (PerformCommentActionEndpointOuterClass$PerformCommentActionEndpoint) apzgVar.qm(PerformCommentActionEndpointOuterClass$PerformCommentActionEndpoint.performCommentActionEndpoint);
        Iterable r = performCommentActionEndpointOuterClass$PerformCommentActionEndpoint.c.size() > 0 ? performCommentActionEndpointOuterClass$PerformCommentActionEndpoint.c : amuk.r(performCommentActionEndpointOuterClass$PerformCommentActionEndpoint.b);
        aavc aavcVar = this.b;
        aopa createBuilder = arnq.a.createBuilder();
        createBuilder.copyOnWrite();
        arnq arnqVar = (arnq) createBuilder.instance;
        aopu aopuVar = arnqVar.d;
        if (!aopuVar.c()) {
            arnqVar.d = aopi.mutableCopy(aopuVar);
        }
        aonk.addAll(r, (List) arnqVar.d);
        aauy aauyVar = new aauy(aavcVar.e, aavcVar.a.c(), createBuilder);
        aauyVar.j(apzgVar.c);
        if (apzgVar.qn(auqs.b)) {
            auqr auqrVar = (auqr) apzgVar.qm(auqs.b);
            if (!auqrVar.c.isEmpty()) {
                aauyVar.l(auqrVar.c);
            }
        }
        ankt b = this.b.c.b(aauyVar, this.d);
        Executor executor = this.d;
        itc itcVar = new itc(xmnVar, 2);
        xmnVar.getClass();
        ylx.k(b, executor, itcVar, new itd(xmnVar, 2));
        if (performCommentActionEndpointOuterClass$PerformCommentActionEndpoint.d.size() > 0) {
            if (I == null) {
                apzt apztVar = this.f.b().z;
                if (apztVar == null) {
                    apztVar = apzt.a;
                }
                if (!apztVar.c) {
                    return;
                }
                ((aafo) this.c.get()).b(performCommentActionEndpointOuterClass$PerformCommentActionEndpoint.d);
                return;
            }
            ((aafo) this.c.get()).e(performCommentActionEndpointOuterClass$PerformCommentActionEndpoint.d, I);
        }
    }
}
