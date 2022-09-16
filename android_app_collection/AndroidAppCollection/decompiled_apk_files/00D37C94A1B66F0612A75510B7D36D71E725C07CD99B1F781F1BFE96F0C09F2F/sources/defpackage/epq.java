package defpackage;

import android.os.Bundle;
import j$.util.Optional;
import j$.util.function.Consumer;
import java.util.Map;
/* compiled from: PG */
/* renamed from: epq  reason: default package */
/* loaded from: classes3.dex */
public final class epq implements aafl {
    private final dt a;
    private final ibm b;
    private final epp c;

    public epq(dt dtVar, ibm ibmVar, epp eppVar) {
        this.a = dtVar;
        this.b = ibmVar;
        this.c = eppVar;
    }

    @Override // defpackage.aafl
    public final void kD(apzg apzgVar, Map map) {
        if (this.a.isFinishing()) {
            return;
        }
        eo supportFragmentManager = this.a.getSupportFragmentManager();
        if (supportFragmentManager.Z()) {
            return;
        }
        dh a = this.c.a(apzgVar);
        Bundle bundle = (Bundle) Optional.ofNullable(a.m).orElseGet(ibz.b);
        bundle.putByteArray("navigation_endpoint", apzgVar.toByteArray());
        a.ae(bundle);
        Optional map2 = this.b.a().map(eoo.c);
        final l lVar = a.X;
        lVar.getClass();
        map2.ifPresent(new Consumer() { // from class: epo
            @Override // j$.util.function.Consumer
            public final void accept(Object obj) {
                apu.this.c((apx) obj);
            }

            @Override // j$.util.function.Consumer
            public final /* synthetic */ Consumer andThen(Consumer consumer) {
                return consumer.getClass();
            }
        });
        ex l = supportFragmentManager.l();
        l.r(a, "DialogFragmentFromNavigation");
        l.k();
    }
}
