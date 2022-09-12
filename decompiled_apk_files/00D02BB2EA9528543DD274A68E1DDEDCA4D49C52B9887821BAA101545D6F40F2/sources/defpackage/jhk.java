package defpackage;

import java.io.Serializable;
import java.util.Arrays;
/* compiled from: PG */
/* renamed from: jhk  reason: default package */
/* loaded from: classes7.dex */
public class jhk implements Serializable {
    private static final vtj g = vtj.TRANSIT_AUTO;
    public final String a;
    public final vtj b;
    public final dbsg<String> c;
    public final dbsg<String> d;
    public final dbsg<Float> e;
    public final boolean f;

    public jhk() {
        this(null);
    }

    public jhk(String str, vtj vtjVar, dbsg<String> dbsgVar, dbsg<String> dbsgVar2, dbsg<Float> dbsgVar3) {
        this.a = str;
        this.b = vtjVar;
        this.f = false;
        this.c = dbsgVar;
        this.d = dbsgVar2;
        this.e = dbsgVar3;
    }

    public final boolean equals(@dzsi Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof jhk) {
            jhk jhkVar = (jhk) obj;
            if (dbsd.a(this.a, jhkVar.a) && dbsd.a(this.b, jhkVar.b)) {
                boolean z = jhkVar.f;
                if (dbsd.a(this.d, jhkVar.d) && dbsd.a(this.e, jhkVar.e) && dbsd.a(this.c, jhkVar.c)) {
                    return true;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, this.b, false, this.d, this.e});
    }

    public jhk(String str) {
        this(str, g);
    }

    public jhk(String str, vtj vtjVar) {
        this(str, vtjVar, null);
    }

    public jhk(String str, vtj vtjVar, byte[] bArr) {
        this(str, vtjVar, dbpy.a, dbpy.a, dbpy.a);
    }
}
