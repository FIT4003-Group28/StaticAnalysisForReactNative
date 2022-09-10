package defpackage;
/* compiled from: PG */
/* renamed from: vyv  reason: default package */
/* loaded from: classes7.dex */
public final class vyv {
    @dzsi
    public static cqtd a(dqvj dqvjVar) {
        dqvj dqvjVar2 = dqvj.DRIVE;
        int ordinal = dqvjVar.ordinal();
        if (ordinal != 0) {
            if (ordinal == 1) {
                return vyt.p;
            }
            if (ordinal == 2) {
                return vyt.m;
            }
            if (ordinal == 3) {
                return vyt.n;
            }
            if (ordinal == 4) {
                return vyt.s;
            }
            if (ordinal == 5) {
                return vyt.r;
            }
            if (ordinal == 7) {
                return vyt.q;
            }
            return null;
        }
        return vyt.o;
    }

    public static cqtd b(dqvj dqvjVar) {
        cqtd a = a(dqvjVar);
        return a != null ? a : cqtt.c();
    }

    public static cqtd c(@dzsi dqvj dqvjVar) {
        if (dqvjVar == null) {
            return vyt.i;
        }
        cqtd a = a(dqvjVar);
        return a != null ? a : vyt.i;
    }
}
