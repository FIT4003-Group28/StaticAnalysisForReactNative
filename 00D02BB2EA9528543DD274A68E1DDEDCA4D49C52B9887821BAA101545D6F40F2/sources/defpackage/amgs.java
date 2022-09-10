package defpackage;

import java.util.Arrays;
/* compiled from: PG */
/* renamed from: amgs  reason: default package */
/* loaded from: classes2.dex */
final class amgs {
    public dmpn a;
    public dmrt b;

    public amgs(dmpn dmpnVar, dmrt dmrtVar) {
        this.a = dmpnVar;
        this.b = dmrtVar;
    }

    public final boolean equals(@dzsi Object obj) {
        if (obj instanceof amgs) {
            amgs amgsVar = (amgs) obj;
            if (this.a == amgsVar.a && this.b == amgsVar.b) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, this.b});
    }
}
