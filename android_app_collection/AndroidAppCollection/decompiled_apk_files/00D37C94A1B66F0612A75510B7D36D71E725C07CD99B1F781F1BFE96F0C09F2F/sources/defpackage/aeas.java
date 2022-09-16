package defpackage;

import com.google.android.libraries.backup.Backup;
import java.net.SocketTimeoutException;
import java.util.concurrent.Executor;
import org.chromium.net.CronetEngine;
/* compiled from: PG */
/* renamed from: aeas  reason: default package */
/* loaded from: classes.dex */
public final class aeas {
    @Backup
    public static final String LIMIT_MOBILE_DATA_USAGE = "limit_mobile_data_usage";

    private aeas() {
    }

    public static /* synthetic */ String a(int i) {
        return i != 1 ? i != 2 ? i != 3 ? "null" : "GAMMA22" : "HLG" : "PQ";
    }

    public static atp b(CronetEngine cronetEngine, Executor executor, ampt amptVar, int i, int i2, boolean z, boolean z2) {
        return new aeim(cronetEngine, executor, amptVar, i, i2, z, z2);
    }

    public static boolean c(Exception exc) {
        return exc.getCause() != null && (exc.getCause() instanceof SocketTimeoutException);
    }
}
