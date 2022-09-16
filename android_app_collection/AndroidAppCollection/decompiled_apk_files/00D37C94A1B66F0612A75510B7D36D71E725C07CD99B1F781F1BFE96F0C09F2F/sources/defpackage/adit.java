package defpackage;

import java.io.Serializable;
/* compiled from: PG */
/* renamed from: adit  reason: default package */
/* loaded from: classes.dex */
public class adit implements Serializable {
    public final String c;

    public adit(String str) {
        str.getClass();
        this.c = str;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof adit)) {
            return false;
        }
        return this.c.equals(((adit) obj).c);
    }

    public final int hashCode() {
        return this.c.hashCode();
    }

    public final String toString() {
        return this.c;
    }
}
