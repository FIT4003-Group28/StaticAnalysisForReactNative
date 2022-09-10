package defpackage;

import com.google.android.apps.gmm.car.api.GmmCarProjectionStateEvent;
/* compiled from: PG */
/* renamed from: ckta  reason: default package */
/* loaded from: classes4.dex */
public final class ckta {
    final /* synthetic */ cktd a;

    public ckta(cktd cktdVar) {
        this.a = cktdVar;
    }

    public final void a() {
        boolean z;
        synchronized (this.a.a) {
            cktd cktdVar = this.a;
            if (!cktdVar.e) {
                ckuv ckuvVar = cktdVar.c;
                synchronized (ckuvVar.c) {
                    z = !ckuvVar.e.isEmpty();
                }
                cktd cktdVar2 = this.a;
                if (z == cktdVar2.f) {
                    return;
                }
                cktdVar2.f = z;
                if (z) {
                    btrm btrmVar = cktdVar2.d;
                    cktb cktbVar = cktdVar2.h;
                    dceq a = dcet.a();
                    a.b(GmmCarProjectionStateEvent.class, new ckte(0, GmmCarProjectionStateEvent.class, cktbVar));
                    a.b(asin.class, new ckte(1, asin.class, cktbVar));
                    btrmVar.g(cktbVar, a.a());
                    cktdVar2.c();
                } else {
                    cktdVar2.a();
                }
            }
        }
    }
}
