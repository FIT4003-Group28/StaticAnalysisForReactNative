package defpackage;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.regex.Pattern;
/* compiled from: PG */
/* renamed from: amqf  reason: default package */
/* loaded from: classes.dex */
public final class amqf {
    public final amoy a;
    public final boolean b;
    public final amqe c;
    public final int d;

    private amqf(amqe amqeVar) {
        this(amqeVar, false, amow.a, Integer.MAX_VALUE);
    }

    public amqf(amqe amqeVar, boolean z, amoy amoyVar, int i) {
        this.c = amqeVar;
        this.b = z;
        this.a = amoyVar;
        this.d = i;
    }

    public static amqf b(char c) {
        return new amqf(new ampy(new amot(c)));
    }

    public static amqf c(String str) {
        aqxo.q(str.length() != 0, "The separator may not be the empty string.");
        if (str.length() == 1) {
            return b(str.charAt(0));
        }
        return new amqf(new amqa(str));
    }

    public static amqf d(String str) {
        int i = amps.a;
        ampj ampjVar = new ampj(Pattern.compile(str));
        aqxo.u(!ampjVar.a("").a.matches(), "The pattern may not match the empty string: %s", ampjVar);
        return new amqf(new amqc(ampjVar));
    }

    public final amqf a() {
        return new amqf(this.c, true, this.a, this.d);
    }

    public final amqf e() {
        amox amoxVar = amox.b;
        amoxVar.getClass();
        return new amqf(this.c, this.b, amoxVar, this.d);
    }

    public final Iterable f(CharSequence charSequence) {
        charSequence.getClass();
        return new amqd(this, charSequence);
    }

    public final Iterator g(CharSequence charSequence) {
        return this.c.a(this, charSequence);
    }

    public final List h(CharSequence charSequence) {
        charSequence.getClass();
        Iterator g = g(charSequence);
        ArrayList arrayList = new ArrayList();
        while (g.hasNext()) {
            arrayList.add((String) g.next());
        }
        return Collections.unmodifiableList(arrayList);
    }
}
