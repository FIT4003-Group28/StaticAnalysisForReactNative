package defpackage;

import java.util.List;
/* compiled from: PG */
/* renamed from: inz  reason: default package */
/* loaded from: classes6.dex */
public final class inz {
    public static final iny a(dbty<List<ioo>> dbtyVar, dcdc<ioa> dcdcVar) {
        b(dbtyVar, 1);
        b(dcdcVar, 2);
        return new iny(dbtyVar, dcdcVar);
    }

    private static <T> void b(T t, int i) {
        if (t != null) {
            return;
        }
        StringBuilder sb = new StringBuilder(93);
        sb.append("@AutoFactory method argument is null but is not marked @Nullable. Argument index: ");
        sb.append(i);
        throw new NullPointerException(sb.toString());
    }
}
