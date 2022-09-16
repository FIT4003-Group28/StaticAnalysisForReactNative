package defpackage;

import android.content.Context;
import java.io.File;
/* compiled from: PG */
/* renamed from: akvr  reason: default package */
/* loaded from: classes.dex */
public final class akvr {
    public final File a;
    public boolean b = false;

    public akvr(Context context) {
        this.a = new File(context.getCacheDir(), "anr_detection.journal");
    }
}
