package defpackage;

import android.content.ComponentName;
import android.content.Context;
import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
/* compiled from: PG */
/* renamed from: lq  reason: default package */
/* loaded from: classes7.dex */
public final class lq {
    public final lf a;

    public lq(Context context, ComponentName componentName, le leVar, Bundle bundle) {
        if (Build.VERSION.SDK_INT >= 26) {
            this.a = new li(context, componentName, leVar, bundle);
        } else if (Build.VERSION.SDK_INT >= 23) {
            this.a = new lh(context, componentName, leVar, bundle);
        } else {
            this.a = new lg(context, componentName, leVar, bundle);
        }
    }

    public final void a(String str, lp lpVar) {
        if (TextUtils.isEmpty(str)) {
            throw new IllegalArgumentException("parentId is empty");
        }
        this.a.g(str, lpVar);
    }
}
