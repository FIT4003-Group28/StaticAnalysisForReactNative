package defpackage;

import com.google.protos.youtube.api.innertube.DismissalEndpointOuterClass$DismissalEndpoint;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Map;
/* compiled from: PG */
/* renamed from: eps  reason: default package */
/* loaded from: classes3.dex */
public final class eps implements aafl, afzf {
    private final aavu a;
    private final yzj b;
    private final aafo c;

    public eps(aavu aavuVar, yzj yzjVar, aafo aafoVar) {
        aavuVar.getClass();
        this.a = aavuVar;
        yzjVar.getClass();
        this.b = yzjVar;
        aafoVar.getClass();
        this.c = aafoVar;
    }

    private static boolean d(arqv arqvVar) {
        return arqvVar.c.size() > 0;
    }

    @Override // defpackage.aafl
    public final void kD(apzg apzgVar, Map map) {
        aavu aavuVar = this.a;
        aavt aavtVar = new aavt(aavuVar.e, aavuVar.a.c());
        DismissalEndpointOuterClass$DismissalEndpoint dismissalEndpointOuterClass$DismissalEndpoint = (DismissalEndpointOuterClass$DismissalEndpoint) apzgVar.qm(DismissalEndpointOuterClass$DismissalEndpoint.dismissalEndpoint);
        aavtVar.a = Arrays.asList(dismissalEndpointOuterClass$DismissalEndpoint.b);
        aavtVar.j(apzgVar.c);
        this.a.b.e(aavtVar, this);
        if (dismissalEndpointOuterClass$DismissalEndpoint.c.size() != 0) {
            this.c.d(dismissalEndpointOuterClass$DismissalEndpoint.c, map);
        }
    }

    @Override // defpackage.cez
    public final void kV(cff cffVar) {
        this.b.e(cffVar);
    }

    @Override // defpackage.afzf
    public final /* synthetic */ void kW() {
    }

    @Override // defpackage.cfa
    public final /* bridge */ /* synthetic */ void lG(Object obj) {
        List<String> list;
        arqv arqvVar = (arqv) obj;
        if (d(arqvVar)) {
            if (!d(arqvVar)) {
                list = Collections.emptyList();
            } else {
                ArrayList arrayList = new ArrayList(arqvVar.c.size());
                for (arqw arqwVar : arqvVar.c) {
                    arrayList.add(arqwVar.b);
                }
                list = arrayList;
            }
            for (String str : list) {
                String valueOf = String.valueOf(str);
                zep.b(valueOf.length() != 0 ? "Dismiss failed: ".concat(valueOf) : new String("Dismiss failed: "));
            }
        }
    }
}
