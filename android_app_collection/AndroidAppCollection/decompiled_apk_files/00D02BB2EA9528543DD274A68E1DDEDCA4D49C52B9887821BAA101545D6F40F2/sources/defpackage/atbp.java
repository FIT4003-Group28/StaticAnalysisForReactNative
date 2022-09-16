package defpackage;

import android.view.View;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: atbp  reason: default package */
/* loaded from: classes2.dex */
public final class atbp implements dbty<Integer> {
    final /* synthetic */ atbq a;

    public atbp(atbq atbqVar) {
        this.a = atbqVar;
    }

    @Override // defpackage.dbty
    public final /* bridge */ /* synthetic */ Integer a() {
        int bottom;
        atbq atbqVar = this.a;
        if (!atbqVar.aD) {
            return 0;
        }
        View c = atbqVar.bd.c();
        View a = cqhu.a(c, atje.h);
        View a2 = cqhu.a(c, atje.i);
        View a3 = cqhu.a(c, atje.j);
        if (a != null) {
            int g = this.a.ay.g() + cqrp.d(8.0d).e(this.a.H());
            int bottom2 = a.getBottom();
            if (a2 != null && a2.isShown()) {
                bottom2 = a2.getBottom();
            }
            if (a3 != null && a3.isShown()) {
                bottom2 = Math.max(bottom2, a3.getBottom());
            }
            bottom = bottom2 + g;
        } else {
            bottom = c.getBottom();
        }
        return Integer.valueOf(bottom);
    }
}
