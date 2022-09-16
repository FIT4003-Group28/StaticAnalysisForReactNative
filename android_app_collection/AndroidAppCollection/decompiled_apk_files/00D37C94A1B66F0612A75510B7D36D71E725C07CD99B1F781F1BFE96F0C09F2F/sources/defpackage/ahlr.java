package defpackage;

import android.content.res.Resources;
import com.google.android.youtube.R;
/* compiled from: PG */
/* renamed from: ahlr  reason: default package */
/* loaded from: classes.dex */
public final class ahlr extends ahjs implements ahng {
    private static final float f = ahom.a(5.0f);
    public boolean e;
    private final ahjv g;
    private final ahnh h;
    private float i;
    private final ahpn j;

    public ahlr(Resources resources, azqb azqbVar, ahne ahneVar, ahoo ahooVar, ahpl ahplVar, ahpn ahpnVar) {
        super(new ahli(ahooVar.clone(), 0.0f, 0.0f));
        this.j = ahpnVar;
        ahnh a = ahneVar.a(ahooVar.clone(), 0.0f, 0.0f);
        this.h = a;
        a.g(this);
        a.B(true, true);
        a.y(resources.getString(R.string.live_label));
        float f2 = f;
        ahon c = ahon.c(f2);
        ahjv ahjvVar = new ahjv(c, ahooVar.clone(), ahjv.s(ahjv.h(-1695465), c.f), azqbVar);
        this.g = ahjvVar;
        ahjvVar.n(((-f2) / 2.0f) - 0.4f, 0.0f, 0.0f);
        a.n((f2 + 0.4f) / 2.0f, 0.0f, 0.0f);
        q(a);
        q(ahjvVar);
        ((ahjs) this).c = new ahlq(this, ahplVar);
        d();
    }

    @Override // defpackage.ahng
    public final void a(float f2, float f3) {
        float f4 = this.i;
        this.i = f2;
        this.g.n((f4 - f2) / 2.0f, 0.0f, 0.0f);
        p(this.i, f3);
        ahpn ahpnVar = this.j;
        ahpnVar.a.b.n((this.i - f4) / 2.0f, 0.0f, 0.0f);
        ahpnVar.a.c();
    }

    public final float c() {
        return this.i + f + 0.4f;
    }

    public final void d() {
        if (this.e) {
            this.g.g(-1695465);
        } else {
            this.g.g(-5723992);
        }
    }
}
