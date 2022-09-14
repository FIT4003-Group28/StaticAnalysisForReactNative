package c.d.j.d;

import java.util.concurrent.TimeUnit;
/* loaded from: classes.dex */
public class k implements c.d.d.d.l<q> {

    /* renamed from: a  reason: collision with root package name */
    private static final long f3230a = TimeUnit.MINUTES.toMillis(5);

    private int a() {
        int min = (int) Math.min(Runtime.getRuntime().maxMemory(), 2147483647L);
        if (min < 16777216) {
            return 1048576;
        }
        return min < 33554432 ? 2097152 : 4194304;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // c.d.d.d.l
    /* renamed from: get */
    public q mo139get() {
        int a2 = a();
        return new q(a2, Integer.MAX_VALUE, a2, Integer.MAX_VALUE, a2 / 8, f3230a);
    }
}
