package defpackage;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.Executor;
/* compiled from: PG */
/* renamed from: dyet  reason: default package */
/* loaded from: classes6.dex */
public final class dyet {
    public static final dyet a = new dyet();
    @dzsi
    public dyfr b;
    @dzsi
    public Executor c;
    @dzsi
    public dyer d;
    public List<dyfb> e;
    @dzsi
    public Boolean f;
    @dzsi
    public Integer g;
    @dzsi
    public Integer h;
    private Object[][] i;

    private dyet() {
        this.i = (Object[][]) Array.newInstance(Object.class, 0, 2);
        this.e = Collections.emptyList();
    }

    public final dyet a(@dzsi dyer dyerVar) {
        dyet dyetVar = new dyet(this);
        dyetVar.d = dyerVar;
        return dyetVar;
    }

    public final dyet b(@dzsi dyfr dyfrVar) {
        dyet dyetVar = new dyet(this);
        dyetVar.b = dyfrVar;
        return dyetVar;
    }

    public final dyet c(dyfb dyfbVar) {
        dyet dyetVar = new dyet(this);
        ArrayList arrayList = new ArrayList(this.e.size() + 1);
        arrayList.addAll(this.e);
        arrayList.add(dyfbVar);
        dyetVar.e = Collections.unmodifiableList(arrayList);
        return dyetVar;
    }

    public final <T> dyet d(dyes<T> dyesVar, T t) {
        dbsk.t(dyesVar, "key");
        dbsk.t(t, "value");
        dyet dyetVar = new dyet(this);
        int i = 0;
        while (true) {
            Object[][] objArr = this.i;
            if (i >= objArr.length) {
                i = -1;
                break;
            } else if (dyesVar.equals(objArr[i][0])) {
                break;
            } else {
                i++;
            }
        }
        Object[][] objArr2 = (Object[][]) Array.newInstance(Object.class, this.i.length + (i == -1 ? 1 : 0), 2);
        dyetVar.i = objArr2;
        Object[][] objArr3 = this.i;
        System.arraycopy(objArr3, 0, objArr2, 0, objArr3.length);
        if (i == -1) {
            Object[][] objArr4 = dyetVar.i;
            int length = this.i.length;
            Object[] objArr5 = new Object[2];
            objArr5[0] = dyesVar;
            objArr5[1] = t;
            objArr4[length] = objArr5;
        } else {
            Object[][] objArr6 = dyetVar.i;
            Object[] objArr7 = new Object[2];
            objArr7[0] = dyesVar;
            objArr7[1] = t;
            objArr6[i] = objArr7;
        }
        return dyetVar;
    }

    public final <T> T e(dyes<T> dyesVar) {
        dbsk.t(dyesVar, "key");
        int i = 0;
        while (true) {
            Object[][] objArr = this.i;
            if (i < objArr.length) {
                if (dyesVar.equals(objArr[i][0])) {
                    return (T) this.i[i][1];
                }
                i++;
            } else {
                return dyesVar.a;
            }
        }
    }

    public final boolean f() {
        return Boolean.TRUE.equals(this.f);
    }

    public final dyet g(int i) {
        dbsk.e(i >= 0, "invalid maxsize %s", i);
        dyet dyetVar = new dyet(this);
        dyetVar.g = Integer.valueOf(i);
        return dyetVar;
    }

    public final dyet h(int i) {
        dbsk.e(i >= 0, "invalid maxsize %s", i);
        dyet dyetVar = new dyet(this);
        dyetVar.h = Integer.valueOf(i);
        return dyetVar;
    }

    public final String toString() {
        dbsb b = dbsc.b(this);
        b.b("deadline", this.b);
        b.b("authority", null);
        b.b("callCredentials", this.d);
        Executor executor = this.c;
        b.b("executor", executor != null ? executor.getClass() : null);
        b.b("compressorName", null);
        b.b("customOptions", Arrays.deepToString(this.i));
        b.h("waitForReady", f());
        b.b("maxInboundMessageSize", this.g);
        b.b("maxOutboundMessageSize", this.h);
        b.b("streamTracerFactories", this.e);
        return b.toString();
    }

    public dyet(dyet dyetVar) {
        this.i = (Object[][]) Array.newInstance(Object.class, 0, 2);
        this.e = Collections.emptyList();
        this.b = dyetVar.b;
        this.d = dyetVar.d;
        this.c = dyetVar.c;
        this.i = dyetVar.i;
        this.f = dyetVar.f;
        this.g = dyetVar.g;
        this.h = dyetVar.h;
        this.e = dyetVar.e;
    }
}
