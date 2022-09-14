package defpackage;

import android.os.Build;
/* compiled from: PG */
/* renamed from: cpps  reason: default package */
/* loaded from: classes5.dex */
public enum cpps {
    CLIP_PATH(17),
    CLIP_RECT(17),
    PATH_EFFECT(1000);
    
    private final int d;

    cpps(int i) {
        this.d = i;
    }

    public final boolean a() {
        return Build.VERSION.SDK_INT >= this.d;
    }
}
