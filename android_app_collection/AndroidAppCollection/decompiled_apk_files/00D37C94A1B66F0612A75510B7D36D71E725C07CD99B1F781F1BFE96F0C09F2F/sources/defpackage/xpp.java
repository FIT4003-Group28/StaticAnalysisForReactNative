package defpackage;

import android.content.Context;
import com.google.mediapipe.framework.Graph;
/* compiled from: PG */
/* renamed from: xpp  reason: default package */
/* loaded from: classes4.dex */
public final class xpp {
    public final Context a;
    public Graph b;

    static {
        try {
            System.loadLibrary("drishti_jni_native");
        } catch (UnsatisfiedLinkError unused) {
            zep.b("Failed to load drishti_jni_native");
        }
    }

    public xpp(Context context) {
        this.a = context;
    }
}
