package defpackage;
/* compiled from: PG */
/* renamed from: bwsu  reason: default package */
/* loaded from: classes4.dex */
public final class bwsu {
    final /* synthetic */ bwsw a;
    private float b = 1.0f;

    public bwsu(bwsw bwswVar) {
        this.a = bwswVar;
    }

    public float getScale() {
        return this.b;
    }

    public void setScale(float f) {
        if (f != this.b) {
            this.b = f;
            for (bwvi bwviVar : this.a.a.values()) {
                bwviVar.k = f;
                bwviVar.d();
            }
            this.a.e.a.b();
        }
    }
}
