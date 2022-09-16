package defpackage;

import com.google.protos.youtube.api.innertube.WatchEndpointOuterClass;
import java.io.IOException;
import java.util.Collections;
/* compiled from: PG */
/* renamed from: aaav  reason: default package */
/* loaded from: classes.dex */
public final class aaav implements aaoo {
    private final ces a;
    private final aidg b;

    public aaav(ces cesVar, aidg aidgVar) {
        cesVar.getClass();
        this.a = cesVar;
        aidgVar.getClass();
        this.b = aidgVar;
    }

    @Override // defpackage.aaoo
    public final /* bridge */ /* synthetic */ void a(Object obj) {
        apzg apzgVar = (apzg) obj;
        if (!aidg.a(apzgVar)) {
            return;
        }
        aqxo.y(aidg.a(apzgVar));
        awem awemVar = ((awel) apzgVar.qm(WatchEndpointOuterClass.watchEndpoint)).l;
        if (awemVar == null) {
            awemVar = awem.a;
        }
        atza atzaVar = awemVar.d;
        if (atzaVar == null) {
            atzaVar = atza.a;
        }
        byte[] I = atzaVar.c.I();
        aidg aidgVar = this.b;
        aina c = ((aimy) aidgVar.a.get()).c();
        awel awelVar = (awel) apzgVar.qm(WatchEndpointOuterClass.watchEndpoint);
        int i = awelVar.b;
        if ((i & 1) != 0) {
            c.b = awelVar.c;
        }
        if ((i & 2) != 0) {
            c.d = awelVar.d;
        }
        if ((i & 4) != 0) {
            c.s = awelVar.e;
        }
        if ((i & 512) != 0) {
            c.c = awelVar.k;
        }
        c.j(apzgVar.c);
        c.j = true;
        aidgVar.b.rj(c);
        String b = c.b();
        arpa arpaVar = null;
        if (I != null) {
            try {
                aoog O = aoog.O(I);
                int n = O.n();
                while (true) {
                    if (n == 0) {
                        break;
                    } else if (aosl.a(n) == 1) {
                        arpa arpaVar2 = arpa.a;
                        aoos b2 = aoos.b();
                        int k = ((aooc) O).k();
                        O.P();
                        int f = ((aooc) O).f(k);
                        ((aooc) O).a++;
                        aopi parsePartialFrom = aopi.parsePartialFrom(arpaVar2, O, b2);
                        ((aooc) O).B(0);
                        ((aooc) O).a--;
                        if (((aooc) O).d() != 0) {
                            throw aopx.j();
                        }
                        ((aooc) O).C(f);
                        arpaVar = (arpa) parsePartialFrom;
                    } else {
                        O.G(n);
                        n = O.n();
                    }
                }
            } catch (IOException e) {
                try {
                    throw new aopx(e.getMessage());
                } catch (aopx e2) {
                    String valueOf = String.valueOf(e2.getLocalizedMessage());
                    zep.l(valueOf.length() != 0 ? "Failed to parse inlined prefetch data: ".concat(valueOf) : new String("Failed to parse inlined prefetch data: "));
                }
            }
        }
        cer f2 = abga.f(I, Collections.emptyMap(), arpaVar);
        if (f2 == null) {
            return;
        }
        this.a.d(b, f2);
    }
}
