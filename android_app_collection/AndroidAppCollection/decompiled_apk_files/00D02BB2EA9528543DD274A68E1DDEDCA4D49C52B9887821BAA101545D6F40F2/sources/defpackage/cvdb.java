package defpackage;

import com.google.android.libraries.messaging.lighter.ui.messagecell.TimestampHeaderView;
/* compiled from: PG */
/* renamed from: cvdb  reason: default package */
/* loaded from: classes5.dex */
public final class cvdb implements Runnable {
    final /* synthetic */ TimestampHeaderView a;

    public cvdb(TimestampHeaderView timestampHeaderView) {
        this.a = timestampHeaderView;
    }

    @Override // java.lang.Runnable
    public final void run() {
        TimestampHeaderView timestampHeaderView = this.a;
        timestampHeaderView.b.setText(cvda.a(timestampHeaderView.c, timestampHeaderView.getContext()));
        this.a.postDelayed(this, TimestampHeaderView.a);
    }
}
