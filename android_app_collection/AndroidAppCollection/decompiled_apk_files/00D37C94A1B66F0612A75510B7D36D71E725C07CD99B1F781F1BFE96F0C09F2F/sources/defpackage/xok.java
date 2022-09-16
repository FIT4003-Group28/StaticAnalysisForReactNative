package defpackage;

import com.google.protos.youtube.api.innertube.ElementRendererOuterClass;
import com.google.protos.youtube.api.innertube.ReplaceBackstagePostActionOuterClass;
import java.util.Map;
/* compiled from: PG */
/* renamed from: xok  reason: default package */
/* loaded from: classes4.dex */
public final class xok implements aafl {
    public static final /* synthetic */ int a = 0;
    private final xov b;

    public xok(xov xovVar) {
        this.b = xovVar;
    }

    @Override // defpackage.aafl
    public final void kD(apzg apzgVar, Map map) {
        final aunj aunjVar = apzgVar.qn(ReplaceBackstagePostActionOuterClass.replaceBackstagePostAction) ? (aunj) apzgVar.qm(ReplaceBackstagePostActionOuterClass.replaceBackstagePostAction) : null;
        if (aunjVar == null) {
            zep.b("ReplaceBackstagePostActionResolver received an action other than ReplaceBackstagePostAction.");
        } else if ((aunjVar.b & 1) == 0) {
        } else {
            aunb aunbVar = aunjVar.d;
            if (aunbVar == null) {
                aunbVar = aunb.a;
            }
            if (!aunbVar.qn(ElementRendererOuterClass.elementRenderer)) {
                return;
            }
            aunb aunbVar2 = aunjVar.d;
            if (aunbVar2 == null) {
                aunbVar2 = aunb.a;
            }
            ajhh a2 = ajhh.a((aqtb) aunbVar2.qm(ElementRendererOuterClass.elementRenderer));
            this.b.a.b(new aabn(a2, new ampt() { // from class: xoj
                @Override // defpackage.ampt
                public final boolean a(Object obj) {
                    aunj aunjVar2 = aunj.this;
                    int i = xok.a;
                    if (!(obj instanceof ajhh)) {
                        return false;
                    }
                    return ((aufs) ((ajhh) obj).b().qm(aufs.b)).c.equals(aunjVar2.c);
                }
            }));
        }
    }
}
