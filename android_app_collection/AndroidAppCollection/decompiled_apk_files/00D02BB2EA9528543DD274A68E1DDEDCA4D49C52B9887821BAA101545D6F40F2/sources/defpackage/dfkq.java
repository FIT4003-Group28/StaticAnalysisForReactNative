package defpackage;

import android.view.Surface;
/* compiled from: PG */
/* renamed from: dfkq  reason: default package */
/* loaded from: classes6.dex */
public final class dfkq implements dfel {
    @dzsi
    private dfel a;
    @dzsi
    private Surface b;
    private int c;
    private int d;
    private int e;
    private dfeh f;

    @Override // defpackage.dfel
    public final synchronized void a(Surface surface) {
        if (this.b == surface) {
            return;
        }
        this.b = surface;
        if (surface == null) {
            this.c = 0;
            this.d = 0;
            this.e = 0;
        }
        dfel dfelVar = this.a;
        if (dfelVar == null) {
            return;
        }
        dfelVar.a(surface);
    }

    @Override // defpackage.dfel
    public final synchronized void b(int i, int i2, int i3) {
        if (this.b != null) {
            this.c = i;
            this.d = i2;
            this.e = i3;
            dfel dfelVar = this.a;
            if (dfelVar == null) {
                return;
            }
            dfelVar.b(i, i2, i3);
            return;
        }
        throw new IllegalStateException("Surface is null.");
    }

    @Override // defpackage.dfel
    public final synchronized void c(@dzsi dfeh dfehVar) {
        if (this.f == dfehVar) {
            return;
        }
        this.f = dfehVar;
        dfel dfelVar = this.a;
        if (dfelVar == null) {
            return;
        }
        dfelVar.c(dfehVar);
    }

    public final synchronized void d(@dzsi dfel dfelVar) {
        int i;
        dfel dfelVar2 = this.a;
        if (dfelVar2 == dfelVar) {
            return;
        }
        if (dfelVar2 != null) {
            if (this.b != null) {
                dfelVar2.a(null);
            }
            if (this.f != null) {
                dfelVar2.c(null);
            }
        }
        this.a = dfelVar;
        if (dfelVar == null) {
            return;
        }
        Surface surface = this.b;
        if (surface != null) {
            dfelVar.a(surface);
            int i2 = this.c;
            if (i2 != 0 && (i = this.d) != 0) {
                this.a.b(i2, i, this.e);
            }
        }
        dfeh dfehVar = this.f;
        if (dfehVar == null) {
            return;
        }
        this.a.c(dfehVar);
    }
}
