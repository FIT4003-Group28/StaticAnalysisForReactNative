package defpackage;
/* compiled from: PG */
/* renamed from: dad  reason: default package */
/* loaded from: classes3.dex */
public final class dad {
    public final Object a;
    public final Object b;

    public dad(Object obj, Object obj2) {
        this.a = obj;
        this.b = obj2;
    }

    public final String toString() {
        String valueOf = String.valueOf(this.a);
        String valueOf2 = String.valueOf(this.b);
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 24 + String.valueOf(valueOf2).length());
        sb.append("Diff{mPrevious=");
        sb.append(valueOf);
        sb.append(", mNext=");
        sb.append(valueOf2);
        sb.append('}');
        return sb.toString();
    }
}
