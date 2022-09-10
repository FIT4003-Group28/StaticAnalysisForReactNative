package defpackage;

import android.os.Build;
/* compiled from: PG */
/* renamed from: aqck  reason: default package */
/* loaded from: classes2.dex */
public final class aqck {
    public final aujb a;
    private final auhq b;
    private final dxio<auhi> c;

    public aqck(auhq auhqVar, dxio<auhi> dxioVar, aujb aujbVar) {
        this.b = auhqVar;
        this.c = dxioVar;
        this.a = aujbVar;
    }

    public static final boolean b(aqcj aqcjVar) {
        return aqcjVar == aqcj.DISABLED_APP || aqcjVar == aqcj.DISABLED_CHANNEL_GROUP || aqcjVar == aqcj.DISABLED_CHANNEL;
    }

    public static final boolean c() {
        return Build.VERSION.SDK_INT >= 26;
    }

    public final aqcj a() {
        if (!this.b.a()) {
            return aqcj.DISABLED_APP;
        }
        if (!this.b.b(this.a)) {
            return aqcj.DISABLED_CHANNEL_GROUP;
        }
        if (!this.b.c(this.a)) {
            return aqcj.DISABLED_CHANNEL;
        }
        if (this.c.a().t(this.a.a) != aufs.ENABLED) {
            return aqcj.DISABLED_IN_APP;
        }
        return aqcj.ENABLED;
    }
}
