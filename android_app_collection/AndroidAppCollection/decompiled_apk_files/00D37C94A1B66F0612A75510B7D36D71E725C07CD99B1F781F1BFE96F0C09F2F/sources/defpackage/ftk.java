package defpackage;
/* compiled from: PG */
/* renamed from: ftk  reason: default package */
/* loaded from: classes3.dex */
final class ftk extends fwe {
    private final boolean a;

    public ftk(boolean z) {
        this.a = z;
    }

    @Override // defpackage.fwe
    public boolean a() {
        return this.a;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        return (obj instanceof fwe) && this.a == ((fwe) obj).a();
    }

    public int hashCode() {
        return (true != this.a ? 1237 : 1231) ^ 1000003;
    }

    public String toString() {
        boolean z = this.a;
        StringBuilder sb = new StringBuilder(58);
        sb.append("FreeTextSurveyFocusedEvent{wasFreeTextSurveyFocused=");
        sb.append(z);
        sb.append("}");
        return sb.toString();
    }
}
