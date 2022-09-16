package defpackage;
/* compiled from: PG */
/* renamed from: ezr  reason: default package */
/* loaded from: classes3.dex */
public final class ezr extends afmw {
    private static final afmv b = new afmv(640, 360, false);
    public afmv a = afmv.a;

    public final void a(int i, int i2, boolean z) {
        if (i <= 0 || i2 <= 0) {
            return;
        }
        afmv afmvVar = this.a;
        if (afmvVar.c == i && afmvVar.d == i2 && afmvVar.b == z) {
            return;
        }
        this.a = new afmv(i, i2, z);
        notifyObservers();
    }

    @Override // defpackage.amqo
    public final /* bridge */ /* synthetic */ Object get() {
        afmv afmvVar = this.a;
        if (afmvVar.c <= 0 || afmvVar.d <= 0) {
            zep.l("Suppressed bad viewport dimensions. Video quality may suffer!");
            return b;
        }
        return afmvVar;
    }
}
