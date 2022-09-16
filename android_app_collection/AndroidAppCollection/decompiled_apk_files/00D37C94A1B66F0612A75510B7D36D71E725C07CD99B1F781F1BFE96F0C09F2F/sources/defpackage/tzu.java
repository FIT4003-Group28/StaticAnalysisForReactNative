package defpackage;

import android.content.Context;
/* compiled from: PG */
/* renamed from: tzu  reason: default package */
/* loaded from: classes4.dex */
public final class tzu {
    public final String a;
    public final String b;

    public tzu() {
    }

    public static void a(Context context, String str) {
        new tzu(context.getPackageName(), str);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof tzu) {
            tzu tzuVar = (tzu) obj;
            if (this.a.equals(tzuVar.a) && this.b.equals(tzuVar.b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((this.a.hashCode() ^ 1000003) * (-721379959)) ^ this.b.hashCode();
    }

    public final String toString() {
        String str = this.a;
        String str2 = this.b;
        int length = str.length();
        StringBuilder sb = new StringBuilder(length + 53 + "null".length() + str2.length());
        sb.append("ApplicationId{packageName=");
        sb.append(str);
        sb.append(", moduleName=null, instanceId=");
        sb.append(str2);
        sb.append("}");
        return sb.toString();
    }

    public tzu(String str, String str2) {
        if (str != null) {
            this.a = str;
            this.b = str2;
            return;
        }
        throw new NullPointerException("Null packageName");
    }
}
