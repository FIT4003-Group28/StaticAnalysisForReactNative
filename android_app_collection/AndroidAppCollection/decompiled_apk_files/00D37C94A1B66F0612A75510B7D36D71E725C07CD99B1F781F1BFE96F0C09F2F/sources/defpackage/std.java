package defpackage;

import com.google.android.libraries.elements.interfaces.JSControllerInitializationMode;
/* compiled from: PG */
/* renamed from: std  reason: default package */
/* loaded from: classes4.dex */
public final class std {
    public JSControllerInitializationMode a;
    public Boolean b;
    public Integer c;

    public final void a(boolean z) {
        this.b = Boolean.valueOf(z);
    }

    public final void b(JSControllerInitializationMode jSControllerInitializationMode) {
        if (jSControllerInitializationMode != null) {
            this.a = jSControllerInitializationMode;
            return;
        }
        throw new NullPointerException("Null initializationMode");
    }

    public final void c(int i) {
        this.c = Integer.valueOf(i);
    }
}
