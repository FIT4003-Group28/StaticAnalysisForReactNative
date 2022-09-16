package defpackage;

import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.atomic.AtomicReference;
/* compiled from: PG */
/* renamed from: ssl  reason: default package */
/* loaded from: classes4.dex */
public final class ssl {
    public final axnm b;
    public final ayor c;
    public final ayor d;
    public final Map a = new HashMap();
    public final Object e = new Object();

    public ssl(axnm axnmVar, ayor ayorVar, ayor ayorVar2) {
        this.b = axnmVar;
        this.c = ayorVar;
        this.d = ayorVar2;
    }

    public final void a(String str) {
        aypg aypgVar;
        synchronized (this.e) {
            ssk sskVar = (ssk) this.a.get(str);
            if (sskVar != null && (aypgVar = sskVar.b) != null) {
                ayqi.c((AtomicReference) aypgVar);
                sskVar.b = null;
            }
        }
    }
}
