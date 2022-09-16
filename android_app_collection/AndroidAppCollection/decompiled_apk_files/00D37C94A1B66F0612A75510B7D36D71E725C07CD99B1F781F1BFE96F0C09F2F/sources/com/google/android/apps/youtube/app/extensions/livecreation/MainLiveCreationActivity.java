package com.google.android.apps.youtube.app.extensions.livecreation;

import android.os.Bundle;
import android.view.ViewStub;
import com.google.android.apps.youtube.app.common.ui.bottomui.BottomUiContainer;
import com.google.android.youtube.R;
/* compiled from: PG */
/* loaded from: classes2.dex */
public class MainLiveCreationActivity extends gsg {
    public fud a;
    public akge b;

    @Override // com.google.android.libraries.youtube.livecreation.ui.LiveCreationActivity
    protected final void g(ViewStub viewStub) {
        viewStub.setLayoutResource(R.layout.bottom_ui_container);
        this.a.d((BottomUiContainer) viewStub.inflate());
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.libraries.youtube.livecreation.ui.LiveCreationActivity, defpackage.dt, defpackage.abp, defpackage.gb, android.app.Activity
    public final void onCreate(Bundle bundle) {
        emn.D(this);
        super.onCreate(bundle);
        this.b.g(findViewById(16908290));
    }
}
