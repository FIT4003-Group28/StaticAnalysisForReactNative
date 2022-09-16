package defpackage;

import com.google.android.libraries.youtube.livecreation.ui.LiveCreationActivity;
/* compiled from: PG */
/* renamed from: acgx  reason: default package */
/* loaded from: classes.dex */
final class acgx implements Runnable {
    final String a;
    final /* synthetic */ LiveCreationActivity b;

    public acgx(LiveCreationActivity liveCreationActivity) {
        this.b = liveCreationActivity;
        this.a = liveCreationActivity.F.c;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.b.q.a(this.a, null);
    }
}
