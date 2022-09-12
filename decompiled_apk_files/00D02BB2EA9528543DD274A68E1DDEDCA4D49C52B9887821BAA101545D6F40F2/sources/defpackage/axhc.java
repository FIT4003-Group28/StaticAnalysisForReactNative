package defpackage;

import java.util.List;
/* compiled from: PG */
/* renamed from: axhc  reason: default package */
/* loaded from: classes3.dex */
public final class axhc extends axhd {
    public final List<String> a;

    public axhc(List<String> list) {
        dzvx.c(list, "users");
        this.a = list;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            return (obj instanceof axhc) && dzvx.d(this.a, ((axhc) obj).a);
        }
        return true;
    }

    public final int hashCode() {
        List<String> list = this.a;
        if (list != null) {
            return list.hashCode();
        }
        return 0;
    }

    public final String toString() {
        return "WarmUpUserListEvent(users=" + this.a + ")";
    }
}
