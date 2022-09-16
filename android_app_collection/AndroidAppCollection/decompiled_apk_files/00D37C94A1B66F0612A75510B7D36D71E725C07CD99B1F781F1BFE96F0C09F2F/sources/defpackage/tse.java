package defpackage;

import java.util.EnumSet;
/* compiled from: PG */
/* renamed from: tse  reason: default package */
/* loaded from: classes4.dex */
public final class tse {
    public static final tse a;
    public static final tse b;
    public static final tse c;
    private final boolean d;
    private final amvn e;

    static {
        tsc a2 = a();
        a2.c(EnumSet.noneOf(tsd.class));
        a2.b(false);
        a = a2.a();
        tsc a3 = a();
        a3.c(EnumSet.of(tsd.ANY));
        a3.b(true);
        b = a3.a();
        tsc a4 = a();
        a4.c(EnumSet.of(tsd.ANY));
        a4.b(false);
        c = a4.a();
    }

    public tse() {
    }

    public tse(boolean z, amvn amvnVar) {
        this.d = z;
        this.e = amvnVar;
    }

    public static tsc a() {
        tsc tscVar = new tsc();
        tscVar.b(false);
        return tscVar;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof tse) {
            tse tseVar = (tse) obj;
            if (this.d == tseVar.d && this.e.equals(tseVar.e)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (((true != this.d ? 1237 : 1231) ^ 1000003) * 1000003) ^ this.e.hashCode();
    }

    public final String toString() {
        boolean z = this.d;
        String valueOf = String.valueOf(this.e);
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 73);
        sb.append("DownloadConstraints{requireUnmeteredNetwork=");
        sb.append(z);
        sb.append(", requiredNetworkTypes=");
        sb.append(valueOf);
        sb.append("}");
        return sb.toString();
    }
}
