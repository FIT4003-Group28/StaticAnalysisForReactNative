package defpackage;
/* compiled from: PG */
/* renamed from: cuew  reason: default package */
/* loaded from: classes5.dex */
final class cuew extends cuil {
    private final dbsg<Long> a;
    private final dbsg<String> b;
    private final dbsg<String> c;
    private final dbsg<Long> d;
    private final dbsg<Long> e;
    private final dbsg<String> f;
    private final dbsg<cuij> g;

    public cuew(dbsg<Long> dbsgVar, dbsg<String> dbsgVar2, dbsg<String> dbsgVar3, dbsg<Long> dbsgVar4, dbsg<Long> dbsgVar5, dbsg<String> dbsgVar6, dbsg<cuij> dbsgVar7) {
        this.a = dbsgVar;
        this.b = dbsgVar2;
        this.c = dbsgVar3;
        this.d = dbsgVar4;
        this.e = dbsgVar5;
        this.f = dbsgVar6;
        this.g = dbsgVar7;
    }

    @Override // defpackage.cuil
    public final dbsg<Long> a() {
        return this.a;
    }

    @Override // defpackage.cuil
    public final dbsg<String> b() {
        return this.b;
    }

    @Override // defpackage.cuil
    public final dbsg<String> c() {
        return this.c;
    }

    @Override // defpackage.cuil
    public final dbsg<Long> d() {
        return this.d;
    }

    @Override // defpackage.cuil
    public final dbsg<Long> e() {
        return this.e;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof cuil) {
            cuil cuilVar = (cuil) obj;
            if (this.a.equals(cuilVar.a()) && this.b.equals(cuilVar.b()) && this.c.equals(cuilVar.c()) && this.d.equals(cuilVar.d()) && this.e.equals(cuilVar.e()) && this.f.equals(cuilVar.f()) && this.g.equals(cuilVar.g())) {
                return true;
            }
        }
        return false;
    }

    @Override // defpackage.cuil
    public final dbsg<String> f() {
        return this.f;
    }

    @Override // defpackage.cuil
    public final dbsg<cuij> g() {
        return this.g;
    }

    public final int hashCode() {
        return ((((((((((((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003) ^ this.c.hashCode()) * 1000003) ^ this.d.hashCode()) * 1000003) ^ this.e.hashCode()) * 1000003) ^ this.f.hashCode()) * 1000003) ^ this.g.hashCode();
    }

    public final String toString() {
        String valueOf = String.valueOf(this.a);
        String valueOf2 = String.valueOf(this.b);
        String valueOf3 = String.valueOf(this.c);
        String valueOf4 = String.valueOf(this.d);
        String valueOf5 = String.valueOf(this.e);
        String valueOf6 = String.valueOf(this.f);
        String valueOf7 = String.valueOf(this.g);
        int length = String.valueOf(valueOf).length();
        int length2 = String.valueOf(valueOf2).length();
        int length3 = String.valueOf(valueOf3).length();
        int length4 = String.valueOf(valueOf4).length();
        int length5 = String.valueOf(valueOf5).length();
        StringBuilder sb = new StringBuilder(length + 176 + length2 + length3 + length4 + length5 + String.valueOf(valueOf6).length() + String.valueOf(valueOf7).length());
        sb.append("VisualElementDetail{entryPointId=");
        sb.append(valueOf);
        sb.append(", entryPointEventId=");
        sb.append(valueOf2);
        sb.append(", correlationId=");
        sb.append(valueOf3);
        sb.append(", actionTriggeredLogId=");
        sb.append(valueOf4);
        sb.append(", elapsedTimeFromPriorEventMillis=");
        sb.append(valueOf5);
        sb.append(", visualElementId=");
        sb.append(valueOf6);
        sb.append(", lighterVisualElementMetadata=");
        sb.append(valueOf7);
        sb.append("}");
        return sb.toString();
    }
}
