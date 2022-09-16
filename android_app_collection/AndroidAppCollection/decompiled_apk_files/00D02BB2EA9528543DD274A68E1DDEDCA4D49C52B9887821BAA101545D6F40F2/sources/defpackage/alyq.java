package defpackage;

import java.util.List;
/* compiled from: PG */
/* renamed from: alyq  reason: default package */
/* loaded from: classes.dex */
public final class alyq {
    @dzsi
    public alyj a;
    public String[] b;
    @dzsi
    public List<alvz> c;
    @dzsi
    public dmte d;
    @dzsi
    public List<dmrt> e;
    public alvw[] f;
    public dmnr[] g;
    public byte[] h;
    public int i;
    public akrx j;
    private final amze k;
    private String[] l;
    private int m;
    private akry n;
    private final alyh o;
    private boolean p;
    private byte[] q;

    public alyq(alyt alytVar, amze amzeVar, akry akryVar, alyh alyhVar) {
        this.m = -1;
        this.n = akry.BASE;
        this.h = alxs.b;
        this.p = false;
        this.i = 0;
        this.q = null;
        this.j = akrx.UNKNOWN;
        this.a = alytVar.a;
        this.k = amzeVar;
        this.n = akryVar;
        this.o = alyhVar;
        this.b = alytVar.b;
        this.l = alytVar.c;
        this.m = alytVar.d;
        this.c = alytVar.e;
        this.e = alytVar.g;
        this.f = alytVar.h;
        this.h = alytVar.p;
        this.p = alytVar.n;
        this.i = alytVar.o;
        this.q = alytVar.m;
        this.d = alytVar.f;
        this.j = alytVar.l;
    }

    public final alyt a() {
        alyj alyjVar = this.a;
        amze amzeVar = this.k;
        akry akryVar = this.n;
        alyh alyhVar = this.o;
        String[] strArr = this.b;
        if (strArr == null) {
            strArr = new String[0];
        }
        String[] strArr2 = strArr;
        String[] strArr3 = this.l;
        if (strArr3 == null) {
            strArr3 = new String[0];
        }
        String[] strArr4 = strArr3;
        int i = this.m;
        List list = this.c;
        if (list == null) {
            list = dchl.a();
        }
        List list2 = list;
        dmte dmteVar = this.d;
        List<dmrt> list3 = this.e;
        dcdc e = list3 == null ? dcdc.e() : dcdc.r(list3);
        alvw[] alvwVarArr = this.f;
        if (alvwVarArr == null) {
            alvwVarArr = new alvw[0];
        }
        alvw[] alvwVarArr2 = alvwVarArr;
        dmnr[] dmnrVarArr = this.g;
        if (dmnrVarArr == null) {
            dmnrVarArr = new dmnr[0];
        }
        return new alyt(alyjVar, amzeVar, akryVar, alyhVar, strArr2, strArr4, i, list2, dmteVar, e, alvwVarArr2, dmnrVarArr, this.h, this.q, this.p, this.i, this.j);
    }

    public alyq(amze amzeVar, akry akryVar, alyh alyhVar) {
        this.m = -1;
        this.n = akry.BASE;
        this.h = alxs.b;
        this.p = false;
        this.i = 0;
        this.q = null;
        this.j = akrx.UNKNOWN;
        this.k = amzeVar;
        this.n = akryVar;
        this.o = alyhVar;
    }
}
