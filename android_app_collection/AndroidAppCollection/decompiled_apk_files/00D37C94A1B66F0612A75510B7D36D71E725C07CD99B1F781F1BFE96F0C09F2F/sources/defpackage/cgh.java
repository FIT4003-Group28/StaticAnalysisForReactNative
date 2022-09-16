package defpackage;
/* compiled from: PG */
/* renamed from: cgh  reason: default package */
/* loaded from: classes2.dex */
public final class cgh implements Cloneable {
    public cuh a = cue.b;

    public static cgh b(int i) {
        cgh cghVar = new cgh();
        cghVar.c(new cui(i));
        return cghVar;
    }

    /* renamed from: a */
    public final cgh clone() {
        try {
            return (cgh) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new RuntimeException(e);
        }
    }

    public final void c(cuh cuhVar) {
        hy.N(cuhVar);
        this.a = cuhVar;
    }
}
