package defpackage;

import java.io.Serializable;
/* compiled from: PG */
/* renamed from: bwnk  reason: default package */
/* loaded from: classes4.dex */
public final class bwnk implements Serializable {
    public static final bwnk a = new bwnk();

    private bwnk() {
    }

    public final boolean equals(@dzsi Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj == null || obj.getClass() != getClass()) {
            return false;
        }
        bwnk bwnkVar = (bwnk) obj;
        return true;
    }

    public final int hashCode() {
        return 0;
    }
}
