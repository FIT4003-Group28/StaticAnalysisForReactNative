package defpackage;
/* compiled from: PG */
/* renamed from: ayoh  reason: default package */
/* loaded from: classes2.dex */
public final class ayoh {
    public static final ayoh a = new ayoh(null);
    public final Object b;

    private ayoh(Object obj) {
        this.b = obj;
    }

    public static ayoh a(Throwable th) {
        ayrd.b(th, "error is null");
        return new ayoh(azoq.b(th));
    }

    public static ayoh b(Object obj) {
        ayrd.b(obj, "value is null");
        return new ayoh(obj);
    }

    public final boolean equals(Object obj) {
        if (obj instanceof ayoh) {
            return ayrd.a(this.b, ((ayoh) obj).b);
        }
        return false;
    }

    public final int hashCode() {
        Object obj = this.b;
        if (obj != null) {
            return obj.hashCode();
        }
        return 0;
    }

    public final String toString() {
        Object obj = this.b;
        if (obj == null) {
            return "OnCompleteNotification";
        }
        if (azoq.h(obj)) {
            String valueOf = String.valueOf(azoq.d(obj));
            StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 21);
            sb.append("OnErrorNotification[");
            sb.append(valueOf);
            sb.append("]");
            return sb.toString();
        }
        String valueOf2 = String.valueOf(this.b);
        StringBuilder sb2 = new StringBuilder(String.valueOf(valueOf2).length() + 20);
        sb2.append("OnNextNotification[");
        sb2.append(valueOf2);
        sb2.append("]");
        return sb2.toString();
    }
}
