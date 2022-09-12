package defpackage;
/* compiled from: PG */
/* renamed from: csny  reason: default package */
/* loaded from: classes5.dex */
public abstract class csny<V> {
    public abstract csoa<V> a();

    public abstract void b(long j);

    public final csoa<V> c() {
        csoa<V> a = a();
        if (a.c() == 2) {
            if (!a.a().a()) {
                throw new IllegalStateException("If state is FOUND, must have a value set");
            }
        } else if (a.a().a()) {
            String a2 = csnz.a(a.c());
            String valueOf = String.valueOf(a.a().b());
            StringBuilder sb = new StringBuilder(a2.length() + 50 + String.valueOf(valueOf).length());
            sb.append("If state is ");
            sb.append(a2);
            sb.append(", must not have a value set (but is ");
            sb.append(valueOf);
            sb.append(").");
            throw new IllegalStateException(sb.toString());
        }
        return a;
    }
}
