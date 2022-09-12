package defpackage;

import android.content.res.Resources;
/* compiled from: PG */
/* renamed from: cnwh  reason: default package */
/* loaded from: classes5.dex */
public final class cnwh {
    @dzsi
    public static final String a(String str, Resources resources, String str2) {
        int identifier = resources.getIdentifier(str, "string", str2);
        if (identifier == 0) {
            return null;
        }
        return resources.getString(identifier);
    }
}
