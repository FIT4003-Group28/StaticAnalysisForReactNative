package defpackage;

import android.support.v7.widget.RecyclerView;
/* compiled from: PG */
/* renamed from: bclb  reason: default package */
/* loaded from: classes3.dex */
public final class bclb {
    public static bckx a(final bckv bckvVar) {
        return new bckx(bckvVar) { // from class: bcla
            private final bckv a;

            {
                this.a = bckvVar;
            }

            @Override // defpackage.bckx
            public final boolean a(RecyclerView recyclerView, int i) {
                bckv bckvVar2 = this.a;
                return !bckvVar2.a() || i == 0 || recyclerView != bckvVar2.g();
            }
        };
    }
}
