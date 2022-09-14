package defpackage;

import java.io.Serializable;
import java.util.Arrays;
/* compiled from: PG */
/* renamed from: bwnl  reason: default package */
/* loaded from: classes4.dex */
public final class bwnl implements Serializable {
    public static final bwnl a = new bwnl(null);
    @dzsi
    public final String b;

    public bwnl(@dzsi String str) {
        this.b = str;
    }

    public final boolean equals(@dzsi Object obj) {
        if (!(obj instanceof bwnl)) {
            return false;
        }
        return dbsd.a(this.b, ((bwnl) obj).b);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.b});
    }

    public final String toString() {
        String str = this.b;
        if (str == null) {
            return "<empty token>";
        }
        StringBuilder sb = new StringBuilder(str.length() + 9);
        sb.append("<token: ");
        sb.append(str);
        sb.append(">");
        return sb.toString();
    }
}
