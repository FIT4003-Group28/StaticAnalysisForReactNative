package defpackage;

import android.view.View;
/* renamed from: aexw  reason: default package */
/* loaded from: classes2.dex */
final /* synthetic */ class aexw implements cqlc {
    static final cqlc a = new aexw();

    private aexw() {
    }

    @Override // defpackage.cqlc
    public final Object a(cqkp cqkpVar) {
        final aeyn aeynVar = (aeyn) cqkpVar;
        return new View.OnClickListener(aeynVar) { // from class: aexy
            private final aeyn a;

            {
                this.a = aeynVar;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                aeyn aeynVar2 = this.a;
                int i = aexz.a;
                aeynVar2.g();
            }
        };
    }

    @Override // defpackage.cqlc
    public final boolean b() {
        return false;
    }
}
