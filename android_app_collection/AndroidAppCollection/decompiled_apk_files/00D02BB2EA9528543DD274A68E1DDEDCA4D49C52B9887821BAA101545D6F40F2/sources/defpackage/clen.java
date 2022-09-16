package defpackage;

import java.util.Arrays;
/* compiled from: PG */
/* renamed from: clen  reason: default package */
/* loaded from: classes5.dex */
final class clen extends clew {
    private final String a;
    private final byte[] b;
    private final clcv c;

    public clen(String str, byte[] bArr, clcv clcvVar) {
        this.a = str;
        this.b = bArr;
        this.c = clcvVar;
    }

    @Override // defpackage.clew
    public final String a() {
        return this.a;
    }

    @Override // defpackage.clew
    public final byte[] b() {
        return this.b;
    }

    @Override // defpackage.clew
    public final clcv c() {
        return this.c;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof clew) {
            clew clewVar = (clew) obj;
            if (this.a.equals(clewVar.a())) {
                if (Arrays.equals(this.b, clewVar instanceof clen ? ((clen) clewVar).b : clewVar.b()) && this.c.equals(clewVar.c())) {
                    return true;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((this.a.hashCode() ^ 1000003) * 1000003) ^ Arrays.hashCode(this.b)) * 1000003) ^ this.c.hashCode();
    }
}
