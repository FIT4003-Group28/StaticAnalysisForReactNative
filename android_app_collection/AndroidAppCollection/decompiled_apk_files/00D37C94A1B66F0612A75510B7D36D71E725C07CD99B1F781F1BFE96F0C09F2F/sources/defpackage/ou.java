package defpackage;

import android.view.KeyEvent;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: ou  reason: default package */
/* loaded from: classes4.dex */
public final class ou implements ka {
    final /* synthetic */ ov a;

    public ou(ov ovVar) {
        this.a = ovVar;
    }

    @Override // defpackage.ka
    public final boolean superDispatchKeyEvent(KeyEvent keyEvent) {
        return this.a.d(keyEvent);
    }
}
