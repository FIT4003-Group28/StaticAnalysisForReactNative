package defpackage;

import android.os.IInterface;
/* compiled from: PG */
/* renamed from: axgd  reason: default package */
/* loaded from: classes2.dex */
public interface axgd extends IInterface {
    boolean enableAsyncReprojection(int i);

    boolean enableCardboardTriggerEmulation(axgj axgjVar);

    long getNativeGvrContext();

    axgj getRootView();

    axgg getUiLayout();

    void onBackPressed();

    void onPause();

    void onResume();

    boolean setOnDonNotNeededListener(axgj axgjVar);

    void setPresentationView(axgj axgjVar);

    void setReentryIntent(axgj axgjVar);

    void setStereoModeEnabled(boolean z);

    void shutdown();
}
