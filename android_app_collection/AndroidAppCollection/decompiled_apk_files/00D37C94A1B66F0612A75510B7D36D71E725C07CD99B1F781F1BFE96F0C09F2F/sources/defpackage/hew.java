package defpackage;

import android.content.Context;
import android.net.Uri;
/* compiled from: PG */
/* renamed from: hew  reason: default package */
/* loaded from: classes3.dex */
public final class hew implements hez {
    public final Context a;
    public final pjx b = new het();
    public final ava c = new heu(this);
    public boolean d;
    public boolean e;
    public hev f;
    public long g;
    public long h;
    public final hfa i;
    public pkl j;
    private final asu k;

    public hew(Context context, hfa hfaVar) {
        this.a = context;
        this.k = new axk(context, pxi.E(context, "AudioMPEG"));
        this.i = hfaVar;
    }

    public final long a() {
        return this.g + this.h;
    }

    public final void b() {
        pkl pklVar = this.j;
        if (pklVar != null) {
            pklVar.z(false);
        }
    }

    public final void c(long j) {
        aqxo.p(this.e);
        if (!this.d) {
            return;
        }
        this.j.b(j);
    }

    public final void d() {
        this.j.b(a());
    }

    public final void e(float f) {
        this.j.A(new pjt(f));
    }

    public final void f(boolean z) {
        pkl pklVar = this.j;
        if (pklVar == null) {
            return;
        }
        if (z) {
            pklVar.G(1);
        } else {
            pklVar.G(0);
        }
    }

    public final void g(boolean z) {
        this.i.a = z;
    }

    public final void h(Uri uri) {
        pix pixVar = new pix();
        pixVar.a = uri;
        pixVar.b(uri.toString());
        this.j.f(new pra(this.k).a(pixVar.a()));
        this.j.v();
        d();
        this.d = true;
    }

    public final void i() {
        aqxo.p(this.e);
        if (!this.d) {
            return;
        }
        this.j.z(true);
    }

    @Override // defpackage.hez
    public final long j() {
        aqxo.p(this.e);
        if (!this.d) {
            return 0L;
        }
        return this.j.q();
    }
}
