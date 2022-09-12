package defpackage;

import com.google.android.filament.R;
/* compiled from: PG */
/* renamed from: cqob  reason: default package */
/* loaded from: classes5.dex */
final class cqob extends cqox {
    private final int a;
    private final int b;
    private final int c;
    private final int d;
    private final cqtv e;

    public cqob(int i, int i2, int i3, int i4, cqtv cqtvVar) {
        this.a = i;
        this.b = i2;
        this.c = i3;
        this.d = i4;
        this.e = cqtvVar;
    }

    @Override // defpackage.cqox
    public final int a() {
        return this.a;
    }

    @Override // defpackage.cqox
    public final int b() {
        return this.b;
    }

    @Override // defpackage.cqox
    public final int c() {
        return this.c;
    }

    @Override // defpackage.cqox
    public final int d() {
        return this.d;
    }

    @Override // defpackage.cqox
    public final cqtv e() {
        return this.e;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof cqox) {
            cqox cqoxVar = (cqox) obj;
            if (this.a == cqoxVar.a() && this.b == cqoxVar.b() && this.c == cqoxVar.c() && this.d == cqoxVar.d() && this.e.equals(cqoxVar.e())) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((((((this.a ^ 1000003) * 1000003) ^ this.b) * 1000003) ^ this.c) * 1000003) ^ this.d) * 1000003) ^ ((cqrp) this.e).a;
    }

    public final String toString() {
        int i = this.a;
        int i2 = this.b;
        int i3 = this.c;
        int i4 = this.d;
        String valueOf = String.valueOf(this.e);
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + R.styleable.AppCompatTheme_textAppearancePopupMenuHeader);
        sb.append("ConnectMargin{startId=");
        sb.append(i);
        sb.append(", startSide=");
        sb.append(i2);
        sb.append(", endId=");
        sb.append(i3);
        sb.append(", endSide=");
        sb.append(i4);
        sb.append(", margin=");
        sb.append(valueOf);
        sb.append("}");
        return sb.toString();
    }
}
