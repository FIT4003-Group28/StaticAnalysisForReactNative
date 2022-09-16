package defpackage;

import android.view.View;
/* compiled from: PG */
/* renamed from: umq  reason: default package */
/* loaded from: classes4.dex */
public final class umq {
    public final uor a;
    public final View.OnClickListener b;
    public final zgd c;

    public umq() {
    }

    public umq(zgd zgdVar, uor uorVar, View.OnClickListener onClickListener, byte[] bArr, byte[] bArr2, byte[] bArr3) {
        this.c = zgdVar;
        this.a = uorVar;
        this.b = onClickListener;
    }

    public final boolean equals(Object obj) {
        uor uorVar;
        if (obj == this) {
            return true;
        }
        if (obj instanceof umq) {
            umq umqVar = (umq) obj;
            if (this.c.equals(umqVar.c) && ((uorVar = this.a) != null ? uorVar.equals(umqVar.a) : umqVar.a == null) && this.b.equals(umqVar.b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int hashCode = (this.c.hashCode() ^ 1000003) * 1000003;
        uor uorVar = this.a;
        return ((hashCode ^ (uorVar == null ? 0 : uorVar.hashCode())) * (-721379959)) ^ this.b.hashCode();
    }

    public final String toString() {
        String valueOf = String.valueOf(this.c);
        String valueOf2 = String.valueOf(this.a);
        String valueOf3 = String.valueOf(this.b);
        int length = String.valueOf(valueOf).length();
        int length2 = String.valueOf(valueOf2).length();
        StringBuilder sb = new StringBuilder(length + 84 + length2 + "null".length() + String.valueOf(valueOf3).length());
        sb.append("AccountLayer{accountConverter=");
        sb.append(valueOf);
        sb.append(", avatarRetriever=");
        sb.append(valueOf2);
        sb.append(", avatarImageLoader=");
        sb.append("null");
        sb.append(", onAddAccount=");
        sb.append(valueOf3);
        sb.append("}");
        return sb.toString();
    }
}
