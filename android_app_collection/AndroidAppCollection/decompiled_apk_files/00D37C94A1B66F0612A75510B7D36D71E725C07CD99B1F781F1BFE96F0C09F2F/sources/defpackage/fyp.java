package defpackage;

import android.view.View;
import java.lang.ref.WeakReference;
/* compiled from: PG */
/* renamed from: fyp  reason: default package */
/* loaded from: classes3.dex */
public final class fyp {
    public static final fyp a = new fyp(null, ggz.a);
    public final ggt b;
    private final WeakReference c;

    public fyp(fzq fzqVar, ggt ggtVar) {
        this.c = new WeakReference(fzqVar);
        this.b = ggtVar;
    }

    public final View a() {
        fzq fzqVar = (fzq) this.c.get();
        if (fzqVar == null) {
            return null;
        }
        return fzqVar.g();
    }

    public final fzq b() {
        return (fzq) this.c.get();
    }

    public final void c(boolean z) {
        fzq fzqVar = (fzq) this.c.get();
        if (fzqVar == null) {
            return;
        }
        fzqVar.i(z);
    }
}
