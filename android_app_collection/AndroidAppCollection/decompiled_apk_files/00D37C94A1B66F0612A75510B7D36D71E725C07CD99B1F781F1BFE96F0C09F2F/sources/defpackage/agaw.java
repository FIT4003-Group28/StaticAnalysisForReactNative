package defpackage;

import j$.util.Optional;
import j$.util.function.Consumer;
import java.util.HashMap;
import java.util.List;
/* compiled from: PG */
/* renamed from: agaw  reason: default package */
/* loaded from: classes.dex */
public final class agaw implements uit {
    public final Optional a;
    private final agec b;

    public agaw(Optional optional, agec agecVar, byte[] bArr, byte[] bArr2) {
        this.a = optional;
        this.b = agecVar;
    }

    @Override // defpackage.uit
    public final void a(aols aolsVar) {
        Optional optional = (Optional) uct.a(aolsVar).b(new adrz(17)).d(adyd.r);
        if (!optional.isPresent()) {
            zep.b("Could not get the YouTube custom payload.");
        } else if (!this.a.isPresent()) {
            zep.b("Endpoint resolver is missing.");
        } else {
            optional.filter(agat.c).map(adgi.k).ifPresent(new agau((aafo) this.a.get()));
            optional.filter(agat.d).map(adgi.l).ifPresent(new Consumer() { // from class: agav
                @Override // j$.util.function.Consumer
                public final void accept(Object obj) {
                    agaw agawVar = agaw.this;
                    apzg apzgVar = (apzg) obj;
                    HashMap hashMap = new HashMap();
                    hashMap.put("com.google.android.libraries.youtube.innertube.endpoint.tag", apzgVar.c.I());
                    ((aafo) agawVar.a.get()).c(apzgVar, hashMap);
                }

                @Override // j$.util.function.Consumer
                public final /* synthetic */ Consumer andThen(Consumer consumer) {
                    return consumer.getClass();
                }
            });
        }
    }

    @Override // defpackage.uit
    public final void b(List list) {
        Optional f = agec.f(list);
        if (!f.isPresent()) {
            zep.b("Could not get the YouTube custom payload.");
        } else if (!this.a.isPresent()) {
            zep.b("Endpoint resolver is missing.");
        } else {
            f.filter(agat.a).map(adgi.n).ifPresent(new agau((aafo) this.a.get()));
        }
    }

    @Override // defpackage.uit
    public final void c(List list) {
        Optional f = agec.f(list);
        if (!f.isPresent()) {
            zep.b("Could not get the YouTube custom payload.");
        } else if (!this.a.isPresent()) {
            zep.b("Endpoint resolver is missing.");
        } else {
            f.filter(agat.b).map(adgi.m).ifPresent(new agau((aafo) this.a.get()));
        }
    }
}
