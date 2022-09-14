package defpackage;

import java.io.Closeable;
import java.math.BigDecimal;
import java.math.BigInteger;
/* compiled from: PG */
/* renamed from: eamw  reason: default package */
/* loaded from: classes6.dex */
public abstract class eamw implements Closeable {
    protected int a;
    public eamz b;

    public final boolean a(eamv eamvVar) {
        return (eamvVar.b() & this.a) != 0;
    }

    public abstract eamz b();

    public abstract String c();

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public abstract void close();

    public abstract eamt d();

    public abstract String e();

    public abstract int f();

    public abstract long g();

    public abstract BigInteger h();

    public abstract float i();

    public abstract double j();

    public abstract BigDecimal k();

    public final eamu l(String str) {
        return new eamu(str, d());
    }

    public abstract void m();
}
