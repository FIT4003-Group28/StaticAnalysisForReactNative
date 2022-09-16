package defpackage;

import com.google.protos.youtube.api.innertube.SubscribeEndpointOuterClass$SubscribeEndpoint;
import java.util.Map;
/* compiled from: PG */
/* renamed from: fom  reason: default package */
/* loaded from: classes3.dex */
final class fom implements afzf {
    final /* synthetic */ Map a;
    final /* synthetic */ SubscribeEndpointOuterClass$SubscribeEndpoint b;
    final /* synthetic */ boolean c;
    final /* synthetic */ fop d;
    final /* synthetic */ apzg e;
    final /* synthetic */ fon f;
    final /* synthetic */ aysm g;

    public fom(fon fonVar, Map map, SubscribeEndpointOuterClass$SubscribeEndpoint subscribeEndpointOuterClass$SubscribeEndpoint, boolean z, fop fopVar, aysm aysmVar, apzg apzgVar) {
        this.f = fonVar;
        this.a = map;
        this.b = subscribeEndpointOuterClass$SubscribeEndpoint;
        this.c = z;
        this.d = fopVar;
        this.g = aysmVar;
        this.e = apzgVar;
    }

    @Override // defpackage.cez
    public final void kV(cff cffVar) {
        foo fooVar;
        this.f.a.e(cffVar);
        for (String str : ((SubscribeEndpointOuterClass$SubscribeEndpoint) this.e.qm(SubscribeEndpointOuterClass$SubscribeEndpoint.subscribeEndpoint)).b) {
            iiq d = iiq.d(this.f.c, str);
            if (d != null) {
                iip f = d.f();
                f.c(this.c);
                iiq a = f.a();
                this.f.c.d(a.b, a);
            }
        }
        fop fopVar = this.d;
        if (fopVar != null && (fooVar = fopVar.b) != null) {
            fooVar.c();
        }
        aysm aysmVar = this.g;
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
        avbl avblVar;
        acti actiVar;
        asdg asdgVar = (asdg) obj;
        Map map = this.a;
        if (map != null && (asdgVar.b & 16) != 0 && (actiVar = (acti) zew.K(map, "com.google.android.libraries.youtube.logging.interaction_logger", acti.class)) != null) {
            actiVar.D(new acte(asdgVar.h.I()));
            actiVar.u(new acte(asdgVar.h.I()), null);
        }
        for (String str : this.b.b) {
            iip c = iiq.c(str);
            c.c = true;
            c.c(this.c);
            c.d(asdgVar.i);
            c.e(true);
            if ((asdgVar.b & 4) != 0) {
                arxz arxzVar = asdgVar.g;
                if (arxzVar == null) {
                    arxzVar = arxz.a;
                }
                int i = arxzVar.b;
                int i2 = 119226798;
                if (i == 119226798) {
                    avblVar = (avbl) arxzVar.c;
                } else {
                    i2 = i;
                    avblVar = null;
                }
                c.e = avblVar;
                c.d = i2 == 136076983 ? (avbh) arxzVar.c : null;
            }
            iiq a = c.a();
            this.f.c.c(a.b, a);
        }
        if (asdgVar.e.size() != 0) {
            ((aafo) this.f.b.get()).d(asdgVar.e, this.a);
        }
        fop fopVar = this.d;
        if (fopVar != null && (fooVar = fopVar.b) != null) {
            fooVar.b(asdgVar);
        }
        aysm aysmVar = this.g;
        if (aysmVar != null) {
            aysmVar.a();
        }
    }
}
