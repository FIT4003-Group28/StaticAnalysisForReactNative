package defpackage;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.locks.LockSupport;
import java.util.logging.Level;
import java.util.logging.Logger;
/* compiled from: PG */
/* renamed from: dyzf  reason: default package */
/* loaded from: classes6.dex */
public final class dyzf {
    private static final Logger b = Logger.getLogger(dyzf.class.getName());
    static final dyes<dyzc> a = dyes.a("internal-stub-type");

    private dyzf() {
    }

    public static <ReqT, RespT> void a(dyex<ReqT, RespT> dyexVar, ReqT reqt, dyzk<RespT> dyzkVar) {
        f(dyexVar, reqt, new dyzb(dyzkVar, new dyyy(dyexVar)));
    }

    public static <ReqT, RespT> dyzk<ReqT> b(dyex<ReqT, RespT> dyexVar, dyzk<RespT> dyzkVar) {
        dyyy dyyyVar = new dyyy(dyexVar);
        g(dyexVar, new dyzb(dyzkVar, dyyyVar));
        return dyyyVar;
    }

    public static <ReqT, RespT> RespT c(dyeu dyeuVar, dyib<ReqT, RespT> dyibVar, dyet dyetVar, ReqT reqt) {
        RuntimeException e;
        Error e2;
        dyzd dyzdVar = new dyzd();
        dyet dyetVar2 = new dyet(dyetVar.d(a, dyzc.BLOCKING));
        dyetVar2.c = dyzdVar;
        dyex a2 = dyeuVar.a(dyibVar, dyetVar2);
        boolean z = true;
        boolean z2 = false;
        try {
            try {
                dehn d = d(a2, reqt);
                while (!d.isDone()) {
                    try {
                        try {
                            dyzd.a();
                            Runnable poll = dyzdVar.poll();
                            if (poll == null) {
                                dyzdVar.b = Thread.currentThread();
                                while (true) {
                                    try {
                                        poll = dyzdVar.poll();
                                        if (poll != null) {
                                            break;
                                        }
                                        LockSupport.park(dyzdVar);
                                        dyzd.a();
                                    } catch (Throwable th) {
                                        dyzdVar.b = null;
                                        throw th;
                                        break;
                                    }
                                }
                                dyzdVar.b = null;
                            }
                            do {
                                try {
                                    poll.run();
                                } catch (Throwable th2) {
                                    dyzd.a.logp(Level.WARNING, "io.grpc.stub.ClientCalls$ThreadlessExecutor", "waitAndDrain", "Runnable threw exception", th2);
                                }
                                poll = dyzdVar.poll();
                            } while (poll != null);
                        } catch (InterruptedException e3) {
                            try {
                                a2.d("Thread interrupted", e3);
                                z2 = true;
                            } catch (Error e4) {
                                e2 = e4;
                                throw e(a2, e2);
                            } catch (RuntimeException e5) {
                                e = e5;
                                throw e(a2, e);
                            }
                        }
                    } catch (Error e6) {
                        e2 = e6;
                    } catch (RuntimeException e7) {
                        e = e7;
                    } catch (Throwable th3) {
                        th = th3;
                        z = z2;
                        if (z) {
                            Thread.currentThread().interrupt();
                        }
                        throw th;
                    }
                }
                try {
                    RespT respt = (RespT) d.get();
                    if (z2) {
                        Thread.currentThread().interrupt();
                    }
                    return respt;
                } catch (InterruptedException e8) {
                    Thread.currentThread().interrupt();
                    throw dyjb.c.g("Thread interrupted").f(e8).j();
                } catch (ExecutionException e9) {
                    Throwable cause = e9.getCause();
                    dbsk.t(cause, "t");
                    for (Throwable th4 = cause; th4 != null; th4 = th4.getCause()) {
                        if (th4 instanceof dyjc) {
                            throw new dyjd(((dyjc) th4).a, null);
                        }
                        if (th4 instanceof dyjd) {
                            dyjd dyjdVar = (dyjd) th4;
                            throw new dyjd(dyjdVar.a, dyjdVar.b);
                        }
                    }
                    throw dyjb.d.g("unexpected exception").f(cause).j();
                }
            } catch (Throwable th5) {
                th = th5;
            }
        } catch (Error e10) {
            e2 = e10;
        } catch (RuntimeException e11) {
            e = e11;
        } catch (Throwable th6) {
            th = th6;
            z = false;
        }
    }

    public static <ReqT, RespT> dehn<RespT> d(dyex<ReqT, RespT> dyexVar, ReqT reqt) {
        dyyz dyyzVar = new dyyz(dyexVar);
        f(dyexVar, reqt, new dyze(dyyzVar));
        return dyyzVar;
    }

    private static RuntimeException e(dyex<?, ?> dyexVar, Throwable th) {
        try {
            dyexVar.d(null, th);
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

    private static <ReqT, RespT> void f(dyex<ReqT, RespT> dyexVar, ReqT reqt, dyza<RespT> dyzaVar) {
        g(dyexVar, dyzaVar);
        try {
            dyexVar.f(reqt);
            dyexVar.e();
        } catch (Error e) {
            throw e(dyexVar, e);
        } catch (RuntimeException e2) {
            throw e(dyexVar, e2);
        }
    }

    private static <ReqT, RespT> void g(dyex<ReqT, RespT> dyexVar, dyza<RespT> dyzaVar) {
        dyexVar.a(dyzaVar, new dyhw());
        dyzaVar.e();
    }
}
