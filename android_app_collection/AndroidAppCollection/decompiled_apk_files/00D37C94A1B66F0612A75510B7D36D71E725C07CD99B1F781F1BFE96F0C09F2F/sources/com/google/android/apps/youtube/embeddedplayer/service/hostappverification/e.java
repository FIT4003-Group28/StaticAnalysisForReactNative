package com.google.android.apps.youtube.embeddedplayer.service.hostappverification;
/* compiled from: PG */
/* loaded from: classes2.dex */
public final class e extends cff {
    public final int a;

    public e(int i) {
        this.a = i;
    }

    public static e a(cew cewVar) {
        int i = cewVar.a;
        int i2 = 2;
        if (i != 400 && i != 403) {
            i2 = 1;
        }
        return new e(i2);
    }
}
