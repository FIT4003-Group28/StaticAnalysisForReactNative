package defpackage;

import java.util.List;
/* compiled from: PG */
/* renamed from: sgi  reason: default package */
/* loaded from: classes7.dex */
final class sgi implements degu<amte> {
    final /* synthetic */ sgl a;

    public sgi(sgl sglVar) {
        this.a = sglVar;
    }

    @Override // defpackage.degu
    public final void a(Throwable th) {
        if (th instanceof qsk) {
            this.a.N(4);
        } else if (!(th instanceof qsl)) {
        } else {
            final sgl sglVar = this.a;
            sglVar.e.a(new Runnable(sglVar) { // from class: sgh
                private final sgl a;

                {
                    this.a = sglVar;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    this.a.J();
                }
            });
            this.a.N(5);
        }
    }

    @Override // defpackage.degu
    public final /* bridge */ /* synthetic */ void b(@dzsi amte amteVar) {
        amte amteVar2 = amteVar;
        sgl sglVar = this.a;
        sglVar.g = amteVar2;
        int i = 4;
        if (amteVar2 == null) {
            sglVar.N(4);
            return;
        }
        List<sbe> a = sea.a(amteVar2.a(sglVar.b), sglVar.c, sgg.a, dtyd.aT);
        sglVar.f = a.isEmpty() ? null : a.get(0);
        sgl sglVar2 = this.a;
        if (sglVar2.f != null) {
            i = 2;
        }
        sglVar2.N(i);
    }
}
