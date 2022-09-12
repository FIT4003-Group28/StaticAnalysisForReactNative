package defpackage;

import com.google.android.filament.R;
/* compiled from: PG */
/* renamed from: ajve  reason: default package */
/* loaded from: classes2.dex */
public final class ajve extends ajwc {
    public final ddho a;
    public final ddho b;
    public final ddho c;
    public final ddho d;
    public final ddho e;

    public ajve(ddho ddhoVar, ddho ddhoVar2, ddho ddhoVar3, ddho ddhoVar4, @dzsi ddho ddhoVar5) {
        this.a = ddhoVar;
        this.b = ddhoVar2;
        this.c = ddhoVar3;
        this.d = ddhoVar4;
        this.e = ddhoVar5;
    }

    @Override // defpackage.ajwc
    public final ddho a() {
        return this.a;
    }

    @Override // defpackage.ajwc
    public final ddho b() {
        return this.b;
    }

    @Override // defpackage.ajwc
    public final ddho c() {
        return this.c;
    }

    @Override // defpackage.ajwc
    public final ddho d() {
        return this.d;
    }

    @Override // defpackage.ajwc
    @dzsi
    public final ddho e() {
        return this.e;
    }

    public final boolean equals(Object obj) {
        ddho ddhoVar;
        if (obj == this) {
            return true;
        }
        if (obj instanceof ajwc) {
            ajwc ajwcVar = (ajwc) obj;
            if (this.a.equals(ajwcVar.a()) && this.b.equals(ajwcVar.b()) && this.c.equals(ajwcVar.c()) && this.d.equals(ajwcVar.d()) && ((ddhoVar = this.e) != null ? ddhoVar.equals(ajwcVar.e()) : ajwcVar.e() == null)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int hashCode = (((((((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003) ^ this.c.hashCode()) * 1000003) ^ this.d.hashCode()) * 1000003;
        ddho ddhoVar = this.e;
        return hashCode ^ (ddhoVar == null ? 0 : ddhoVar.hashCode());
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
        StringBuilder sb = new StringBuilder(length + R.styleable.AppCompatTheme_textColorAlertDialogListItem + length2 + length3 + length4 + String.valueOf(valueOf5).length());
        sb.append("ConfigureSharesVEs{temporaryShareVE=");
        sb.append(valueOf);
        sb.append(", persistentShareVE=");
        sb.append(valueOf2);
        sb.append(", increaseDurationVE=");
        sb.append(valueOf3);
        sb.append(", decreaseDurationVE=");
        sb.append(valueOf4);
        sb.append(", cancelVE=");
        sb.append(valueOf5);
        sb.append("}");
        return sb.toString();
    }
}
