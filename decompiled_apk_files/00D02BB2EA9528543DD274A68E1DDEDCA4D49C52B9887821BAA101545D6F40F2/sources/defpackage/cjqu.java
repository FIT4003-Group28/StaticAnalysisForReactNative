package defpackage;

import android.util.Pair;
import java.util.Map;
/* compiled from: PG */
/* renamed from: cjqu  reason: default package */
/* loaded from: classes.dex */
public final class cjqu {
    private final cjqy a;
    private final cjqq b;
    private final Map<cjqt, Pair<cjtg, cjqp>> c = new aif();
    @dzsi
    private cjtg d;

    public cjqu(cjqy cjqyVar, cjqq cjqqVar) {
        this.a = cjqyVar;
        this.b = cjqqVar;
    }

    public final cjqp a(ddho ddhoVar) {
        cjqt cjqtVar = new cjqt(ddhoVar);
        this.a.h();
        Pair<cjtg, cjqp> pair = this.c.get(cjqtVar);
        if (pair != null) {
            this.b.k((cjtg) pair.first, this.d);
            this.d = (cjtg) pair.first;
            return (cjqp) pair.second;
        }
        cjsv cjsvVar = new cjsv(cjqtVar.a);
        cjqp k = this.b.k(cjsvVar, this.d);
        this.c.put(cjqtVar, Pair.create(cjsvVar, k));
        this.d = cjsvVar;
        return k;
    }
}
