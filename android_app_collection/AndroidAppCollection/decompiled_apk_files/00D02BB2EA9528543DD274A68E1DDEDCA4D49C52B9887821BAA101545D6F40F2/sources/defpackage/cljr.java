package defpackage;
/* compiled from: PG */
/* renamed from: cljr  reason: default package */
/* loaded from: classes5.dex */
public abstract class cljr {
    public static final cljr a;
    public static final cljr b;

    static {
        cljp c = c();
        c.c(dcmr.a);
        c.b(false);
        a = c.a();
        cljp c2 = c();
        c2.c(dcep.B(cljq.ANY));
        c2.b(true);
        c2.a();
        cljp c3 = c();
        c3.c(dcep.B(cljq.ANY));
        c3.b(false);
        b = c3.a();
    }

    public static cljp c() {
        cliq cliqVar = new cliq();
        cliqVar.b(false);
        return cliqVar;
    }

    public abstract boolean a();

    public abstract dcep<cljq> b();
}
