package defpackage;

import java.util.HashMap;
import java.util.Map;
/* compiled from: PG */
/* renamed from: alup  reason: default package */
/* loaded from: classes.dex */
public final class alup {
    public static final alup a = a().a();
    public final Integer b;
    public final Map c;

    public alup() {
    }

    public alup(Integer num, Map map) {
        this.b = num;
        this.c = map;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static aluo a() {
        aluo aluoVar = new aluo();
        aluoVar.c(new HashMap());
        return aluoVar;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof alup) {
            alup alupVar = (alup) obj;
            Integer num = this.b;
            if (num != null ? num.equals(alupVar.b) : alupVar.b == null) {
                if (this.c.equals(alupVar.c)) {
                    return true;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        Integer num = this.b;
        return (((num == null ? 0 : num.hashCode()) ^ 1000003) * 1000003) ^ this.c.hashCode();
    }

    public final String toString() {
        String valueOf = String.valueOf(this.b);
        String valueOf2 = String.valueOf(this.c);
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 81 + String.valueOf(valueOf2).length());
        sb.append("LocalTestingConfig{defaultSplitInstallErrorCode=");
        sb.append(valueOf);
        sb.append(", splitInstallErrorCodeByModule=");
        sb.append(valueOf2);
        sb.append("}");
        return sb.toString();
    }
}
