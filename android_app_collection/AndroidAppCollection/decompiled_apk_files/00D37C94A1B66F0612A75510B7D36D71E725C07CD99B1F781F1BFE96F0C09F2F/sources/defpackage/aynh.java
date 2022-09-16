package defpackage;

import java.util.logging.Level;
import java.util.logging.Logger;
/* compiled from: PG */
/* renamed from: aynh  reason: default package */
/* loaded from: classes2.dex */
public final class aynh {
    private static final Logger b = Logger.getLogger(aynh.class.getName());
    public static final axyc a = axyc.a("internal-stub-type");

    private aynh() {
    }

    public static ankt a(axyg axygVar, Object obj) {
        aync ayncVar = new aync(axygVar);
        d(axygVar, obj, new ayng(ayncVar));
        return ayncVar;
    }

    public static aynl b(axyg axygVar, aynl aynlVar) {
        aynb aynbVar = new aynb(axygVar);
        e(axygVar, new ayne(aynlVar, aynbVar));
        return aynbVar;
    }

    private static RuntimeException c(axyg axygVar, Throwable th) {
        try {
            axygVar.b(null, th);
        } catch (Throwable th2) {
            b.logp(Level.SEVERE, "io.grpc.stub.ClientCalls", "cancelThrow", "RuntimeException encountered while closing call", th2);
        }
        if (th instanceof RuntimeException) {
            throw ((RuntimeException) th);
        }
        if (th instanceof Error) {
            throw ((Error) th);
        }
        throw new AssertionError(th);
    }

    private static void d(axyg axygVar, Object obj, aynd ayndVar) {
        e(axygVar, ayndVar);
        try {
            axygVar.e(obj);
            axygVar.c();
        } catch (Error e) {
            throw c(axygVar, e);
        } catch (RuntimeException e2) {
            throw c(axygVar, e2);
        }
    }

    private static void e(axyg axygVar, aynd ayndVar) {
        axygVar.k(ayndVar, new ayat());
        ayndVar.q();
    }
}
