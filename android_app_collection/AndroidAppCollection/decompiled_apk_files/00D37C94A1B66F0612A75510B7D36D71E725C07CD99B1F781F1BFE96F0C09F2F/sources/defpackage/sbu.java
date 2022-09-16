package defpackage;

import android.os.Build;
/* compiled from: PG */
/* renamed from: sbu  reason: default package */
/* loaded from: classes4.dex */
public enum sbu {
    CLIP_PATH(17),
    CLIP_RECT(17),
    PATH_EFFECT(1000);
    
    private final int e;

    sbu(int i) {
        this.e = i;
    }

    public final boolean a() {
        return Build.VERSION.SDK_INT >= this.e;
    }
}
