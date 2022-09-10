package defpackage;

import java.util.Arrays;
/* compiled from: PG */
/* renamed from: ankt  reason: default package */
/* loaded from: classes2.dex */
final class ankt {
    public final dssj a;
    public final dbsg<anks> b;

    public ankt(dssj dssjVar, dbsg dbsgVar) {
        this.a = dssjVar;
        this.b = dbsgVar;
    }

    public final boolean equals(@dzsi Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ankt anktVar = (ankt) obj;
        return dbsd.a(this.a, anktVar.a) && dbsd.a(this.b, anktVar.b);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, this.b});
    }
}
