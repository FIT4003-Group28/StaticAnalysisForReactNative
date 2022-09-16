package defpackage;

import android.os.Handler;
import android.os.Looper;
/* compiled from: PG */
/* renamed from: ldx  reason: default package */
/* loaded from: classes7.dex */
final class ldx implements lzd {
    public final Handler a = new Handler(Looper.getMainLooper());
    final /* synthetic */ ldz b;

    public ldx(ldz ldzVar) {
        this.b = ldzVar;
    }

    @Override // defpackage.lzd
    public final void a(dcdc<ldm> dcdcVar, lyy lyyVar) {
        bvrj.UI_THREAD.c();
        this.a.removeCallbacksAndMessages(null);
        this.a.post(new ldw(this, dcdcVar, lyyVar));
    }
}
