package defpackage;
/* compiled from: PG */
/* renamed from: dxin  reason: default package */
/* loaded from: classes6.dex */
public final class dxin {
    public final dxik a;
    public final dxii b;
    private final String c;
    private final Object d = this;

    public dxin(dxim dximVar) {
        this.a = dximVar.a;
        this.c = dximVar.b;
        this.b = new dxii(dximVar.c);
    }

    public final String toString() {
        String str = this.c;
        String valueOf = String.valueOf(this.a);
        Object obj = this.d;
        if (obj == this) {
            obj = null;
        }
        String valueOf2 = String.valueOf(obj);
        int length = str.length();
        StringBuilder sb = new StringBuilder(length + 28 + String.valueOf(valueOf).length() + String.valueOf(valueOf2).length());
        sb.append("Request{method=");
        sb.append(str);
        sb.append(", url=");
        sb.append(valueOf);
        sb.append(", tag=");
        sb.append(valueOf2);
        sb.append('}');
        return sb.toString();
    }
}
