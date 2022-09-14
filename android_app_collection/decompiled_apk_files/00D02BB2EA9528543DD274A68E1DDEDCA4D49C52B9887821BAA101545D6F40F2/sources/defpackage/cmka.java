package defpackage;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Map;
/* compiled from: PG */
/* renamed from: cmka  reason: default package */
/* loaded from: classes5.dex */
public abstract class cmka implements cmkg {
    private final boolean a;
    private final ArrayList<cmlo> b = new ArrayList<>(1);
    private int c;
    private cmkj d;

    /* JADX INFO: Access modifiers changed from: protected */
    public cmka(boolean z) {
        this.a = z;
    }

    @Override // defpackage.cmkg
    public final void b(cmlo cmloVar) {
        cmmn.f(cmloVar);
        if (!this.b.contains(cmloVar)) {
            this.b.add(cmloVar);
            this.c++;
        }
    }

    @Override // defpackage.cmkg
    public Map e() {
        return Collections.emptyMap();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final void g(cmkj cmkjVar) {
        this.d = cmkjVar;
        for (int i = 0; i < this.c; i++) {
            this.b.get(i).f(cmkjVar, this.a);
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final void h(int i) {
        cmkj cmkjVar = this.d;
        int i2 = cmny.a;
        for (int i3 = 0; i3 < this.c; i3++) {
            this.b.get(i3).c(cmkjVar, this.a, i);
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final void i() {
        cmkj cmkjVar = this.d;
        int i = cmny.a;
        for (int i2 = 0; i2 < this.c; i2++) {
            this.b.get(i2).d(cmkjVar, this.a);
        }
        this.d = null;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final void j() {
        for (int i = 0; i < this.c; i++) {
            this.b.get(i).e();
        }
    }
}
