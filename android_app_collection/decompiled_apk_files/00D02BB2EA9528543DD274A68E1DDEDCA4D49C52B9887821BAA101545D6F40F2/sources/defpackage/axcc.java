package defpackage;

import java.util.List;
/* compiled from: PG */
/* renamed from: axcc  reason: default package */
/* loaded from: classes3.dex */
final class axcc implements degu<List<btzv>> {
    final /* synthetic */ List a;
    final /* synthetic */ long b;
    final /* synthetic */ btzr c;
    final /* synthetic */ long d;
    final /* synthetic */ boolean e;

    public axcc(List list, long j, btzr btzrVar, long j2, boolean z) {
        this.a = list;
        this.b = j;
        this.c = btzrVar;
        this.d = j2;
        this.e = z;
    }

    @Override // defpackage.degu
    public final void a(Throwable th) {
        bvoo.i(new RuntimeException(th));
    }

    @Override // defpackage.degu
    public final /* bridge */ /* synthetic */ void b(List<btzv> list) {
        if (list.isEmpty()) {
            return;
        }
        for (awwl awwlVar : this.a) {
            awwlVar.a(this.b, this.c.e, this.d, this.e);
        }
    }
}
