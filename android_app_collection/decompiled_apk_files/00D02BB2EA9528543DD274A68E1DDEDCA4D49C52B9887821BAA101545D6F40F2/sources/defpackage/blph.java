package defpackage;

import java.util.List;
/* compiled from: PG */
/* renamed from: blph  reason: default package */
/* loaded from: classes3.dex */
public final class blph extends blpj {
    private final List<drfx> a;

    public blph(List<drfx> list) {
        if (list != null) {
            this.a = list;
            return;
        }
        throw new NullPointerException("Null entries");
    }

    @Override // defpackage.blpj
    public final List<drfx> a() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof blpj)) {
            return false;
        }
        return this.a.equals(((blpj) obj).a());
    }

    public final int hashCode() {
        return this.a.hashCode() ^ 1000003;
    }

    public final String toString() {
        String valueOf = String.valueOf(this.a);
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 36);
        sb.append("RatingsReviewsChangedEvent{entries=");
        sb.append(valueOf);
        sb.append("}");
        return sb.toString();
    }
}
