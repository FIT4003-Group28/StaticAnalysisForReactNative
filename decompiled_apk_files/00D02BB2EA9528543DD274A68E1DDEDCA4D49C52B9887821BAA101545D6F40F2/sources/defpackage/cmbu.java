package defpackage;

import com.google.android.exoplayer2.Format;
/* compiled from: PG */
/* renamed from: cmbu  reason: default package */
/* loaded from: classes5.dex */
final class cmbu implements cmbv {
    @Override // defpackage.cmbv
    public final boolean a(Format format) {
        String str = format.l;
        return "application/id3".equals(str) || "application/x-emsg".equals(str) || "application/x-scte35".equals(str) || "application/x-icy".equals(str) || "application/vnd.dvb.ait".equals(str);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    @Override // defpackage.cmbv
    public final cmbt b(Format format) {
        char c;
        String str = format.l;
        if (str != null) {
            switch (str.hashCode()) {
                case -1354451219:
                    if (str.equals("application/vnd.dvb.ait")) {
                        c = 4;
                        break;
                    }
                    c = 65535;
                    break;
                case -1348231605:
                    if (str.equals("application/x-icy")) {
                        c = 3;
                        break;
                    }
                    c = 65535;
                    break;
                case -1248341703:
                    if (str.equals("application/id3")) {
                        c = 0;
                        break;
                    }
                    c = 65535;
                    break;
                case 1154383568:
                    if (str.equals("application/x-emsg")) {
                        c = 1;
                        break;
                    }
                    c = 65535;
                    break;
                case 1652648887:
                    if (str.equals("application/x-scte35")) {
                        c = 2;
                        break;
                    }
                    c = 65535;
                    break;
                default:
                    c = 65535;
                    break;
            }
            if (c == 0) {
                return new cmcs(null);
            }
            if (c == 1) {
                return new cmcd();
            }
            if (c == 2) {
                return new cmdb();
            }
            if (c == 3) {
                return new cmch();
            }
            if (c == 4) {
                return new cmcb();
            }
        }
        String valueOf = String.valueOf(str);
        throw new IllegalArgumentException(valueOf.length() != 0 ? "Attempted to create decoder for unsupported MIME type: ".concat(valueOf) : new String("Attempted to create decoder for unsupported MIME type: "));
    }
}
