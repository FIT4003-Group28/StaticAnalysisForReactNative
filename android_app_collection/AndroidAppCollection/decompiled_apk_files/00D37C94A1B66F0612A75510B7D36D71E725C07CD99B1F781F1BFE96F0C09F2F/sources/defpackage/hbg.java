package defpackage;
/* compiled from: PG */
/* renamed from: hbg  reason: default package */
/* loaded from: classes3.dex */
public final class hbg {
    public float a = 0.5f;

    public final void a(float f) {
        if (f < 0.0f || f > 1.0f) {
            zep.b("Volume balance is not between 0 and 1 inclusive.");
        } else {
            this.a = f;
        }
    }
}
