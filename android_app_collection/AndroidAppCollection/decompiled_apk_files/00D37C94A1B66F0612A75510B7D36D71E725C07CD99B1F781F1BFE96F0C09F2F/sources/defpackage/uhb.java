package defpackage;

import android.text.TextUtils;
/* compiled from: PG */
/* renamed from: uhb  reason: default package */
/* loaded from: classes4.dex */
public final class uhb {
    public final String a;
    public final String b;
    public final int c;

    public uhb() {
    }

    public uhb(String str, String str2, int i) {
        this.a = str;
        this.b = str2;
        this.c = i;
    }

    public final aoit a() {
        aopa createBuilder = aoit.a.createBuilder();
        String str = this.a;
        createBuilder.copyOnWrite();
        aoit aoitVar = (aoit) createBuilder.instance;
        str.getClass();
        int i = 1;
        aoitVar.b |= 1;
        aoitVar.c = str;
        int i2 = this.c;
        int i3 = i2 - 1;
        if (i2 == 0) {
            throw null;
        }
        if (i3 == 1) {
            i = 3;
        } else if (i3 == 2) {
            i = 4;
        } else if (i3 == 3) {
            i = 5;
        } else if (i3 == 4) {
            i = 2;
        }
        createBuilder.copyOnWrite();
        aoit aoitVar2 = (aoit) createBuilder.instance;
        aoitVar2.e = i - 1;
        aoitVar2.b |= 4;
        if (!TextUtils.isEmpty(this.b)) {
            String str2 = this.b;
            createBuilder.copyOnWrite();
            aoit aoitVar3 = (aoit) createBuilder.instance;
            str2.getClass();
            aoitVar3.b |= 2;
            aoitVar3.d = str2;
        }
        return (aoit) createBuilder.mo39build();
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof uhb) {
            uhb uhbVar = (uhb) obj;
            if (this.a.equals(uhbVar.a) && this.b.equals(uhbVar.b)) {
                int i = this.c;
                int i2 = uhbVar.c;
                if (i == 0) {
                    throw null;
                }
                if (i == i2) {
                    return true;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        int hashCode = (((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003;
        int i = this.c;
        if (i != 0) {
            return hashCode ^ i;
        }
        throw null;
    }

    public final String toString() {
        String str = this.a;
        String str2 = this.b;
        int i = this.c;
        String str3 = i != 1 ? i != 2 ? i != 3 ? i != 4 ? i != 5 ? "null" : "IMPORTANCE_NONE" : "IMPORTANCE_LOW" : "IMPORTANCE_HIGH" : "IMPORTANCE_DEFAULT" : "IMPORTANCE_UNSPECIFIED";
        StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 50 + String.valueOf(str2).length() + str3.length());
        sb.append("ChimeNotificationChannel{id=");
        sb.append(str);
        sb.append(", group=");
        sb.append(str2);
        sb.append(", importance=");
        sb.append(str3);
        sb.append("}");
        return sb.toString();
    }
}
