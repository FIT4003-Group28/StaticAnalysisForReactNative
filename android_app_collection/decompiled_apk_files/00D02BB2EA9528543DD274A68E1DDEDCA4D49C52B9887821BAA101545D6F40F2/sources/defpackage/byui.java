package defpackage;
/* compiled from: PG */
/* renamed from: byui  reason: default package */
/* loaded from: classes4.dex */
public final class byui {
    private final bytc a;

    public byui(bytc bytcVar) {
        this.a = bytcVar;
    }

    @dzsi
    public final akqi a(@dzsi String str) {
        if (str == null) {
            this.a.a(236);
            return null;
        }
        try {
            dtbq a = bkkc.a(str);
            if ((a.a & 1) == 0) {
                this.a.a(238);
                return null;
            }
            this.a.a(239);
            dgrh dgrhVar = a.b;
            if (dgrhVar == null) {
                dgrhVar = dgrh.d;
            }
            return akqi.k(dgrhVar);
        } catch (IllegalArgumentException unused) {
            this.a.a(237);
            return null;
        }
    }
}
