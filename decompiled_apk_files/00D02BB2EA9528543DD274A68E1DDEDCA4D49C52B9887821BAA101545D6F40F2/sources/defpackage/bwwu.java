package defpackage;

import android.view.View;
/* renamed from: bwwu  reason: default package */
/* loaded from: classes4.dex */
final /* synthetic */ class bwwu implements cqlc {
    static final cqlc a = new bwwu();

    private bwwu() {
    }

    @Override // defpackage.cqlc
    public final Object a(cqkp cqkpVar) {
        final bxca bxcaVar = (bxca) cqkpVar;
        return new View.OnClickListener(bxcaVar) { // from class: bwwn
            private final bxca a;

            {
                this.a = bxcaVar;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                bxca bxcaVar2 = this.a;
                int i = bwwy.a;
                bxcaVar2.i();
            }
        };
    }

    @Override // defpackage.cqlc
    public final boolean b() {
        return false;
    }
}
