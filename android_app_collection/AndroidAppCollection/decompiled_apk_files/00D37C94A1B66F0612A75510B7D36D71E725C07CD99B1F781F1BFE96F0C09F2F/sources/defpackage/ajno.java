package defpackage;

import android.app.ActivityManager;
import android.content.Context;
/* compiled from: PG */
/* renamed from: ajno  reason: default package */
/* loaded from: classes.dex */
public final class ajno {
    public final int a;

    public ajno(int i) {
        this.a = i;
    }

    public ajno(Context context, apfc apfcVar) {
        boolean isLowRamDevice = ((ActivityManager) context.getSystemService("activity")).isLowRamDevice();
        float f = isLowRamDevice ? apfcVar.f : apfcVar.e;
        f = f <= 0.0f ? true != isLowRamDevice ? 4.0f : 2.5f : f;
        cmd cmdVar = new cmd(context);
        cmdVar.g = 0;
        cmdVar.b(0.0f);
        cmdVar.c(f);
        this.a = cmdVar.a().b;
    }
}
