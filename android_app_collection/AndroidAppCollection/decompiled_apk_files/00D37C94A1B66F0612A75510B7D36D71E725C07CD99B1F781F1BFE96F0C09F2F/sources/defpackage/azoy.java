package defpackage;
/* compiled from: PG */
/* renamed from: azoy  reason: default package */
/* loaded from: classes2.dex */
public abstract class azoy {
    public abstract int a();

    public final boolean c(bame[] bameVarArr) {
        int a = a();
        int length = bameVarArr.length;
        if (length != a) {
            StringBuilder sb = new StringBuilder(52);
            sb.append("parallelism = ");
            sb.append(a);
            sb.append(", subscribers = ");
            sb.append(length);
            IllegalArgumentException illegalArgumentException = new IllegalArgumentException(sb.toString());
            for (bame bameVar : bameVarArr) {
                azoc.f(illegalArgumentException, bameVar);
            }
            return false;
        }
        return true;
    }
}
