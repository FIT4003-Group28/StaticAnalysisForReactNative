package defpackage;

import java.util.Arrays;
import org.json.JSONObject;
/* compiled from: PG */
/* renamed from: qke  reason: default package */
/* loaded from: classes4.dex */
public final class qke {
    public final long a;
    private final int b = 0;
    private final boolean c = false;
    private final JSONObject d = null;

    public qke(long j) {
        this.a = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof qke)) {
            return false;
        }
        qke qkeVar = (qke) obj;
        if (this.a == qkeVar.a) {
            int i = qkeVar.b;
            boolean z = qkeVar.c;
            JSONObject jSONObject = qkeVar.d;
            if (tnk.j(null, null)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Long.valueOf(this.a), 0, false, null});
    }
}
