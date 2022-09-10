package defpackage;

import android.os.SystemClock;
import java.util.ArrayList;
import java.util.List;
/* compiled from: PG */
/* renamed from: csig  reason: default package */
/* loaded from: classes5.dex */
public final class csig extends csgx {
    private final csga a;

    public csig(csga csgaVar) {
        this.a = csgaVar;
    }

    @Override // defpackage.csgx
    public final void a(final csgw csgwVar, final csgt csgtVar) {
        this.a.a(new csfz(csgtVar, csgwVar) { // from class: csif
            private final csgt a;
            private final csgw b;

            {
                this.a = csgtVar;
                this.b = csgwVar;
            }

            @Override // defpackage.csfz
            public final List a() {
                csgt csgtVar2 = this.a;
                csgw csgwVar2 = this.b;
                boolean z = true;
                dbsk.m(csgtVar2 != null, "View is not instrumented.");
                cshu<csgt> cshuVar = csgtVar2.b;
                if (!cshuVar.a.isEmpty()) {
                    for (cshr<csgt> cshrVar : cshuVar.a) {
                        cshrVar.c(csgtVar2);
                    }
                }
                dbsk.r(csgtVar2.e(), "VE is not impressed: %s {attached=%s}", csgtVar2, Boolean.valueOf(((cshd) csgtVar2.c).c));
                if (csgtVar2.a() != ddhj.VISIBILITY_VISIBLE) {
                    z = false;
                }
                dbsk.p(z, "VE is not visible: %s", csgtVar2);
                ddxz a = csfr.a();
                ArrayList arrayList = new ArrayList();
                cshv.a(csgtVar2, arrayList);
                return dcdc.f(new csir(a, arrayList, csgwVar2, 1000 * SystemClock.elapsedRealtime()));
            }
        });
    }
}
