package defpackage;

import android.os.IBinder;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: cngp  reason: default package */
/* loaded from: classes5.dex */
public final class cngp implements IBinder.DeathRecipient {
    final /* synthetic */ cnht a;

    public cngp(cnht cnhtVar) {
        this.a = cnhtVar;
    }

    @Override // android.os.IBinder.DeathRecipient
    public final void binderDied() {
        cmyz.a(this.a.d);
    }
}
