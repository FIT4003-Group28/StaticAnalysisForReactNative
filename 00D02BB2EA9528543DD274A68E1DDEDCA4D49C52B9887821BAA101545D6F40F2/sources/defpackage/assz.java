package defpackage;

import com.google.android.filament.R;
/* compiled from: PG */
/* renamed from: assz  reason: default package */
/* loaded from: classes2.dex */
final class assz extends astg {
    private final amuh a;
    private final alfa b;
    private final boolean c;
    private final boolean d;
    private final int e;

    public assz(amuh amuhVar, alfa alfaVar, int i, boolean z, boolean z2) {
        this.a = amuhVar;
        this.b = alfaVar;
        this.e = i;
        this.c = z;
        this.d = z2;
    }

    @Override // defpackage.astg
    public final amuh a() {
        return this.a;
    }

    @Override // defpackage.astg
    public final alfa b() {
        return this.b;
    }

    @Override // defpackage.astg
    public final boolean c() {
        return this.c;
    }

    @Override // defpackage.astg
    public final boolean d() {
        return this.d;
    }

    @Override // defpackage.astg
    public final int e() {
        return this.e;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof astg) {
            astg astgVar = (astg) obj;
            if (this.a.equals(astgVar.a()) && this.b.equals(astgVar.b())) {
                int i = this.e;
                int e = astgVar.e();
                if (i == 0) {
                    throw null;
                }
                if (i == e && this.c == astgVar.c() && this.d == astgVar.d()) {
                    return true;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        int i = 1237;
        int hashCode = (((((((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003) ^ vuu.b(this.e)) * 1000003) ^ (true != this.c ? 1237 : 1231)) * 1000003;
        if (true == this.d) {
            i = 1231;
        }
        return hashCode ^ i;
    }

    public final String toString() {
        String valueOf = String.valueOf(this.a);
        String valueOf2 = String.valueOf(this.b);
        String a = vuu.a(this.e);
        boolean z = this.c;
        boolean z2 = this.d;
        int length = String.valueOf(valueOf).length();
        int length2 = String.valueOf(valueOf2).length();
        StringBuilder sb = new StringBuilder(length + R.styleable.AppCompatTheme_windowNoTitle + length2 + String.valueOf(a).length());
        sb.append("PolylineOverride{routeList=");
        sb.append(valueOf);
        sb.append(", calloutsDisplayMode=");
        sb.append(valueOf2);
        sb.append(", pinDisplayMode=");
        sb.append(a);
        sb.append(", alwaysShowImportantMeasles=");
        sb.append(z);
        sb.append(", allPathsAreActive=");
        sb.append(z2);
        sb.append("}");
        return sb.toString();
    }
}
