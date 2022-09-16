package defpackage;

import android.content.Context;
import android.media.AudioManager;
/* compiled from: PG */
/* renamed from: enz  reason: default package */
/* loaded from: classes3.dex */
public final class enz {
    public final AudioManager a;

    public enz(Context context) {
        Object systemService = context.getSystemService("audio");
        systemService.getClass();
        this.a = (AudioManager) systemService;
    }
}
