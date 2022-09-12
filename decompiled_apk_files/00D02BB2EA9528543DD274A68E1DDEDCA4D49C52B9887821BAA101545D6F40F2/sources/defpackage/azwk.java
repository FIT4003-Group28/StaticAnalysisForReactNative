package defpackage;

import java.io.Serializable;
/* compiled from: PG */
/* renamed from: azwk  reason: default package */
/* loaded from: classes3.dex */
public final class azwk implements Serializable {
    public final String a;

    public azwk(String str) {
        dbsk.s(str);
        this.a = str;
    }

    public final boolean equals(@dzsi Object obj) {
        if (!(obj instanceof azwk)) {
            return false;
        }
        return this.a.equals(((azwk) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
