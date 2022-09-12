package defpackage;

import android.view.View;
/* renamed from: cijl  reason: default package */
/* loaded from: classes4.dex */
final /* synthetic */ class cijl implements cqlc {
    static final cqlc a = new cijl();

    private cijl() {
    }

    @Override // defpackage.cqlc
    public final Object a(cqkp cqkpVar) {
        final cika cikaVar = (cika) cqkpVar;
        return new View.OnClickListener(cikaVar) { // from class: cijk
            private final cika a;

            {
                this.a = cikaVar;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                cika cikaVar2 = this.a;
                int i = cijz.a;
                cikaVar2.e().r(iuf.a());
            }
        };
    }

    @Override // defpackage.cqlc
    public final boolean b() {
        return false;
    }
}
