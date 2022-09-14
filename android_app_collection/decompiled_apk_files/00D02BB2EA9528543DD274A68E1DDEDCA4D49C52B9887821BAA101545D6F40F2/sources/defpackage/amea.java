package defpackage;

import java.util.concurrent.Executor;
import org.chromium.net.CronetEngine;
import org.chromium.net.ExperimentalCronetEngine;
/* compiled from: PG */
/* renamed from: amea  reason: default package */
/* loaded from: classes2.dex */
public final class amea {
    public final ExperimentalCronetEngine a;

    public amea(CronetEngine cronetEngine, Executor executor, ckcw ckcwVar) {
        ExperimentalCronetEngine experimentalCronetEngine = (ExperimentalCronetEngine) cronetEngine;
        this.a = experimentalCronetEngine;
        experimentalCronetEngine.addRequestFinishedListener(new amdz(executor, ckcwVar));
    }
}
