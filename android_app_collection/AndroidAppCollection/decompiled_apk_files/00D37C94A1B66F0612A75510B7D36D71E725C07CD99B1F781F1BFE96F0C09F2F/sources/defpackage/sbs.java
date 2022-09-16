package defpackage;

import io.grpc.Status;
import io.grpc.StatusException;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ExecutionException;
/* compiled from: PG */
/* renamed from: sbs  reason: default package */
/* loaded from: classes4.dex */
public class sbs {
    public static anay e() {
        return anay.m("GAL");
    }

    public static rxv f(Throwable th) {
        Status.Code code;
        Status g = g(th);
        if (g == null || ((code = g.getCode()) != Status.Code.DEADLINE_EXCEEDED && code != Status.Code.UNAVAILABLE)) {
            return new rxv(1, "An error occurred in gRPC call", th);
        }
        return new rxv(2, "Network error", th);
    }

    public static Status g(Throwable th) {
        Throwable h = h(th);
        if (h instanceof StatusException) {
            return ((StatusException) h).a;
        }
        if (!(h instanceof aybt)) {
            return null;
        }
        return ((aybt) h).a;
    }

    public static Throwable h(Throwable th) {
        if (th == null) {
            return null;
        }
        return ((th instanceof ExecutionException) || (th instanceof anlr)) ? h(th.getCause()) : th;
    }

    public void a() {
    }

    public void b(Map map, sfa sfaVar) {
    }

    public void c() {
    }

    public void d(List list) {
    }
}
