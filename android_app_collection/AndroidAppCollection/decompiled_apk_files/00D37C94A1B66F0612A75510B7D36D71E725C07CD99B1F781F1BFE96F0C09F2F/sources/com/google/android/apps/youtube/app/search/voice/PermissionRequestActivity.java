package com.google.android.apps.youtube.app.search.voice;

import android.os.Bundle;
import com.google.android.libraries.youtube.rendering.ui.permissions.PermissionDescriptor;
import com.google.android.youtube.R;
/* compiled from: PG */
/* loaded from: classes2.dex */
public class PermissionRequestActivity extends lbz implements akdz {
    private static final PermissionDescriptor[] c = {new PermissionDescriptor(2, actj.VOICE_SEARCH_APPROVE_MICROPHONE_BUTTON, actj.VOICE_SEARCH_DENY_MICROPHONE_BUTTON)};
    public akdy b;

    @Override // defpackage.akdz
    public final void aI() {
        setResult(0);
        finish();
    }

    @Override // defpackage.akdz
    public final void aJ() {
        setResult(-1);
        finish();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.dt, defpackage.abp, defpackage.gb, android.app.Activity
    public final void onCreate(Bundle bundle) {
        akea akeaVar;
        super.onCreate(bundle);
        if (bundle == null) {
            akdy akdyVar = this.b;
            akdyVar.e(c);
            akdyVar.a = acuo.a(69076);
            akdyVar.b = acuo.b(69077);
            akdyVar.c = acuo.b(69078);
            akdyVar.d = acuo.b(69079);
            akdyVar.b(R.string.vs_permission_allow_access_description);
            akdyVar.c(R.string.vs_permission_open_settings_description);
            akdyVar.e = R.string.permission_fragment_title;
            akeaVar = akdyVar.a();
            ex l = getSupportFragmentManager().l();
            l.p(16908290, akeaVar);
            l.a();
        } else {
            akeaVar = (akea) getSupportFragmentManager().e(16908290);
        }
        akeaVar.aF(this);
    }
}
