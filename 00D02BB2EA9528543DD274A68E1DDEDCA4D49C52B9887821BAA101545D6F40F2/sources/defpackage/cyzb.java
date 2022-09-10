package defpackage;

import com.google.android.filament.R;
import com.google.android.libraries.social.populous.core.Photo;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: cyzb  reason: default package */
/* loaded from: classes5.dex */
public final class cyzb extends cyzl {
    private final long a;
    private final String b;
    private final dcdc<cyvv> c;
    private final Photo d;
    private final dcdc<cyvy> e;
    private final cyxg f;

    public cyzb(long j, String str, dcdc<cyvv> dcdcVar, @dzsi Photo photo, dcdc<cyvy> dcdcVar2, cyxg cyxgVar) {
        this.a = j;
        this.b = str;
        this.c = dcdcVar;
        this.d = photo;
        this.e = dcdcVar2;
        this.f = cyxgVar;
    }

    @Override // defpackage.cyzl
    public final long a() {
        return this.a;
    }

    @Override // defpackage.cyzl
    public final String b() {
        return this.b;
    }

    @Override // defpackage.cyzl
    public final dcdc<cyvv> c() {
        return this.c;
    }

    @Override // defpackage.cyzl
    @dzsi
    public final Photo d() {
        return this.d;
    }

    @Override // defpackage.cyzl
    public final dcdc<cyvy> e() {
        return this.e;
    }

    public final boolean equals(Object obj) {
        Photo photo;
        if (obj == this) {
            return true;
        }
        if (obj instanceof cyzl) {
            cyzl cyzlVar = (cyzl) obj;
            if (this.a == cyzlVar.a() && this.b.equals(cyzlVar.b()) && dchl.m(this.c, cyzlVar.c()) && ((photo = this.d) != null ? photo.equals(cyzlVar.d()) : cyzlVar.d() == null) && dchl.m(this.e, cyzlVar.e()) && this.f.equals(cyzlVar.f())) {
                return true;
            }
        }
        return false;
    }

    @Override // defpackage.cyzl
    public final cyxg f() {
        return this.f;
    }

    public final int hashCode() {
        long j = this.a;
        int hashCode = (((((((int) (j ^ (j >>> 32))) ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003) ^ this.c.hashCode()) * 1000003;
        Photo photo = this.d;
        return this.f.hashCode() ^ ((((hashCode ^ (photo == null ? 0 : photo.hashCode())) * 1000003) ^ this.e.hashCode()) * 1000003);
    }

    public final String toString() {
        long j = this.a;
        String str = this.b;
        String valueOf = String.valueOf(this.c);
        String valueOf2 = String.valueOf(this.d);
        String valueOf3 = String.valueOf(this.e);
        String valueOf4 = String.valueOf(this.f);
        int length = String.valueOf(str).length();
        int length2 = String.valueOf(valueOf).length();
        int length3 = String.valueOf(valueOf2).length();
        int length4 = String.valueOf(valueOf3).length();
        StringBuilder sb = new StringBuilder(length + R.styleable.AppCompatTheme_toolbarNavigationButtonStyle + length2 + length3 + length4 + String.valueOf(valueOf4).length());
        sb.append("Item{deviceContactId=");
        sb.append(j);
        sb.append(", deviceLookupKey=");
        sb.append(str);
        sb.append(", displayNames=");
        sb.append(valueOf);
        sb.append(", photo=");
        sb.append(valueOf2);
        sb.append(", fields=");
        sb.append(valueOf3);
        sb.append(", rankingFeatureSet=");
        sb.append(valueOf4);
        sb.append("}");
        return sb.toString();
    }
}
