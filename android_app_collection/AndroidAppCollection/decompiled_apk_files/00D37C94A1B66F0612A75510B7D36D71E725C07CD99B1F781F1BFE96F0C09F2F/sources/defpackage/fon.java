package defpackage;

import android.content.Context;
import com.google.protos.youtube.api.innertube.SubscribeEndpointOuterClass$SubscribeEndpoint;
import java.util.Map;
/* compiled from: PG */
/* renamed from: fon  reason: default package */
/* loaded from: classes3.dex */
public final class fon implements aafl {
    public final yzj a;
    public final azqb b;
    public final ajqa c;
    private final abdi d;
    private final agbd e;
    private final Context f;
    private final aacz g;

    public fon(Context context, abdi abdiVar, yzj yzjVar, azqb azqbVar, ajqa ajqaVar, agbd agbdVar, aacz aaczVar) {
        abdiVar.getClass();
        this.d = abdiVar;
        yzjVar.getClass();
        this.a = yzjVar;
        azqbVar.getClass();
        this.b = azqbVar;
        ajqaVar.getClass();
        this.c = ajqaVar;
        agbdVar.getClass();
        this.e = agbdVar;
        this.f = context;
        aaczVar.getClass();
        this.g = aaczVar;
    }

    public final void b(apzg apzgVar, Map map, boolean z) {
        foo fooVar;
        fop fopVar = (fop) zew.K(map, "com.google.android.libraries.youtube.innertube.endpoint.tag", fop.class);
        if (fopVar != null && (fooVar = fopVar.b) != null) {
            fooVar.a();
        }
        boolean z2 = fopVar != null && fopVar.a;
        abdf a = this.d.a();
        SubscribeEndpointOuterClass$SubscribeEndpoint subscribeEndpointOuterClass$SubscribeEndpoint = (SubscribeEndpointOuterClass$SubscribeEndpoint) apzgVar.qm(SubscribeEndpointOuterClass$SubscribeEndpoint.subscribeEndpoint);
        for (String str : subscribeEndpointOuterClass$SubscribeEndpoint.b) {
            a.t(str);
        }
        if (!subscribeEndpointOuterClass$SubscribeEndpoint.d.isEmpty()) {
            a.b = subscribeEndpointOuterClass$SubscribeEndpoint.d;
        }
        if (apzgVar.qn(auqs.b)) {
            auqr auqrVar = (auqr) apzgVar.qm(auqs.b);
            if (!auqrVar.c.isEmpty()) {
                a.l(auqrVar.c);
            }
        }
        a.a = subscribeEndpointOuterClass$SubscribeEndpoint.c;
        a.j(apzgVar.c);
        asxj asxjVar = this.g.b().e;
        if (asxjVar == null) {
            asxjVar = asxj.a;
        }
        if (asxjVar.ae) {
            boolean d = this.e.d(this.f);
            long a2 = this.e.a();
            aopa aopaVar = a.c;
            aopaVar.copyOnWrite();
            ator atorVar = (ator) aopaVar.instance;
            ator atorVar2 = ator.a;
            atorVar.b = 1 | atorVar.b;
            atorVar.c = d;
            aopa aopaVar2 = a.c;
            aopaVar2.copyOnWrite();
            ator atorVar3 = (ator) aopaVar2.instance;
            atorVar3.b |= 2;
            atorVar3.d = a2;
            aopa aopaVar3 = a.c;
            aopaVar3.copyOnWrite();
            ator atorVar4 = (ator) aopaVar3.instance;
            atorVar4.b |= 4;
            atorVar4.e = z;
        }
        ajlp ajlpVar = (ajlp) zew.K(map, "command_status_callback", ajlp.class);
        this.d.e(a, new fom(this, map, subscribeEndpointOuterClass$SubscribeEndpoint, z2, fopVar, (ajlpVar == null || ajlpVar.a()) ? null : ajlpVar.b(), apzgVar));
    }

    @Override // defpackage.aafl
    public final void kD(final apzg apzgVar, final Map map) {
        asxj asxjVar = this.g.b().e;
        if (asxjVar == null) {
            asxjVar = asxj.a;
        }
        if (asxjVar.ae) {
            ylx.k(this.e.c(), ylx.a, new ylv() { // from class: fok
                @Override // defpackage.zdt
                /* renamed from: b */
                public final void a(Throwable th) {
                    fon.this.b(apzgVar, map, true);
                }
            }, new ylw() { // from class: fol
                @Override // defpackage.ylw, defpackage.zdt
                public final void a(Object obj) {
                    fon.this.b(apzgVar, map, ((Boolean) obj).booleanValue());
                }
            });
        } else {
            b(apzgVar, map, false);
        }
    }
}
