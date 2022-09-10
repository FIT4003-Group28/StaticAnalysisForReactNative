package defpackage;

import java.util.ArrayList;
import java.util.List;
/* compiled from: PG */
/* renamed from: amph  reason: default package */
/* loaded from: classes.dex */
final class amph {
    private final List<ampf> a;
    private final List<ampf> b;
    private final int c;
    private final float d;
    private final int e;

    public amph(ampe ampeVar) {
        ArrayList a = dchl.a();
        this.a = a;
        ArrayList a2 = dchl.a();
        this.b = a2;
        this.d = 0.0f;
        this.c = 0;
        a2.addAll(ampeVar.b);
        a.addAll(ampeVar.c);
        this.e = (((a.hashCode() * 31) + a2.hashCode()) * 961) + Float.floatToIntBits(0.0f);
    }

    public final boolean equals(@dzsi Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof amph)) {
            return false;
        }
        amph amphVar = (amph) obj;
        float f = amphVar.d;
        if (Float.compare(0.0f, 0.0f) != 0) {
            return false;
        }
        int i = amphVar.c;
        return this.a.equals(amphVar.a) && this.b.equals(amphVar.b);
    }

    public final int hashCode() {
        return this.e;
    }
}
