package defpackage;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.util.AttributeSet;
/* compiled from: PG */
/* renamed from: iqd  reason: default package */
/* loaded from: classes6.dex */
public final class iqd extends RecyclerView {
    public Runnable S;

    public iqd(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        setOverScrollMode(0);
        D(new ipz(this));
    }

    @SafeVarargs
    public static <T extends cqkp> cqmj<T> a(cqmp<T>... cqmpVarArr) {
        return new cqmh(iqd.class, cqmpVarArr);
    }

    public static <T extends cqkp> cqmt<T> av(mw<T> mwVar) {
        return new iqc(mwVar);
    }
}
