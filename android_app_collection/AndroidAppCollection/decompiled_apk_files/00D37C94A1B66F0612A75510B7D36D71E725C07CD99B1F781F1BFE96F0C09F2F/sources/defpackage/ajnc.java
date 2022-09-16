package defpackage;

import android.widget.ImageView;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArraySet;
/* compiled from: PG */
/* renamed from: ajnc  reason: default package */
/* loaded from: classes.dex */
public final class ajnc implements ajmx {
    private Set a;

    public final synchronized void a(ajmx ajmxVar) {
        if (this.a == null) {
            this.a = new CopyOnWriteArraySet();
        }
        this.a.add(ajmxVar);
    }

    @Override // defpackage.ajmx
    public final synchronized void b(ImageView imageView, ajmu ajmuVar, avhn avhnVar) {
        if (g()) {
            return;
        }
        for (ajmx ajmxVar : this.a) {
            ajmxVar.b(imageView, ajmuVar, avhnVar);
        }
    }

    @Override // defpackage.ajmx
    public final synchronized void c(ImageView imageView, ajmu ajmuVar, avhn avhnVar) {
        if (g()) {
            return;
        }
        for (ajmx ajmxVar : this.a) {
            ajmxVar.c(imageView, ajmuVar, avhnVar);
        }
    }

    @Override // defpackage.ajmx
    public final synchronized void d(ImageView imageView, ajmu ajmuVar, avhn avhnVar) {
        if (g()) {
            return;
        }
        for (ajmx ajmxVar : this.a) {
            ajmxVar.d(imageView, ajmuVar, avhnVar);
        }
    }

    @Override // defpackage.ajmx
    public final synchronized void e(ImageView imageView, ajmu ajmuVar, avhn avhnVar) {
        if (g()) {
            return;
        }
        for (ajmx ajmxVar : this.a) {
            ajmxVar.e(imageView, ajmuVar, avhnVar);
        }
    }

    public final synchronized void f(ajmx ajmxVar) {
        Set set = this.a;
        if (set != null) {
            set.remove(ajmxVar);
        }
    }

    public final synchronized boolean g() {
        boolean z;
        Set set = this.a;
        if (set != null) {
            if (!set.isEmpty()) {
                z = false;
            }
        }
        z = true;
        return z;
    }
}
