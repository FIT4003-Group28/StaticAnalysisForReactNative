package defpackage;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Map;
/* compiled from: PG */
/* renamed from: ass  reason: default package */
/* loaded from: classes2.dex */
public abstract class ass implements asv {
    private final boolean a;
    private final ArrayList b = new ArrayList(1);
    private int c;
    private asy d;

    /* JADX INFO: Access modifiers changed from: protected */
    public ass(boolean z) {
        this.a = z;
    }

    @Override // defpackage.asv
    public /* synthetic */ Map a() {
        return Collections.emptyMap();
    }

    @Override // defpackage.asv
    public final void b(atk atkVar) {
        ptx.a(atkVar);
        if (!this.b.contains(atkVar)) {
            this.b.add(atkVar);
            this.c++;
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final void c(int i) {
        asy asyVar = this.d;
        int i2 = pxi.a;
        for (int i3 = 0; i3 < this.c; i3++) {
            ((atk) this.b.get(i3)).a(this, asyVar, this.a, i);
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final void d() {
        asy asyVar = this.d;
        int i = pxi.a;
        for (int i2 = 0; i2 < this.c; i2++) {
            ((atk) this.b.get(i2)).b(this, asyVar, this.a);
        }
        this.d = null;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final void e(asy asyVar) {
        for (int i = 0; i < this.c; i++) {
            ((atk) this.b.get(i)).c(this, asyVar, this.a);
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final void f(asy asyVar) {
        this.d = asyVar;
        for (int i = 0; i < this.c; i++) {
            ((atk) this.b.get(i)).d(this, asyVar, this.a);
        }
    }
}
