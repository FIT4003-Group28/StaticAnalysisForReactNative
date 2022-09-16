package defpackage;

import android.media.AudioDeviceCallback;
import android.os.Build;
/* compiled from: PG */
/* renamed from: aheq  reason: default package */
/* loaded from: classes.dex */
public final class aheq {
    public final adzt a;
    public final aijf b;
    public final AudioDeviceCallback c;

    public aheq(adzt adztVar, aijf aijfVar) {
        this.a = adztVar;
        this.b = aijfVar;
        this.c = Build.VERSION.SDK_INT >= 23 ? new ahep(this) : null;
    }
}
