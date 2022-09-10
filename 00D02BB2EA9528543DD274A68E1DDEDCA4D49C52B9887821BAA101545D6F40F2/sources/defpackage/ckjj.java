package defpackage;
/* compiled from: PG */
/* renamed from: ckjj  reason: default package */
/* loaded from: classes4.dex */
public final class ckjj {
    @dzsi
    public final ckgz a;
    @dzsi
    public final ckha b;
    @dzsi
    public final ckha c;
    @dzsi
    public final ckha d;
    @dzsi
    public final ckha e;
    @dzsi
    public final ckha f;
    @dzsi
    public final ckha g;
    @dzsi
    public final ckgz h;

    public ckjj() {
        this.a = null;
        this.b = null;
        this.c = null;
        this.d = null;
        this.e = null;
        this.f = null;
        this.g = null;
        this.h = null;
    }

    public ckjj(String str) {
        ckgy ckgyVar = ckgy.REQUEST_PERFORMANCE;
        this.a = new ckgz(str.length() != 0 ? "RequestPerformanceNumTries".concat(str) : new String("RequestPerformanceNumTries"), ckgyVar);
        this.b = new ckha(str.length() != 0 ? "RequestPerformanceNetworkLatency".concat(str) : new String("RequestPerformanceNetworkLatency"), ckgyVar);
        this.c = new ckha(str.length() != 0 ? "RequestPerformanceEndToEndLatency".concat(str) : new String("RequestPerformanceEndToEndLatency"), ckgyVar);
        this.d = new ckha(str.length() != 0 ? "RequestPerformanceEndToEndSuccessLatency".concat(str) : new String("RequestPerformanceEndToEndSuccessLatency"), ckgyVar);
        this.e = new ckha(str.length() != 0 ? "RequestPerformanceSentBytes".concat(str) : new String("RequestPerformanceSentBytes"), ckgyVar);
        this.f = new ckha(str.length() != 0 ? "RequestPerformanceReceivedBytes".concat(str) : new String("RequestPerformanceReceivedBytes"), ckgyVar);
        this.g = new ckha(str.length() != 0 ? "RequestPerformanceServerTime".concat(str) : new String("RequestPerformanceServerTime"), ckgyVar);
        this.h = new ckgz(str.length() != 0 ? "RequestPerformanceStatus".concat(str) : new String("RequestPerformanceStatus"), ckgyVar);
    }
}
