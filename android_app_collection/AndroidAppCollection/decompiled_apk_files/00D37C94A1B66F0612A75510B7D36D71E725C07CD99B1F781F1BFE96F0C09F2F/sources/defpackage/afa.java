package defpackage;

import android.os.Handler;
import java.util.concurrent.Executor;
/* compiled from: PG */
/* renamed from: afa  reason: default package */
/* loaded from: classes.dex */
public final class afa implements afl {
    public static final afd a = afd.a("camerax.core.appConfig.cameraFactoryProvider", afc.class);
    public static final afd b = afd.a("camerax.core.appConfig.deviceSurfaceManagerProvider", afb.class);
    public static final afd c = afd.a("camerax.core.appConfig.useCaseConfigFactoryProvider", afj.class);

    static {
        afd.a("camerax.core.appConfig.cameraExecutor", Executor.class);
        afd.a("camerax.core.appConfig.schedulerHandler", Handler.class);
        afd.a("camerax.core.appConfig.minimumLoggingLevel", Integer.TYPE);
        afd.a("camerax.core.appConfig.availableCamerasLimiter", aex.class);
    }

    @Override // defpackage.aff
    public final /* synthetic */ Object a(afd afdVar) {
        throw null;
    }
}
