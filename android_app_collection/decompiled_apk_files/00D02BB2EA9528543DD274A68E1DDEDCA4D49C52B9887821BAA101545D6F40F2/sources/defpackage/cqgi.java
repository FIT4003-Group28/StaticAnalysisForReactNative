package defpackage;

import android.text.TextWatcher;
/* renamed from: cqgi  reason: default package */
/* loaded from: classes5.dex */
public final /* synthetic */ class cqgi {
    public static <T extends cqkp> cqlc<T, TextWatcher> a(final cqlc<T, cqgl> cqlcVar) {
        return new cqlc(cqlcVar) { // from class: cqgj
            private final cqlc a;

            {
                this.a = cqlcVar;
            }

            @Override // defpackage.cqlc
            public final Object a(cqkp cqkpVar) {
                return new cqgk((cqgl) this.a.a(cqkpVar));
            }

            @Override // defpackage.cqlc
            public final boolean b() {
                return false;
            }
        };
    }
}
