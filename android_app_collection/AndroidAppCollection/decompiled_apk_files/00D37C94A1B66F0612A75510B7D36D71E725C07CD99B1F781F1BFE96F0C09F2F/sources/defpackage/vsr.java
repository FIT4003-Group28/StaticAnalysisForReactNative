package defpackage;
/* compiled from: PG */
/* renamed from: vsr  reason: default package */
/* loaded from: classes4.dex */
public final class vsr {
    public static vso a(vss vssVar) {
        if (!vssVar.b.equals("mvhd")) {
            if (!vssVar.b.equals("tkhd")) {
                if (!vssVar.b.equals("stco")) {
                    if (!vssVar.b.equals("co64")) {
                        if (vssVar.b.equals("moov") || vssVar.b.equals("trak") || vssVar.b.equals("edts") || vssVar.b.equals("mdia") || vssVar.b.equals("minf") || vssVar.b.equals("dinf") || vssVar.b.equals("stbl")) {
                            return new vsx(vssVar);
                        }
                        return new vso(vssVar);
                    }
                    return new vsp(vssVar);
                }
                return new vsu(vssVar);
            }
            return new vsv(vssVar);
        }
        return new vst(vssVar);
    }

    public static int b(axlh axlhVar) {
        axlh axlhVar2 = new axlh(axlhVar.h, axlhVar.i, axlhVar.j, axlhVar.k, axlhVar.e, axlhVar.f, axlhVar.g, 0.0d, 0.0d);
        if (uwp.l(axlhVar2, axlh.a)) {
            return 0;
        }
        if (uwp.l(axlhVar2, axlh.b)) {
            return 90;
        }
        if (uwp.l(axlhVar2, axlh.c)) {
            return 180;
        }
        if (uwp.l(axlhVar2, axlh.d)) {
            return 270;
        }
        String valueOf = String.valueOf(axlhVar);
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 58);
        sb.append("track contains rotation matrix other than simple rotation ");
        sb.append(valueOf);
        vqy.d(sb.toString());
        return 0;
    }

    public static void c(ankt anktVar) {
        anktVar.qY(new amhz(anktVar, 1), anjk.a);
    }
}
