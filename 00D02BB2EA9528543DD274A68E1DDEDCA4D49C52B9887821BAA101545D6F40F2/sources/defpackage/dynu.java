package defpackage;

import java.util.ArrayList;
import java.util.List;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: dynu  reason: default package */
/* loaded from: classes6.dex */
public final class dynu implements dylu {
    public final dylu a;
    public volatile boolean b;
    public List<Runnable> c = new ArrayList();

    public dynu(dylu dyluVar) {
        this.a = dyluVar;
    }

    private final void a(Runnable runnable) {
        synchronized (this) {
            if (!this.b) {
                this.c.add(runnable);
            } else {
                runnable.run();
            }
        }
    }

    @Override // defpackage.dylu
    public final void b(dyhw dyhwVar) {
        a(new dynr(this, dyhwVar));
    }

    @Override // defpackage.dyvl
    public final void c(dyvk dyvkVar) {
        if (this.b) {
            this.a.c(dyvkVar);
        } else {
            a(new dynp(this, dyvkVar));
        }
    }

    @Override // defpackage.dylu
    public final void d(dyjb dyjbVar, dyhw dyhwVar) {
        a(new dyns(this, dyjbVar, dyhwVar));
    }

    @Override // defpackage.dylu
    public final void e(dyjb dyjbVar, dylt dyltVar, dyhw dyhwVar) {
        a(new dynt(this, dyjbVar, dyltVar, dyhwVar));
    }

    @Override // defpackage.dyvl
    public final void f() {
        if (this.b) {
            this.a.f();
        } else {
            a(new dynq(this));
        }
    }
}
