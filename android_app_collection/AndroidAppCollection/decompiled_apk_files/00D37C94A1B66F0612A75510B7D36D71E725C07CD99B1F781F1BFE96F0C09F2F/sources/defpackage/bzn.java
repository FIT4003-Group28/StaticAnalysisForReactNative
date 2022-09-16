package defpackage;

import java.util.Collections;
/* compiled from: PG */
/* renamed from: bzn  reason: default package */
/* loaded from: classes2.dex */
public final class bzn extends byy {
    public bzn(cdj cdjVar) {
        this(cdjVar, null);
    }

    @Override // defpackage.byy
    public final float a() {
        return 1.0f;
    }

    @Override // defpackage.byy
    public final Object e() {
        return this.d.a();
    }

    @Override // defpackage.byy
    public final Object f(cdi cdiVar, float f) {
        return e();
    }

    @Override // defpackage.byy
    public final void h() {
        if (this.d != null) {
            super.h();
        }
    }

    @Override // defpackage.byy
    public final void i(float f) {
        this.c = f;
    }

    public bzn(cdj cdjVar, byte[] bArr) {
        super(Collections.emptyList());
        this.d = cdjVar;
    }
}
