package defpackage;
/* compiled from: PG */
/* renamed from: qdb  reason: default package */
/* loaded from: classes7.dex */
public abstract class qdb {
    public abstract qdc a();

    public abstract void b(String str);

    public final qdc c() {
        qdc a = a();
        if (a != null) {
            return a;
        }
        throw new IllegalStateException();
    }
}
