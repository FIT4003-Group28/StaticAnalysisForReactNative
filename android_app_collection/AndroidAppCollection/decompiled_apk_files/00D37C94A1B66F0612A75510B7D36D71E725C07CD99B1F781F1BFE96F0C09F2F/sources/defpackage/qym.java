package defpackage;

import java.util.regex.Pattern;
/* compiled from: PG */
/* renamed from: qym  reason: default package */
/* loaded from: classes4.dex */
public final class qym {
    static {
        Pattern.compile("\\$\\{(.*?)\\}");
    }

    public static boolean a(String str) {
        return str == null || str.trim().isEmpty();
    }
}
