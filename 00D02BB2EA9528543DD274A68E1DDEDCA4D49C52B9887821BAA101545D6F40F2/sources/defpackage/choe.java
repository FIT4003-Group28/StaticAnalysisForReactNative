package defpackage;

import com.google.android.filament.R;
/* compiled from: PG */
/* renamed from: choe  reason: default package */
/* loaded from: classes4.dex */
final class choe extends chsq {
    private final String a;
    private final chtq b;
    private final String c;
    private final dpyv d;
    private final dcdc<drrv> e;

    public choe(String str, chtq chtqVar, @dzsi String str2, @dzsi dpyv dpyvVar, dcdc<drrv> dcdcVar) {
        if (str != null) {
            this.a = str;
            if (chtqVar != null) {
                this.b = chtqVar;
                this.c = str2;
                this.d = dpyvVar;
                if (dcdcVar != null) {
                    this.e = dcdcVar;
                    return;
                }
                throw new NullPointerException("Null highlightedItems");
            }
            throw new NullPointerException("Null mode");
        }
        throw new NullPointerException("Null accountId");
    }

    @Override // defpackage.chsq
    public final String a() {
        return this.a;
    }

    @Override // defpackage.chsq
    public final chtq b() {
        return this.b;
    }

    @Override // defpackage.chsq
    @dzsi
    public final String c() {
        return this.c;
    }

    @Override // defpackage.chsq
    @dzsi
    public final dpyv d() {
        return this.d;
    }

    @Override // defpackage.chsq
    public final dcdc<drrv> e() {
        return this.e;
    }

    public final boolean equals(Object obj) {
        String str;
        dpyv dpyvVar;
        if (obj == this) {
            return true;
        }
        if (obj instanceof chsq) {
            chsq chsqVar = (chsq) obj;
            if (this.a.equals(chsqVar.a()) && this.b.equals(chsqVar.b()) && ((str = this.c) != null ? str.equals(chsqVar.c()) : chsqVar.c() == null) && ((dpyvVar = this.d) != null ? dpyvVar.equals(chsqVar.d()) : chsqVar.d() == null) && dchl.m(this.e, chsqVar.e())) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int hashCode = (((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003;
        String str = this.c;
        int i = 0;
        int hashCode2 = (hashCode ^ (str == null ? 0 : str.hashCode())) * 1000003;
        dpyv dpyvVar = this.d;
        if (dpyvVar != null) {
            i = dpyvVar.hashCode();
        }
        return ((hashCode2 ^ i) * 1000003) ^ this.e.hashCode();
    }

    public final String toString() {
        String str = this.a;
        String valueOf = String.valueOf(this.b);
        String str2 = this.c;
        String valueOf2 = String.valueOf(this.d);
        String valueOf3 = String.valueOf(this.e);
        int length = str.length();
        int length2 = String.valueOf(valueOf).length();
        int length3 = String.valueOf(str2).length();
        int length4 = String.valueOf(valueOf2).length();
        StringBuilder sb = new StringBuilder(length + R.styleable.AppCompatTheme_textAppearanceListItem + length2 + length3 + length4 + String.valueOf(valueOf3).length());
        sb.append("TodolistResponseCacheKey{accountId=");
        sb.append(str);
        sb.append(", mode=");
        sb.append(valueOf);
        sb.append(", continuationToken=");
        sb.append(str2);
        sb.append(", originNotification=");
        sb.append(valueOf2);
        sb.append(", highlightedItems=");
        sb.append(valueOf3);
        sb.append("}");
        return sb.toString();
    }
}
