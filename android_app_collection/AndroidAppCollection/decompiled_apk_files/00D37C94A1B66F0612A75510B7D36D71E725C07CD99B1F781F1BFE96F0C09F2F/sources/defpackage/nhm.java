package defpackage;

import com.google.protos.youtube.api.innertube.SharePlaylistEndpointOuterClass$SharePlaylistEndpoint;
import j$.util.Optional;
import j$.util.function.Function;
/* compiled from: PG */
/* renamed from: nhm  reason: default package */
/* loaded from: classes3.dex */
public final /* synthetic */ class nhm implements Function {
    public final /* synthetic */ nhr a;
    private final /* synthetic */ int b;

    public /* synthetic */ nhm(nhr nhrVar) {
        this.a = nhrVar;
    }

    public /* synthetic */ nhm(nhr nhrVar, int i) {
        this.b = i;
        this.a = nhrVar;
    }

    @Override // j$.util.function.Function
    public final /* synthetic */ Function andThen(Function function) {
        return this.b != 0 ? function.getClass() : function.getClass();
    }

    @Override // j$.util.function.Function
    public final /* synthetic */ Function compose(Function function) {
        return this.b != 0 ? function.getClass() : function.getClass();
    }

    @Override // j$.util.function.Function
    public final Object apply(Object obj) {
        aten b;
        if (this.b == 0) {
            nhr nhrVar = this.a;
            aten atenVar = (aten) obj;
            if ((atenVar.b & 1) != 0) {
                ateo ateoVar = atenVar.c;
                if (ateoVar == null) {
                    ateoVar = ateo.a;
                }
                apzg apzgVar = ateoVar.e;
                if (apzgVar == null) {
                    apzgVar = apzg.a;
                }
                if (apzgVar.qn(SharePlaylistEndpointOuterClass$SharePlaylistEndpoint.sharePlaylistEndpoint)) {
                    apzg apzgVar2 = ateoVar.e;
                    if (apzgVar2 == null) {
                        apzgVar2 = apzg.a;
                    }
                    arag aragVar = ateoVar.c;
                    if (aragVar == null) {
                        aragVar = arag.a;
                    }
                    return Optional.of(new nht(apzgVar2, ajgl.b(aragVar), nhrVar.f, 1));
                }
            }
            if ((atenVar.b & 2) == 0 || (b = nhrVar.h.b(atenVar, null)) == null) {
                return Optional.empty();
            }
            ater aterVar = b.d;
            if (aterVar == null) {
                aterVar = ater.a;
            }
            apzg apzgVar3 = aterVar.e;
            if (apzgVar3 == null) {
                apzgVar3 = apzg.a;
            }
            arag aragVar2 = aterVar.c;
            if (aragVar2 == null) {
                aragVar2 = arag.a;
            }
            return Optional.of(new nht(apzgVar3, ajgl.b(aragVar2), nhrVar.f, 2));
        }
        nhr nhrVar2 = this.a;
        return new nhp(nhrVar2, (aten) obj, nhrVar2.i);
    }
}
