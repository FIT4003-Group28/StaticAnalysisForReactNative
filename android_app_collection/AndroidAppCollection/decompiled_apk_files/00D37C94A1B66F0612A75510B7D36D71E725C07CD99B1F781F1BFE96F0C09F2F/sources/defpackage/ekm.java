package defpackage;
/* compiled from: PG */
/* renamed from: ekm  reason: default package */
/* loaded from: classes3.dex */
final class ekm extends elq {
    private final ampq a;

    public ekm(ampq ampqVar) {
        this.a = ampqVar;
    }

    @Override // defpackage.elq
    public ampq a() {
        return this.a;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof elq)) {
            return false;
        }
        return this.a.equals(((elq) obj).a());
    }

    public int hashCode() {
        return this.a.hashCode() ^ 1000003;
    }

    public String toString() {
        String valueOf = String.valueOf(this.a);
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 54);
        sb.append("ChannelListSelectionChangeEvent{selectedChannelIndex=");
        sb.append(valueOf);
        sb.append("}");
        return sb.toString();
    }
}
