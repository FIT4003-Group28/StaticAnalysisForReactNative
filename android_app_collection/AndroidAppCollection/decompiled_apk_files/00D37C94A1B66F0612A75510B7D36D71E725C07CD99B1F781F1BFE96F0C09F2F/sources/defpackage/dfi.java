package defpackage;

import java.util.concurrent.CopyOnWriteArrayList;
/* compiled from: PG */
/* renamed from: dfi  reason: default package */
/* loaded from: classes3.dex */
abstract class dfi implements dfg {
    private final CopyOnWriteArrayList a = new CopyOnWriteArrayList();

    @Override // defpackage.dfg
    public final void a(dfh dfhVar) {
        this.a.add(dfhVar);
    }

    @Override // defpackage.dfg
    public final void c(dfh dfhVar) {
        this.a.remove(dfhVar);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void g() {
        int size = this.a.size();
        while (true) {
            size--;
            if (size >= 0) {
                ((dfh) this.a.get(size)).a(this);
            } else {
                return;
            }
        }
    }

    public final void h() {
        int size = this.a.size();
        while (true) {
            size--;
            if (size >= 0) {
                ((dfh) this.a.get(size)).b(this);
            } else {
                return;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void i() {
        int size = this.a.size();
        while (true) {
            size--;
            if (size >= 0) {
                ((dfh) this.a.get(size)).c(this);
            } else {
                return;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final boolean j() {
        int size = this.a.size();
        do {
            size--;
            if (size < 0) {
                return true;
            }
        } while (((dfh) this.a.get(size)).d(this));
        return false;
    }
}
