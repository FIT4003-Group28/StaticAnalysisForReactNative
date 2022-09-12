package defpackage;

import android.text.TextUtils;
import java.util.Collection;
/* compiled from: PG */
/* renamed from: coow  reason: default package */
/* loaded from: classes5.dex */
public final class coow {
    @dzsi
    public static String a(@dzsi Collection<String> collection) {
        if (collection.isEmpty()) {
            return null;
        }
        return TextUtils.join(", ", collection);
    }
}
