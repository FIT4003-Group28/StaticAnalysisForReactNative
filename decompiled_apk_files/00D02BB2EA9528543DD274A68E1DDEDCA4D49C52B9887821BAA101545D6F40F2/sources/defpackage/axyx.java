package defpackage;

import java.util.HashSet;
import java.util.List;
import java.util.Set;
/* compiled from: PG */
/* renamed from: axyx  reason: default package */
/* loaded from: classes3.dex */
public final class axyx {
    final /* synthetic */ axyz b;
    public final Set<axyy> a = new HashSet();
    private List<dpre> c = dcdc.e();

    public axyx(axyz axyzVar) {
        this.b = axyzVar;
    }

    public final synchronized void a(final List<dpre> list) {
        this.c = dcdc.r(list);
        b(new bvqg(list) { // from class: axyv
            private final List a;

            {
                this.a = list;
            }

            @Override // defpackage.bvqg
            public final void NU(Object obj) {
                ((axyy) obj).a(this.a);
            }
        });
    }

    public final synchronized void b(final bvqg<axyy> bvqgVar) {
        this.b.a.a(new Runnable(this, bvqgVar) { // from class: axyw
            private final axyx a;
            private final bvqg b;

            {
                this.a = this;
                this.b = bvqgVar;
            }

            @Override // java.lang.Runnable
            public final void run() {
                axyx axyxVar = this.a;
                bvqg bvqgVar2 = this.b;
                dcpd it = dcep.K(axyxVar.a).iterator();
                while (it.hasNext()) {
                    bvqgVar2.NU((axyy) it.next());
                }
            }
        });
    }

    public final synchronized void c(axyy axyyVar) {
        if (this.a.add(axyyVar)) {
            axyyVar.a(this.c);
        }
    }

    public final synchronized void d(axyy axyyVar) {
        this.a.remove(axyyVar);
    }
}
