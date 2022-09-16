package defpackage;

import java.net.InetSocketAddress;
import org.chromium.net.CronetEngine;
/* compiled from: PG */
/* renamed from: aydq  reason: default package */
/* loaded from: classes2.dex */
public final class aydq extends ayam {
    public final CronetEngine a;
    public final ayjm b;
    public ayms c;
    public int d;

    private aydq(String str, int i, CronetEngine cronetEngine) {
        this.c = aymt.a;
        this.d = 4194304;
        this.b = new ayjm(InetSocketAddress.createUnresolved(str, i), ayhf.c(str, i), new aydd(this));
        this.a = cronetEngine;
    }

    public static aydq a(String str, int i, CronetEngine cronetEngine) {
        cronetEngine.getClass();
        return new aydq(str, i, cronetEngine);
    }

    @Override // defpackage.ayam
    public final ayal c() {
        return this.b.c();
    }

    public final String toString() {
        ampp c = akzj.c(this);
        c.b("delegate", this.b);
        return c.toString();
    }

    protected aydq() {
    }
}
