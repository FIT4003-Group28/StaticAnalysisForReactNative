package defpackage;
/* compiled from: PG */
/* renamed from: awly  reason: default package */
/* loaded from: classes2.dex */
public final class awly {
    private final awmf a;

    public awly(awmf awmfVar) {
        this.a = awmfVar;
    }

    public final boolean equals(Object obj) {
        return (obj instanceof awly) && this.a.equals(((awly) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode() ^ 1008001;
    }

    public final String toString() {
        String valueOf = String.valueOf(this.a);
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 20);
        sb.append("TextDecoratorModel{");
        sb.append(valueOf);
        sb.append("}");
        return sb.toString();
    }
}
