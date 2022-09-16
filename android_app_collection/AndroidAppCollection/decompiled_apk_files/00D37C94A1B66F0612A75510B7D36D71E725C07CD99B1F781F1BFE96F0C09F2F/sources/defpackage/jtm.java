package defpackage;

import java.util.concurrent.Callable;
/* compiled from: PG */
/* renamed from: jtm  reason: default package */
/* loaded from: classes3.dex */
public final /* synthetic */ class jtm implements anir {
    public final /* synthetic */ jtp a;
    public final /* synthetic */ jnb b;
    private final /* synthetic */ int c;

    public /* synthetic */ jtm(jtp jtpVar, jnb jnbVar) {
        this.a = jtpVar;
        this.b = jnbVar;
    }

    public /* synthetic */ jtm(jtp jtpVar, jnb jnbVar, int i) {
        this.c = i;
        this.a = jtpVar;
        this.b = jnbVar;
    }

    @Override // defpackage.anir
    public final ankt a(Object obj) {
        if (this.c == 0) {
            final jtp jtpVar = this.a;
            final jnb jnbVar = this.b;
            final Boolean bool = (Boolean) obj;
            return anlz.u(new Callable() { // from class: jto
                /* JADX WARN: Code restructure failed: missing block: B:51:0x015b, code lost:
                    if (r2 == false) goto L54;
                 */
                @Override // java.util.concurrent.Callable
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                    To view partially-correct add '--show-bad-code' argument
                */
                public final java.lang.Object call() {
                    /*
                        Method dump skipped, instructions count: 502
                        To view this dump add '--comments-level debug' option
                    */
                    throw new UnsupportedOperationException("Method not decompiled: defpackage.jto.call():java.lang.Object");
                }
            }, jtpVar.f);
        }
        jtp jtpVar2 = this.a;
        jnb jnbVar2 = this.b;
        if (((Boolean) obj).booleanValue()) {
            return anii.i(anko.q(jtpVar2.e.d()), new jtm(jtpVar2, jnbVar2), jtpVar2.f);
        }
        return anlz.q(amuk.q());
    }
}
