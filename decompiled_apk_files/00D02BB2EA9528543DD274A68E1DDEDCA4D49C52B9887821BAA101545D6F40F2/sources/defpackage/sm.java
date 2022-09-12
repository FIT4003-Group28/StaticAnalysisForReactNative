package defpackage;

import android.graphics.drawable.Animatable;
/* compiled from: PG */
/* renamed from: sm  reason: default package */
/* loaded from: classes.dex */
final class sm extends sr {
    private final Animatable a;

    public sm(Animatable animatable) {
        this.a = animatable;
    }

    @Override // defpackage.sr
    public final void a() {
        this.a.start();
    }

    @Override // defpackage.sr
    public final void b() {
        this.a.stop();
    }
}
