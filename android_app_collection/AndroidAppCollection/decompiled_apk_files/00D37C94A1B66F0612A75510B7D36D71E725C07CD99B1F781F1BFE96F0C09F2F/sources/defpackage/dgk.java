package defpackage;

import android.animation.TimeInterpolator;
/* compiled from: PG */
/* renamed from: dgk  reason: default package */
/* loaded from: classes3.dex */
public final class dgk extends dgp {
    private final TimeInterpolator e;

    public dgk(TimeInterpolator timeInterpolator) {
        this.e = timeInterpolator;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.dgp
    public final float a(long j) {
        return this.e.getInterpolation(f("default_input").c);
    }
}
