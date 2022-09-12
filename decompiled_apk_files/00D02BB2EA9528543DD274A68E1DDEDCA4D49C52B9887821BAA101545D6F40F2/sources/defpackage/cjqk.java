package defpackage;

import java.io.Serializable;
/* compiled from: PG */
/* renamed from: cjqk  reason: default package */
/* loaded from: classes.dex */
public class cjqk implements Serializable {
    @dzsi
    private final String a;

    public cjqk(@dzsi String str) {
        this.a = str;
    }

    public final dbsg<String> a() {
        return dbsg.j(this.a);
    }

    public final boolean equals(@dzsi Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof cjqk) {
            return a().equals(((cjqk) obj).a());
        }
        return false;
    }

    public final int hashCode() {
        return a().hashCode();
    }

    public final String toString() {
        return a().toString();
    }
}
