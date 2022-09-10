package defpackage;

import android.app.Activity;
/* compiled from: PG */
/* renamed from: apkr  reason: default package */
/* loaded from: classes2.dex */
public class apkr {
    private final Activity a;
    private final ania b;
    private final bzpr c;

    public apkr(Activity activity, ania aniaVar, bzpr bzprVar) {
        this.a = activity;
        this.b = aniaVar;
        this.c = bzprVar;
    }

    public final void a(apkp apkpVar, String str) {
        this.c.b(new apko(apkpVar)).a(str);
    }

    public final boolean b(apkp apkpVar) {
        if (!this.b.a()) {
            a(apkpVar, "timeline");
            return false;
        }
        apkpVar.a(this.a);
        return true;
    }
}
