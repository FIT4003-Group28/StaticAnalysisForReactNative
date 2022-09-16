package defpackage;

import j$.util.Optional;
import java.util.Map;
import java.util.concurrent.Executor;
/* compiled from: PG */
/* renamed from: gjk */
/* loaded from: classes3.dex */
public final class gjk implements aafl, eoy {
    public static final /* synthetic */ int e = 0;
    public final gin a;
    public final Executor b;
    public final joz c;
    public final jfv d;
    private final Executor f;
    private final faw g;

    public gjk(gin ginVar, Executor executor, Executor executor2, faw fawVar, joz jozVar, jfv jfvVar) {
        this.a = ginVar;
        this.b = executor;
        this.f = executor2;
        this.c = jozVar;
        this.g = fawVar;
        this.d = jfvVar;
    }

    @Override // defpackage.aafl
    public final void kD(final apzg apzgVar, final Map map) {
        ankt i;
        if (!apzgVar.qn(attg.a)) {
            throw new aafy("Command is not an OfflineWatchEndpoint.");
        }
        final attf attfVar = (attf) apzgVar.qm(attg.a);
        if (attfVar.c.isEmpty()) {
            i = anlz.q(gjj.a(Optional.empty(), true));
        } else {
            i = anii.i(anii.h(anko.q(zna.r(this.g.a(attfVar.c).w(gam.l).R(Optional.empty()))), new fuj(15), this.b), new anir() { // from class: gji
                @Override // defpackage.anir
                public final ankt a(Object obj) {
                    ankt q;
                    gjk gjkVar = gjk.this;
                    Optional optional = (Optional) obj;
                    if (optional.isPresent()) {
                        jfv jfvVar = gjkVar.d;
                        jfz jfzVar = (jfz) optional.get();
                        if (jfzVar.a() == agqv.class) {
                            q = jfvVar.a.d(jfzVar);
                        } else if (jfzVar.a() == awjr.class) {
                            q = jfvVar.b.d(jfzVar);
                        } else if (jfzVar.a() == asze.class) {
                            q = jfvVar.c.d(jfzVar);
                        } else {
                            String valueOf = String.valueOf(jfzVar.a());
                            StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 77);
                            sb.append("CompositeDownloadStateChecker.isVideoPlayableAsync does not have support for ");
                            sb.append(valueOf);
                            throw new UnsupportedOperationException(sb.toString());
                        }
                    } else {
                        q = anlz.q(false);
                    }
                    return anii.h(anko.q(q), new jgb(optional, 1), gjkVar.b);
                }
            }, this.b);
        }
        ylx.k(i, this.f, dzl.r, new ylw() { // from class: gjh
            @Override // defpackage.ylw, defpackage.zdt
            public final void a(Object obj) {
                gjk gjkVar = gjk.this;
                apzg apzgVar2 = apzgVar;
                Map map2 = map;
                attf attfVar2 = attfVar;
                gjj gjjVar = (gjj) obj;
                if (gjjVar.b) {
                    gjkVar.a.kD(apzgVar2, map2);
                    return;
                }
                joz jozVar = gjkVar.c;
                String str = attfVar2.c;
                Optional optional = gjjVar.a;
                Optional of = Optional.of(attfVar2.d);
                if (!optional.isPresent()) {
                    if (!of.isPresent() || ((String) of.get()).isEmpty()) {
                        jozVar.e.n(null, str, null, true);
                        return;
                    } else {
                        jozVar.d.i((String) of.get(), str);
                        return;
                    }
                }
                jfz jfzVar = (jfz) optional.get();
                if (jfzVar.a() == agqv.class) {
                    jozVar.a.b(str, jfzVar, of);
                } else if (jfzVar.a() == awjr.class) {
                    jozVar.b.b(str, jfzVar, of);
                } else if (jfzVar.a() == asze.class) {
                    jozVar.c.b(str, jfzVar, of);
                } else {
                    String valueOf = String.valueOf(jfzVar.a());
                    StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 76);
                    sb.append("CompositeUnplayableDownloadedVideoClickController does not have support for ");
                    sb.append(valueOf);
                    throw new UnsupportedOperationException(sb.toString());
                }
            }
        });
    }
}
