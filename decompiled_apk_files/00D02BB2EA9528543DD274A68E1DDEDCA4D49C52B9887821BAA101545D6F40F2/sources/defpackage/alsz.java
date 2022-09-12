package defpackage;

import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Executor;
/* compiled from: PG */
/* renamed from: alsz  reason: default package */
/* loaded from: classes.dex */
public final class alsz {
    public final altr<alyh, Collection<altt>> a;
    public final altj<akqh, alts> b;
    public final altj<akqh, altu> c;
    public final ambz d;
    public final Executor e;
    public final Map<alyh, List<alsx>> f = new HashMap();

    public alsz(btmv btmvVar, Executor executor, ambz ambzVar) {
        this.e = executor;
        this.d = ambzVar;
        this.a = new altr<>(50, btmz.INDOOR_METADATA, btmvVar);
        this.b = new altj<>(new altr(1024, btmz.INDOOR_BUILDING, btmvVar));
        this.c = new altj<>(new altr(1024, btmz.INDOOR_LEVEL, btmvVar));
    }

    public final void a(akqh akqhVar, alsw alswVar) {
        this.b.a(akqhVar, alswVar);
    }

    public final void b(Collection<altt> collection) {
        for (altt alttVar : collection) {
            alts altsVar = alttVar.a;
            if (altsVar != null) {
                this.b.b(altsVar.a, altsVar);
                dcdc<altu> dcdcVar = altsVar.b;
                int size = dcdcVar.size();
                for (int i = 0; i < size; i++) {
                    altu altuVar = dcdcVar.get(i);
                    this.c.b(altuVar.b(), altuVar);
                }
            }
        }
    }
}
