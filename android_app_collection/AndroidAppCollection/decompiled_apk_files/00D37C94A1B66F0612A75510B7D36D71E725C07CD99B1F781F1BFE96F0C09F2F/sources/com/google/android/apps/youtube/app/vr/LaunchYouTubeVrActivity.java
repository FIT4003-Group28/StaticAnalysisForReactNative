package com.google.android.apps.youtube.app.vr;

import android.os.Bundle;
import android.widget.FrameLayout;
import com.google.vr.ndk.base.DaydreamApi;
/* compiled from: PG */
/* loaded from: classes2.dex */
public class LaunchYouTubeVrActivity extends niq {
    public airr b;

    @Override // defpackage.dt, defpackage.abp, defpackage.gb, android.app.Activity
    public final void onCreate(Bundle bundle) {
        emn.D(this);
        super.onCreate(bundle);
        FrameLayout frameLayout = new FrameLayout(this);
        frameLayout.setBackgroundColor(-16777216);
        frameLayout.setSystemUiVisibility(3846);
        setContentView(frameLayout);
        DaydreamApi create = DaydreamApi.create(getApplicationContext());
        if (create != null) {
            ahss.d(this, 2, create, this.b);
            create.close();
        }
    }
}
