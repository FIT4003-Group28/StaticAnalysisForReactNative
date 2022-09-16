package defpackage;

import java.util.Arrays;
/* compiled from: PG */
/* renamed from: atnw  reason: default package */
/* loaded from: classes2.dex */
public final class atnw {
    public final float a;
    @dzsi
    public final cqtv b;
    @dzsi
    public final cqtv c;

    public atnw() {
        dbsk.a(true);
        this.a = 1.4f;
        this.b = null;
        this.c = null;
    }

    public atnw(cqtv cqtvVar, cqtv cqtvVar2) {
        this.a = -1.0f;
        this.b = cqtvVar;
        this.c = cqtvVar2;
    }

    public final boolean equals(@dzsi Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof atnw) {
            atnw atnwVar = (atnw) obj;
            if (this.a == atnwVar.a && dbsd.a(this.b, atnwVar.b) && dbsd.a(this.c, atnwVar.c)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Float.valueOf(this.a), this.b, this.c});
    }
}
