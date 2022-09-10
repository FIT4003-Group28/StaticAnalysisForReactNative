package defpackage;

import android.os.Parcelable;
import android.support.v7.widget.RecyclerView;
import android.view.ViewTreeObserver;
/* compiled from: PG */
/* renamed from: bcfn  reason: default package */
/* loaded from: classes3.dex */
final class bcfn extends cqmr<bclv> {
    abx a;
    abw b;
    ViewTreeObserver.OnPreDrawListener c;
    final /* synthetic */ RecyclerView d;

    public bcfn(RecyclerView recyclerView) {
        this.d = recyclerView;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.cqmr
    public final /* bridge */ /* synthetic */ void a(bclv bclvVar, boolean z) {
        bclv bclvVar2 = bclvVar;
        b(false);
        cqqw n = bclvVar2.n();
        this.a = n;
        if (n != null) {
            this.d.i(n);
        }
        abw l = bclvVar2.l(this.d);
        this.b = l;
        if (l != null) {
            this.d.D(l);
        }
        this.c = bclvVar2.G(this.d);
        this.d.getViewTreeObserver().addOnPreDrawListener(this.c);
        Parcelable p = bclvVar2.p();
        if (p != null) {
            ((aag) this.d.l).C(p);
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.cqmr
    public final void b(boolean z) {
        abx abxVar = this.a;
        if (abxVar != null) {
            this.d.j(abxVar);
            this.a = null;
        }
        abw abwVar = this.b;
        if (abwVar != null) {
            this.d.E(abwVar);
            this.b = null;
        }
        if (this.c != null) {
            this.d.getViewTreeObserver().removeOnPreDrawListener(this.c);
            this.c = null;
        }
    }
}
