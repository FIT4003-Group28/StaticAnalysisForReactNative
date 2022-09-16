package defpackage;
/* compiled from: PG */
/* renamed from: osi  reason: default package */
/* loaded from: classes4.dex */
final class osi extends osk {
    private final Integer a;
    private final Object b;
    private final osl c;

    public osi(Integer num, Object obj, osl oslVar) {
        this.a = num;
        if (obj != null) {
            this.b = obj;
            if (oslVar != null) {
                this.c = oslVar;
                return;
            }
            throw new NullPointerException("Null priority");
        }
        throw new NullPointerException("Null payload");
    }

    @Override // defpackage.osk
    public osl a() {
        return this.c;
    }

    @Override // defpackage.osk
    public Integer b() {
        return this.a;
    }

    @Override // defpackage.osk
    public Object c() {
        return this.b;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof osk) {
            osk oskVar = (osk) obj;
            Integer num = this.a;
            if (num != null ? num.equals(oskVar.b()) : oskVar.b() == null) {
                if (this.b.equals(oskVar.c()) && this.c.equals(oskVar.a())) {
                    return true;
                }
            }
        }
        return false;
    }

    public int hashCode() {
        Integer num = this.a;
        return (((((num == null ? 0 : num.hashCode()) ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003) ^ this.c.hashCode();
    }

    public String toString() {
        String valueOf = String.valueOf(this.a);
        String valueOf2 = String.valueOf(this.b);
        String valueOf3 = String.valueOf(this.c);
        int length = String.valueOf(valueOf).length();
        StringBuilder sb = new StringBuilder(length + 33 + String.valueOf(valueOf2).length() + String.valueOf(valueOf3).length());
        sb.append("Event{code=");
        sb.append(valueOf);
        sb.append(", payload=");
        sb.append(valueOf2);
        sb.append(", priority=");
        sb.append(valueOf3);
        sb.append("}");
        return sb.toString();
    }
}
