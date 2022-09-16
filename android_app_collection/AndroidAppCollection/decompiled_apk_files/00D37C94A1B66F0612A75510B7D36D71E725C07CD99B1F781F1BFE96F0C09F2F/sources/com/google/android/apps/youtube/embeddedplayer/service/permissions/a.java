package com.google.android.apps.youtube.embeddedplayer.service.permissions;
/* JADX WARN: Failed to restore enum class, 'enum' modifier removed */
/* compiled from: PG */
/* loaded from: classes2.dex */
public final class a extends Enum {
    public static final a a;
    private static final /* synthetic */ a[] c;
    public final String b = "Permission denied: unauthorized usage of SignIn API";

    static {
        a aVar = new a();
        a = aVar;
        c = new a[]{aVar};
    }

    private a() {
    }

    public static a[] values() {
        return (a[]) c.clone();
    }
}
