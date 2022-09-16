package defpackage;

import org.json.JSONObject;
/* compiled from: PG */
/* renamed from: acyv  reason: default package */
/* loaded from: classes.dex */
public final class acyv extends acyw {
    private static final String c = zep.a("MDX.browserchannel");
    public final int a;

    public acyv(int i) {
        super(401);
        this.a = i;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public static acyv a(String str) {
        char c2;
        try {
            String string = new JSONObject(str).getString("unauthorizedError");
            int i = 3;
            switch (string.hashCode()) {
                case -1869966340:
                    if (string.equals("INVALID_LOUNGE_TOKEN")) {
                        c2 = 2;
                        break;
                    }
                    c2 = 65535;
                    break;
                case -963888754:
                    if (string.equals("EXPIRED_LOUNGE_TOKEN")) {
                        c2 = 1;
                        break;
                    }
                    c2 = 65535;
                    break;
                case 552926238:
                    if (string.equals("AUTHENTICATE_USER_ERROR")) {
                        c2 = 3;
                        break;
                    }
                    c2 = 65535;
                    break;
                case 1260835053:
                    if (string.equals("MISSING_LOUNGE_TOKEN")) {
                        c2 = 0;
                        break;
                    }
                    c2 = 65535;
                    break;
                default:
                    c2 = 65535;
                    break;
            }
            if (c2 == 0) {
                i = 1;
            } else if (c2 == 1) {
                i = 2;
            } else if (c2 != 2) {
                if (c2 != 3) {
                    throw new IllegalArgumentException();
                }
                i = 4;
            }
            return new acyv(i);
        } catch (Exception unused) {
            zep.m(c, "failed to parse error enum, assuming bad lounge token");
            return new acyv(1);
        }
    }
}
