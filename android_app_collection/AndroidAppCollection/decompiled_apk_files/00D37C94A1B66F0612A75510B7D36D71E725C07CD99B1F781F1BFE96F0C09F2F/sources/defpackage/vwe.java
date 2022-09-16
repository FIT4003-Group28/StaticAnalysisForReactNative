package defpackage;
/* compiled from: PG */
/* renamed from: vwe  reason: default package */
/* loaded from: classes4.dex */
public final class vwe {
    public static final vwe a = new vwe(0.0f, 0.0f, 0);
    public final float b;
    public final float c;
    public final int d;

    public vwe(float f, float f2, int i) {
        this.b = f;
        this.c = f2;
        this.d = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof vwe)) {
            return false;
        }
        vwe vweVar = (vwe) obj;
        return this.d == vweVar.d && this.c == vweVar.c && this.b == vweVar.b;
    }
}
