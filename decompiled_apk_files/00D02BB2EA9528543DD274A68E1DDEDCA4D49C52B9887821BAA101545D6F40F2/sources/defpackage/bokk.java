package defpackage;

import java.io.Serializable;
/* compiled from: PG */
/* renamed from: bokk  reason: default package */
/* loaded from: classes3.dex */
public class bokk implements Serializable {
    @dzsi
    private bvrt<dorz> a;
    public Boolean d;
    public String e;
    public String f;
    public final String g;
    public Boolean h;
    public Boolean i;
    @dzsi
    public String j;
    public dory k;
    public String l;
    public String m;
    @dzsi
    public Integer n;

    private bokk(bokm bokmVar) {
        this.e = "";
        this.f = "";
        this.h = false;
        this.i = false;
        this.k = dory.UNSPECIFIED;
        this.l = "";
        this.m = "";
        this.a = null;
        this.n = null;
        this.d = Boolean.valueOf(bokmVar.b);
        this.e = bokmVar.c;
        this.f = bokmVar.d;
        this.g = bokmVar.e;
        this.h = Boolean.valueOf(bokmVar.f);
        this.i = Boolean.valueOf(bokmVar.g);
        if ((bokmVar.a & 64) != 0) {
            this.j = bokmVar.h;
        }
        dory b = dory.b(bokmVar.i);
        this.k = b == null ? dory.UNSPECIFIED : b;
        this.l = bokmVar.j;
        this.m = bokmVar.k;
        if ((bokmVar.a & 1024) != 0) {
            dorz dorzVar = bokmVar.l;
            this.a = bvrt.a(dorzVar == null ? dorz.f : dorzVar);
        }
        if ((bokmVar.a & 2048) != 0) {
            this.n = Integer.valueOf(bokmVar.m);
        }
    }

    public static bokk a(bokm bokmVar) {
        return new bokk(bokmVar);
    }

    public final bokl b() {
        bokl bZ = bokm.n.bZ();
        boolean booleanValue = this.d.booleanValue();
        if (bZ.c) {
            bZ.bF();
            bZ.c = false;
        }
        bokm bokmVar = (bokm) bZ.b;
        int i = bokmVar.a | 1;
        bokmVar.a = i;
        bokmVar.b = booleanValue;
        String str = this.e;
        str.getClass();
        int i2 = i | 2;
        bokmVar.a = i2;
        bokmVar.c = str;
        String str2 = this.f;
        str2.getClass();
        int i3 = i2 | 4;
        bokmVar.a = i3;
        bokmVar.d = str2;
        String str3 = this.g;
        str3.getClass();
        bokmVar.a = i3 | 8;
        bokmVar.e = str3;
        boolean booleanValue2 = this.h.booleanValue();
        if (bZ.c) {
            bZ.bF();
            bZ.c = false;
        }
        bokm bokmVar2 = (bokm) bZ.b;
        bokmVar2.a |= 16;
        bokmVar2.f = booleanValue2;
        boolean booleanValue3 = this.i.booleanValue();
        if (bZ.c) {
            bZ.bF();
            bZ.c = false;
        }
        bokm bokmVar3 = (bokm) bZ.b;
        int i4 = bokmVar3.a | 32;
        bokmVar3.a = i4;
        bokmVar3.g = booleanValue3;
        bokmVar3.i = this.k.i;
        int i5 = i4 | 128;
        bokmVar3.a = i5;
        String str4 = this.l;
        str4.getClass();
        int i6 = i5 | 256;
        bokmVar3.a = i6;
        bokmVar3.j = str4;
        String str5 = this.m;
        str5.getClass();
        int i7 = i6 | 512;
        bokmVar3.a = i7;
        bokmVar3.k = str5;
        String str6 = this.j;
        if (str6 != null) {
            str6.getClass();
            bokmVar3.a = i7 | 64;
            bokmVar3.h = str6;
        }
        dorz e = e();
        if (e != null) {
            if (bZ.c) {
                bZ.bF();
                bZ.c = false;
            }
            bokm bokmVar4 = (bokm) bZ.b;
            e.getClass();
            bokmVar4.l = e;
            bokmVar4.a |= 1024;
        }
        Integer num = this.n;
        if (num != null) {
            int intValue = num.intValue();
            if (bZ.c) {
                bZ.bF();
                bZ.c = false;
            }
            bokm bokmVar5 = (bokm) bZ.b;
            bokmVar5.a |= 2048;
            bokmVar5.m = intValue;
        }
        return bZ;
    }

    public final String c() {
        return this.f.replace("\u200b", "").trim();
    }

    public final String d() {
        return bvom.b(this.g).getDisplayLanguage();
    }

    @dzsi
    public final dorz e() {
        return (dorz) bvrt.f(this.a, (dssr) dorz.f.cu(7), dorz.f);
    }

    public final void f(@dzsi dorz dorzVar) {
        this.a = bvrt.a(dorzVar);
    }

    public bokk(Boolean bool, String str, boolean z) {
        this(bool, str, z, "");
    }

    public bokk(Boolean bool, String str, boolean z, String str2) {
        this.e = "";
        this.f = "";
        this.h = false;
        this.i = false;
        this.k = dory.UNSPECIFIED;
        this.l = "";
        this.m = "";
        this.a = null;
        this.n = null;
        this.g = str2;
        this.d = bool;
        if (!z) {
            this.e = str;
            return;
        }
        this.h = true;
        this.f = str;
    }

    public bokk(String str, boolean z) {
        this(true, str, z);
        if (str.isEmpty() || !z) {
            return;
        }
        this.k = dory.PRE_FILLED;
    }
}
