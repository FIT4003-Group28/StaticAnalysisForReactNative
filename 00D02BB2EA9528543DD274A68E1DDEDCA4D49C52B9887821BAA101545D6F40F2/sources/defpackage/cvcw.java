package defpackage;

import com.google.android.libraries.messaging.lighter.ui.messagecell.MessageCellStatusView;
/* compiled from: PG */
/* renamed from: cvcw  reason: default package */
/* loaded from: classes5.dex */
public final class cvcw implements Runnable {
    final /* synthetic */ MessageCellStatusView a;

    public cvcw(MessageCellStatusView messageCellStatusView) {
        this.a = messageCellStatusView;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.a.b();
        this.a.postDelayed(this, MessageCellStatusView.b);
    }
}
