package defpackage;

import android.text.TextUtils;
import com.google.android.libraries.lidar.VisibilityChangeEventData;
/* compiled from: PG */
/* renamed from: wzm  reason: default package */
/* loaded from: classes4.dex */
public abstract class wzm implements tkz, wjz {
    protected static final amup a = amyc.b;
    public long b;
    public boolean c;
    public final long d;
    public tjt e;
    protected boolean f;
    protected boolean g;
    protected final wme h;
    private final xci i;

    public wzm(xci xciVar, long j, boolean z, boolean z2, wme wmeVar) {
        this.i = xciVar;
        this.d = j;
        this.f = z;
        this.g = z2;
        this.h = wmeVar;
    }

    @Override // defpackage.tkz
    public final tld a() {
        return new tld((int) this.d, (int) this.b, this.f, this.g);
    }

    @Override // defpackage.tkz
    public final void c(tjt tjtVar) {
        this.e = tjtVar;
        wme wmeVar = this.h;
        ((wlf) wmeVar.e.get()).b(this.i.a);
    }

    @Override // defpackage.tkz
    public final void d(tjt tjtVar) {
        this.e = tjtVar;
        wme wmeVar = this.h;
        ((wlf) wmeVar.e.get()).d(this.i.a);
    }

    @Override // defpackage.tkz
    public final void e(tjt tjtVar) {
        this.e = tjtVar;
        wme wmeVar = this.h;
        ((wlf) wmeVar.e.get()).e(this.i.a);
    }

    public abstract tjt f(int i);

    public final Boolean g(xci xciVar) {
        return Boolean.valueOf(TextUtils.equals(xciVar.a, this.i.a));
    }

    public abstract void h();

    public abstract void i();

    public abstract void j();

    public abstract void k();

    public abstract void l();

    public abstract void m();

    public abstract void n();

    public abstract void o(VisibilityChangeEventData visibilityChangeEventData);

    public abstract void p();

    public abstract void q(aijs aijsVar);

    public abstract void r(int i, int i2, int i3, int i4);
}
