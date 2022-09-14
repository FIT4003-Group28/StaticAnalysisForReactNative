package defpackage;

import com.google.android.apps.gmm.settings.navigation.NavigationPlayTestSoundPreference;
/* compiled from: PG */
/* renamed from: btef  reason: default package */
/* loaded from: classes4.dex */
final class btef implements cree {
    final /* synthetic */ NavigationPlayTestSoundPreference a;

    public btef(NavigationPlayTestSoundPreference navigationPlayTestSoundPreference) {
        this.a = navigationPlayTestSoundPreference;
    }

    @Override // defpackage.cree
    public final void a(cred credVar) {
        if (credVar == cred.CANCELLED || credVar == cred.NEVER_PLAYED) {
            return;
        }
        NavigationPlayTestSoundPreference navigationPlayTestSoundPreference = this.a;
        navigationPlayTestSoundPreference.a.setVisibility(4);
        navigationPlayTestSoundPreference.b.stop();
        navigationPlayTestSoundPreference.c = false;
    }

    @Override // defpackage.cree
    public final void b(long j) {
        this.a.m();
    }
}
