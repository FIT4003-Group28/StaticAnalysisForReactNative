package defpackage;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.util.DisplayMetrics;
/* compiled from: PG */
/* renamed from: chhc  reason: default package */
/* loaded from: classes4.dex */
final class chhc extends aah {
    final /* synthetic */ RecyclerView f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public chhc(Context context, RecyclerView recyclerView) {
        super(context);
        this.f = recyclerView;
    }

    @Override // defpackage.aah
    protected final float b(DisplayMetrics displayMetrics) {
        return 150.0f / cqsz.c().a(this.f.getContext());
    }
}
