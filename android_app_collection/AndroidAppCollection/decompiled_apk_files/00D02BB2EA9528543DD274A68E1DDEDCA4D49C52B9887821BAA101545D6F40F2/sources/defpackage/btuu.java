package defpackage;

import android.content.Context;
import android.content.res.Resources;
import android.os.Build;
/* compiled from: PG */
/* renamed from: btuu  reason: default package */
/* loaded from: classes.dex */
public final class btuu {
    private final Context a;
    private boolean b = false;

    public btuu(Context context) {
        this.a = context;
    }

    public final synchronized void a() {
        if (this.b) {
            return;
        }
        if (Build.VERSION.SDK_INT != 21 || (!Build.MODEL.equals("SM-G900F") && !Build.MODEL.equals("SM-G900M") && !Build.MODEL.equals("SCL23") && !Build.MODEL.equals("SM-G900S") && !Build.MODEL.equals("SM-G900FQ"))) {
            try {
                coyv.a(this.a);
            } catch (Resources.NotFoundException | cnni | cnnj unused) {
            }
        }
        this.b = true;
    }
}
