package defpackage;

import android.content.Context;
/* compiled from: PG */
/* renamed from: cqle  reason: default package */
/* loaded from: classes5.dex */
public final class cqle {
    public static <V extends cqkp> cqlc<V, CharSequence> a(final int i) {
        dbsk.e(i > 0, "Attempted to fetch AndroidResource with an invalid resId. resid=%s", i);
        return cqkz.b(new cqjb(i) { // from class: cqld
            private final int a;

            {
                this.a = i;
            }

            @Override // defpackage.cqjb
            public final Object a(cqkp cqkpVar, Context context) {
                return context.getText(this.a);
            }
        });
    }
}
