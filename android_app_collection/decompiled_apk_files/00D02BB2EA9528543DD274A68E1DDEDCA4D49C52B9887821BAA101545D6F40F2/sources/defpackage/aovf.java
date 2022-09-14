package defpackage;

import java.io.Serializable;
import java.lang.Comparable;
import java.util.ArrayList;
import java.util.List;
/* compiled from: PG */
/* renamed from: aovf  reason: default package */
/* loaded from: classes2.dex */
public class aovf<K extends Comparable<? super K>, D extends Serializable> {
    private final List<aove<K, D>> a = new ArrayList();
    private boolean b = false;

    public final void a(angu<K, D> anguVar, angt<K, D> angtVar) {
        if (!this.b) {
            anguVar.c(angtVar);
        }
        this.a.add(aove.c(anguVar, angtVar));
    }

    public final void b(angu<K, D> anguVar, angt<K, D> angtVar) {
        if (!this.b) {
            anguVar.d(angtVar);
        }
        this.a.remove(aove.c(anguVar, angtVar));
    }

    public final void c() {
        if (this.b) {
            return;
        }
        this.b = true;
        for (aove<K, D> aoveVar : this.a) {
            aoveVar.a().d(aoveVar.b());
        }
    }

    public final void d() {
        if (!this.b) {
            return;
        }
        this.b = false;
        for (aove<K, D> aoveVar : this.a) {
            aoveVar.a().c(aoveVar.b());
        }
    }
}
