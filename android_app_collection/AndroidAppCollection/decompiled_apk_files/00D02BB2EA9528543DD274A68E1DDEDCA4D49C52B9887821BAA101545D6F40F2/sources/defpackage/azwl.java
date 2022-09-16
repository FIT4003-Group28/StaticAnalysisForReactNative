package defpackage;

import java.io.Serializable;
import java.util.Arrays;
/* compiled from: PG */
/* renamed from: azwl  reason: default package */
/* loaded from: classes.dex */
public final class azwl implements Serializable {
    public String a;
    @dzsi
    public String b;

    public azwl() {
        this("Auto-generate a ClientId, please!", "ServerIds do not apply to this corpus.");
    }

    public static String a(long j) {
        StringBuilder sb = new StringBuilder(42);
        sb.append("AUTO_GEN_KEY_FOR_SYNC_");
        sb.append(j);
        return sb.toString();
    }

    public final boolean equals(@dzsi Object obj) {
        if (!(obj instanceof azwl)) {
            return false;
        }
        azwl azwlVar = (azwl) obj;
        if (!this.a.equals(azwlVar.a)) {
            return false;
        }
        String str = this.b;
        if (str == null && azwlVar.b == null) {
            return true;
        }
        return str != null && str.equals(azwlVar.b);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, this.b});
    }

    public azwl(String str, @dzsi String str2) {
        dbsk.s(str);
        this.a = str;
        if (dbsj.d(str2) || str2.equals("ServerIds do not apply to this corpus.")) {
            this.b = null;
        } else {
            this.b = str2;
        }
    }
}
