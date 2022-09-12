package defpackage;

import java.util.Arrays;
/* compiled from: PG */
/* renamed from: cych  reason: default package */
/* loaded from: classes5.dex */
public final class cych {
    public final String a;
    public final String b;
    public final cycg c;
    @dzsi
    public final String d;

    public cych(String str, String str2, cycg cycgVar, @dzsi String str3) {
        this.a = str;
        this.b = str2;
        this.c = cycgVar;
        this.d = str3;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof cych) {
            cych cychVar = (cych) obj;
            if (dbsd.a(this.a, cychVar.a) && dbsd.a(this.b, cychVar.b) && dbsd.a(this.c, cychVar.c) && dbsd.a(this.d, cychVar.d)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, this.b, this.c, this.d});
    }
}
