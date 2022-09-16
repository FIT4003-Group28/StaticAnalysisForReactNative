package defpackage;

import com.google.android.libraries.youtube.player.features.prefetch.WillAutonavInformer;
import java.util.Collections;
import java.util.Set;
import java.util.WeakHashMap;
import java.util.concurrent.Executor;
/* compiled from: PG */
/* renamed from: jxn  reason: default package */
/* loaded from: classes3.dex */
public final class jxn implements ahiu {
    public final yve a;
    public final yve b;
    public boolean c = true;
    private final Executor e;
    private final Set f;
    private final WillAutonavInformer g;

    public jxn(yve yveVar, yve yveVar2, Executor executor, WillAutonavInformer willAutonavInformer) {
        yveVar.getClass();
        this.a = yveVar;
        yveVar2.getClass();
        this.b = yveVar2;
        this.e = executor;
        this.g = willAutonavInformer;
        this.f = Collections.newSetFromMap(new WeakHashMap());
        willAutonavInformer.c.B().X(aypa.a()).at(new ayqb() { // from class: jxm
            @Override // defpackage.ayqb
            public final void a(Object obj) {
                jxn jxnVar = jxn.this;
                Boolean bool = (Boolean) obj;
                if (bool.booleanValue() != jxnVar.c) {
                    jxnVar.c = bool.booleanValue();
                    jxnVar.b();
                }
            }
        }, jww.c);
    }

    public final void b() {
        boolean g = g();
        for (ahit ahitVar : this.f) {
            ahitVar.r(g);
        }
    }

    @Override // defpackage.ahiu
    public final void c(final zdt zdtVar) {
        ylx.k(this.a.a(), anjk.a, jou.i, new ylw() { // from class: jxl
            @Override // defpackage.ylw, defpackage.zdt
            public final void a(Object obj) {
                zdtVar.a(Boolean.valueOf(jxn.this.h((awvc) obj)));
            }
        });
    }

    @Override // defpackage.ahiu
    public final void d(ahit ahitVar) {
        this.f.add(ahitVar);
    }

    public final void e(boolean z) {
        if (z != g()) {
            ylx.k(this.a.b(new ehf(z, 9)), this.e, jou.j, new ylw() { // from class: jxk
                @Override // defpackage.ylw, defpackage.zdt
                public final void a(Object obj) {
                    Void r2 = (Void) obj;
                    jxn.this.b();
                }
            });
        }
    }

    public final void f(ahit ahitVar) {
        this.f.remove(ahitVar);
    }

    @Override // defpackage.ahiu
    public final boolean g() {
        return h((awvc) this.a.c());
    }

    public final boolean h(awvc awvcVar) {
        return (awvcVar.b & 4) != 0 ? awvcVar.e : this.c;
    }
}
