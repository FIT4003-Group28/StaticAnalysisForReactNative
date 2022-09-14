package defpackage;

import java.util.HashSet;
import java.util.Set;
/* compiled from: PG */
/* renamed from: asvx  reason: default package */
/* loaded from: classes2.dex */
public final class asvx {
    public boolean a;
    public int b = 1;
    private final Set<aswa> c;

    public asvx(boolean z) {
        bvrj.UI_THREAD.c();
        this.a = z;
        this.c = new HashSet();
    }

    public final boolean a() {
        bvrj.UI_THREAD.c();
        return !d() ? this.a : this.b == 2;
    }

    public final void b(aswa aswaVar) {
        bvrj.UI_THREAD.c();
        this.c.add(aswaVar);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void c(boolean z) {
        bvrj.UI_THREAD.c();
        this.a = z;
        e();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final boolean d() {
        bvrj.UI_THREAD.c();
        return this.b != 1;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void e() {
        bvrj.UI_THREAD.c();
        for (aswa aswaVar : this.c) {
            aswaVar.a(this);
        }
    }

    public final void f(aswa aswaVar) {
        bvrj.UI_THREAD.c();
        this.c.remove(aswaVar);
    }
}
