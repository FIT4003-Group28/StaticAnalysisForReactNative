package defpackage;

import java.util.List;
import java.util.Map;
/* compiled from: PG */
/* renamed from: ammd  reason: default package */
/* loaded from: classes2.dex */
public abstract class ammd {
    private static final float g = (float) Math.log(2.0d);
    private static final float h = (float) Math.log(2.0d);
    public alwo a;
    final Map<alwo, List<akrk>> b = dcjz.h();
    public boolean c;
    boolean d;
    public final bnsn e;
    @dzsi
    protected amgr f;

    public ammd(bnsn bnsnVar) {
        this.e = bnsnVar;
    }

    public static float j(float f, boolean z) {
        float f2;
        int i = 9;
        float min = Math.min(Math.max(f, true != z ? 9 : 6), 18.0f);
        if (true == z) {
            i = 12;
        }
        return (float) Math.exp((z ? g : h) * ((min - f2) / i));
    }

    public synchronized void a() {
        if (this.c) {
            i();
        }
    }

    protected abstract boolean b(akzh akzhVar, akrp akrpVar);

    protected abstract void c(akzh akzhVar);

    public final void d() {
        this.d = true;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final synchronized void e() {
        alwo alwoVar = this.a;
        if (alwoVar != null) {
            List<akrk> list = this.b.get(alwoVar);
            if (list != null) {
                list.clear();
            }
        } else {
            this.b.clear();
        }
        this.d = true;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final synchronized void f(amlp amlpVar) {
        List<akrk> list = this.b.get(this.a);
        if (list != null) {
            list.add(amlpVar.a);
            this.d = true;
        }
    }

    public final synchronized void g(akzh akzhVar, @dzsi akrp akrpVar) {
        if (!this.c) {
            return;
        }
        if (h(akzhVar) && akrpVar != null && !this.b.isEmpty() && b(akzhVar, akrpVar)) {
            akzhVar.m();
        }
        c(akzhVar);
    }

    public boolean h(akzh akzhVar) {
        throw null;
    }

    public abstract void i();

    protected abstract void k();

    /* JADX INFO: Access modifiers changed from: package-private */
    public final synchronized void l() {
        a();
        this.c = true;
        k();
    }
}
