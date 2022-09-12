package defpackage;

import android.view.View;
/* renamed from: acme  reason: default package */
/* loaded from: classes2.dex */
public final /* synthetic */ class acme {
    public static <V extends cqkp> cqlc<V, View.OnClickListener> a(final acmh<V> acmhVar) {
        return new cqlc(acmhVar) { // from class: acmf
            private final acmh a;

            {
                this.a = acmhVar;
            }

            @Override // defpackage.cqlc
            public final Object a(cqkp cqkpVar) {
                return new acmg(this.a, cqkpVar);
            }

            @Override // defpackage.cqlc
            public final boolean b() {
                return false;
            }
        };
    }
}
