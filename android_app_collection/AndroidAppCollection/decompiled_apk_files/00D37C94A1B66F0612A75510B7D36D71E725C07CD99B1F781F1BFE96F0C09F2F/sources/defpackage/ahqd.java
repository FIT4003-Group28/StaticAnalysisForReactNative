package defpackage;

import com.google.android.libraries.youtube.player.features.overlay.controls.ControlsOverlayStyle;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: ahqd  reason: default package */
/* loaded from: classes.dex */
public final class ahqd implements ahmi {
    final /* synthetic */ ahqe a;
    final /* synthetic */ ahpu b;

    public ahqd(ahqe ahqeVar, ahpu ahpuVar) {
        this.a = ahqeVar;
        this.b = ahpuVar;
    }

    private final long b(float f) {
        ahqe ahqeVar = this.a;
        long j = ahqeVar.g;
        long j2 = ahqeVar.h;
        return (long) Math.ceil((f * ((((float) (j - j2)) / 1000.0f) + 1.0f) * 1000.0f) + ((float) j2));
    }

    @Override // defpackage.ahmi
    public final void a(float f) {
        ahqe ahqeVar = this.a;
        ahqeVar.b.n(-ahqeVar.i, 0.0f, 0.0f);
        ahqe ahqeVar2 = this.a;
        float f2 = ahqeVar2.a.h * f;
        ahqeVar2.i = f2;
        ahqeVar2.b.n(f2, 0.0f, 0.0f);
        long b = b(f);
        if (ControlsOverlayStyle.b(this.a.k)) {
            b -= this.a.g;
        }
        ahom.h(this.a.f, zgh.i(b / 1000));
        this.a.b.g();
    }

    @Override // defpackage.ahmi
    public final void c() {
    }

    @Override // defpackage.ahmi
    public final void d(float f) {
        this.b.a(b(f));
    }
}
