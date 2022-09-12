package defpackage;
/* compiled from: PG */
/* renamed from: azvj  reason: default package */
/* loaded from: classes3.dex */
final class azvj extends azwu {
    private final String a;
    private final baab b;
    private final String c;
    private final boolean d;
    private final boolean e;
    private final boolean f;
    private final long g;
    private final String h;
    private final String i;

    public azvj(String str, baab baabVar, String str2, boolean z, boolean z2, boolean z3, long j, @dzsi String str3, @dzsi String str4) {
        this.a = str;
        this.b = baabVar;
        this.c = str2;
        this.d = z;
        this.e = z2;
        this.f = z3;
        this.g = j;
        this.h = str3;
        this.i = str4;
    }

    @Override // defpackage.azwu
    public final String a() {
        return this.a;
    }

    @Override // defpackage.azwu
    public final baab b() {
        return this.b;
    }

    @Override // defpackage.azwu
    public final String c() {
        return this.c;
    }

    @Override // defpackage.azwu
    public final boolean d() {
        return this.d;
    }

    @Override // defpackage.azwu
    public final boolean e() {
        return this.e;
    }

    @Override // defpackage.azwu
    public final boolean f() {
        return this.f;
    }

    @Override // defpackage.azwu
    public final long g() {
        return this.g;
    }

    @Override // defpackage.azwu
    @dzsi
    public final String h() {
        return this.h;
    }

    @Override // defpackage.azwu
    @dzsi
    public final String i() {
        return this.i;
    }

    public final String toString() {
        String str = this.a;
        String valueOf = String.valueOf(this.b);
        String str2 = this.c;
        boolean z = this.d;
        boolean z2 = this.e;
        boolean z3 = this.f;
        long j = this.g;
        String str3 = this.h;
        String str4 = this.i;
        int length = String.valueOf(str).length();
        int length2 = String.valueOf(valueOf).length();
        int length3 = String.valueOf(str2).length();
        StringBuilder sb = new StringBuilder(length + 168 + length2 + length3 + String.valueOf(str3).length() + String.valueOf(str4).length());
        sb.append("PlaceListMetadata{id=");
        sb.append(str);
        sb.append(", listType=");
        sb.append(valueOf);
        sb.append(", title=");
        sb.append(str2);
        sb.append(", editable=");
        sb.append(z);
        sb.append(", collaborative=");
        sb.append(z2);
        sb.append(", followed=");
        sb.append(z3);
        sb.append(", lastModifiedTimestamp=");
        sb.append(j);
        sb.append(", authorName=");
        sb.append(str3);
        sb.append(", authorPhotoUrl=");
        sb.append(str4);
        sb.append("}");
        return sb.toString();
    }
}
