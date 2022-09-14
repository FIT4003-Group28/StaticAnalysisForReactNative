package defpackage;

import android.app.Activity;
import java.io.File;
import java.util.HashSet;
/* compiled from: PG */
/* renamed from: apne  reason: default package */
/* loaded from: classes2.dex */
public final class apne implements apqa {
    public final Activity a;
    @dzsi
    public final File b;
    private final cltz c;
    private final cmkf d;
    @dzsi
    private final cmls e;

    public apne(Activity activity) {
        new HashSet();
        this.a = activity;
        File externalCacheDir = activity.getExternalCacheDir();
        cmml cmmlVar = null;
        File file = externalCacheDir == null ? null : new File(externalCacheDir, "mcache");
        this.b = file;
        cmmlVar = file != null ? apnf.a(file) : cmmlVar;
        this.e = cmmlVar;
        cltz cltzVar = new cltz();
        this.c = cltzVar;
        this.d = new apnd(cmmlVar, new cmkp(activity, new cmlk(new cmkr("gmm"), cltzVar)));
        activity.getApplication().registerActivityLifecycleCallbacks(new apnc(this));
    }

    @Override // defpackage.apqa
    public final cmkf a() {
        return this.d;
    }
}
