package defpackage;

import java.util.concurrent.CopyOnWriteArrayList;
/* compiled from: PG */
/* renamed from: abky  reason: default package */
/* loaded from: classes.dex */
public final class abky {
    public abkx a;
    public final CopyOnWriteArrayList b = new CopyOnWriteArrayList();
    public final CopyOnWriteArrayList c = new CopyOnWriteArrayList();
    public final CopyOnWriteArrayList d = new CopyOnWriteArrayList();

    private final void c(abkx abkxVar) {
        if (abkxVar == null) {
            return;
        }
        int b = abkxVar.b();
        if (b == 0) {
            this.d.add(abkxVar);
        } else if (b != 1) {
            this.b.add(abkxVar);
        } else {
            this.c.add(abkxVar);
        }
    }

    public final void b(abkx abkxVar) {
        if (this.a == null) {
            abkxVar.i();
            this.a = abkxVar;
        } else if (abkxVar.b() >= this.a.b()) {
            this.a.c();
            c(this.a);
            abkxVar.i();
            this.a = abkxVar;
        } else {
            c(abkxVar);
        }
    }

    public final void a(abkx abkxVar) {
        abkx abkxVar2;
        if (abkxVar != this.a) {
            if (abkxVar.b() == 0) {
                this.d.remove(abkxVar);
                return;
            } else if (abkxVar.b() == 1) {
                this.c.remove(abkxVar);
                return;
            } else if (abkxVar.b() != 2) {
                return;
            } else {
                this.b.remove(abkxVar);
                return;
            }
        }
        if (!this.b.isEmpty()) {
            CopyOnWriteArrayList copyOnWriteArrayList = this.b;
            abkxVar2 = (abkx) copyOnWriteArrayList.remove(copyOnWriteArrayList.size() - 1);
        } else if (!this.c.isEmpty()) {
            CopyOnWriteArrayList copyOnWriteArrayList2 = this.c;
            abkxVar2 = (abkx) copyOnWriteArrayList2.remove(copyOnWriteArrayList2.size() - 1);
        } else if (!this.d.isEmpty()) {
            CopyOnWriteArrayList copyOnWriteArrayList3 = this.d;
            abkxVar2 = (abkx) copyOnWriteArrayList3.remove(copyOnWriteArrayList3.size() - 1);
        } else {
            abkxVar2 = null;
        }
        this.a = abkxVar2;
        if (abkxVar2 == null) {
            return;
        }
        abkxVar2.i();
    }
}
