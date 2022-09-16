package defpackage;

import android.os.Looper;
import java.util.ArrayList;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: ksc  reason: default package */
/* loaded from: classes3.dex */
public final class ksc {
    public final String a;
    public int d;
    private final abbe e;
    public final ArrayList b = new ArrayList();
    public final ArrayList c = new ArrayList();
    private final kry f = new kry(this, Looper.getMainLooper());

    public ksc(abbe abbeVar, String str) {
        this.e = abbeVar;
        this.a = str;
    }

    public static final void e(ArrayList arrayList, ArrayList arrayList2) {
        if (arrayList2.isEmpty()) {
            return;
        }
        if (arrayList.isEmpty()) {
            arrayList.add((krz) arrayList2.remove(0));
        }
        if (!((krz) arey.s(arrayList)).c()) {
            return;
        }
        while (!arrayList2.isEmpty() && ((krz) arrayList2.get(0)).c()) {
            arrayList.add((krz) arrayList2.remove(0));
        }
    }

    private final boolean f() {
        if (this.b.isEmpty()) {
            return false;
        }
        if (arey.v(this.b, jny.h)) {
            return true;
        }
        kry kryVar = this.f;
        return !kryVar.hasMessages(1) && !kryVar.hasMessages(2);
    }

    public final void a(krz krzVar) {
        if (!krzVar.c() || (!arey.v(this.b, jny.g) && !arey.v(this.c, jny.g))) {
            krz krzVar2 = (krz) arey.z(this.b);
            if (krzVar2 != null && krzVar2.b(krzVar)) {
                ArrayList arrayList = this.b;
                arrayList.remove(arrayList.size() - 1);
            }
            boolean f = f();
            this.b.add(krzVar);
            if (!krzVar.c() || this.b.size() > 6) {
                d();
            } else if (f) {
            } else {
                if (this.b.size() == 1) {
                    this.f.a(1, 8000);
                }
                this.f.a(2, 3000);
            }
        }
    }

    public final void b() {
        this.c.clear();
        if (f()) {
            d();
        }
    }

    public final void c(ArrayList arrayList) {
        if (arrayList.isEmpty()) {
            return;
        }
        abbb a = this.e.a();
        krz krzVar = (krz) arrayList.get(0);
        a.a = krzVar.f.a;
        a.c = krzVar.c;
        if (!krzVar.d.H()) {
            a.j(krzVar.d);
        } else {
            a.i();
        }
        krzVar.a(a);
        for (int i = 1; i < arrayList.size(); i++) {
            ((krz) arrayList.get(i)).a(a);
        }
        this.e.b(a, new ksa(this, krzVar.e));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void d() {
        this.f.removeCallbacksAndMessages(null);
        if (!this.c.isEmpty()) {
            return;
        }
        ArrayList arrayList = new ArrayList();
        e(arrayList, this.b);
        c(arrayList);
        this.c.addAll(arrayList);
    }
}
