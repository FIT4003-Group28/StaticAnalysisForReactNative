package defpackage;

import java.util.List;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: albc  reason: default package */
/* loaded from: classes2.dex */
public final class albc {
    private final List<albb> a;
    private int b = -1;

    public albc(List<albb> list) {
        this.a = list;
    }

    public final synchronized void a(akox akoxVar) {
        int i = (int) akoxVar.n().k;
        dbsk.l(i >= 0);
        if (i == this.b) {
            return;
        }
        akty aC = akoxVar.aj().aC();
        for (albb albbVar : this.a) {
            boolean a = albbVar.a(this.b);
            boolean a2 = albbVar.a(i);
            if (a && !a2) {
                aC.g(albbVar.a);
            } else if (!a && a2) {
                aC.f(albbVar.a);
            }
        }
        this.b = i;
    }

    public final synchronized void b(akox akoxVar) {
        akty aC = akoxVar.aj().aC();
        for (albb albbVar : this.a) {
            aC.g(albbVar.a);
        }
        this.b = -1;
    }

    public final synchronized void c(akox akoxVar) {
        akty aC = akoxVar.aj().aC();
        for (albb albbVar : this.a) {
            aC.e(albbVar.a);
        }
    }
}
