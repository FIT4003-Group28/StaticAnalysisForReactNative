package defpackage;

import com.google.vr.cardboard.ExternalSurfaceManager;
/* compiled from: PG */
/* renamed from: axea  reason: default package */
/* loaded from: classes2.dex */
public final class axea {
    final /* synthetic */ long a;

    public axea(long j) {
        this.a = j;
    }

    public final void a(int i, int i2, long j, float[] fArr) {
        ExternalSurfaceManager.nativeUpdateSurface(this.a, i, i2, j, fArr);
    }
}
