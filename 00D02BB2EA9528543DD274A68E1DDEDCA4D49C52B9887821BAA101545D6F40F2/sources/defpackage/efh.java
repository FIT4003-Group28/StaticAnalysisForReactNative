package defpackage;

import com.google.android.apps.maps.R;
/* compiled from: PG */
/* renamed from: efh  reason: default package */
/* loaded from: classes.dex */
public final class efh implements eeu {
    public boolean a;
    public boolean b;
    public boolean c;
    public boolean d;
    public boolean e;
    public boolean f;
    public boolean g;
    public boolean h = true;
    public boolean i = false;
    private final gga j;

    public efh(gga ggaVar) {
        this.j = ggaVar;
    }

    @Override // defpackage.eeu
    public final boolean a() {
        return this.c;
    }

    @Override // defpackage.eeu
    public final boolean b() {
        return this.b;
    }

    @Override // defpackage.eeu
    public final boolean c() {
        return this.d;
    }

    @Override // defpackage.eeu
    public final void d(boolean z) {
        this.e = z;
    }

    @Override // defpackage.eeu
    public final boolean e() {
        return this.e;
    }

    @Override // defpackage.eeu
    public final boolean f() {
        if (this.j.I()) {
            return false;
        }
        return this.h;
    }

    @Override // defpackage.eeu
    public final boolean g() {
        return this.f;
    }

    @Override // defpackage.eeu
    public final boolean h() {
        return this.j.findViewById(R.id.mainmap_container) != null;
    }

    @Override // defpackage.eeu
    public final boolean i() {
        return this.i;
    }
}
