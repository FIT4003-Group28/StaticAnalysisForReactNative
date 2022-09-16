package defpackage;

import com.google.android.exoplayer2.Format;
/* compiled from: PG */
/* renamed from: poj  reason: default package */
/* loaded from: classes4.dex */
final class poj implements pok {
    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    @Override // defpackage.pok
    public final poi a(Format format) {
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
                return new pov(null);
            }
            if (c == 1) {
                return new poq();
            }
            if (c == 2) {
                return new pow();
            }
            if (c == 3) {
                return new pos();
            }
            if (c == 4) {
                return new pop();
            }
        }
        String valueOf = String.valueOf(str);
        throw new IllegalArgumentException(valueOf.length() != 0 ? "Attempted to create decoder for unsupported MIME type: ".concat(valueOf) : new String("Attempted to create decoder for unsupported MIME type: "));
    }

    @Override // defpackage.pok
    public final boolean b(Format format) {
        String str = format.l;
        return "application/id3".equals(str) || "application/x-emsg".equals(str) || "application/x-scte35".equals(str) || "application/x-icy".equals(str) || "application/vnd.dvb.ait".equals(str);
    }
}
