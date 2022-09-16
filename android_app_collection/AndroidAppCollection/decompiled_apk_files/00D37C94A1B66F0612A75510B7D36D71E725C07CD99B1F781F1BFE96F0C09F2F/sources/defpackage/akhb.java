package defpackage;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeoutException;
/* compiled from: PG */
/* renamed from: akhb  reason: default package */
/* loaded from: classes.dex */
final class akhb implements aniq {
    final /* synthetic */ ankt a;
    final /* synthetic */ ankt b;
    final /* synthetic */ ankt c;
    final /* synthetic */ akhc d;

    public akhb(akhc akhcVar, ankt anktVar, ankt anktVar2, ankt anktVar3) {
        this.d = akhcVar;
        this.a = anktVar;
        this.b = anktVar2;
        this.c = anktVar3;
    }

    @Override // defpackage.aniq
    public final ankt a() {
        try {
            akhe akheVar = (akhe) anlz.y(this.a);
            apwt.w(akheVar);
            akheVar.b.size();
            if (akheVar != null && !akheVar.b.isEmpty()) {
                return anlz.q(akheVar);
            }
        } catch (ExecutionException e) {
            if (!(e.getCause() instanceof TimeoutException)) {
                apwt.u("OnlineAndOnDeviceSuggestionSource: Error getting online suggestions.", e);
            }
        }
        final boolean z = false;
        try {
            akhe akheVar2 = (akhe) anlz.y(this.b);
            akheVar2.b.size();
            if (akheVar2.b.size() >= this.d.a.b()) {
                z = this.d.a.m();
                if (this.d.a.l()) {
                    apwt.w(akheVar2);
                    this.c.cancel(true);
                    return anlz.q(akheVar2);
                }
            }
        } catch (ExecutionException e2) {
            apwt.u("OnlineAndOnDeviceSuggestionSource: Error getting on device suggestions.", e2);
        }
        return anii.i(this.c, new anir() { // from class: akha
            @Override // defpackage.anir
            public final ankt a(Object obj) {
                boolean z2 = z;
                akhe akheVar3 = (akhe) obj;
                apwt.w(akheVar3);
                if (akheVar3 == null) {
                    return anlz.q(akhe.a);
                }
                if (z2) {
                    akheVar3.c = true;
                }
                return anlz.q(akheVar3);
            }
        }, this.d.d);
    }
}
