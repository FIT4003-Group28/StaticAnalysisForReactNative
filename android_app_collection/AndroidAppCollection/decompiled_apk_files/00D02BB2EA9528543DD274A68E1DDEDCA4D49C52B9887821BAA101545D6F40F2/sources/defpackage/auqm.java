package defpackage;

import java.util.UUID;
/* compiled from: PG */
/* renamed from: auqm  reason: default package */
/* loaded from: classes2.dex */
public final class auqm {
    public static String a(@dzsi int i, @dzsi String str) {
        if (i != 0) {
            int i2 = i - 1;
            if (i2 != 2) {
                if (i2 == 3 && str != null) {
                    return String.format("%s:%s", "LIGHTER", str);
                }
            } else if (str != null) {
                return String.format("%s:%s", "CHIME", str);
            }
        }
        return UUID.randomUUID().toString();
    }
}
