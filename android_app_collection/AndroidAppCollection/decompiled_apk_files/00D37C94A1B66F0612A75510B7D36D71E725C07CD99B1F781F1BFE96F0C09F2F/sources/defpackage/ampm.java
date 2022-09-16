package defpackage;

import java.io.IOException;
import java.util.Iterator;
/* compiled from: PG */
/* renamed from: ampm  reason: default package */
/* loaded from: classes.dex */
public class ampm {
    public final String b;

    public ampm(ampm ampmVar) {
        this.b = ampmVar.b;
    }

    public ampm(String str) {
        str.getClass();
        this.b = str;
    }

    public static ampm b(String str) {
        return new ampm(str);
    }

    public static final CharSequence g(Object obj) {
        obj.getClass();
        return obj instanceof CharSequence ? (CharSequence) obj : obj.toString();
    }

    public void a(Appendable appendable, Iterator it) {
        if (it.hasNext()) {
            appendable.append(g(it.next()));
            while (it.hasNext()) {
                appendable.append(this.b);
                appendable.append(g(it.next()));
            }
        }
    }

    public final ampm c() {
        return new ampk(this, this);
    }

    public final String d(Iterable iterable) {
        Iterator it = iterable.iterator();
        StringBuilder sb = new StringBuilder();
        f(sb, it);
        return sb.toString();
    }

    public final String e(Object obj, Object obj2, Object... objArr) {
        return d(new ampl(objArr, obj, obj2));
    }

    public final void f(StringBuilder sb, Iterator it) {
        try {
            a(sb, it);
        } catch (IOException e) {
            throw new AssertionError(e);
        }
    }
}
