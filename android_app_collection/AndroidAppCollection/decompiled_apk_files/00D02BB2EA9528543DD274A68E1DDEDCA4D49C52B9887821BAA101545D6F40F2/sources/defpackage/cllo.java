package defpackage;

import android.media.AudioManager;
import android.os.Handler;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: cllo  reason: default package */
/* loaded from: classes5.dex */
public final class cllo implements AudioManager.OnAudioFocusChangeListener {
    final /* synthetic */ cllq a;
    private final Handler b;

    public cllo(cllq cllqVar, Handler handler) {
        this.a = cllqVar;
        this.b = handler;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final /* synthetic */ void a(int i) {
        cllq cllqVar = this.a;
        if (i == -3 || i == -2) {
            if (i != -2) {
                cllqVar.b(3);
                return;
            }
            cllqVar.c(0);
            cllqVar.b(2);
        } else if (i == -1) {
            cllqVar.c(-1);
            cllqVar.a();
        } else if (i == 1) {
            cllqVar.b(1);
            cllqVar.c(1);
        } else {
            StringBuilder sb = new StringBuilder(38);
            sb.append("Unknown focus change type: ");
            sb.append(i);
            sb.toString();
        }
    }

    @Override // android.media.AudioManager.OnAudioFocusChangeListener
    public final void onAudioFocusChange(final int i) {
        this.b.post(new Runnable(this, i) { // from class: clln
            private final cllo a;
            private final int b;

            {
                this.a = this;
                this.b = i;
            }

            @Override // java.lang.Runnable
            public final void run() {
                this.a.a(this.b);
            }
        });
    }
}
