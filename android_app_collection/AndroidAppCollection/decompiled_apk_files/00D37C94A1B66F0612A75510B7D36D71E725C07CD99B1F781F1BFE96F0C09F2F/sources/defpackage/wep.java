package defpackage;
/* compiled from: PG */
/* renamed from: wep  reason: default package */
/* loaded from: classes4.dex */
public final class wep {
    public static final Class[] a(wgs wgsVar, Object obj, int i) {
        if (i != -1) {
            if (i == 0) {
                wgsVar.d((wgf) obj);
                return null;
            } else if (i == 1) {
                wgsVar.e((wgh) obj);
                return null;
            } else if (i == 2) {
                afwb afwbVar = (afwb) obj;
                wgsVar.h();
                return null;
            } else {
                StringBuilder sb = new StringBuilder(32);
                sb.append("unsupported op code: ");
                sb.append(i);
                throw new IllegalStateException(sb.toString());
            }
        }
        return new Class[]{wgf.class, wgh.class, afwb.class};
    }
}
