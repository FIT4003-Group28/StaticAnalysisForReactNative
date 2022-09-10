package defpackage;
/* compiled from: PG */
/* renamed from: bydh  reason: default package */
/* loaded from: classes4.dex */
final class bydh extends byed {
    private final byeb a;
    private final byef b;
    private final byef c;
    private final byea d;

    public bydh(byeb byebVar, @dzsi byef byefVar, @dzsi byef byefVar2, @dzsi byea byeaVar) {
        this.a = byebVar;
        this.b = byefVar;
        this.c = byefVar2;
        this.d = byeaVar;
    }

    @Override // defpackage.byed
    public final byeb a() {
        return this.a;
    }

    @Override // defpackage.byed
    @dzsi
    public final byef b() {
        return this.b;
    }

    @Override // defpackage.byed
    @dzsi
    public final byef c() {
        return this.c;
    }

    @Override // defpackage.byed
    @dzsi
    public final byea d() {
        return this.d;
    }

    public final String toString() {
        String valueOf = String.valueOf(this.a);
        String valueOf2 = String.valueOf(this.b);
        String valueOf3 = String.valueOf(this.c);
        String valueOf4 = String.valueOf(this.d);
        int length = String.valueOf(valueOf).length();
        int length2 = String.valueOf(valueOf2).length();
        StringBuilder sb = new StringBuilder(length + 80 + length2 + String.valueOf(valueOf3).length() + String.valueOf(valueOf4).length());
        sb.append("OpenStatusMessage{status=");
        sb.append(valueOf);
        sb.append(", currentInterval=");
        sb.append(valueOf2);
        sb.append(", nextInterval=");
        sb.append(valueOf3);
        sb.append(", dayOfWeekToDisplay=");
        sb.append(valueOf4);
        sb.append("}");
        return sb.toString();
    }
}
