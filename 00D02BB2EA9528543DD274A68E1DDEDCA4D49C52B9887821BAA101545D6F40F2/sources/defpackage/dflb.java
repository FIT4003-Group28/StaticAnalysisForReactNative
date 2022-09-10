package defpackage;

import android.util.Pair;
import java.util.HashMap;
import java.util.Map;
/* compiled from: PG */
/* renamed from: dflb  reason: default package */
/* loaded from: classes6.dex */
public final class dflb extends dflc {
    private final cwsy f;
    private final Map<Pair<cwsv, String>, cxdh> g = new HashMap();

    public dflb(cwsy cwsyVar) {
        this.f = cwsyVar;
    }

    @Override // defpackage.dflc
    public final void a() {
        this.e.clear();
        for (Map.Entry<Pair<cwsv, String>, cxdh> entry : this.g.entrySet()) {
            this.f.o(entry.getValue(), (cwsv) entry.getKey().first, 4);
        }
        this.g.clear();
    }

    @Override // defpackage.dflc
    public final void b(cwsv cwsvVar) {
        cxdh remove = this.g.remove(Pair.create(cwsvVar, ""));
        if (remove != null) {
            this.f.i(remove, cwsvVar);
        }
    }

    @Override // defpackage.dflc
    public final void c(cwsv cwsvVar) {
        this.g.put(Pair.create(cwsvVar, ""), this.f.h());
    }
}
