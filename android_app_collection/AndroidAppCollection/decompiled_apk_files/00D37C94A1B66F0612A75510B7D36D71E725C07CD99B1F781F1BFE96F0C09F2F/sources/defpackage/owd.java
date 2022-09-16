package defpackage;

import java.util.UUID;
/* compiled from: PG */
/* renamed from: owd  reason: default package */
/* loaded from: classes4.dex */
public class owd {
    public final String a;
    public final UUID b;
    public final owv c;

    public owd(String str, UUID uuid, owv owvVar) {
        pce.a(str);
        this.a = str;
        this.b = uuid;
        this.c = owvVar;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof owd)) {
            return false;
        }
        if (obj == this) {
            return true;
        }
        owd owdVar = (owd) obj;
        return this.a.equals(owdVar.a) && pcx.p(this.b, owdVar.b) && pcx.p(this.c, owdVar.c);
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 37;
        UUID uuid = this.b;
        int i = 0;
        int hashCode2 = (hashCode + (uuid != null ? uuid.hashCode() : 0)) * 37;
        owv owvVar = this.c;
        if (owvVar != null) {
            i = owvVar.hashCode();
        }
        return hashCode2 + i;
    }
}
