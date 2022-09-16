package defpackage;

import android.graphics.drawable.Animatable;
/* compiled from: PG */
/* renamed from: pp  reason: default package */
/* loaded from: classes4.dex */
final class pp extends pu {
    private final Animatable a;

    public pp(Animatable animatable) {
        this.a = animatable;
    }

    @Override // defpackage.pu
    public final void a() {
        this.a.start();
    }

    @Override // defpackage.pu
    public final void b() {
        this.a.stop();
    }
}
