package defpackage;

import com.google.android.filament.R;
/* compiled from: PG */
/* renamed from: alzc  reason: default package */
/* loaded from: classes2.dex */
public final class alzc extends alzr {
    public final alyh a;
    private final akry b;
    private final String c;
    private final boolean d;
    private final amap e;

    public alzc(akry akryVar, alyh alyhVar, String str, boolean z, amap amapVar) {
        if (akryVar != null) {
            this.b = akryVar;
            if (alyhVar != null) {
                this.a = alyhVar;
                if (str != null) {
                    this.c = str;
                    this.d = z;
                    this.e = amapVar;
                    return;
                }
                throw new NullPointerException("Null versionId");
            }
            throw new NullPointerException("Null coords");
        }
        throw new NullPointerException("Null tileType");
    }

    @Override // defpackage.alzr
    public final akry a() {
        return this.b;
    }

    @Override // defpackage.alzr
    public final alyh b() {
        return this.a;
    }

    @Override // defpackage.alzr
    public final String c() {
        return this.c;
    }

    @Override // defpackage.alzr
    public final boolean d() {
        return this.d;
    }

    @Override // defpackage.alzr
    @dzsi
    public final amap e() {
        return this.e;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof alzr) {
            alzr alzrVar = (alzr) obj;
            if (this.b.equals(alzrVar.a()) && this.a.equals(alzrVar.b()) && this.c.equals(alzrVar.c()) && this.d == alzrVar.d() && this.e.equals(alzrVar.e())) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((((((this.b.hashCode() ^ 1000003) * 1000003) ^ this.a.hashCode()) * 1000003) ^ this.c.hashCode()) * 1000003) ^ (true != this.d ? 1237 : 1231)) * 1000003) ^ this.e.hashCode();
    }

    public final String toString() {
        String valueOf = String.valueOf(this.b);
        String valueOf2 = String.valueOf(this.a);
        String str = this.c;
        boolean z = this.d;
        String valueOf3 = String.valueOf(this.e);
        int length = String.valueOf(valueOf).length();
        int length2 = String.valueOf(valueOf2).length();
        int length3 = str.length();
        StringBuilder sb = new StringBuilder(length + R.styleable.AppCompatTheme_textAppearanceSearchResultSubtitle + length2 + length3 + String.valueOf(valueOf3).length());
        sb.append("PaintTileRequest{tileType=");
        sb.append(valueOf);
        sb.append(", coords=");
        sb.append(valueOf2);
        sb.append(", versionId=");
        sb.append(str);
        sb.append(", enableUnchangedEpochDetection=");
        sb.append(z);
        sb.append(", networkTileCallback=");
        sb.append(valueOf3);
        sb.append("}");
        return sb.toString();
    }
}
