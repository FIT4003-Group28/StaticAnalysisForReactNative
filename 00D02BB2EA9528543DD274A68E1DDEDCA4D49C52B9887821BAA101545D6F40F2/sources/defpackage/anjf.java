package defpackage;

import java.util.Collections;
/* compiled from: PG */
/* renamed from: anjf  reason: default package */
/* loaded from: classes2.dex */
final class anjf extends cqmr<anji> {
    final /* synthetic */ dmjq a;

    public anjf(dmjq dmjqVar) {
        this.a = dmjqVar;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.cqmr
    public final /* bridge */ /* synthetic */ void a(anji anjiVar, boolean z) {
        aogo d = anjiVar.d();
        if (d == null) {
            b(true);
            return;
        }
        this.a.setHighlightedDays(d.a());
        this.a.setSecondaryHighlightedDays(Collections.emptySet());
        this.a.setCompletedDaysWithData(d.b());
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.cqmr
    public final void b(boolean z) {
        if (z) {
            this.a.setHighlightedDays(Collections.emptySet());
            this.a.setSecondaryHighlightedDays(Collections.emptySet());
            this.a.setCompletedDaysWithData(Collections.emptySet());
        }
    }
}
