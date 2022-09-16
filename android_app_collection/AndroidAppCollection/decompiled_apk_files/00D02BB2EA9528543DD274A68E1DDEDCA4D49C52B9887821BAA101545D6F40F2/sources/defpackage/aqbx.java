package defpackage;

import java.util.Arrays;
/* compiled from: PG */
/* renamed from: aqbx  reason: default package */
/* loaded from: classes2.dex */
public class aqbx {
    public final ctyy a;
    public final ctyy b;

    public aqbx(ctyy ctyyVar, ctyy ctyyVar2) {
        this.a = ctyyVar;
        this.b = ctyyVar2;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof aqbx)) {
            return false;
        }
        if (this == obj) {
            return true;
        }
        aqbx aqbxVar = (aqbx) obj;
        return this.a.equals(aqbxVar.a) && this.b.equals(aqbxVar.b);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, this.b});
    }
}
