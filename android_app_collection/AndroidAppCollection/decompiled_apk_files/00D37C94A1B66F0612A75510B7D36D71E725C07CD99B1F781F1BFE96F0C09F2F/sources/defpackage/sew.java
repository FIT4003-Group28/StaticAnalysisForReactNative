package defpackage;

import java.util.HashSet;
import java.util.Set;
/* compiled from: PG */
/* renamed from: sew  reason: default package */
/* loaded from: classes4.dex */
public abstract class sew implements sfa {
    private final Set a = new HashSet();

    /* JADX INFO: Access modifiers changed from: protected */
    public final void a() {
        for (saf safVar : this.a) {
            for (sez sezVar : safVar.a.o) {
                sezVar.a(safVar.a);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final void b() {
        for (saf safVar : this.a) {
            for (sez sezVar : safVar.a.o) {
                sezVar.d(safVar.a);
            }
        }
    }

    @Override // defpackage.sfa
    public final void c(saf safVar) {
        this.a.add(safVar);
    }

    @Override // defpackage.sfa
    public final void d(saf safVar) {
        this.a.remove(safVar);
    }
}
