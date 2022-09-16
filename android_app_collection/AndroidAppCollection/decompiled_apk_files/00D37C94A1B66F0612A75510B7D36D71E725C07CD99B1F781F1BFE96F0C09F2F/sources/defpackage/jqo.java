package defpackage;

import j$.util.Optional;
import java.util.concurrent.Executor;
/* compiled from: PG */
/* renamed from: jqo  reason: default package */
/* loaded from: classes3.dex */
public final class jqo implements fch {
    public final jql a;
    private final Executor b;
    private final Executor c;
    private final /* synthetic */ int d;

    public jqo(jql jqlVar, Executor executor, Executor executor2) {
        this.a = jqlVar;
        this.b = executor;
        this.c = executor2;
    }

    public jqo(jql jqlVar, Executor executor, Executor executor2, int i) {
        this.d = i;
        this.a = jqlVar;
        this.b = executor;
        this.c = executor2;
    }

    @Override // defpackage.fch
    public final void b(final String str, final jfz jfzVar, final Optional optional) {
        if (this.d == 0) {
            ylx.k(anlz.u(new jgh(jfzVar, 9), this.c), this.b, jou.g, new ylw() { // from class: jqn
                @Override // defpackage.ylw, defpackage.zdt
                public final void a(Object obj) {
                    jqo jqoVar = jqo.this;
                    ampr amprVar = (ampr) obj;
                    jqoVar.a.d(str, jfzVar, (Optional) amprVar.a, (Optional) amprVar.b, optional);
                }
            });
        } else {
            ylx.k(anlz.u(new jgh(jfzVar, 8), this.c), this.b, jou.f, new ylw(str, jfzVar, optional, null) { // from class: jqm
                public final /* synthetic */ String a;
                public final /* synthetic */ jfz b;
                public final /* synthetic */ Optional c;

                @Override // defpackage.ylw, defpackage.zdt
                public final void a(Object obj) {
                    jqo jqoVar = jqo.this;
                    ampr amprVar = (ampr) obj;
                    jqoVar.a.d(this.a, this.b, (Optional) amprVar.a, (Optional) amprVar.b, this.c);
                }
            });
        }
    }
}
