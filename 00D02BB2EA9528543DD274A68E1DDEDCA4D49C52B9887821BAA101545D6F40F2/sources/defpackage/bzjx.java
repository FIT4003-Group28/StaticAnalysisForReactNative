package defpackage;

import java.util.Locale;
/* compiled from: PG */
/* renamed from: bzjx  reason: default package */
/* loaded from: classes4.dex */
final class bzjx extends bzko {
    private final dbsg<Locale> a;
    private final bzlf b;
    private final int c;

    public bzjx(dbsg<Locale> dbsgVar, bzlf bzlfVar, int i) {
        this.a = dbsgVar;
        if (bzlfVar != null) {
            this.b = bzlfVar;
            if (i != 0) {
                this.c = i;
                return;
            }
            throw new NullPointerException("Null hourDisplayMode");
        }
        throw new NullPointerException("Null timeFormatSpec");
    }

    @Override // defpackage.bzko
    public final dbsg<Locale> a() {
        return this.a;
    }

    @Override // defpackage.bzko
    public final bzlf b() {
        return this.b;
    }

    @Override // defpackage.bzko
    public final int c() {
        return this.c;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof bzko) {
            bzko bzkoVar = (bzko) obj;
            if (this.a.equals(bzkoVar.a()) && this.b.equals(bzkoVar.b()) && this.c == bzkoVar.c()) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode();
        int hashCode2 = this.b.hashCode();
        int i = this.c;
        bzkh.b(i);
        return ((((hashCode ^ 1000003) * 1000003) ^ hashCode2) * 1000003) ^ i;
    }

    public final String toString() {
        String valueOf = String.valueOf(this.a);
        String valueOf2 = String.valueOf(this.b);
        String a = bzkh.a(this.c);
        int length = String.valueOf(valueOf).length();
        StringBuilder sb = new StringBuilder(length + 65 + String.valueOf(valueOf2).length() + a.length());
        sb.append("DateFormatKey{optionalLocale=");
        sb.append(valueOf);
        sb.append(", timeFormatSpec=");
        sb.append(valueOf2);
        sb.append(", hourDisplayMode=");
        sb.append(a);
        sb.append("}");
        return sb.toString();
    }
}
