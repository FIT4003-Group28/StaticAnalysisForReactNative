package defpackage;

import android.support.v7.widget.RecyclerView;
/* compiled from: PG */
/* renamed from: aobo  reason: default package */
/* loaded from: classes2.dex */
public final class aobo extends abx {
    private final aobn a;

    public aobo(aobn aobnVar) {
        this.a = aobnVar;
    }

    @Override // defpackage.abx
    public final void a(RecyclerView recyclerView, int i, int i2) {
        if (i2 != 0 && !this.a.b().booleanValue()) {
            this.a.s(i2 < 0);
        }
    }
}
