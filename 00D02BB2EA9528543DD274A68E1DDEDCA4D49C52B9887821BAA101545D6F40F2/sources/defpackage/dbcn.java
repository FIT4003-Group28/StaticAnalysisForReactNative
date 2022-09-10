package defpackage;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.function.Consumer;
/* compiled from: PG */
/* renamed from: dbcn  reason: default package */
/* loaded from: classes5.dex */
public class dbcn {
    private final ArrayList<dbcm> a;
    private final ArrayList<dbcm> b;
    private boolean c;
    private int d;
    public final List<dbcm> w;

    public dbcn() {
        ArrayList<dbcm> arrayList = new ArrayList<>();
        this.a = arrayList;
        this.w = Collections.unmodifiableList(arrayList);
        this.b = new ArrayList<>();
    }

    public final void H(dbcm dbcmVar) {
        dbix.a();
        if (!this.a.contains(dbcmVar)) {
            return;
        }
        j(dbcmVar);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public boolean h(dbcm dbcmVar, StringBuilder sb) {
        if (dbcmVar == this) {
            sb.append("Cannot add child: Cannot make a node a child of itself.");
            return false;
        }
        return true;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void i(dbcm dbcmVar) {
        dbcn dbcnVar = dbcmVar.g;
        if (dbcnVar != null) {
            dbcnVar.H(dbcmVar);
        }
        this.a.add(dbcmVar);
        dbcmVar.g = this;
        this.c = true;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void j(dbcm dbcmVar) {
        this.a.remove(dbcmVar);
        dbcmVar.g = null;
        this.c = true;
    }

    public void x(Consumer<dbcm> consumer) {
        if (this.c && this.d <= 0) {
            this.b.clear();
            this.b.addAll(this.a);
            this.c = false;
        }
        ArrayList<dbcm> arrayList = this.b;
        this.d++;
        for (int i = 0; i < arrayList.size(); i++) {
            arrayList.get(i).x(consumer);
        }
        int i2 = this.d - 1;
        this.d = i2;
        if (i2 >= 0) {
            return;
        }
        throw new AssertionError("stopIteration was called without calling startIteration.");
    }
}
