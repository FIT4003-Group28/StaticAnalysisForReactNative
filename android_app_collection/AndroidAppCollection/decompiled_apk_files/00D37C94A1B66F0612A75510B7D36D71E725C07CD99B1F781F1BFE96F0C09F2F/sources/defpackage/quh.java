package defpackage;

import android.os.Handler;
/* compiled from: PG */
/* renamed from: quh  reason: default package */
/* loaded from: classes4.dex */
final class quh implements qtr {
    final /* synthetic */ quq a;

    public quh(quq quqVar) {
        this.a = quqVar;
    }

    @Override // defpackage.qtr
    public final void a(boolean z) {
        Handler handler = this.a.o;
        handler.sendMessage(handler.obtainMessage(1, Boolean.valueOf(z)));
    }
}
