package defpackage;

import android.view.Surface;
/* compiled from: PG */
/* renamed from: pxn  reason: default package */
/* loaded from: classes4.dex */
public final class pxn extends avy {
    public final int b;
    public final boolean c;

    public pxn(Throwable th, avz avzVar, Surface surface) {
        super(th, avzVar);
        this.b = System.identityHashCode(surface);
        boolean z = true;
        if (surface != null && !surface.isValid()) {
            z = false;
        }
        this.c = z;
    }
}
