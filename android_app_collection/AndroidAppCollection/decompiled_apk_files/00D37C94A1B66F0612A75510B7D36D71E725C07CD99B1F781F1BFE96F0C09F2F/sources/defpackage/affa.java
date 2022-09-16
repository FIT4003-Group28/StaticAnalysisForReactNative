package defpackage;
/* compiled from: PG */
/* renamed from: affa  reason: default package */
/* loaded from: classes.dex */
final class affa extends affh {
    private final affi a;
    private final long b;
    private final afte c;
    private final int d;
    private final afnk e;
    private final Object f;

    public affa(affi affiVar, long j, afte afteVar, int i, afnk afnkVar, Object obj) {
        if (affiVar != null) {
            this.a = affiVar;
            this.b = j;
            if (afteVar != null) {
                this.c = afteVar;
                this.d = i;
                if (afnkVar != null) {
                    this.e = afnkVar;
                    this.f = obj;
                    return;
                }
                throw new NullPointerException("Null mediaViewType");
            }
            throw new NullPointerException("Null playerType");
        }
        throw new NullPointerException("Null eventType");
    }

    @Override // defpackage.affh
    public int a() {
        return this.d;
    }

    @Override // defpackage.affh
    public long b() {
        return this.b;
    }

    @Override // defpackage.affh
    public affi c() {
        return this.a;
    }

    @Override // defpackage.affh
    public afnk d() {
        return this.e;
    }

    @Override // defpackage.affh
    public afte e() {
        return this.c;
    }

    public boolean equals(Object obj) {
        Object obj2;
        if (obj == this) {
            return true;
        }
        if (obj instanceof affh) {
            affh affhVar = (affh) obj;
            if (this.a.equals(affhVar.c()) && this.b == affhVar.b() && this.c.equals(affhVar.e()) && this.d == affhVar.a() && this.e.equals(affhVar.d()) && ((obj2 = this.f) != null ? obj2.equals(affhVar.f()) : affhVar.f() == null)) {
                return true;
            }
        }
        return false;
    }

    @Override // defpackage.affh
    public Object f() {
        return this.f;
    }

    public int hashCode() {
        int hashCode = this.a.hashCode();
        long j = this.b;
        int hashCode2 = (((((((((hashCode ^ 1000003) * 1000003) ^ ((int) (j ^ (j >>> 32)))) * 1000003) ^ this.c.hashCode()) * 1000003) ^ this.d) * 1000003) ^ this.e.hashCode()) * 1000003;
        Object obj = this.f;
        return hashCode2 ^ (obj == null ? 0 : obj.hashCode());
    }

    public String toString() {
        String valueOf = String.valueOf(this.a);
        long j = this.b;
        String valueOf2 = String.valueOf(this.c);
        int i = this.d;
        String valueOf3 = String.valueOf(this.e);
        String valueOf4 = String.valueOf(this.f);
        int length = String.valueOf(valueOf).length();
        int length2 = String.valueOf(valueOf2).length();
        StringBuilder sb = new StringBuilder(length + 128 + length2 + String.valueOf(valueOf3).length() + String.valueOf(valueOf4).length());
        sb.append("Event{eventType=");
        sb.append(valueOf);
        sb.append(", elapsedMillis=");
        sb.append(j);
        sb.append(", playerType=");
        sb.append(valueOf2);
        sb.append(", surfaceHashCode=");
        sb.append(i);
        sb.append(", mediaViewType=");
        sb.append(valueOf3);
        sb.append(", additionalInfo=");
        sb.append(valueOf4);
        sb.append("}");
        return sb.toString();
    }
}
