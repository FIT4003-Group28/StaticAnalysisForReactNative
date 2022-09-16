package defpackage;

import android.content.res.Resources;
import com.google.android.youtube.R;
/* compiled from: PG */
/* renamed from: xjx  reason: default package */
/* loaded from: classes4.dex */
public final class xjx extends ahjs implements ahlz, ahng, ahmd {
    private static final float[] e = {0.0f, 0.0f, 0.0f, 1.0f};
    private final ahjv f;
    private final ahnh g;
    private final ahli h;
    private final Resources i;
    private float j;

    public xjx(Resources resources, ahne ahneVar, ahoo ahooVar, azqb azqbVar) {
        super(new ahli(ahooVar, 0.0f, 0.0f));
        resources.getClass();
        this.i = resources;
        ahnh a = ahneVar.a(ahooVar.clone(), 10.0f, 0.0f);
        this.g = a;
        a.B(false, true);
        a.A(2.0f);
        a.g(this);
        a.h(17);
        ahon a2 = ahon.a(1.0f, 1.0f, ahon.c);
        ahjv ahjvVar = new ahjv(a2, ahooVar.clone(), ahjv.s(e, a2.f), azqbVar);
        this.f = ahjvVar;
        ahjvVar.a(new ahme(this, ahme.b(1.0f), ahme.b(1.1f)));
        ahjvVar.a(new ahly(ahjvVar, 0.6f, 0.9f));
        ahjvVar.t();
        ahjvVar.d = 0.6f;
        q(ahjvVar);
        q(a);
        this.h = new ahli(ahooVar, 0.0f, 0.0f);
        k(false);
        e(5);
    }

    @Override // defpackage.ahng
    public final void a(float f, float f2) {
        float a = f2 + ahom.a(20.0f);
        this.j = a;
        this.f.rT(12.0f, a, 1.0f);
        this.h.b(21.599998f, this.j * 1.8f);
        p(12.0f, this.j);
    }

    public final void d(boolean z) {
        if (z) {
            this.g.y(this.i.getString(R.string.skip_ad));
        }
        k(z);
    }

    public final void e(int i) {
        this.g.y(this.i.getString(R.string.skip_ad_in, Integer.valueOf(i / 1000)));
    }

    @Override // defpackage.ahlz
    public final boolean f(ahjy ahjyVar) {
        return !v() && this.h.a(ahjyVar).b();
    }

    @Override // defpackage.ahlz
    public final boolean g(ahjy ahjyVar) {
        return false;
    }

    @Override // defpackage.ahlz
    public final boolean h(ahjy ahjyVar) {
        return !((ahjs) this).b;
    }

    @Override // defpackage.ahjs, defpackage.ahlb, defpackage.ahmf
    public final void qR(boolean z, ahjy ahjyVar) {
        super.qR(z, ahjyVar);
        this.f.b = z;
    }

    @Override // defpackage.ahmd
    public final void rT(float f, float f2, float f3) {
        this.f.rT(f * 12.0f, this.j * f2, f3);
    }
}
