package defpackage;

import android.os.IInterface;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.facs.cache.ForceSettingsCacheRefreshResult;
import com.google.android.gms.facs.cache.GetActivityControlsSettingsResult;
import com.google.android.gms.facs.cache.UpdateActivityControlsSettingsResult;
/* compiled from: PG */
/* renamed from: cock  reason: default package */
/* loaded from: classes5.dex */
public interface cock extends IInterface {
    void b(Status status, ForceSettingsCacheRefreshResult forceSettingsCacheRefreshResult);

    void c(Status status, UpdateActivityControlsSettingsResult updateActivityControlsSettingsResult);

    void d(Status status, GetActivityControlsSettingsResult getActivityControlsSettingsResult);

    void e();

    void f();
}
