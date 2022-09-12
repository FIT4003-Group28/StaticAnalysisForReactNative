package defpackage;

import android.view.View;
/* renamed from: acly  reason: default package */
/* loaded from: classes2.dex */
public final /* synthetic */ class acly {
    public static <V extends cqkp> cqlc<V, View.OnClickListener> a(final acmd<V> acmdVar) {
        return new cqlc(acmdVar) { // from class: aclz
            private final acmd a;

            {
                this.a = acmdVar;
            }

            @Override // defpackage.cqlc
            public final Object a(cqkp cqkpVar) {
                return new acmc(this.a, cqkpVar);
            }

            @Override // defpackage.cqlc
            public final boolean b() {
                return false;
            }
        };
    }

    public static <V extends cqkp> cqlc<V, View.OnLongClickListener> b(final acmd<V> acmdVar) {
        return new cqlc(acmdVar) { // from class: acma
            private final acmd a;

            {
                this.a = acmdVar;
            }

            @Override // defpackage.cqlc
            public final Object a(final cqkp cqkpVar) {
                final acmd acmdVar2 = this.a;
                return new View.OnLongClickListener(acmdVar2, cqkpVar) { // from class: acmb
                    private final acmd a;
                    private final cqkp b;

                    {
                        this.a = acmdVar2;
                        this.b = cqkpVar;
                    }

                    @Override // android.view.View.OnLongClickListener
                    public final boolean onLongClick(View view) {
                        acmd acmdVar3 = this.a;
                        cqkp cqkpVar2 = this.b;
                        cjqm g = cjqg.g(cjqi.a, view);
                        if (g == null) {
                            bvoo.h("Attempting to invoke a LoggedInteractionCallback on a View with no registered LoggedInteraction. Defaulting to LoggedInteraction.NONE.", new Object[0]);
                            g = cjqm.a;
                        }
                        acmdVar3.a(cqkpVar2, g);
                        return true;
                    }
                };
            }

            @Override // defpackage.cqlc
            public final boolean b() {
                return false;
            }
        };
    }
}
