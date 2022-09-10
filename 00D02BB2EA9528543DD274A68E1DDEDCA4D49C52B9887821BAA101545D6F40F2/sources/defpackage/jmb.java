package defpackage;

import android.widget.PopupWindow;
import java.util.concurrent.atomic.AtomicBoolean;
/* compiled from: PG */
/* renamed from: jmb  reason: default package */
/* loaded from: classes7.dex */
public final class jmb {
    public final jlm a;
    public final jme b;
    private final AtomicBoolean c;

    public jmb(jlm jlmVar, jme jmeVar, AtomicBoolean atomicBoolean) {
        this.a = jlmVar;
        this.b = jmeVar;
        this.c = atomicBoolean;
    }

    public final void a() {
        this.c.set(false);
        PopupWindow popupWindow = this.a.a.b;
        if (popupWindow != null && popupWindow.isShowing()) {
            this.a.a();
        }
        this.b.a();
    }
}
