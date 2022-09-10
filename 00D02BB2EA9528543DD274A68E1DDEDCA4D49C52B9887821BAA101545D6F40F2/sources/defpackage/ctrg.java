package defpackage;

import com.google.android.libraries.messaging.lighter.model.ConversationId;
/* compiled from: PG */
/* renamed from: ctrg  reason: default package */
/* loaded from: classes5.dex */
public abstract class ctrg {
    public static ctrd l() {
        return new ctpz();
    }

    public abstract cuib a();

    public abstract boolean b();

    public abstract ctrf c();

    public abstract ctrd d();

    public final cugu e() {
        return c().c();
    }

    public final ctqy f() {
        return c().e();
    }

    public final ctra g() {
        return c().f();
    }

    public final ctri h() {
        return c().g();
    }

    public final ctql i() {
        return c().a();
    }

    public final ctrc j() {
        return c().d();
    }

    public final ConversationId k() {
        int m = m();
        int i = m - 1;
        if (m != 0) {
            if (i == 0) {
                return e().c();
            }
            if (i == 2) {
                return g().e();
            }
            if (i == 3) {
                return h().b();
            }
            if (i != 4) {
                if (i == 5) {
                    return j().a();
                }
                return null;
            } else if (i().c() != 1) {
                return null;
            } else {
                return i().b().a();
            }
        }
        throw null;
    }

    public final int m() {
        return c().b();
    }
}
