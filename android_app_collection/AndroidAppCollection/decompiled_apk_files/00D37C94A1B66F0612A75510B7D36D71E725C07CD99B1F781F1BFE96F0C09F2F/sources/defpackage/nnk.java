package defpackage;

import java.util.concurrent.TimeUnit;
/* compiled from: PG */
/* renamed from: nnk  reason: default package */
/* loaded from: classes3.dex */
public final class nnk {
    static final String a = aakj.f(ataf.b.a(), "sync_model");
    public static final /* synthetic */ int c = 0;
    public final long b;
    private final aagi d;

    public nnk(aagi aagiVar, aacz aaczVar) {
        this.d = aagiVar;
        asxj asxjVar = aaczVar.b().e;
        this.b = (asxjVar == null ? asxj.a : asxjVar).bo;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final ayoi a(aqvq aqvqVar) {
        String str;
        auqh auqhVar;
        auqh auqhVar2;
        aagh c2 = this.d.c();
        if ((aqvqVar.c & 16) != 0) {
            aqvo aqvoVar = aqvqVar.g;
            if (aqvoVar == null) {
                aqvoVar = aqvo.a;
            }
            if (aqvoVar.b == 49399797) {
                aqvo aqvoVar2 = aqvqVar.g;
                if (aqvoVar2 == null) {
                    aqvoVar2 = aqvo.a;
                }
                if (aqvoVar2.b == 49399797) {
                    auqhVar = (auqh) aqvoVar2.c;
                } else {
                    auqhVar = auqh.a;
                }
                if ((auqhVar.c & 32768) != 0) {
                    int a2 = ataf.b.a();
                    aqvo aqvoVar3 = aqvqVar.g;
                    if (aqvoVar3 == null) {
                        aqvoVar3 = aqvo.a;
                    }
                    if (aqvoVar3.b == 49399797) {
                        auqhVar2 = (auqh) aqvoVar3.c;
                    } else {
                        auqhVar2 = auqh.a;
                    }
                    str = aakj.f(a2, auqhVar2.p);
                    return c2.h(str, true).I(kth.s).V(lyd.s).k(atad.class).I(kth.t).q(new ayol() { // from class: nnj
                        @Override // defpackage.ayol
                        public final ayok a(ayoi ayoiVar) {
                            long j = nnk.this.b;
                            return j > 0 ? ayoiVar.x(j, TimeUnit.MILLISECONDS) : ayoiVar;
                        }
                    }).V(lyd.t).X(aypa.a());
                }
            }
        }
        str = a;
        return c2.h(str, true).I(kth.s).V(lyd.s).k(atad.class).I(kth.t).q(new ayol() { // from class: nnj
            @Override // defpackage.ayol
            public final ayok a(ayoi ayoiVar) {
                long j = nnk.this.b;
                return j > 0 ? ayoiVar.x(j, TimeUnit.MILLISECONDS) : ayoiVar;
            }
        }).V(lyd.t).X(aypa.a());
    }
}
