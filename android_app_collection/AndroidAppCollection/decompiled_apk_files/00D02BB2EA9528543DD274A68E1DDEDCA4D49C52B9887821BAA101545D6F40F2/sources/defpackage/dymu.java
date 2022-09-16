package defpackage;

import java.util.ArrayList;
import java.util.List;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: dymu  reason: default package */
/* loaded from: classes6.dex */
public final class dymu<RespT> extends dyew<RespT> {
    public final dyew<RespT> a;
    public volatile boolean b;
    public List<Runnable> c = new ArrayList();

    public dymu(dyew<RespT> dyewVar) {
        this.a = dyewVar;
    }

    private final void e(Runnable runnable) {
        synchronized (this) {
            if (!this.b) {
                this.c.add(runnable);
            } else {
                runnable.run();
            }
        }
    }

    @Override // defpackage.dyew
    public final void a(dyhw dyhwVar) {
        if (this.b) {
            this.a.a(dyhwVar);
        } else {
            e(new dymq(this, dyhwVar));
        }
    }

    @Override // defpackage.dyew
    public final void b(dyjb dyjbVar, dyhw dyhwVar) {
        e(new dyms(this, dyjbVar, dyhwVar));
    }

    @Override // defpackage.dyew
    public final void c(RespT respt) {
        if (this.b) {
            this.a.c(respt);
        } else {
            e(new dymr(this, respt));
        }
    }

    @Override // defpackage.dyew
    public final void i() {
        if (this.b) {
            this.a.i();
        } else {
            e(new dymt(this));
        }
    }
}
