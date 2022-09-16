package defpackage;
/* compiled from: PG */
/* renamed from: upj  reason: default package */
/* loaded from: classes4.dex */
public final class upj {
    private final String a;
    private final int b;

    public upj() {
    }

    public upj(int i, String str) {
        this.b = i;
        this.a = str;
    }

    public static upj b() {
        return new upj(2, null);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof upj) {
            upj upjVar = (upj) obj;
            if (this.b == upjVar.b) {
                String str = this.a;
                String str2 = upjVar.a;
                if (str != null ? str.equals(str2) : str2 == null) {
                    return true;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        int i = (this.b ^ 1000003) * 1000003;
        String str = this.a;
        return i ^ (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        String str = this.b != 1 ? "ANONYMOUS" : "GAIA";
        String str2 = this.a;
        StringBuilder sb = new StringBuilder(str.length() + 28 + String.valueOf(str2).length());
        sb.append("AuthChannel{type=");
        sb.append(str);
        sb.append(", account=");
        sb.append(str2);
        sb.append("}");
        return sb.toString();
    }

    public final tlz a() {
        if (this.b - 1 == 0) {
            String str = this.a;
            str.getClass();
            aqxo.p(str.contains("@"));
            aopg aopgVar = tmq.a;
            aopa createBuilder = tmp.a.createBuilder();
            createBuilder.copyOnWrite();
            tmp tmpVar = (tmp) createBuilder.instance;
            tmpVar.d = 1;
            tmpVar.b = 2 | tmpVar.b;
            createBuilder.copyOnWrite();
            tmp tmpVar2 = (tmp) createBuilder.instance;
            str.getClass();
            tmpVar2.b |= 1;
            tmpVar2.c = str;
            return tlz.a(aopgVar, (tmp) createBuilder.mo39build());
        }
        aopg aopgVar2 = tmq.a;
        aopa createBuilder2 = tmp.a.createBuilder();
        createBuilder2.copyOnWrite();
        tmp tmpVar3 = (tmp) createBuilder2.instance;
        tmpVar3.d = 2;
        tmpVar3.b = 2 | tmpVar3.b;
        return tlz.a(aopgVar2, (tmp) createBuilder2.mo39build());
    }
}
