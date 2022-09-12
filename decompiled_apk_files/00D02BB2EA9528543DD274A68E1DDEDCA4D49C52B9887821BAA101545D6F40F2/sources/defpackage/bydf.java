package defpackage;

import android.content.Context;
/* compiled from: PG */
/* renamed from: bydf  reason: default package */
/* loaded from: classes4.dex */
final class bydf extends bydm {
    private final int a;
    private final int b;
    private final int c;
    private final int d;
    private final boolean e;
    private final Context f;

    public bydf(int i, int i2, int i3, int i4, boolean z, Context context) {
        this.a = i;
        this.b = i2;
        this.c = i3;
        this.d = i4;
        this.e = z;
        this.f = context;
    }

    @Override // defpackage.bydm
    public final int a() {
        return this.a;
    }

    @Override // defpackage.bydm
    public final int b() {
        return this.b;
    }

    @Override // defpackage.bydm
    public final int c() {
        return this.c;
    }

    @Override // defpackage.bydm
    public final int d() {
        return this.d;
    }

    @Override // defpackage.bydm
    public final boolean e() {
        return this.e;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof bydm) {
            bydm bydmVar = (bydm) obj;
            if (this.a == bydmVar.a() && this.b == bydmVar.b() && this.c == bydmVar.c() && this.d == bydmVar.d() && this.e == bydmVar.e() && this.f.equals(bydmVar.f())) {
                return true;
            }
        }
        return false;
    }

    @Override // defpackage.bydm
    public final Context f() {
        return this.f;
    }

    public final int hashCode() {
        return ((((((((((this.a ^ 1000003) * 1000003) ^ this.b) * 1000003) ^ this.c) * 1000003) ^ this.d) * 1000003) ^ (true != this.e ? 1237 : 1231)) * 1000003) ^ this.f.hashCode();
    }

    public final String toString() {
        int i = this.a;
        int i2 = this.b;
        int i3 = this.c;
        int i4 = this.d;
        boolean z = this.e;
        String valueOf = String.valueOf(this.f);
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 186);
        sb.append("ColorOptions{closedColor=");
        sb.append(i);
        sb.append(", closingOrOpeningSoonColor=");
        sb.append(i2);
        sb.append(", openColor=");
        sb.append(i3);
        sb.append(", futureOpenColor=");
        sb.append(i4);
        sb.append(", useBoldInsteadOfMediumForIncreasedWeight=");
        sb.append(z);
        sb.append(", context=");
        sb.append(valueOf);
        sb.append("}");
        return sb.toString();
    }
}
