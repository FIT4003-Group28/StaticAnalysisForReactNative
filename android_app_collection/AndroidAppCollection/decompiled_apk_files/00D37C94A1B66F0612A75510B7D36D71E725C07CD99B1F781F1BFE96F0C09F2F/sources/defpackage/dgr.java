package defpackage;

import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArraySet;
/* compiled from: PG */
/* renamed from: dgr  reason: default package */
/* loaded from: classes3.dex */
public final class dgr {
    private static int i;
    public dgs a;
    public double e;
    public final dgq b = new dgq();
    public final dgq c = new dgq();
    public final dgq d = new dgq();
    public boolean f = true;
    public double g = 0.0d;
    public final CopyOnWriteArraySet h = new CopyOnWriteArraySet();

    public dgr() {
        i++;
        this.a = dgs.a;
    }

    public final boolean a() {
        if (Math.abs(this.b.b) <= 0.005d) {
            if (Math.abs(this.e - this.b.a) <= 0.005d || this.a.d == 0.0d) {
                return true;
            }
        }
        return false;
    }

    public final void b(double d) {
        if (this.e != d || !a()) {
            this.e = d;
            Iterator it = this.h.iterator();
            while (it.hasNext()) {
                ((dgt) it.next()).c();
            }
        }
    }
}
