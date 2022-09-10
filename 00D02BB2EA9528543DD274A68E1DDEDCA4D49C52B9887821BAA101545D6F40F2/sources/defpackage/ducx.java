package defpackage;

import defpackage.dssj;
/* compiled from: PG */
/* renamed from: ducx  reason: default package */
/* loaded from: classes6.dex */
public final class ducx<T extends dssj> extends dudb<T> {
    public final dspy<dtrw, T> a;
    public final String b;
    private final String c;

    public ducx(dspy<dtrw, T> dspyVar, String str, String str2) {
        if (dspyVar != null) {
            this.a = dspyVar;
            this.b = str;
            this.c = str2;
            return;
        }
        throw new NullPointerException("Null extension");
    }

    @Override // defpackage.dudb
    public final dspy<dtrw, T> a() {
        return this.a;
    }

    @Override // defpackage.dudb
    public final String b() {
        return this.b;
    }

    @Override // defpackage.dudb
    public final String c() {
        return this.c;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof dudb) {
            dudb dudbVar = (dudb) obj;
            if (this.a.equals(dudbVar.a()) && this.b.equals(dudbVar.b()) && this.c.equals(dudbVar.c())) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003) ^ this.c.hashCode();
    }

    public final String toString() {
        String valueOf = String.valueOf(this.a);
        String str = this.b;
        String str2 = this.c;
        int length = String.valueOf(valueOf).length();
        StringBuilder sb = new StringBuilder(length + 73 + str.length() + str2.length());
        sb.append("InfiniteDataGaiaMultiValueLookupConfig{extension=");
        sb.append(valueOf);
        sb.append(", tableId=");
        sb.append(str);
        sb.append(", configName=");
        sb.append(str2);
        sb.append("}");
        return sb.toString();
    }
}
