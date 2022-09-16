package defpackage;

import android.view.View;
import java.util.HashSet;
import java.util.Set;
/* compiled from: PG */
/* renamed from: khf  reason: default package */
/* loaded from: classes3.dex */
public final class khf {
    private final Set a = new HashSet();
    private final azqb b;
    private boolean c;

    public khf(azqb azqbVar) {
        this.b = azqbVar;
    }

    public final void a(khe kheVar) {
        if (this.c) {
            kheVar.a((View) this.b.get());
        } else {
            this.a.add(kheVar);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void b() {
        if (this.c) {
            return;
        }
        Object obj = this.b.get();
        this.c = true;
        for (khe kheVar : this.a) {
            kheVar.a((View) obj);
        }
        this.a.clear();
    }
}
