package defpackage;

import java.util.regex.Pattern;
/* compiled from: PG */
/* renamed from: cnxu  reason: default package */
/* loaded from: classes5.dex */
public final class cnxu {
    static {
        Pattern.compile("\\$\\{(.*?)\\}");
    }

    public static boolean a(String str) {
        return str == null || str.trim().isEmpty();
    }
}
