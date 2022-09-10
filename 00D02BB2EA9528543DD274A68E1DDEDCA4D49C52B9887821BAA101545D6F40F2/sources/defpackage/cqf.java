package defpackage;

import java.io.Serializable;
/* compiled from: PG */
/* renamed from: cqf  reason: default package */
/* loaded from: classes5.dex */
public final class cqf implements Serializable {
    public final bokk a;
    public final bokg b;
    public final bows c;
    public final bowt d;
    @dzsi
    public byee e;
    public final bokk f;
    public final bokk g;
    public final bokf h;
    public final dnqb i;
    @dzsi
    public bvrt<dnpz> j;
    public boolean k;
    public boolean l;
    public final bosj m;
    public bvrt<dwhd> n;
    public final boki o;

    public cqf(dnqb dnqbVar, String str, String str2, @dzsi akqq akqqVar, String str3, String str4) {
        dbsk.s(dnqbVar);
        this.i = dnqbVar;
        this.a = new bokk(str, true);
        this.d = new bowt();
        this.c = new bows(akqqVar);
        this.e = null;
        this.f = new bokk("", true);
        this.g = new bokk("", true);
        this.h = new bokf();
        bokg bokgVar = new bokg(str2);
        this.b = bokgVar;
        bokgVar.m = str3;
        bokgVar.l = str4;
        bosi j = bosj.j();
        j.d(str);
        ((bosg) j).a = null;
        j.b(new bokf());
        j.f("GMT");
        this.m = j.a();
        this.n = bvrt.b(dwhd.h);
        this.o = new boki();
        new bokj();
    }

    public static cqf a(dnqb dnqbVar) {
        return b(dnqbVar, null);
    }

    public static cqf b(dnqb dnqbVar, @dzsi akqq akqqVar) {
        return new cqf(dnqbVar, "", "", akqqVar, "", "");
    }

    public final void c(dwhd dwhdVar) {
        this.n = bvrt.b(dwhdVar);
    }
}
