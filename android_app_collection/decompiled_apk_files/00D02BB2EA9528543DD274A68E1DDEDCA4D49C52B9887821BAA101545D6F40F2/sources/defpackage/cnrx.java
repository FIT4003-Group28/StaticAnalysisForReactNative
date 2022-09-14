package defpackage;

import android.app.Activity;
import android.content.Intent;
import com.google.android.gms.common.api.internal.LifecycleCallback;
/* compiled from: PG */
/* renamed from: cnrx  reason: default package */
/* loaded from: classes.dex */
public interface cnrx {
    <T extends LifecycleCallback> T a(String str, Class<T> cls);

    void b(String str, LifecycleCallback lifecycleCallback);

    Activity c();

    void startActivityForResult(Intent intent, int i);
}
