package defpackage;

import android.graphics.Bitmap;
import android.net.Uri;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.concurrent.Executor;
/* compiled from: PG */
/* renamed from: ajvm  reason: default package */
/* loaded from: classes.dex */
public final class ajvm {
    public final HashMap a = new HashMap();
    public final Executor b;
    private final ajmy c;

    public ajvm(ajmy ajmyVar, Executor executor) {
        this.c = ajmyVar;
        this.b = executor;
    }

    public final void a(ajvg ajvgVar, avhn avhnVar, int i, ajvo ajvoVar) {
        Uri s = akel.s(avhnVar, i);
        WeakReference weakReference = (WeakReference) this.a.get(s);
        if (weakReference == null || weakReference.get() == null) {
            ajvl ajvlVar = new ajvl(this, ajvoVar, ajvgVar);
            if (s == null) {
                zep.b("Tried to load a null bitmap.");
                return;
            } else {
                this.c.l(s, ajvlVar);
                return;
            }
        }
        ajvoVar.d(ajvgVar, (Bitmap) weakReference.get());
    }
}
