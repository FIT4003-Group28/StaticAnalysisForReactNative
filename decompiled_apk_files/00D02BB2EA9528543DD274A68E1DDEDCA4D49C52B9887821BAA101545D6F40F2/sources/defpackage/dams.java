package defpackage;

import java.util.List;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: dams  reason: default package */
/* loaded from: classes5.dex */
public final class dams implements dakq {
    final /* synthetic */ List a;
    final /* synthetic */ List b;
    final /* synthetic */ long c;
    final /* synthetic */ boolean d;
    final /* synthetic */ List e;
    final /* synthetic */ damu f;

    public dams(damu damuVar, List list, List list2, long j, boolean z, List list3) {
        this.f = damuVar;
        this.a = list;
        this.b = list2;
        this.c = j;
        this.d = z;
        this.e = list3;
    }

    @Override // defpackage.dakq
    public final void a() {
        this.f.f.addAll(this.a);
        this.f.g.addAll(this.b);
        this.f.j(5, 0, Long.valueOf(this.c), Long.valueOf(this.c), null, null, null);
    }

    @Override // defpackage.dakq
    public final void b() {
        if (!this.d) {
            this.f.h(this.e, this.a, this.b, this.c, true);
        }
    }

    @Override // defpackage.dakq
    public final void c(int i) {
        this.f.i(i);
    }
}
