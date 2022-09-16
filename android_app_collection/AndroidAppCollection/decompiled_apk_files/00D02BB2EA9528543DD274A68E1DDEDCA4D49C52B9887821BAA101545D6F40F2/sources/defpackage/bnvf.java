package defpackage;

import java.util.List;
/* compiled from: PG */
/* renamed from: bnvf  reason: default package */
/* loaded from: classes.dex */
public final class bnvf {
    public float a;
    public float b;
    private final List<bnve> c;

    public bnvf(List<bnve> list) {
        this.a = 0.0f;
        this.b = 0.0f;
        this.c = list;
        for (bnve bnveVar : list) {
            if (bnveVar != null) {
                this.a = Math.max(this.a, bnveVar.a());
                this.b = Math.max(this.b, bnveVar.b());
            }
        }
    }

    public final int a() {
        return this.c.size();
    }

    @dzsi
    public final bnve b(int i) {
        if (i < 0 || i >= this.c.size()) {
            return null;
        }
        return this.c.get(i);
    }

    public final void c() {
        int size = this.c.size();
        for (int i = 0; i < size; i++) {
            if (this.c.get(i) != null) {
                this.c.get(i).c();
            }
        }
    }
}
