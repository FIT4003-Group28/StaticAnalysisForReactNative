package defpackage;

import java.io.IOException;
import java.util.Arrays;
import java.util.Iterator;
/* compiled from: PG */
/* renamed from: dbrz  reason: default package */
/* loaded from: classes.dex */
public class dbrz {
    public final String c;

    public dbrz(dbrz dbrzVar) {
        this.c = dbrzVar.c;
    }

    private dbrz(String str) {
        dbsk.s(str);
        this.c = str;
    }

    public static dbrz e(String str) {
        return new dbrz(str);
    }

    public static dbrz f(char c) {
        return new dbrz(String.valueOf(c));
    }

    public CharSequence a(Object obj) {
        dbsk.s(obj);
        return obj instanceof CharSequence ? (CharSequence) obj : obj.toString();
    }

    public dbrz b() {
        return new dbrv(this, this);
    }

    public dbry c(String str) {
        return new dbry(this, str);
    }

    public <A extends Appendable> void d(A a, Iterator it) {
        if (it.hasNext()) {
            a.append(a(it.next()));
            while (it.hasNext()) {
                a.append(this.c);
                a.append(a(it.next()));
            }
        }
    }

    public final String g(Iterable<?> iterable) {
        Iterator<?> it = iterable.iterator();
        StringBuilder sb = new StringBuilder();
        k(sb, it);
        return sb.toString();
    }

    public final String h(Object[] objArr) {
        return g(Arrays.asList(objArr));
    }

    public final String i(Object obj, Object obj2, Object... objArr) {
        return g(new dbrx(objArr, obj, obj2));
    }

    public final dbrz j() {
        return new dbrw(this, this);
    }

    public final void k(StringBuilder sb, Iterator<?> it) {
        try {
            d(sb, it);
        } catch (IOException e) {
            throw new AssertionError(e);
        }
    }

    public final dbry l() {
        return c("=");
    }

    public final void m(StringBuilder sb, Iterable<?> iterable) {
        k(sb, iterable.iterator());
    }
}
