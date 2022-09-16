package defpackage;

import java.util.Set;
import java.util.concurrent.CopyOnWriteArraySet;
/* compiled from: PG */
/* renamed from: aign  reason: default package */
/* loaded from: classes.dex */
public final class aign {
    public int a;
    public float b;
    public final Set c = new CopyOnWriteArraySet();

    public final void a(aigm aigmVar) {
        this.c.add(aigmVar);
    }

    public final void b(aigm aigmVar) {
        this.c.remove(aigmVar);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void c(float f, boolean z) {
        this.b = f;
        for (aigm aigmVar : this.c) {
            aigmVar.e(f, z);
        }
    }

    public final boolean d() {
        return this.a == 2;
    }

    public final boolean e() {
        return this.a == 0;
    }

    public final boolean f() {
        return this.a == 1;
    }

    public final boolean g() {
        return f() || d();
    }
}
