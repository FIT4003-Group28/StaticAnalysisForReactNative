package defpackage;

import com.google.android.gms.udc.UdcCacheResponse;
/* compiled from: PG */
/* renamed from: bbee  reason: default package */
/* loaded from: classes3.dex */
final class bbee implements akeo {
    final /* synthetic */ bbek a;

    public bbee(bbek bbekVar) {
        this.a = bbekVar;
    }

    @Override // defpackage.akeo
    public final void a(gga ggaVar, btlu btluVar) {
        deha.q(this.a.a(), this.a.g(new bvqg(this) { // from class: bbed
            private final bbee a;

            {
                this.a = this;
            }

            @Override // defpackage.bvqg
            public final void NU(Object obj) {
                bbee bbeeVar = this.a;
                if (bbek.f((UdcCacheResponse) obj)) {
                    bbeeVar.a.d();
                } else {
                    bbeeVar.a.h();
                }
            }
        }), dege.a);
    }

    @Override // defpackage.akeo
    public final void b(gga ggaVar, btlu btluVar) {
        this.a.c();
    }
}
