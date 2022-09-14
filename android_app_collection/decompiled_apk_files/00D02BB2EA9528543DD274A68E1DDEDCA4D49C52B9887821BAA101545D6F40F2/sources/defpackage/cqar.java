package defpackage;

import android.os.Bundle;
/* compiled from: PG */
/* renamed from: cqar  reason: default package */
/* loaded from: classes5.dex */
final class cqar extends cqap {
    private final String a;
    private final Bundle b;
    private final String c;

    public cqar(@dzsi String str, Bundle bundle, String str2) {
        this.a = str;
        this.b = bundle;
        this.c = str2;
    }

    @Override // defpackage.cqap
    @dzsi
    public final String a() {
        return this.a;
    }

    @Override // defpackage.cqap
    public final Bundle b() {
        return this.b;
    }

    @Override // defpackage.cqap
    @dzsi
    public final String c() {
        return null;
    }

    @Override // defpackage.cqap
    public final String d() {
        return this.c;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof cqap) {
            cqap cqapVar = (cqap) obj;
            String str = this.a;
            if (str != null ? str.equals(cqapVar.a()) : cqapVar.a() == null) {
                if (this.b.equals(cqapVar.b()) && cqapVar.c() == null && this.c.equals(cqapVar.d())) {
                    return true;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        String str = this.a;
        return (((((str == null ? 0 : str.hashCode()) ^ 1000003) * 1000003) ^ this.b.hashCode()) * (-721379959)) ^ this.c.hashCode();
    }

    public final String toString() {
        String str = this.a;
        String valueOf = String.valueOf(this.b);
        String str2 = this.c;
        int length = String.valueOf(str).length();
        int length2 = String.valueOf(valueOf).length();
        StringBuilder sb = new StringBuilder(length + 83 + length2 + "null".length() + String.valueOf(str2).length());
        sb.append("AssistantSettingsIntent{feature=");
        sb.append(str);
        sb.append(", featureArguments=");
        sb.append(valueOf);
        sb.append(", accountName=");
        sb.append((String) null);
        sb.append(", gsaPackageName=");
        sb.append(str2);
        sb.append("}");
        return sb.toString();
    }
}
