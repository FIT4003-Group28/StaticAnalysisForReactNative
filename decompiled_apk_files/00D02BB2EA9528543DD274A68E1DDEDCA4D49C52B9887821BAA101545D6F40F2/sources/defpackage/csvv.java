package defpackage;

import java.util.UUID;
/* compiled from: PG */
/* renamed from: csvv  reason: default package */
/* loaded from: classes5.dex */
public final class csvv {
    public static String a(String str) {
        cstd.a();
        return String.format("%s%s-%s", str, b(), Long.valueOf(System.currentTimeMillis()));
    }

    static final /* synthetic */ String b() {
        return UUID.randomUUID().toString();
    }
}
