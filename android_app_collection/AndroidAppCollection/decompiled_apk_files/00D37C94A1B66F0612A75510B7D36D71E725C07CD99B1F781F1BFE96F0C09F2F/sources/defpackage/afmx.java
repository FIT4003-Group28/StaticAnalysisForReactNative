package defpackage;

import android.content.Context;
import android.view.Surface;
import android.view.SurfaceHolder;
/* compiled from: PG */
/* renamed from: afmx  reason: default package */
/* loaded from: classes.dex */
public abstract class afmx extends afna {
    public Surface a;
    public pgg b;
    public pxs c;

    public afmx(Context context) {
        super(context);
    }

    @Override // defpackage.afnh
    public Surface A() {
        return this.a;
    }

    @Override // defpackage.afna, defpackage.afnh
    public SurfaceHolder B() {
        return null;
    }

    @Override // defpackage.afmu
    public final boolean E() {
        return (this.a == null && this.b == null && this.c == null) ? false : true;
    }

    public void F(int i) {
    }

    @Override // defpackage.afna, defpackage.afnh
    public final pgg i() {
        return this.b;
    }

    @Override // defpackage.afna, defpackage.afnh
    public final pxs j() {
        return this.c;
    }

    @Override // defpackage.afnh
    public void o() {
    }
}
