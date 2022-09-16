package defpackage;

import java.io.Serializable;
import java.util.Locale;
/* compiled from: PG */
/* renamed from: cxoc  reason: default package */
/* loaded from: classes5.dex */
public class cxoc implements Serializable {
    private static final long serialVersionUID = 1;
    public final cxof a;

    public cxoc(cxof cxofVar) {
        this.a = cxofVar;
    }

    public boolean equals(Object obj) {
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        return this.a.equals(((cxoc) obj).a);
    }

    public int hashCode() {
        return this.a.hashCode() + 527;
    }

    public String toString() {
        return String.format(Locale.US, "VisualElement {tag: %s}", this.a);
    }
}
