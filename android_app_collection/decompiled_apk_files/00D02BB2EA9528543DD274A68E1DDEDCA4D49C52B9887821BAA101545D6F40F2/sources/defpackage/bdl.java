package defpackage;

import android.content.Context;
import java.io.File;
/* compiled from: PG */
/* renamed from: bdl  reason: default package */
/* loaded from: classes3.dex */
public final class bdl {
    public static final String[] a;

    static {
        bbz.f("WrkDbPathHelper");
        a = new String[]{"-journal", "-shm", "-wal"};
    }

    public static String a() {
        return "androidx.work.workdb";
    }

    public static File b(Context context) {
        return context.getDatabasePath("androidx.work.workdb");
    }
}
