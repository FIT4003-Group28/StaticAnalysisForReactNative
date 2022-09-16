package defpackage;

import com.google.protos.youtube.api.innertube.UnsubscribeEndpointOuterClass$UnsubscribeEndpoint;
import java.util.Map;
/* compiled from: PG */
/* renamed from: foq  reason: default package */
/* loaded from: classes3.dex */
final class foq implements afzf {
    final /* synthetic */ Map a;
    final /* synthetic */ apzg b;
    final /* synthetic */ fop c;
    final /* synthetic */ Cfor d;
    final /* synthetic */ aysm e;

    public foq(Cfor cfor, Map map, apzg apzgVar, fop fopVar, aysm aysmVar) {
        this.d = cfor;
        this.a = map;
        this.b = apzgVar;
        this.c = fopVar;
        this.e = aysmVar;
    }

    @Override // defpackage.cez
    public final void kV(cff cffVar) {
        foo fooVar;
        this.d.a.e(cffVar);
        for (String str : ((UnsubscribeEndpointOuterClass$UnsubscribeEndpoint) this.b.qm(UnsubscribeEndpointOuterClass$UnsubscribeEndpoint.unsubscribeEndpoint)).c) {
            iiq d = iiq.d(this.d.c, str);
            if (d != null) {
                this.d.c.d(d.b, d);
            }
        }
        fop fopVar = this.c;
        if (fopVar != null && (fooVar = fopVar.b) != null) {
            fooVar.c();
        }
        aysm aysmVar = this.e;
        if (aysmVar != null) {
            aysmVar.c(cffVar);
        }
    }

    @Override // defpackage.afzf
    public final /* synthetic */ void kW() {
    }

    @Override // defpackage.cfa
    public final /* bridge */ /* synthetic */ void lG(Object obj) {
        foo fooVar;
        acti actiVar;
        asdi asdiVar = (asdi) obj;
        Map map = this.a;
        if (map != null && (asdiVar.b & 4) != 0 && (actiVar = (acti) zew.K(map, "com.google.android.libraries.youtube.logging.interaction_logger", acti.class)) != null) {
            actiVar.D(new acte(asdiVar.f.I()));
            actiVar.u(new acte(asdiVar.f.I()), null);
        }
        for (String str : ((UnsubscribeEndpointOuterClass$UnsubscribeEndpoint) this.b.qm(UnsubscribeEndpointOuterClass$UnsubscribeEndpoint.unsubscribeEndpoint)).c) {
            iip c = iiq.c(str);
            c.c = false;
            c.e(true);
            c.d(asdiVar.g);
            iiq a = c.a();
            this.d.c.c(a.b, a);
        }
        fop fopVar = this.c;
        if (fopVar != null && (fooVar = fopVar.b) != null) {
            fooVar.b(null);
        }
        if (asdiVar.e.size() != 0) {
            this.d.b.d(asdiVar.e, this.a);
        }
        aysm aysmVar = this.e;
        if (aysmVar != null) {
            aysmVar.a();
        }
    }
}
