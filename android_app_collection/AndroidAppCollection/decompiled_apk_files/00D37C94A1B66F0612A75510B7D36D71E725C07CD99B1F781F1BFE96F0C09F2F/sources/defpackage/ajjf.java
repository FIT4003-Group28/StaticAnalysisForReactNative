package defpackage;

import java.util.List;
/* compiled from: PG */
/* renamed from: ajjf  reason: default package */
/* loaded from: classes.dex */
public final class ajjf {
    public final Object a;
    public final asjj b;
    public final acti c;
    public final apzg d;
    public final List e;

    public ajjf() {
    }

    public ajjf(Object obj, asjj asjjVar, acti actiVar, apzg apzgVar, List list) {
        this.a = obj;
        this.b = asjjVar;
        this.c = actiVar;
        this.d = apzgVar;
        this.e = list;
    }

    public static ajje a() {
        return new ajje();
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof ajjf) {
            ajjf ajjfVar = (ajjf) obj;
            Object obj2 = this.a;
            if (obj2 != null ? obj2.equals(ajjfVar.a) : ajjfVar.a == null) {
                asjj asjjVar = this.b;
                if (asjjVar != null ? asjjVar.equals(ajjfVar.b) : ajjfVar.b == null) {
                    acti actiVar = this.c;
                    if (actiVar != null ? actiVar.equals(ajjfVar.c) : ajjfVar.c == null) {
                        apzg apzgVar = this.d;
                        if (apzgVar != null ? apzgVar.equals(ajjfVar.d) : ajjfVar.d == null) {
                            List list = this.e;
                            List list2 = ajjfVar.e;
                            if (list != null ? list.equals(list2) : list2 == null) {
                                return true;
                            }
                        }
                    }
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        Object obj = this.a;
        int i = 0;
        int hashCode = ((obj == null ? 0 : obj.hashCode()) ^ 1000003) * 1000003;
        asjj asjjVar = this.b;
        int hashCode2 = (hashCode ^ (asjjVar == null ? 0 : asjjVar.hashCode())) * 1000003;
        acti actiVar = this.c;
        int hashCode3 = (hashCode2 ^ (actiVar == null ? 0 : actiVar.hashCode())) * 1000003;
        apzg apzgVar = this.d;
        int hashCode4 = (hashCode3 ^ (apzgVar == null ? 0 : apzgVar.hashCode())) * 1000003;
        List list = this.e;
        if (list != null) {
            i = list.hashCode();
        }
        return hashCode4 ^ i;
    }

    public final String toString() {
        String valueOf = String.valueOf(this.a);
        String valueOf2 = String.valueOf(this.b);
        String valueOf3 = String.valueOf(this.c);
        String valueOf4 = String.valueOf(this.d);
        String valueOf5 = String.valueOf(this.e);
        int length = String.valueOf(valueOf).length();
        int length2 = String.valueOf(valueOf2).length();
        int length3 = String.valueOf(valueOf3).length();
        StringBuilder sb = new StringBuilder(length + 119 + length2 + length3 + String.valueOf(valueOf4).length() + String.valueOf(valueOf5).length());
        sb.append("YouTubeCustomCommandEventDataImpl{tag=");
        sb.append(valueOf);
        sb.append(", interactionLoggingClientData=");
        sb.append(valueOf2);
        sb.append(", interactionLogger=");
        sb.append(valueOf3);
        sb.append(", command=");
        sb.append(valueOf4);
        sb.append(", customConverters=");
        sb.append(valueOf5);
        sb.append("}");
        return sb.toString();
    }
}
