package defpackage;

import java.io.Serializable;
import java.util.Arrays;
/* compiled from: PG */
/* renamed from: cjsa  reason: default package */
/* loaded from: classes.dex */
public class cjsa implements Serializable {
    public final cjrc a;
    @dzsi
    public final String b;
    @dzsi
    public final String c;
    @dzsi
    public final transient cjtg d;

    public cjsa(cjrc cjrcVar, @dzsi String str, @dzsi String str2, @dzsi cjtg cjtgVar) {
        this.a = cjrcVar;
        this.b = str;
        this.c = str2;
        this.d = cjtgVar;
    }

    public final boolean equals(@dzsi Object obj) {
        if (obj instanceof cjsa) {
            cjsa cjsaVar = (cjsa) obj;
            if (dbsd.a(this.a, cjsaVar.a) && dbsd.a(this.b, cjsaVar.b) && dbsd.a(this.c, cjsaVar.c) && dbsd.a(this.d, cjsaVar.d)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, this.b, this.c, this.d});
    }

    public String toString() {
        return String.format("ContextEntry(%s, %s, %s, %s)", this.a, this.b, this.c, this.d);
    }
}
