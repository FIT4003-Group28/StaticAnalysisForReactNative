package defpackage;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.Executor;
/* compiled from: PG */
/* renamed from: tvy  reason: default package */
/* loaded from: classes4.dex */
public final class tvy implements tul {
    public final trv a;
    public final Executor b;
    public final vne c;
    private final snc d;

    public tvy(snc sncVar, trv trvVar, vne vneVar, Executor executor) {
        this.d = sncVar;
        this.a = trvVar;
        this.c = vneVar;
        this.b = executor;
    }

    @Override // defpackage.tul
    public final ankt a(tqm tqmVar) {
        int i = typ.a;
        tqm f = tzc.f(tqmVar, (this.d.c() / 1000) + tqmVar.j);
        ArrayList arrayList = new ArrayList();
        arrayList.add(f);
        return m(arrayList);
    }

    @Override // defpackage.tul
    public final ankt b() {
        return anii.i(anko.q(k()), new anir() { // from class: tvw
            @Override // defpackage.anir
            public final ankt a(Object obj) {
                tvy tvyVar = tvy.this;
                Void r3 = (Void) obj;
                return tvyVar.c.b(tvv.c, tvyVar.b);
            }
        }, this.b);
    }

    @Override // defpackage.tul
    public final ankt c() {
        ArrayList arrayList = new ArrayList();
        return anii.h(anko.q(this.c.b(new tvu(arrayList, 3), this.b)), new tvu(arrayList, 5), this.b);
    }

    @Override // defpackage.tul
    public final ankt d() {
        final ArrayList arrayList = new ArrayList();
        return anii.h(anko.q(this.c.b(new ampg() { // from class: tvt
            @Override // defpackage.ampg
            public final Object apply(Object obj) {
                tvy tvyVar = tvy.this;
                List list = arrayList;
                tqt tqtVar = (tqt) obj;
                aopa mo52toBuilder = tqtVar.mo52toBuilder();
                for (String str : Collections.unmodifiableMap(tqtVar.b).keySet()) {
                    try {
                        list.add(tzh.i(str));
                    } catch (tzd e) {
                        String valueOf = String.valueOf(str);
                        typ.i(e, valueOf.length() != 0 ? "Failed to deserialize groupKey:".concat(valueOf) : new String("Failed to deserialize groupKey:"));
                        tvyVar.a.a(e, "Failed to deserialize groupKey", new Object[0]);
                        mo52toBuilder.z(str);
                    }
                }
                return (tqt) mo52toBuilder.mo39build();
            }
        }, this.b)), new tvu(arrayList), this.b);
    }

    @Override // defpackage.tul
    public final ankt e() {
        return anii.h(this.c.a(), tvv.a, this.b);
    }

    @Override // defpackage.tul
    public final ankt f() {
        return ankq.a;
    }

    @Override // defpackage.tul
    public final ankt g(tqv tqvVar) {
        return anii.h(this.c.a(), new fct(tzh.k(tqvVar), 11), this.b);
    }

    @Override // defpackage.tul
    public final ankt h(tqv tqvVar) {
        return anii.h(this.c.a(), new fct(tzh.k(tqvVar), 12), this.b);
    }

    @Override // defpackage.tul
    public final ankt i(tqv tqvVar) {
        return anhq.h(anii.h(anko.q(this.c.b(new fct(tzh.k(tqvVar), 13), this.b)), tvv.i, this.b), IOException.class, tvv.e, this.b);
    }

    @Override // defpackage.tul
    public final ankt j(List list) {
        return anhq.h(anii.h(anko.q(this.c.b(new tvu(list, 2), this.b)), tvv.j, this.b), IOException.class, tvv.f, this.b);
    }

    @Override // defpackage.tul
    public final ankt k() {
        return this.c.b(tvv.d, this.b);
    }

    @Override // defpackage.tul
    public final ankt l(tqv tqvVar, final tqm tqmVar) {
        final String k = tzh.k(tqvVar);
        return anhq.h(anii.h(anko.q(this.c.b(new ampg() { // from class: tvx
            @Override // defpackage.ampg
            public final Object apply(Object obj) {
                String str = k;
                tqm tqmVar2 = tqmVar;
                aopa mo52toBuilder = ((tqt) obj).mo52toBuilder();
                mo52toBuilder.y(str, tqmVar2);
                return (tqt) mo52toBuilder.mo39build();
            }
        }, this.b)), tvv.k, this.b), IOException.class, tvv.g, this.b);
    }

    @Override // defpackage.tul
    public final ankt m(List list) {
        return anhq.h(anii.h(anko.q(this.c.b(new tvu(list, 4), this.b)), tvv.l, this.b), IOException.class, tvv.h, this.b);
    }
}
