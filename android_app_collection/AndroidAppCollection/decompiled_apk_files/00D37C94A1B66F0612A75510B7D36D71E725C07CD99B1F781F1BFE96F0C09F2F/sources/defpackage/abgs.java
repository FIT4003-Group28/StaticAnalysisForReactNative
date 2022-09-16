package defpackage;

import com.google.protos.youtube.api.innertube.ShowShareWithKidsPanelCommandOuterClass;
import java.util.Map;
import java.util.concurrent.Executor;
/* compiled from: PG */
/* renamed from: abgs  reason: default package */
/* loaded from: classes.dex */
public final class abgs implements aafl {
    public final aafo a;
    public Map b;
    private final aaxk c;
    private final Executor d;

    public abgs(aaxk aaxkVar, Executor executor, aafo aafoVar) {
        aaxkVar.getClass();
        this.c = aaxkVar;
        executor.getClass();
        this.d = executor;
        aafoVar.getClass();
        this.a = aafoVar;
    }

    @Override // defpackage.aafl
    public final void kD(apzg apzgVar, Map map) {
        this.b = map;
        if (apzgVar != null && apzgVar.qn(ShowShareWithKidsPanelCommandOuterClass.showShareWithKidsPanelCommand)) {
            final auvq auvqVar = (auvq) apzgVar.qm(ShowShareWithKidsPanelCommandOuterClass.showShareWithKidsPanelCommand);
            if ((auvqVar.b & 1) == 0) {
                return;
            }
            aaxk aaxkVar = this.c;
            aoob aoobVar = apzgVar.c;
            aaxj aaxjVar = new aaxj(aaxkVar.e, aaxkVar.a.c());
            aaxjVar.j(aoobVar);
            aaxjVar.b = auvqVar.d;
            aaxjVar.a = auvqVar.c;
            ylx.k(aaxkVar.b.b(aaxjVar, anjk.a), this.d, new ylv() { // from class: abgq
                @Override // defpackage.zdt
                /* renamed from: b */
                public final void a(Throwable th) {
                    abgs abgsVar = abgs.this;
                    auvq auvqVar2 = auvqVar;
                    if ((auvqVar2.b & 4) != 0) {
                        aafo aafoVar = abgsVar.a;
                        apzg apzgVar2 = auvqVar2.e;
                        if (apzgVar2 == null) {
                            apzgVar2 = apzg.a;
                        }
                        aafoVar.a(apzgVar2);
                    }
                }
            }, new ylw() { // from class: abgr
                @Override // defpackage.ylw, defpackage.zdt
                public final void a(Object obj) {
                    acti actiVar;
                    abgs abgsVar = abgs.this;
                    ardp ardpVar = (ardp) obj;
                    Map map2 = abgsVar.b;
                    if (map2 != null && (ardpVar.b & 8) != 0 && (actiVar = (acti) zew.K(map2, "com.google.android.libraries.youtube.logging.interaction_logger", acti.class)) != null) {
                        actiVar.n(new acte(ardpVar.e));
                    }
                    if ((ardpVar.b & 2) != 0) {
                        aafo aafoVar = abgsVar.a;
                        apzg apzgVar2 = ardpVar.d;
                        if (apzgVar2 == null) {
                            apzgVar2 = apzg.a;
                        }
                        aafoVar.a(apzgVar2);
                    }
                }
            });
        }
    }
}
