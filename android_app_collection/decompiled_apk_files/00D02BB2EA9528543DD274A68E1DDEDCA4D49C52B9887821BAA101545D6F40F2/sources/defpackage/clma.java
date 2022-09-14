package defpackage;

import java.util.Arrays;
import java.util.List;
/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: clma  reason: default package */
/* loaded from: classes5.dex */
public final /* synthetic */ class clma {
    private final clmt a;

    public clma(clmt clmtVar) {
        this.a = clmtVar;
    }

    public final void a(final clmz clmzVar) {
        final clmt clmtVar = this.a;
        clmtVar.c.post(new Runnable(clmtVar, clmzVar) { // from class: clml
            private final clmt a;
            private final clmz b;

            {
                this.a = clmtVar;
                this.b = clmzVar;
            }

            @Override // java.lang.Runnable
            public final void run() {
                clmt clmtVar2 = this.a;
                clmz clmzVar2 = this.b;
                int i = clmtVar2.j - clmzVar2.c;
                clmtVar2.j = i;
                boolean z = true;
                if (clmzVar2.d) {
                    clmtVar2.k = true;
                    clmtVar2.l = clmzVar2.e;
                }
                if (clmzVar2.f) {
                    clmtVar2.m = clmzVar2.g;
                }
                if (i == 0) {
                    clpb clpbVar = clmzVar2.b.b;
                    if (!clmtVar2.n.b.t() && clpbVar.t()) {
                        clmtVar2.o = -1;
                        clmtVar2.p = 0L;
                    }
                    if (!clpbVar.t()) {
                        List asList = Arrays.asList(((clok) clpbVar).b);
                        if (asList.size() != clmtVar2.g.size()) {
                            z = false;
                        }
                        cmmn.c(z);
                        for (int i2 = 0; i2 < asList.size(); i2++) {
                            clmtVar2.g.get(i2).a = (clpb) asList.get(i2);
                        }
                    }
                    boolean z2 = clmtVar2.k;
                    clmtVar2.k = false;
                    clmtVar2.p(clmzVar2.b, z2, clmtVar2.l, 1, clmtVar2.m, false);
                }
            }
        });
    }
}
