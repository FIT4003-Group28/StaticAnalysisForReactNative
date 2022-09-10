package defpackage;

import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.Map;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: aro  reason: default package */
/* loaded from: classes2.dex */
public final class aro {
    final arq a;
    final aqx b;
    private final int c;
    private final Map<String, aqx> d;
    private final WeakReference<arm> e;
    private boolean f;

    public aro(arm armVar, int i) {
        HashMap hashMap = new HashMap();
        this.d = hashMap;
        this.f = false;
        this.c = i;
        this.a = armVar.l;
        this.b = armVar.m;
        hashMap.putAll(armVar.p);
        this.e = new WeakReference<>(armVar);
        armVar.h.postDelayed(new Runnable(this) { // from class: arn
            private final aro a;

            {
                this.a = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                this.a.a();
            }
        }, 15000L);
    }

    public final void a() {
        arv.a();
        if (this.f) {
            return;
        }
        this.f = true;
        arm armVar = this.e.get();
        if (armVar != null && armVar.r == this.a) {
            armVar.r = null;
        }
        aqx aqxVar = this.b;
        if (aqxVar != null) {
            aqxVar.i(this.c);
            this.b.c();
        }
        if (this.d.isEmpty()) {
            return;
        }
        for (aqx aqxVar2 : this.d.values()) {
            aqxVar2.i(this.c);
            aqxVar2.c();
        }
        this.d.clear();
    }
}
