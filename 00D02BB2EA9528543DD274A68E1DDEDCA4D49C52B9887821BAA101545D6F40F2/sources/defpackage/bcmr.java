package defpackage;

import android.support.v7.widget.RecyclerView;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: bcmr  reason: default package */
/* loaded from: classes3.dex */
public final class bcmr extends cqqw {
    @dzsi
    public abx a;
    final /* synthetic */ bcmu b;
    private final cjqb c;

    public bcmr(bcmu bcmuVar, cqat cqatVar, cjqy cjqyVar) {
        this.b = bcmuVar;
        this.c = new cjqb(cqatVar, cjqyVar, cjtd.a(dtxy.bI));
    }

    @Override // defpackage.abx
    public final void QA(RecyclerView recyclerView, int i) {
        this.c.QA(recyclerView, i);
        abx abxVar = this.a;
        if (abxVar != null) {
            abxVar.QA(recyclerView, i);
        }
        if (i != 1) {
            this.b.i.b();
        }
    }

    @Override // defpackage.abx
    public final void a(RecyclerView recyclerView, int i, int i2) {
        abx abxVar = this.a;
        if (abxVar != null) {
            abxVar.a(recyclerView, i, i2);
        }
    }
}
