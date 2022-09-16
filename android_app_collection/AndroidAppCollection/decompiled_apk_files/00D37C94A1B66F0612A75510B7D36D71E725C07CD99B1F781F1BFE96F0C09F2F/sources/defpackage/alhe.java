package defpackage;

import android.text.TextUtils;
/* compiled from: PG */
/* renamed from: alhe  reason: default package */
/* loaded from: classes.dex */
public final class alhe {
    public final String a;
    public final amvn b;
    public final ampq c;

    public alhe() {
    }

    public alhe(String str, amvn amvnVar, ampq ampqVar) {
        this.a = str;
        this.b = amvnVar;
        this.c = ampqVar;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static alhd a(String str) {
        alhd alhdVar = new alhd(null);
        if (str != null) {
            alhdVar.a = str;
            alhdVar.c(amyg.a);
            alhdVar.b(amon.a);
            return alhdVar;
        }
        throw new NullPointerException("Null id");
    }

    public final boolean b() {
        return !TextUtils.isEmpty(this.a) && !this.c.h() && this.b.isEmpty();
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof alhe) {
            alhe alheVar = (alhe) obj;
            if (this.a.equals(alheVar.a) && this.b.equals(alheVar.b) && this.c.equals(alheVar.c)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003) ^ this.c.hashCode();
    }

    public final String toString() {
        String str = this.a;
        String valueOf = String.valueOf(this.b);
        String valueOf2 = String.valueOf(this.c);
        int length = String.valueOf(str).length();
        StringBuilder sb = new StringBuilder(length + 59 + String.valueOf(valueOf).length() + String.valueOf(valueOf2).length());
        sb.append("UploadTaskFutureResult{id=");
        sb.append(str);
        sb.append(", unmetRequirements=");
        sb.append(valueOf);
        sb.append(", retryTime=");
        sb.append(valueOf2);
        sb.append("}");
        return sb.toString();
    }
}
