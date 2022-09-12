package defpackage;

import java.io.Serializable;
import java.util.Locale;
/* compiled from: PG */
/* renamed from: cxof  reason: default package */
/* loaded from: classes5.dex */
public final class cxof implements Serializable {
    private static final long serialVersionUID = 1;
    public final int a;

    public cxof(int i) {
        this.a = i;
    }

    public final boolean equals(Object obj) {
        return this == obj || ((obj instanceof cxof) && this.a == ((cxof) obj).a);
    }

    public final int hashCode() {
        return this.a + 527;
    }

    public final String toString() {
        return String.format(Locale.US, "VisualElementTag {id: %d, isRootPage: %b}", Integer.valueOf(this.a), false);
    }
}
