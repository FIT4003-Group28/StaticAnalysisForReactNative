package defpackage;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: bhht  reason: default package */
/* loaded from: classes3.dex */
public final class bhht extends bhhw {
    private final int a;
    private final int b;
    private final int c;
    private final int d;
    private final ddho e;
    private final ddho f;

    public bhht(int i, int i2, int i3, int i4, ddho ddhoVar, ddho ddhoVar2) {
        this.a = i;
        this.b = i2;
        this.c = i3;
        this.d = i4;
        this.e = ddhoVar;
        this.f = ddhoVar2;
    }

    @Override // defpackage.bhhw
    public final int a() {
        return this.a;
    }

    @Override // defpackage.bhhw
    public final int b() {
        return this.b;
    }

    @Override // defpackage.bhhw
    public final int c() {
        return this.c;
    }

    @Override // defpackage.bhhw
    public final int d() {
        return this.d;
    }

    @Override // defpackage.bhhw
    public final ddho e() {
        return this.e;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof bhhw) {
            bhhw bhhwVar = (bhhw) obj;
            if (this.a == bhhwVar.a() && this.b == bhhwVar.b() && this.c == bhhwVar.c() && this.d == bhhwVar.d() && this.e.equals(bhhwVar.e()) && this.f.equals(bhhwVar.f())) {
                return true;
            }
        }
        return false;
    }

    @Override // defpackage.bhhw
    public final ddho f() {
        return this.f;
    }

    public final int hashCode() {
        return ((((((((((this.a ^ 1000003) * 1000003) ^ this.b) * 1000003) ^ this.c) * 1000003) ^ this.d) * 1000003) ^ this.e.hashCode()) * 1000003) ^ this.f.hashCode();
    }

    public final String toString() {
        int i = this.a;
        int i2 = this.b;
        int i3 = this.c;
        int i4 = this.d;
        String valueOf = String.valueOf(this.e);
        String valueOf2 = String.valueOf(this.f);
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 178 + String.valueOf(valueOf2).length());
        sb.append("IntroPageProperties{titleLabelStringId=");
        sb.append(i);
        sb.append(", descriptionLabelStringId=");
        sb.append(i2);
        sb.append(", helperLabelStringId=");
        sb.append(i3);
        sb.append(", nextButtonStringId=");
        sb.append(i4);
        sb.append(", pageVe=");
        sb.append(valueOf);
        sb.append(", nextButtonVe=");
        sb.append(valueOf2);
        sb.append("}");
        return sb.toString();
    }
}
