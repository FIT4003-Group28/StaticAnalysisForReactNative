package defpackage;

import android.os.Build;
/* compiled from: PG */
/* renamed from: gpn  reason: default package */
/* loaded from: classes3.dex */
public final class gpn {
    public final akkm a;
    public final atvo b = atvo.ANDROID_CAMERA;

    public gpn(akkm akkmVar) {
        this.a = akkmVar;
    }

    public final boolean a() {
        aopa createBuilder = atvp.a.createBuilder();
        atvo atvoVar = this.b;
        createBuilder.copyOnWrite();
        atvp atvpVar = (atvp) createBuilder.instance;
        atvpVar.c = atvoVar.m;
        atvpVar.b |= 1;
        return Build.VERSION.SDK_INT < 23 || this.a.c((atvp) createBuilder.mo39build());
    }
}
