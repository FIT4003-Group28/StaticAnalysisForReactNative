package defpackage;
/* compiled from: PG */
/* renamed from: aosb  reason: default package */
/* loaded from: classes2.dex */
public final class aosb {
    public static <C extends fd & nxd> Runnable a(ges gesVar, bwqv bwqvVar, @dzsi C c) {
        return b(gesVar, bwqvVar, c, null);
    }

    public static <C extends fd & nxd> Runnable b(final ges gesVar, final bwqv bwqvVar, @dzsi final C c, @dzsi final bxko bxkoVar) {
        return new Runnable(gesVar, bwqvVar, c, bxkoVar) { // from class: aosa
            private final ges a;
            private final bwqv b;
            private final fd c;
            private final bxko d;

            {
                this.a = gesVar;
                this.b = bwqvVar;
                this.c = c;
                this.d = bxkoVar;
            }

            @Override // java.lang.Runnable
            public final void run() {
                ges gesVar2 = this.a;
                bwqv bwqvVar2 = this.b;
                fd fdVar = this.c;
                bxko bxkoVar2 = this.d;
                if (!gesVar2.aD) {
                    return;
                }
                gesVar2.aZ(aorz.g(bwqvVar2, gesVar2.Rn(), fdVar, bxkoVar2));
            }
        };
    }
}
