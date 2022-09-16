package defpackage;
/* compiled from: PG */
/* renamed from: ckhb  reason: default package */
/* loaded from: classes.dex */
public abstract class ckhb<T> {
    public final String b;
    public final ckgy c;

    /* JADX INFO: Access modifiers changed from: protected */
    public ckhb(String str, ckgy ckgyVar) {
        this.b = str;
        this.c = ckgyVar;
    }

    public abstract T a(ckcs ckcsVar);

    public final String toString() {
        return String.format("%s; FeatureType: %s, Name: %s", getClass().getSimpleName(), this.c, this.b);
    }
}
