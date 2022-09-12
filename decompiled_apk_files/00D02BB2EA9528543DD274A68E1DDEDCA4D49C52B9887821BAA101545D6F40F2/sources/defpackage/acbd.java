package defpackage;
/* compiled from: PG */
/* renamed from: acbd  reason: default package */
/* loaded from: classes2.dex */
final class acbd extends acbf {
    private final Integer a;

    public acbd(Integer num) {
        this.a = num;
    }

    @Override // defpackage.acbf, defpackage.acax
    public Integer a() {
        return this.a;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof acbf)) {
            return false;
        }
        return this.a.equals(((acbf) obj).a());
    }

    public int hashCode() {
        return this.a.hashCode() ^ 1000003;
    }

    public String toString() {
        String valueOf = String.valueOf(this.a);
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 42);
        sb.append("CarouselBackgroundViewModelImpl{heightPx=");
        sb.append(valueOf);
        sb.append("}");
        return sb.toString();
    }
}
