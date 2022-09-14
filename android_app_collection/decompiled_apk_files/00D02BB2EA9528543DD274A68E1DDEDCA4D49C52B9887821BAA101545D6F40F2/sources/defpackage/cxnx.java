package defpackage;

import java.util.Locale;
/* compiled from: PG */
/* renamed from: cxnx  reason: default package */
/* loaded from: classes5.dex */
public final class cxnx implements cxnv {
    public final int a;
    public final cxod b;
    public String c;
    private dead d;

    public cxnx(int i, cxod cxodVar) {
        this.a = i;
        this.b = cxodVar;
    }

    @Override // defpackage.cxnv
    public final void a() {
    }

    public final boolean equals(Object obj) {
        if (obj instanceof cxnx) {
            cxnx cxnxVar = (cxnx) obj;
            if (this.a == cxnxVar.a) {
                dead deadVar = cxnxVar.d;
                if (czhw.a(null, null) && this.b.equals(cxnxVar.b) && czhw.a(this.c, cxnxVar.c)) {
                    return true;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        return czhw.b(this.a, czhw.c(this.c, czhw.c(null, this.b.hashCode())));
    }

    public final String toString() {
        return String.format(Locale.US, "UserEvent action: %d%s on: %s ", Integer.valueOf(this.a), "", this.b.toString());
    }
}
