package defpackage;
/* compiled from: PG */
/* renamed from: cunw  reason: default package */
/* loaded from: classes5.dex */
final class cunw extends cunz {
    private final cupm a;

    public cunw(cupm cupmVar) {
        this.a = cupmVar;
    }

    @Override // defpackage.cunz, defpackage.cupx
    public final cupm a() {
        return this.a;
    }

    @Override // defpackage.cupx
    public final cupw b() {
        return cupw.CARD_CAROUSEL;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof cupx) {
            cupx cupxVar = (cupx) obj;
            if (cupw.CARD_CAROUSEL == cupxVar.b() && this.a.equals(cupxVar.a())) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        String valueOf = String.valueOf(this.a);
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 23);
        sb.append("RichCard{cardCarousel=");
        sb.append(valueOf);
        sb.append("}");
        return sb.toString();
    }
}
