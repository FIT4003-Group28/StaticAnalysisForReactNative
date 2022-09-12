package defpackage;

import java.util.LinkedList;
import java.util.List;
/* compiled from: PG */
/* renamed from: alip  reason: default package */
/* loaded from: classes.dex */
public abstract class alip {
    protected final aliy a;
    public boolean b;
    protected final float c;
    protected final float d;

    public alip(aliy aliyVar, float f, float f2) {
        dbsk.s(aliyVar);
        this.a = aliyVar;
        this.c = f;
        this.d = f2;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public static float h(float f, float f2) {
        if (Float.isNaN(f) || Float.isNaN(f2)) {
            return 0.0f;
        }
        float f3 = ((f2 - f) + 6.2831855f) % 6.2831855f;
        return ((double) f3) > 3.141592653589793d ? f3 - 6.2831855f : f3;
    }

    public boolean a() {
        return false;
    }

    public boolean b() {
        return false;
    }

    public boolean c() {
        return false;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public abstract boolean d(aljd aljdVar);

    public final void e(aljd aljdVar) {
        if (!this.b) {
            String valueOf = String.valueOf(getClass().getName());
            throw new IllegalStateException(valueOf.length() != 0 ? "Gesture already inactive: ".concat(valueOf) : new String("Gesture already inactive: "));
        }
        this.b = false;
        f(aljdVar);
    }

    protected abstract void f(aljd aljdVar);

    /* JADX INFO: Access modifiers changed from: protected */
    public abstract boolean g(aljd aljdVar);

    /* JADX INFO: Access modifiers changed from: protected */
    /* JADX WARN: Incorrect return type in method signature: (JLjava/util/LinkedList<Laliv;>;Ljava/util/List<Lalip;>;)Ljava/lang/Object; */
    public abstract int i(long j, LinkedList linkedList, List list);
}
