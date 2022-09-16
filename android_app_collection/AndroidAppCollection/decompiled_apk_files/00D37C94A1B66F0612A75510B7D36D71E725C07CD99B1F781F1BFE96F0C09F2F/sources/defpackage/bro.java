package defpackage;

import android.content.Context;
import java.io.File;
/* compiled from: PG */
/* renamed from: bro  reason: default package */
/* loaded from: classes2.dex */
public final class bro {
    public static final String a = bqf.b("WrkDbPathHelper");
    public static final String[] b = {"-journal", "-shm", "-wal"};

    public static File a(Context context) {
        return context.getDatabasePath("androidx.work.workdb");
    }
}
