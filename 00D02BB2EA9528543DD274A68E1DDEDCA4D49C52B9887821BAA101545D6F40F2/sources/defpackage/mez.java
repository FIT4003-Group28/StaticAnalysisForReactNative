package defpackage;

import defpackage.cqkp;
import java.util.ArrayList;
import java.util.List;
/* compiled from: PG */
/* renamed from: mez  reason: default package */
/* loaded from: classes7.dex */
public final class mez<V extends cqkp> {
    public final List<V> a = new ArrayList();
    public int b = -1;
    private final mba c;
    private final mbm d;

    public mez(mba mbaVar, mbm mbmVar) {
        this.c = mbaVar;
        this.d = mbmVar;
    }

    public final void a() {
        if (this.b != -1) {
            this.b = -1;
        }
    }

    public final void b() {
        a();
        this.a.clear();
        this.c.a.y.B();
    }

    public final V c(int i) {
        return this.a.get(i);
    }

    public final int d() {
        return this.a.size();
    }

    public final void e(int i) {
        boolean z = false;
        if (i >= 0 && i < this.a.size()) {
            z = true;
        }
        dbsk.m(z, "itemIndex must be in range 0..totalItemCount.");
        if (this.b == i) {
            return;
        }
        this.b = i;
        this.d.a(i);
    }
}
