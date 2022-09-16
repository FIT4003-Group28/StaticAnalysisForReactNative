package defpackage;
/* compiled from: PG */
/* renamed from: chto  reason: default package */
/* loaded from: classes4.dex */
final class chto extends chts {
    private final cqsn a;
    private final cqsn b;
    private final Runnable c;
    private final cjtd d;

    public chto(cqsn cqsnVar, cqsn cqsnVar2, Runnable runnable, cjtd cjtdVar) {
        if (cqsnVar != null) {
            this.a = cqsnVar;
            this.b = cqsnVar2;
            if (runnable != null) {
                this.c = runnable;
                this.d = cjtdVar;
                return;
            }
            throw new NullPointerException("Null actionCallback");
        }
        throw new NullPointerException("Null text");
    }

    @Override // defpackage.chts
    public final cqsn a() {
        return this.a;
    }

    @Override // defpackage.chts
    public final cqsn b() {
        return this.b;
    }

    @Override // defpackage.chts
    public final Runnable c() {
        return this.c;
    }

    @Override // defpackage.chts
    public final cjtd d() {
        return this.d;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof chts) {
            chts chtsVar = (chts) obj;
            if (this.a.equals(chtsVar.a()) && this.b.equals(chtsVar.b()) && this.c.equals(chtsVar.c()) && this.d.equals(chtsVar.d())) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003) ^ this.c.hashCode()) * 1000003) ^ this.d.hashCode();
    }

    public final String toString() {
        String valueOf = String.valueOf(this.a);
        String valueOf2 = String.valueOf(this.b);
        String valueOf3 = String.valueOf(this.c);
        String valueOf4 = String.valueOf(this.d);
        int length = String.valueOf(valueOf).length();
        int length2 = String.valueOf(valueOf2).length();
        StringBuilder sb = new StringBuilder(length + 79 + length2 + String.valueOf(valueOf3).length() + String.valueOf(valueOf4).length());
        sb.append("UserMessage{text=");
        sb.append(valueOf);
        sb.append(", actionText=");
        sb.append(valueOf2);
        sb.append(", actionCallback=");
        sb.append(valueOf3);
        sb.append(", actionUe3LoggingCommonParams=");
        sb.append(valueOf4);
        sb.append("}");
        return sb.toString();
    }
}
