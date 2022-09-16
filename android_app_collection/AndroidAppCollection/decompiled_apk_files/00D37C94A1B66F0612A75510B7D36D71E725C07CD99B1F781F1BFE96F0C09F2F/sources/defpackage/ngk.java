package defpackage;

import com.google.protos.youtube.api.innertube.ButtonRendererOuterClass;
import com.google.protos.youtube.api.innertube.IconBadgeRendererOuterClass;
import j$.util.Optional;
import j$.util.function.Function;
import java.util.ArrayList;
/* compiled from: PG */
/* renamed from: ngk  reason: default package */
/* loaded from: classes3.dex */
public final /* synthetic */ class ngk implements Function {
    public final /* synthetic */ ngm a;
    private final /* synthetic */ int b;

    public /* synthetic */ ngk(ngm ngmVar) {
        this.a = ngmVar;
    }

    public /* synthetic */ ngk(ngm ngmVar, int i) {
        this.b = i;
        this.a = ngmVar;
    }

    @Override // j$.util.function.Function
    public final /* synthetic */ Function andThen(Function function) {
        int i = this.b;
        if (i != 0 && i == 1) {
            return function.getClass();
        }
        return function.getClass();
    }

    @Override // j$.util.function.Function
    public final /* synthetic */ Function compose(Function function) {
        int i = this.b;
        if (i != 0 && i == 1) {
            return function.getClass();
        }
        return function.getClass();
    }

    @Override // j$.util.function.Function
    public final Object apply(Object obj) {
        int i = this.b;
        if (i != 0) {
            if (i == 1) {
                ngm ngmVar = this.a;
                apoj apojVar = (apoj) obj;
                apzg apzgVar = apojVar.o;
                if (apzgVar == null) {
                    apzgVar = apzg.a;
                }
                arag aragVar = apojVar.i;
                if (aragVar == null) {
                    aragVar = arag.a;
                }
                return ngmVar.j(apzgVar, aragVar, ngmVar.i);
            }
            ngm ngmVar2 = this.a;
            aunb aunbVar = (aunb) obj;
            if (aunbVar.qn(ButtonRendererOuterClass.buttonRenderer)) {
                return ngmVar2.f.a(ngmVar2.h, (apoj) aunbVar.qm(ButtonRendererOuterClass.buttonRenderer), new ArrayList());
            }
            return ngmVar2.g.a(ngmVar2.h, (arhm) aunbVar.qm(IconBadgeRendererOuterClass.iconBadgeRenderer));
        }
        ngm ngmVar3 = this.a;
        aten atenVar = (aten) obj;
        int i2 = atenVar.b;
        if ((i2 & 1) != 0) {
            ateo ateoVar = atenVar.c;
            if (ateoVar == null) {
                ateoVar = ateo.a;
            }
            apzg apzgVar2 = ateoVar.e;
            if (apzgVar2 == null) {
                apzgVar2 = apzg.a;
            }
            arag aragVar2 = ateoVar.c;
            if (aragVar2 == null) {
                aragVar2 = arag.a;
            }
            return Optional.of(ngmVar3.j(apzgVar2, aragVar2, ngmVar3.i));
        } else if ((i2 & 2) != 0) {
            ater aterVar = atenVar.d;
            if (aterVar == null) {
                aterVar = ater.a;
            }
            apzg apzgVar3 = aterVar.e;
            if (apzgVar3 == null) {
                apzgVar3 = apzg.a;
            }
            arag aragVar3 = aterVar.c;
            if (aragVar3 == null) {
                aragVar3 = arag.a;
            }
            return Optional.ofNullable(ngmVar3.j(apzgVar3, aragVar3, ngmVar3.i));
        } else {
            return Optional.empty();
        }
    }
}
