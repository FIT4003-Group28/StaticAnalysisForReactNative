package defpackage;

import android.net.Uri;
/* compiled from: PG */
/* renamed from: czlx  reason: default package */
/* loaded from: classes5.dex */
final class czlx<T> implements czjv<T> {
    private final czly<T> a;

    public czlx(czly<T> czlyVar) {
        this.a = czlyVar;
    }

    @Override // defpackage.czjv
    public final dehn<Void> a(dehn<T> dehnVar) {
        final czly<T> czlyVar = this.a;
        return deew.g(dehnVar, dazv.h(new defg(czlyVar) { // from class: czlt
            private final czly a;

            {
                this.a = czlyVar;
            }

            @Override // defpackage.defg
            public final dehn a(Object obj) {
                czly czlyVar2 = this.a;
                czlyVar2.e((Uri) deha.r(czlyVar2.a), obj);
                return dehk.a;
            }
        }), czlyVar.b);
    }
}
