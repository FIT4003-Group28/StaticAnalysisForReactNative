package defpackage;

import android.support.v7.widget.RecyclerView;
/* compiled from: PG */
/* renamed from: bcll  reason: default package */
/* loaded from: classes3.dex */
final class bcll extends abx {
    final /* synthetic */ bclm a;

    public bcll(bclm bclmVar) {
        this.a = bclmVar;
    }

    @Override // defpackage.abx
    public final void QA(RecyclerView recyclerView, int i) {
        if (i == 0) {
            bclm bclmVar = this.a;
            if (bclmVar.a() < 0.01d || bclmVar.a() > 0.99d) {
                return;
            }
            int i2 = bclmVar.c;
            if (i2 == 0) {
                throw null;
            }
            int i3 = 1;
            if (i2 != 1) {
                i3 = 4;
            }
            bclmVar.e(i3);
        }
    }

    @Override // defpackage.abx
    public final void a(RecyclerView recyclerView, int i, int i2) {
        bclm bclmVar = this.a;
        bclmVar.c = i2 > 0 ? 1 : 2;
        bclmVar.f();
    }
}
