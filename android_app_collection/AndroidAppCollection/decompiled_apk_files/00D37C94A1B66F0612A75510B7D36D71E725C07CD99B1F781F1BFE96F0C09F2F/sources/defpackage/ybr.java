package defpackage;
/* compiled from: PG */
/* renamed from: ybr  reason: default package */
/* loaded from: classes4.dex */
public final class ybr {
    public aoob a;
    public int b;

    public final arrh a() {
        arrf a = arrh.a();
        awhf g = g();
        a.copyOnWrite();
        ((arrh) a.instance).dL(g);
        return (arrh) a.mo39build();
    }

    public final arrh b() {
        arrf a = arrh.a();
        awhf g = g();
        a.copyOnWrite();
        ((arrh) a.instance).dM(g);
        return (arrh) a.mo39build();
    }

    public final arrh c() {
        arrf a = arrh.a();
        awhf g = g();
        a.copyOnWrite();
        ((arrh) a.instance).dN(g);
        return (arrh) a.mo39build();
    }

    public final arrh d() {
        arrf a = arrh.a();
        awhf g = g();
        a.copyOnWrite();
        ((arrh) a.instance).dO(g);
        return (arrh) a.mo39build();
    }

    public final arrh e() {
        arrf a = arrh.a();
        awhf g = g();
        a.copyOnWrite();
        ((arrh) a.instance).dP(g);
        return (arrh) a.mo39build();
    }

    public final arrh f() {
        arrf a = arrh.a();
        awhf g = g();
        a.copyOnWrite();
        ((arrh) a.instance).dQ(g);
        return (arrh) a.mo39build();
    }

    public final awhf g() {
        aopa createBuilder = awhf.a.createBuilder();
        aoob aoobVar = this.a;
        if (aoobVar == null) {
            aoobVar = aoob.b;
        }
        createBuilder.copyOnWrite();
        awhf awhfVar = (awhf) createBuilder.instance;
        aoobVar.getClass();
        int i = 1;
        awhfVar.b |= 1;
        awhfVar.c = aoobVar;
        int i2 = this.b;
        if (i2 != 0) {
            i = i2;
        }
        createBuilder.copyOnWrite();
        awhf awhfVar2 = (awhf) createBuilder.instance;
        awhfVar2.d = i - 1;
        awhfVar2.b |= 2;
        return (awhf) createBuilder.mo39build();
    }
}
