package defpackage;

import java.util.logging.Level;
/* compiled from: PG */
/* renamed from: dcqe  reason: default package */
/* loaded from: classes.dex */
public final class dcqe extends dcpz<dcqb> {
    public static final dcqd b = new dcqd();

    public dcqe(dcrl dcrlVar) {
        super(dcrlVar);
    }

    public static dcqe b() {
        return new dcqe(dcsh.c(dcsh.a().a(dcqe.class)));
    }

    @Deprecated
    public static dcqe c(String str) {
        dcuj.b(!str.isEmpty(), "injected class name is empty");
        return new dcqe(dcsh.c(str.replace('/', '.')));
    }

    public final dcqb d(Level level) {
        boolean a = a(level);
        boolean g = dcsh.g(this.a.a(), level, a);
        return (a || g) ? new dcqc(this, level, g) : b;
    }
}
