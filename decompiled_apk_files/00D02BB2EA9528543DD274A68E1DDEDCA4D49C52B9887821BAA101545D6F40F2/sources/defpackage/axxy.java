package defpackage;

import android.content.Context;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.Map;
/* compiled from: PG */
/* renamed from: axxy  reason: default package */
/* loaded from: classes3.dex */
final class axxy implements axxm<dmpn> {
    public static final dcep<? extends ddho> f = dcep.G(dtyi.ck, dtyi.cu, dtyi.cK, dtyi.cl, dtyi.cj, dtyi.cJ, dtyi.cf);
    public final WeakReference<Context> a;
    public final dxio<akvz> b;
    public final ania c;
    public final dbty<Boolean> d;
    public final Map<String, aktg> e = new HashMap();

    public axxy(WeakReference<Context> weakReference, dxio<akvz> dxioVar, ania aniaVar, dbty<Boolean> dbtyVar) {
        this.a = weakReference;
        this.b = dxioVar;
        this.c = aniaVar;
        this.d = dbtyVar;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static boolean a() {
        try {
            axwi rG = ((axwh) btsr.a(axwh.class)).rG();
            if (!rG.q()) {
                if (rG.p() == null) {
                    return false;
                }
            }
            return true;
        } catch (Exception unused) {
            return false;
        }
    }
}
