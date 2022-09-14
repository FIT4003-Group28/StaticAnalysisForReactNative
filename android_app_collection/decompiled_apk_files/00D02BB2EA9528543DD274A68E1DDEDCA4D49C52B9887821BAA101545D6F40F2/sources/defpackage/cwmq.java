package defpackage;

import java.util.HashMap;
/* compiled from: PG */
/* renamed from: cwmq  reason: default package */
/* loaded from: classes5.dex */
final class cwmq {
    public final cwkn a;
    public final String b;
    public final int c;
    private final cwoi d;
    private final cwlw e;
    private final cwmv f;

    public cwmq(cwoi cwoiVar, cwlw cwlwVar, cwkn cwknVar, String str, int i) {
        this.d = cwoiVar;
        this.e = cwlwVar;
        this.f = new cwmv(cwoiVar);
        this.a = cwknVar;
        this.b = str;
        this.c = i;
    }

    public final dehn<dcdc<cwls>> a(final boolean z) {
        dehn<dcdc<cwls>> a;
        dehn<dcdc<cwls>> a2;
        if (z) {
            a = this.d.b();
            a2 = this.e.b();
        } else {
            a = this.d.a();
            a2 = this.e.a();
        }
        this.f.a(a, a2, new cwmu(this, z) { // from class: cwmp
            private final cwmq a;
            private final boolean b;

            {
                this.a = this;
                this.b = z;
            }

            @Override // defpackage.cwmu
            public final void a(Object obj, Object obj2) {
                int i;
                dcdc dcdcVar;
                cwmq cwmqVar = this.a;
                boolean z2 = this.b;
                dcdc dcdcVar2 = (dcdc) obj;
                dcdc dcdcVar3 = (dcdc) obj2;
                HashMap hashMap = new HashMap();
                int size = dcdcVar2.size();
                for (int i2 = 0; i2 < size; i2++) {
                    cwls cwlsVar = (cwls) dcdcVar2.get(i2);
                    hashMap.put(cwlsVar.a(), cwlsVar);
                }
                int size2 = dcdcVar3.size();
                int i3 = 0;
                while (i3 < size2) {
                    cwls cwlsVar2 = (cwls) dcdcVar3.get(i3);
                    cwls cwlsVar3 = (cwls) hashMap.get(cwlsVar2.a());
                    if (cwlsVar3 != null) {
                        cwkn cwknVar = cwmqVar.a;
                        int i4 = cwmqVar.c;
                        boolean a3 = dbsd.a(cwlsVar3.e(), cwlsVar2.e());
                        boolean a4 = dbsd.a(cwlsVar3.b(), cwlsVar2.b());
                        boolean a5 = dbsd.a(cwlsVar3.c(), cwlsVar2.c());
                        boolean a6 = dbsd.a(cwlsVar3.d(), cwlsVar2.d());
                        boolean a7 = dbsd.a(Boolean.valueOf(cwlsVar3.f()), Boolean.valueOf(cwlsVar2.f()));
                        i = size2;
                        boolean a8 = dbsd.a(cwlsVar3.h(), cwlsVar2.h());
                        String str = cwmqVar.b;
                        dcdcVar = dcdcVar3;
                        Boolean valueOf = Boolean.valueOf(z2);
                        cwknVar.c.a().a(cwmr.a(i4), Boolean.valueOf(a3), Boolean.valueOf(a4), Boolean.valueOf(a5), Boolean.valueOf(a6), Boolean.valueOf(a7), Boolean.valueOf(a8), str, valueOf);
                        cwmqVar.a.d.a().a(Boolean.valueOf(cwlsVar3.b() != null), Boolean.valueOf(cwlsVar2.b() != null), Boolean.valueOf(dbsd.a(cwlsVar3.b(), cwlsVar2.b())), Boolean.valueOf(cwlsVar3.h() != null), Boolean.valueOf(cwlsVar2.h() != null), Boolean.valueOf(dbsd.a(cwlsVar3.h(), cwlsVar2.h())), cwmqVar.b, valueOf);
                    } else {
                        i = size2;
                        dcdcVar = dcdcVar3;
                    }
                    i3++;
                    size2 = i;
                    dcdcVar3 = dcdcVar;
                }
            }
        });
        return this.c == 2 ? a2 : a;
    }
}
