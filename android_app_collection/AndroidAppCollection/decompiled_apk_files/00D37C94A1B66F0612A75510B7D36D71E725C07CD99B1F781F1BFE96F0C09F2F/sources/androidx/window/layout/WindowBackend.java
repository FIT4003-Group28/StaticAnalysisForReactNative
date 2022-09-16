package androidx.window.layout;

import android.app.Activity;
import java.util.concurrent.Executor;
/* compiled from: PG */
/* loaded from: classes.dex */
public interface WindowBackend {
    void registerLayoutChangeCallback(Activity activity, Executor executor, ji jiVar);

    void unregisterLayoutChangeCallback(ji jiVar);
}
