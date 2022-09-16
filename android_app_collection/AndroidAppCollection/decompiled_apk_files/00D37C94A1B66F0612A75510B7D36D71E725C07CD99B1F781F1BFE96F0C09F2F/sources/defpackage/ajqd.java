package defpackage;

import java.util.Iterator;
/* compiled from: PG */
/* renamed from: ajqd  reason: default package */
/* loaded from: classes.dex */
public abstract class ajqd implements ajqm {
    private final ajqc a = new ajqc();
    public final ynb c = new ynb();

    /* JADX INFO: Access modifiers changed from: protected */
    public final void A(int i, int i2) {
        ylr.c();
        Iterator it = this.c.a.iterator();
        while (it.hasNext()) {
            ((ymy) it.next()).e(i, i2);
        }
    }

    @Override // defpackage.ajqm
    public final void lT(ajql ajqlVar) {
        this.c.e(ajqlVar);
    }

    @Override // defpackage.ajqm
    public void mG(ajrt ajrtVar) {
        this.a.b(ajrtVar);
    }

    @Override // defpackage.ajqm
    public void mH(ajrs ajrsVar, int i) {
        this.a.a(ajrsVar, this, i);
    }

    @Override // defpackage.ajqm
    public final void pl(ajql ajqlVar) {
        this.c.f(ajqlVar);
    }

    public final void v() {
        ylr.c();
        this.c.g();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final void w(int i) {
        x(i, 1);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final void x(int i, int i2) {
        ylr.c();
        this.c.a(i, i2);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final void y(int i, int i2) {
        ylr.c();
        this.c.b(i, i2);
    }

    public final void z(int i, int i2) {
        ylr.c();
        this.c.c(i, i2);
    }
}
