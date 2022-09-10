package defpackage;

import com.google.android.filament.R;
/* compiled from: PG */
/* renamed from: cvcp  reason: default package */
/* loaded from: classes5.dex */
final class cvcp extends cvcy {
    public final dbsg<cugu> a;
    public final cufj b;
    public final int c;
    public final boolean d;
    public final boolean e;

    public cvcp(dbsg<cugu> dbsgVar, cufj cufjVar, int i, boolean z, boolean z2) {
        this.a = dbsgVar;
        this.b = cufjVar;
        this.c = i;
        this.d = z;
        this.e = z2;
    }

    @Override // defpackage.cvcy
    public final dbsg<cugu> a() {
        return this.a;
    }

    @Override // defpackage.cvcy
    public final cufj b() {
        return this.b;
    }

    @Override // defpackage.cvcy
    public final int c() {
        return this.c;
    }

    @Override // defpackage.cvcy
    public final boolean d() {
        return this.d;
    }

    @Override // defpackage.cvcy
    public final boolean e() {
        return this.e;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof cvcy) {
            cvcy cvcyVar = (cvcy) obj;
            if (this.a.equals(cvcyVar.a()) && this.b.equals(cvcyVar.b()) && this.c == cvcyVar.c() && this.d == cvcyVar.d() && this.e == cvcyVar.e()) {
                return true;
            }
        }
        return false;
    }

    @Override // defpackage.cvcy
    public final cvcx f() {
        return new cvco(this);
    }

    public final int hashCode() {
        int i = 1237;
        int hashCode = (((((((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003) ^ this.c) * 1000003) ^ (true != this.d ? 1237 : 1231)) * 1000003;
        if (true == this.e) {
            i = 1231;
        }
        return hashCode ^ i;
    }

    public final String toString() {
        String valueOf = String.valueOf(this.a);
        String valueOf2 = String.valueOf(this.b);
        int i = this.c;
        boolean z = this.d;
        boolean z2 = this.e;
        int length = String.valueOf(valueOf).length();
        StringBuilder sb = new StringBuilder(length + R.styleable.AppCompatTheme_windowFixedHeightMajor + String.valueOf(valueOf2).length());
        sb.append("MessageCellViewModel{message=");
        sb.append(valueOf);
        sb.append(", senderProfile=");
        sb.append(valueOf2);
        sb.append(", threadPosition=");
        sb.append(i);
        sb.append(", hasTombstone=");
        sb.append(z);
        sb.append(", bottomLabelVisible=");
        sb.append(z2);
        sb.append("}");
        return sb.toString();
    }
}
