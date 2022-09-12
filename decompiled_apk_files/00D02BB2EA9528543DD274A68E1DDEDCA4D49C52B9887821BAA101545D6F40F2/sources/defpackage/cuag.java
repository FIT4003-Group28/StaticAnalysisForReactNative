package defpackage;

import java.security.KeyPair;
/* compiled from: PG */
/* renamed from: cuag  reason: default package */
/* loaded from: classes5.dex */
final class cuag extends cuai {
    private final KeyPair a;

    public cuag(KeyPair keyPair) {
        this.a = keyPair;
    }

    @Override // defpackage.cuai, defpackage.ctzo
    public final KeyPair a() {
        return this.a;
    }

    @Override // defpackage.ctzo
    public final int c() {
        return 2;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof ctzo) {
            ctzo ctzoVar = (ctzo) obj;
            if (ctzoVar.c() == 2 && this.a.equals(ctzoVar.a())) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        String valueOf = String.valueOf(this.a);
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 15);
        sb.append("OneOfId{ecdsa=");
        sb.append(valueOf);
        sb.append("}");
        return sb.toString();
    }
}
