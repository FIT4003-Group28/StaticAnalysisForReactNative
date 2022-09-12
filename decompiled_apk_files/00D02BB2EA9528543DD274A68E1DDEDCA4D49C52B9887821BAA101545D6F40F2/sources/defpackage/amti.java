package defpackage;

import java.util.Arrays;
/* compiled from: PG */
/* renamed from: amti  reason: default package */
/* loaded from: classes2.dex */
public final class amti {
    public final int a;
    public final int b;
    public final boolean c;

    public amti(int i, int i2, boolean z) {
        this.a = i;
        this.b = i2;
        this.c = z;
    }

    public final boolean equals(@dzsi Object obj) {
        if (obj instanceof amti) {
            amti amtiVar = (amti) obj;
            if (this.a == amtiVar.a && this.b == amtiVar.b && this.c == amtiVar.c) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.a), Integer.valueOf(this.b), Boolean.valueOf(this.c)});
    }

    public final String toString() {
        dbsb b = dbsc.b(this);
        b.f("distanceFromStartMeters", this.a);
        b.f("etaSeconds", this.b);
        b.h("generatedFromTrafficData", this.c);
        return b.toString();
    }
}
