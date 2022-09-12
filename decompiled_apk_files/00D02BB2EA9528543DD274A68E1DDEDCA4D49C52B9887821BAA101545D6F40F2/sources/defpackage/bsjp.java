package defpackage;

import com.google.android.filament.R;
/* compiled from: PG */
/* renamed from: bsjp  reason: default package */
/* loaded from: classes4.dex */
final class bsjp extends bskq {
    private final ddho a;
    private final ddho b;
    private final ddho c;
    private final ddho d;
    private final ddho e;

    public bsjp(ddho ddhoVar, ddho ddhoVar2, ddho ddhoVar3, ddho ddhoVar4, ddho ddhoVar5) {
        this.a = ddhoVar;
        this.b = ddhoVar2;
        this.c = ddhoVar3;
        this.d = ddhoVar4;
        this.e = ddhoVar5;
    }

    @Override // defpackage.bskq
    public final ddho a() {
        return this.a;
    }

    @Override // defpackage.bskq
    public final ddho b() {
        return this.b;
    }

    @Override // defpackage.bskq
    public final ddho c() {
        return this.c;
    }

    @Override // defpackage.bskq
    public final ddho d() {
        return this.d;
    }

    @Override // defpackage.bskq
    public final ddho e() {
        return this.e;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof bskq) {
            bskq bskqVar = (bskq) obj;
            if (this.a.equals(bskqVar.a()) && this.b.equals(bskqVar.b()) && this.c.equals(bskqVar.c()) && this.d.equals(bskqVar.d()) && this.e.equals(bskqVar.e())) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((((((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003) ^ this.c.hashCode()) * 1000003) ^ this.d.hashCode()) * 1000003) ^ this.e.hashCode();
    }

    public final String toString() {
        String valueOf = String.valueOf(this.a);
        String valueOf2 = String.valueOf(this.b);
        String valueOf3 = String.valueOf(this.c);
        String valueOf4 = String.valueOf(this.d);
        String valueOf5 = String.valueOf(this.e);
        int length = String.valueOf(valueOf).length();
        int length2 = String.valueOf(valueOf2).length();
        int length3 = String.valueOf(valueOf3).length();
        int length4 = String.valueOf(valueOf4).length();
        StringBuilder sb = new StringBuilder(length + R.styleable.AppCompatTheme_windowFixedWidthMajor + length2 + length3 + length4 + String.valueOf(valueOf5).length());
        sb.append("PivotsGroupConfig{togglableVeType=");
        sb.append(valueOf);
        sb.append(", valueSelectorVeType=");
        sb.append(valueOf2);
        sb.append(", hotelDatepickersVeType=");
        sb.append(valueOf3);
        sb.append(", hotelPriceVeType=");
        sb.append(valueOf4);
        sb.append(", hotelAmenityVeType=");
        sb.append(valueOf5);
        sb.append("}");
        return sb.toString();
    }
}
