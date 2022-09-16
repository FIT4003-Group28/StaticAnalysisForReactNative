package defpackage;

import java.util.Locale;
/* compiled from: PG */
/* renamed from: czhc  reason: default package */
/* loaded from: classes5.dex */
public final class czhc extends cxoc {
    public Integer b;

    public czhc(cxof cxofVar) {
        super(cxofVar);
    }

    public final void a(int i) {
        this.b = Integer.valueOf(i);
    }

    @Override // defpackage.cxoc
    public final boolean equals(Object obj) {
        return super.equals(obj) && czhw.a(this.b, ((czhc) obj).b) && czhw.a(null, null) && czhw.a(null, null);
    }

    @Override // defpackage.cxoc
    public final int hashCode() {
        return czhw.c(this.b, czhw.c(null, czhw.c(null, super.hashCode())));
    }

    @Override // defpackage.cxoc
    public final String toString() {
        return String.format(Locale.US, "SendKitVisualElement {tag: %s, index: %d, intent class name: %s, first in flow: %b}", this.a, this.b, null, null);
    }
}
