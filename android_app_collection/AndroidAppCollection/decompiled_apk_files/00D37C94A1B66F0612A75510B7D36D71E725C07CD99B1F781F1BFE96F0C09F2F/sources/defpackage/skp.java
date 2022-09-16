package defpackage;

import com.google.android.libraries.ar.faceviewer.runtime.ExperienceJni;
import com.google.android.libraries.ar.faceviewer.runtime.NativeCallback;
import com.google.android.libraries.ar.faceviewer.runtime.RuntimeJni;
/* compiled from: PG */
/* renamed from: skp  reason: default package */
/* loaded from: classes4.dex */
public final /* synthetic */ class skp implements sko {
    private final /* synthetic */ int d;
    public static final /* synthetic */ skp c = new skp(2);
    public static final /* synthetic */ skp b = new skp(1);
    public static final /* synthetic */ skp a = new skp();

    private /* synthetic */ skp() {
    }

    private /* synthetic */ skp(int i) {
        this.d = i;
    }

    @Override // defpackage.sko
    public final Object a(long j) {
        int i = this.d;
        if (i != 0) {
            if (i == 1) {
                ((amzw) ((amzw) NativeCallback.a.f()).i("com/google/android/libraries/ar/faceviewer/runtime/NativeCallback", "lambda$create$0", 20, "NativeCallback.java")).q("NativeCallback.setNativeHandle() called when not expected.");
                return null;
            }
            return new RuntimeJni(j);
        }
        return new ExperienceJni(j);
    }
}
