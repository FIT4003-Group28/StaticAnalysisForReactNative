package defpackage;

import android.view.View;
/* compiled from: PG */
/* renamed from: atbi  reason: default package */
/* loaded from: classes2.dex */
final class atbi implements dbty<Integer> {
    final /* synthetic */ atbq a;

    public atbi(atbq atbqVar) {
        this.a = atbqVar;
    }

    @Override // defpackage.dbty
    public final /* bridge */ /* synthetic */ Integer a() {
        View a;
        return Integer.valueOf((!this.a.bs() || (a = cqhu.a(this.a.bd.c(), atje.h)) == null) ? 0 : a.getWidth());
    }
}
