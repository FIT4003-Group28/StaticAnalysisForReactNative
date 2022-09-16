package defpackage;

import android.os.Build;
import android.support.v7.widget.RecyclerView;
import android.widget.EdgeEffect;
/* compiled from: PG */
/* renamed from: fhc  reason: default package */
/* loaded from: classes3.dex */
public final class fhc extends na {
    private final EdgeEffect a;
    private final EdgeEffect b;

    public fhc(EdgeEffect edgeEffect, EdgeEffect edgeEffect2) {
        this.a = edgeEffect;
        this.b = edgeEffect2;
    }

    @Override // defpackage.na
    public final EdgeEffect d(RecyclerView recyclerView, int i) {
        if (Build.VERSION.SDK_INT > 30) {
            if (i == 1) {
                return new fha(recyclerView.getContext(), this.a);
            }
            if (i == 3) {
                return new fha(recyclerView.getContext(), this.b);
            }
        }
        return super.d(recyclerView, i);
    }
}
