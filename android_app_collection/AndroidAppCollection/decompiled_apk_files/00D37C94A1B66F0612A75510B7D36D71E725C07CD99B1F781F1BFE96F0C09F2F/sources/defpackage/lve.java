package defpackage;

import j$.util.Collection;
import j$.util.Optional;
import j$.util.function.Function;
import java.util.List;
/* compiled from: PG */
/* renamed from: lve  reason: default package */
/* loaded from: classes3.dex */
public final class lve {
    public final aafo a;
    public final acth b;
    public atep c;
    public final lya d;
    private final azpx e;
    private amuk f;

    public lve(aafo aafoVar, lya lyaVar, acth acthVar) {
        azpx aO = azpm.aI(Optional.empty()).aO();
        this.e = aO;
        this.a = aafoVar;
        this.d = lyaVar;
        aO.V(new ayqe() { // from class: lvb
            @Override // defpackage.ayqe
            public final Object a(Object obj) {
                return lve.this.a((Optional) obj);
            }
        }).aE().aI();
        this.b = acthVar;
    }

    public final amuk a(Optional optional) {
        return (amuk) Collection.EL.stream((List) optional.map(jsa.o).orElse(amuk.q())).map(jsa.n).map(new Function() { // from class: lvc
            @Override // j$.util.function.Function
            public final /* synthetic */ Function andThen(Function function) {
                return function.getClass();
            }

            @Override // j$.util.function.Function
            public final Object apply(Object obj) {
                apzg apzgVar;
                lve lveVar = lve.this;
                aoqu aoquVar = (aoqu) obj;
                arag aragVar = null;
                if (aoquVar instanceof ateo) {
                    lya lyaVar = lveVar.d;
                    aafo aafoVar = lveVar.a;
                    ateo ateoVar = (ateo) aoquVar;
                    acti oi = lveVar.b.oi();
                    if ((ateoVar.b & 4) != 0) {
                        apzg apzgVar2 = ateoVar.e;
                        if (apzgVar2 == null) {
                            apzgVar2 = apzg.a;
                        }
                        apzgVar = apzgVar2;
                    } else {
                        apzgVar = null;
                    }
                    if ((ateoVar.b & 1) != 0 && (aragVar = ateoVar.c) == null) {
                        aragVar = arag.a;
                    }
                    return Optional.of(new lvd(lyaVar, aafoVar, apzgVar, ajgl.b(aragVar), ateoVar.f, oi));
                } else if (aoquVar instanceof ater) {
                    lya lyaVar2 = lveVar.d;
                    aafo aafoVar2 = lveVar.a;
                    ater aterVar = (ater) aoquVar;
                    apzg apzgVar3 = aterVar.e;
                    if (apzgVar3 == null) {
                        apzgVar3 = apzg.a;
                    }
                    apzg apzgVar4 = apzgVar3;
                    if ((aterVar.b & 1) != 0 && (aragVar = aterVar.c) == null) {
                        aragVar = arag.a;
                    }
                    return Optional.of(new lvd(lyaVar2, aafoVar2, apzgVar4, ajgl.b(aragVar), null, null));
                } else {
                    return Optional.empty();
                }
            }

            @Override // j$.util.function.Function
            public final /* synthetic */ Function compose(Function function) {
                return function.getClass();
            }
        }).filter(lws.b).map(jsa.p).collect(amsf.a);
    }

    public final amuk b() {
        if (this.f == null) {
            this.f = a(Optional.ofNullable(this.c));
        }
        return this.f;
    }

    public final void c(atep atepVar) {
        this.c = atepVar;
        this.f = null;
        this.e.c(Optional.ofNullable(atepVar));
    }
}
