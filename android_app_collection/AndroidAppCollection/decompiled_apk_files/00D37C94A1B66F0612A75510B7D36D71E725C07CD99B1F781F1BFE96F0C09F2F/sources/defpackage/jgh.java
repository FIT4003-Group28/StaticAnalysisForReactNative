package defpackage;

import j$.util.Optional;
import java.util.concurrent.Callable;
/* compiled from: PG */
/* renamed from: jgh  reason: default package */
/* loaded from: classes3.dex */
public final /* synthetic */ class jgh implements Callable {
    public final /* synthetic */ jfz a;
    private final /* synthetic */ int b;

    public /* synthetic */ jgh(jfz jfzVar, int i) {
        this.b = i;
        this.a = jfzVar;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        atss atssVar;
        switch (this.b) {
            case 0:
                return jgk.f((asze) this.a.b());
            case 1:
                return jgk.f((asze) this.a.b());
            case 2:
                return jgk.f((asze) this.a.b());
            case 3:
                return jgk.f((asze) this.a.b());
            case 4:
                return jgk.e((awjr) this.a.b());
            case 5:
                return jgk.e((awjr) this.a.b());
            case 6:
                return jgk.e((awjr) this.a.b());
            case 7:
                return jgk.e((awjr) this.a.b());
            case 8:
                asza b = ((asze) this.a.b()).b();
                atss atssVar2 = null;
                if (b != null) {
                    atyp b2 = b.b();
                    if (b2 != null) {
                        atssVar2 = b2.f();
                    }
                    atss atssVar3 = atssVar2;
                    atssVar2 = b2;
                    atssVar = atssVar3;
                } else {
                    atssVar = null;
                }
                return ampr.a(Optional.ofNullable(atssVar2), Optional.ofNullable(atssVar));
            default:
                awjr awjrVar = (awjr) this.a.b();
                return ampr.a(Optional.ofNullable(awjrVar.f()), Optional.ofNullable(awjrVar.b()));
        }
    }
}
