package defpackage;
/* compiled from: PG */
/* renamed from: hjz  reason: default package */
/* loaded from: classes3.dex */
public final class hjz {
    public static final hjz a = new hjz(0.0f, 0.0f, 0);
    public final float b;
    public final float c;
    public final int d;

    public hjz(float f, float f2, int i) {
        this.b = f;
        this.c = f2;
        this.d = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof hjz)) {
            return false;
        }
        hjz hjzVar = (hjz) obj;
        return this.d == hjzVar.d && this.c == hjzVar.c && this.b == hjzVar.b;
    }
}
