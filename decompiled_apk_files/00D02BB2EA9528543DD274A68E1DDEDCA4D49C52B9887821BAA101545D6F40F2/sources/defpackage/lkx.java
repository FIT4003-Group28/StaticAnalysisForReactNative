package defpackage;

import android.content.Context;
/* compiled from: PG */
/* renamed from: lkx  reason: default package */
/* loaded from: classes7.dex */
final class lkx implements dzsj<atee> {
    final /* synthetic */ Context a;
    final /* synthetic */ ksi b;
    final /* synthetic */ bvly c;
    final /* synthetic */ bvlo d;
    final /* synthetic */ boolean e;
    private int f;
    private float g;
    private float h;
    @dzsi
    private atee i;

    public lkx(Context context, ksi ksiVar, bvly bvlyVar, bvlo bvloVar, boolean z) {
        this.a = context;
        this.b = ksiVar;
        this.c = bvlyVar;
        this.d = bvloVar;
        this.e = z;
    }

    @Override // defpackage.dzsj
    public final /* bridge */ /* synthetic */ atee a() {
        int i = this.a.getResources().getDisplayMetrics().densityDpi;
        float c = this.b.c(cqsz.c());
        float c2 = this.b.c(cqsz.d());
        if (this.i == null || this.f != i || this.h != c || this.g != c2) {
            this.i = atdz.a(this.a, this.c, this.d, this.e);
            this.f = i;
            this.h = c;
            this.g = c2;
        }
        return this.i;
    }
}
