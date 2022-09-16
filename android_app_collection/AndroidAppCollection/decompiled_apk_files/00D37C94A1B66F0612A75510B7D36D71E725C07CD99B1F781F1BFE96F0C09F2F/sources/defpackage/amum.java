package defpackage;

import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
/* compiled from: PG */
/* renamed from: amum  reason: default package */
/* loaded from: classes.dex */
public class amum {
    Object[] a;
    int b;

    public amum() {
        this(4);
    }

    private final void a(int i) {
        int i2 = i + i;
        Object[] objArr = this.a;
        int length = objArr.length;
        if (i2 > length) {
            this.a = Arrays.copyOf(objArr, amua.f(length, i2));
        }
    }

    public amup b() {
        return amyc.a(this.b, this.a);
    }

    public void d(Map.Entry entry) {
        f(entry.getKey(), entry.getValue());
    }

    public final void e(amum amumVar) {
        amumVar.getClass();
        a(this.b + amumVar.b);
        Object[] objArr = amumVar.a;
        Object[] objArr2 = this.a;
        int i = this.b;
        int i2 = amumVar.b;
        System.arraycopy(objArr, 0, objArr2, i + i, i2 + i2);
        this.b += amumVar.b;
    }

    public final void f(Object obj, Object obj2) {
        a(this.b + 1);
        araa.t(obj, obj2);
        Object[] objArr = this.a;
        int i = this.b;
        int i2 = i + i;
        objArr[i2] = obj;
        objArr[i2 + 1] = obj2;
        this.b = i + 1;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void g(Iterable iterable) {
        if (iterable instanceof Collection) {
            a(this.b + iterable.size());
        }
        Iterator it = iterable.iterator();
        while (it.hasNext()) {
            d((Map.Entry) it.next());
        }
    }

    public final void h(Map map) {
        g(map.entrySet());
    }

    public amum(int i) {
        this.a = new Object[i + i];
        this.b = 0;
    }
}
