package defpackage;
/* compiled from: PG */
/* renamed from: avwg  reason: default package */
/* loaded from: classes2.dex */
public final class avwg implements aajq {
    public static final aajr a = new avwf();
    private final avwh b;

    public avwg(avwh avwhVar) {
        this.b = avwhVar;
    }

    @Override // defpackage.aajj
    public final amvn a() {
        return new amvl().g();
    }

    @Override // defpackage.aajj
    public final byte[] c() {
        return this.b.toByteArray();
    }

    @Override // defpackage.aajj
    public final String d() {
        return this.b.c;
    }

    @Override // defpackage.aajj
    public final /* bridge */ /* synthetic */ abga e() {
        return new avwe(this.b.mo52toBuilder());
    }

    @Override // defpackage.aajj
    public final boolean equals(Object obj) {
        return (obj instanceof avwg) && this.b.equals(((avwg) obj).b);
    }

    public String getAccessibilityFormattedAmount() {
        return this.b.e;
    }

    public Long getAmountMicros() {
        return Long.valueOf(this.b.f);
    }

    public String getFormattedAmount() {
        return this.b.d;
    }

    @Override // defpackage.aajj
    /* renamed from: getType  reason: collision with other method in class */
    public aajr mo145getType() {
        return a;
    }

    public String getVirtualCurrencyCode() {
        return this.b.g;
    }

    @Override // defpackage.aajj
    public final int hashCode() {
        return this.b.hashCode() ^ 1008001;
    }

    public final String toString() {
        String valueOf = String.valueOf(this.b);
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 22);
        sb.append("VcBalanceEntityModel{");
        sb.append(valueOf);
        sb.append("}");
        return sb.toString();
    }
}
