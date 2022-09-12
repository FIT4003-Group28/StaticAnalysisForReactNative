package defpackage;

import java.util.concurrent.TimeUnit;
/* compiled from: PG */
/* renamed from: awkr  reason: default package */
/* loaded from: classes3.dex */
public final class awkr<T> extends btrh<T> {
    private final int d;

    public awkr(int i, Class<?> cls, T t) {
        super(cls, t);
        this.d = i;
    }

    @Override // defpackage.btrs
    public final void a(Object obj) {
        dvzn c;
        if (this.d != 0) {
            awkq awkqVar = (awkq) this.a;
            crhp crhpVar = (crhp) obj;
            if (crhpVar.d()) {
                awkqVar.j = crhpVar.e();
                return;
            } else {
                awkqVar.j = null;
                return;
            }
        }
        awkq awkqVar2 = (awkq) this.a;
        crmj crmjVar = (crmj) obj;
        int i = crmjVar.d;
        if ((i != 1 && i != 2) || (c = awkqVar2.c(crmjVar.b.b())) == null) {
            return;
        }
        deha.q(deew.h(degp.q(awkqVar2.e.j()).r(10L, TimeUnit.SECONDS, awkqVar2.f), awkk.a, awkqVar2.f), new awkl(awkqVar2, c), awkqVar2.f);
    }
}
