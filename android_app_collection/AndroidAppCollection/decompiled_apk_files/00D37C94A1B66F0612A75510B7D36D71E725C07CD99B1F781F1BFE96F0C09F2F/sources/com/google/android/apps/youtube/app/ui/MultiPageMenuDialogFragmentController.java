package com.google.android.apps.youtube.app.ui;

import android.content.res.Configuration;
import com.google.android.apps.youtube.app.common.dialog.DialogFragmentController;
/* compiled from: PG */
/* loaded from: classes2.dex */
public class MultiPageMenuDialogFragmentController extends DialogFragmentController implements fqb {
    public MultiPageMenuDialogFragmentController(dt dtVar) {
        super(dtVar, "MultiPageMenuDialogFragmentController");
    }

    @Override // defpackage.fqb
    public final void g(Configuration configuration) {
        dh i = i();
        if (i == null || !i.at()) {
            return;
        }
        i.onConfigurationChanged(configuration);
    }
}
