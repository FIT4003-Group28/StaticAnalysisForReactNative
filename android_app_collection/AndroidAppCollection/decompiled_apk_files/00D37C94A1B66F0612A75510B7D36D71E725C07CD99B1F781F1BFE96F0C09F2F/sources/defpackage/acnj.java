package defpackage;

import com.google.android.libraries.youtube.livecreation.ui.view.DeveloperPanel;
/* compiled from: PG */
/* renamed from: acnj  reason: default package */
/* loaded from: classes.dex */
public final class acnj implements Runnable {
    final /* synthetic */ DeveloperPanel a;

    public acnj(DeveloperPanel developerPanel) {
        this.a = developerPanel;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.a.postDelayed(this, 1000L);
    }
}
