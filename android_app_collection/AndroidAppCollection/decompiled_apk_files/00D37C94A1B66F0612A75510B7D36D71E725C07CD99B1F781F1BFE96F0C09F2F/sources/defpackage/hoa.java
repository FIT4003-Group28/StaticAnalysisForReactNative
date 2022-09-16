package defpackage;

import android.view.View;
/* compiled from: PG */
/* renamed from: hoa  reason: default package */
/* loaded from: classes3.dex */
public final class hoa implements hpy {
    public final hku a;
    public View b;
    boolean c;

    public hoa(hku hkuVar) {
        this.a = hkuVar;
    }

    @Override // defpackage.hpy
    public final float a() {
        if (this.c) {
            return this.b.getHeight();
        }
        return 0.0f;
    }

    @Override // defpackage.hpy
    public final float b() {
        if (this.c) {
            return 0.0f;
        }
        return this.b.getHeight();
    }

    @Override // defpackage.hpy
    public final View c() {
        return this.b;
    }

    public final void d() {
        if (this.c) {
            hqb.d(this);
            this.c = false;
        }
    }

    @Override // defpackage.hpy
    public final void e() {
    }

    @Override // defpackage.hpy
    public final void f() {
    }

    public final void g() {
        if (!this.c) {
            hqb.d(this);
            this.c = true;
        }
    }
}
