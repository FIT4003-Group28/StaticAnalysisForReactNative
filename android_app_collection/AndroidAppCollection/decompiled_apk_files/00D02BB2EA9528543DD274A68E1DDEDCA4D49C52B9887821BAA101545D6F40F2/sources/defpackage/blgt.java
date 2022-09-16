package defpackage;
/* compiled from: PG */
/* renamed from: blgt  reason: default package */
/* loaded from: classes3.dex */
final class blgt extends blif {
    private final int c;
    private final int d;
    private final int e;
    private final dbsg<Integer> f;
    private final djuu g;
    private final boolean h;
    private final ddho i;
    private final int j;

    public blgt(int i, int i2, int i3, dbsg<Integer> dbsgVar, djuu djuuVar, int i4, boolean z, ddho ddhoVar) {
        this.c = i;
        this.d = i2;
        this.e = i3;
        this.f = dbsgVar;
        if (djuuVar != null) {
            this.g = djuuVar;
            this.j = i4;
            this.h = z;
            this.i = ddhoVar;
            return;
        }
        throw new NullPointerException("Null requestCriterion");
    }

    @Override // defpackage.blif
    public final int a() {
        return this.c;
    }

    @Override // defpackage.blif
    public final int b() {
        return this.d;
    }

    @Override // defpackage.blif
    public final int c() {
        return this.e;
    }

    @Override // defpackage.blif
    public final dbsg<Integer> d() {
        return this.f;
    }

    @Override // defpackage.blif
    public final djuu e() {
        return this.g;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof blif) {
            blif blifVar = (blif) obj;
            if (this.c == blifVar.a() && this.d == blifVar.b() && this.e == blifVar.c() && this.f.equals(blifVar.d()) && this.g.equals(blifVar.e()) && this.j == blifVar.h() && this.h == blifVar.f() && this.i.equals(blifVar.g())) {
                return true;
            }
        }
        return false;
    }

    @Override // defpackage.blif
    public final boolean f() {
        return this.h;
    }

    @Override // defpackage.blif
    public final ddho g() {
        return this.i;
    }

    @Override // defpackage.blif
    public final int h() {
        return this.j;
    }

    public final int hashCode() {
        return ((((((((((((((this.c ^ 1000003) * 1000003) ^ this.d) * 1000003) ^ this.e) * 1000003) ^ 2040732332) * 1000003) ^ this.g.hashCode()) * 1000003) ^ this.j) * 1000003) ^ (true != this.h ? 1237 : 1231)) * 1000003) ^ this.i.hashCode();
    }

    public final String toString() {
        int i = this.c;
        int i2 = this.d;
        int i3 = this.e;
        String valueOf = String.valueOf(this.f);
        String valueOf2 = String.valueOf(this.g);
        String valueOf3 = String.valueOf(Integer.toString(this.j - 1));
        boolean z = this.h;
        String valueOf4 = String.valueOf(this.i);
        int length = String.valueOf(valueOf).length();
        int length2 = String.valueOf(valueOf2).length();
        StringBuilder sb = new StringBuilder(length + 207 + length2 + String.valueOf(valueOf3).length() + String.valueOf(valueOf4).length());
        sb.append("SortCriterion{displayNameResource=");
        sb.append(i);
        sb.append(", chipLabelNameResource=");
        sb.append(i2);
        sb.append(", chipContentDescriptionResource=");
        sb.append(i3);
        sb.append(", iconResource=");
        sb.append(valueOf);
        sb.append(", requestCriterion=");
        sb.append(valueOf2);
        sb.append(", ugcRequestCriterion=");
        sb.append(valueOf3);
        sb.append(", isDefault=");
        sb.append(z);
        sb.append(", veType=");
        sb.append(valueOf4);
        sb.append("}");
        return sb.toString();
    }
}
