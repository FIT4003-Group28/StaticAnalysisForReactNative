package defpackage;
/* compiled from: PG */
/* renamed from: cqgt  reason: default package */
/* loaded from: classes.dex */
final class cqgt extends cqgh {
    private final CharSequence a;
    private final Integer b;
    private final Integer c;

    public cqgt(@dzsi CharSequence charSequence, @dzsi Integer num, @dzsi Integer num2) {
        this.a = charSequence;
        this.b = num;
        this.c = num2;
    }

    @Override // defpackage.cqgh
    @dzsi
    public final CharSequence a() {
        return this.a;
    }

    @Override // defpackage.cqgh
    @dzsi
    public final Integer b() {
        return this.b;
    }

    @Override // defpackage.cqgh
    @dzsi
    public final Integer c() {
        return this.c;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof cqgh) {
            cqgh cqghVar = (cqgh) obj;
            CharSequence charSequence = this.a;
            if (charSequence != null ? charSequence.equals(cqghVar.a()) : cqghVar.a() == null) {
                Integer num = this.b;
                if (num != null ? num.equals(cqghVar.b()) : cqghVar.b() == null) {
                    Integer num2 = this.c;
                    if (num2 != null ? num2.equals(cqghVar.c()) : cqghVar.c() == null) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        CharSequence charSequence = this.a;
        int i = 0;
        int hashCode = ((charSequence == null ? 0 : charSequence.hashCode()) ^ 1000003) * 1000003;
        Integer num = this.b;
        int hashCode2 = (hashCode ^ (num == null ? 0 : num.hashCode())) * 1000003;
        Integer num2 = this.c;
        if (num2 != null) {
            i = num2.hashCode();
        }
        return hashCode2 ^ i;
    }

    public final String toString() {
        String valueOf = String.valueOf(this.a);
        String valueOf2 = String.valueOf(this.b);
        String valueOf3 = String.valueOf(this.c);
        int length = String.valueOf(valueOf).length();
        StringBuilder sb = new StringBuilder(length + 37 + String.valueOf(valueOf2).length() + String.valueOf(valueOf3).length());
        sb.append("TextAndSelection{text=");
        sb.append(valueOf);
        sb.append(", start=");
        sb.append(valueOf2);
        sb.append(", end=");
        sb.append(valueOf3);
        sb.append("}");
        return sb.toString();
    }
}
