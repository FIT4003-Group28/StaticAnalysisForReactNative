package defpackage;

import android.content.Context;
import java.lang.ref.WeakReference;
/* compiled from: PG */
/* renamed from: axxl  reason: default package */
/* loaded from: classes3.dex */
public final class axxl {
    private final axxp<?> a;

    public axxl(Object obj, Context context, dxio<akty> dxioVar, dxio<akvz> dxioVar2, btrm btrmVar, alwc alwcVar, dehq dehqVar, akpq akpqVar, akzh akzhVar, alvc alvcVar, ania aniaVar, dbty<Boolean> dbtyVar) {
        axxp<?> axxpVar = new axxp<>(obj, dxioVar, btrmVar, alwcVar, dehqVar, akpqVar, new WeakReference(akzhVar), alvcVar.a(akry.BASE, 256, false), new axxy(new WeakReference(context), dxioVar2, aniaVar, dbtyVar));
        this.a = axxpVar;
        axxpVar.a();
    }

    public final void a(boolean z) {
        if (z) {
            this.a.a();
        } else {
            this.a.b();
        }
    }
}
