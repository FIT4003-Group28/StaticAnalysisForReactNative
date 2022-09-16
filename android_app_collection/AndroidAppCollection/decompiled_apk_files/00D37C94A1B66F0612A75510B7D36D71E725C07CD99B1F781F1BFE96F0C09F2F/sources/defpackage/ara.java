package defpackage;

import android.os.IBinder;
import java.util.HashMap;
/* compiled from: PG */
/* renamed from: ara  reason: default package */
/* loaded from: classes2.dex */
final class ara implements IBinder.DeathRecipient {
    public final String a;
    public final int b;
    public final int c;
    public final HashMap d = new HashMap();
    final /* synthetic */ arx e;
    public final arv f;
    public ynv g;

    public ara(arx arxVar, String str, int i, int i2, arv arvVar) {
        this.e = arxVar;
        this.a = str;
        this.b = i;
        this.c = i2;
        new ary(str, i, i2);
        this.f = arvVar;
    }

    @Override // android.os.IBinder.DeathRecipient
    public final void binderDied() {
        this.e.d.post(new aqz(this));
    }
}
