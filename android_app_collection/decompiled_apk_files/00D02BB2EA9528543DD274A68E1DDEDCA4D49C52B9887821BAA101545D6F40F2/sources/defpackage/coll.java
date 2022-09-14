package defpackage;

import com.google.android.gms.common.api.Status;
/* compiled from: PG */
@Deprecated
/* renamed from: coll  reason: default package */
/* loaded from: classes5.dex */
public final class coll {
    public static int a(int i) {
        if ((i < 0 || i > 1) && (i < 1000 || i >= 1006)) {
            return 1;
        }
        return i;
    }

    public static Status b(int i) {
        if (i == 1) {
            i = 13;
        }
        return new Status(i);
    }
}
