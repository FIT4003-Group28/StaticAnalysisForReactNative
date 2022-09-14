package defpackage;

import com.google.android.filament.R;
/* compiled from: PG */
/* renamed from: rke  reason: default package */
/* loaded from: classes7.dex */
final class rke extends rkj {
    private final int a;
    private final int b;
    private final ddho c;
    private final cjtd d;
    private final cqtd e;

    public rke(int i, int i2, @dzsi ddho ddhoVar, @dzsi cjtd cjtdVar, @dzsi cqtd cqtdVar) {
        this.a = i;
        this.b = i2;
        this.c = ddhoVar;
        this.d = cjtdVar;
        this.e = cqtdVar;
    }

    @Override // defpackage.rkj
    public final int a() {
        return this.a;
    }

    @Override // defpackage.rkj
    public final int b() {
        return this.b;
    }

    @Override // defpackage.rkj
    @dzsi
    public final ddho c() {
        return this.c;
    }

    @Override // defpackage.rkj
    @dzsi
    public final cjtd d() {
        return this.d;
    }

    @Override // defpackage.rkj
    @dzsi
    public final cqtd e() {
        return this.e;
    }

    public final boolean equals(Object obj) {
        ddho ddhoVar;
        cjtd cjtdVar;
        cqtd cqtdVar;
        if (obj == this) {
            return true;
        }
        if (obj instanceof rkj) {
            rkj rkjVar = (rkj) obj;
            if (this.a == rkjVar.a() && this.b == rkjVar.b() && ((ddhoVar = this.c) != null ? ddhoVar.equals(rkjVar.c()) : rkjVar.c() == null) && ((cjtdVar = this.d) != null ? cjtdVar.equals(rkjVar.d()) : rkjVar.d() == null) && ((cqtdVar = this.e) != null ? cqtdVar.equals(rkjVar.e()) : rkjVar.e() == null)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i = (((this.a ^ 1000003) * 1000003) ^ this.b) * 1000003;
        ddho ddhoVar = this.c;
        int i2 = 0;
        int hashCode = (i ^ (ddhoVar == null ? 0 : ddhoVar.hashCode())) * 1000003;
        cjtd cjtdVar = this.d;
        int hashCode2 = (hashCode ^ (cjtdVar == null ? 0 : cjtdVar.hashCode())) * 1000003;
        cqtd cqtdVar = this.e;
        if (cqtdVar != null) {
            i2 = cqtdVar.hashCode();
        }
        return hashCode2 ^ i2;
    }

    public final String toString() {
        int i = this.a;
        int i2 = this.b;
        String valueOf = String.valueOf(this.c);
        String valueOf2 = String.valueOf(this.d);
        String valueOf3 = String.valueOf(this.e);
        int length = String.valueOf(valueOf).length();
        int length2 = String.valueOf(valueOf2).length();
        StringBuilder sb = new StringBuilder(length + R.styleable.AppCompatTheme_windowMinWidthMinor + length2 + String.valueOf(valueOf3).length());
        sb.append("CommuteSettingsNudgeBarSpecification{titleId=");
        sb.append(i);
        sb.append(", descriptionId=");
        sb.append(i2);
        sb.append(", barUe3VeType=");
        sb.append(valueOf);
        sb.append(", dismissUe3Params=");
        sb.append(valueOf2);
        sb.append(", icon=");
        sb.append(valueOf3);
        sb.append("}");
        return sb.toString();
    }
}
