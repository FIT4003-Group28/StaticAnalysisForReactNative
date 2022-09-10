package defpackage;

import androidx.viewpager.widget.ViewPager;
/* compiled from: PG */
/* renamed from: bcru  reason: default package */
/* loaded from: classes3.dex */
final class bcru extends cqmr {
    final /* synthetic */ ViewPager a;
    final /* synthetic */ cqkj b;
    final /* synthetic */ bcrv c;
    private int d = 0;

    public bcru(bcrv bcrvVar, ViewPager viewPager, cqkj cqkjVar) {
        this.c = bcrvVar;
        this.a = viewPager;
        this.b = cqkjVar;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.cqmr
    public final /* bridge */ /* synthetic */ void a(cqkp cqkpVar, boolean z) {
        bcrw bcrwVar = (bcrw) cqkpVar;
        bas c = this.a.c();
        bcrx bcrxVar = c instanceof bcrx ? (bcrx) c : null;
        if (z || !(bcrxVar == null || bcrxVar.b == bcrwVar)) {
            this.a.setAdapter(new bcrx(this.b, this.c.a, bcrwVar));
        } else if (bcrxVar != null && this.d != bcrwVar.h()) {
            bcrxVar.Pa();
        }
        this.d = bcrwVar.h();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.cqmr
    public final void b(boolean z) {
        this.a.setAdapter(null);
    }
}
