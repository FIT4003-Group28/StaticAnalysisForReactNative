package defpackage;
/* compiled from: PG */
/* renamed from: axho  reason: default package */
/* loaded from: classes2.dex */
public final class axho {
    public amqo a = aqxo.j(null);
    public final amxc b = amry.u();
    public final amvl c = amvn.i();

    public axho() {
        a(axhq.a(axgq.VP8, "OMX.qcom."));
        a(axhq.a(axgq.VP9, "OMX.qcom."));
        a(axhq.a(axgq.H264, "OMX.qcom."));
        a(axhq.a(axgq.H265X, "OMX.qcom."));
        a(axhq.a(axgq.VP8, "OMX.Exynos."));
        a(axhq.a(axgq.VP9, "OMX.Exynos."));
        a(axhq.a(axgq.H264, "OMX.Exynos."));
        a(axhq.a(axgq.H265X, "OMX.Exynos."));
        a(axhq.a(axgq.VP8, "c2.exynos."));
        a(axhq.a(axgq.VP9, "c2.exynos."));
        a(axhq.a(axgq.H264, "c2.exynos."));
        a(axhq.a(axgq.H265X, "c2.exynos."));
        a(axhq.a(axgq.VP8, "OMX.Intel."));
        a(axhq.a(axgq.VP8, "OMX.Nvidia."));
    }

    public final void a(axgr axgrVar) {
        boolean z = true;
        aqxo.p(1 == (axgrVar.b & 1));
        if ((axgrVar.b & 2) == 0) {
            z = false;
        }
        aqxo.p(z);
        amxc amxcVar = this.b;
        axgq b = axgq.b(axgrVar.c);
        if (b == null) {
            b = axgq.UNKNOWN;
        }
        amxcVar.p(b, axgrVar);
    }
}
