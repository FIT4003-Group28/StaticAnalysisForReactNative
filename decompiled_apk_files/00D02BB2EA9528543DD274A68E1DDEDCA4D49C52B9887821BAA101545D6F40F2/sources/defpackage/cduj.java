package defpackage;
/* compiled from: PG */
/* renamed from: cduj  reason: default package */
/* loaded from: classes4.dex */
final class cduj extends cdul {
    private final cdwx a;

    public cduj(cdwx cdwxVar) {
        this.a = cdwxVar;
    }

    @Override // defpackage.cdul, defpackage.cdxd
    public final cdwx a() {
        return this.a;
    }

    @Override // defpackage.cdxd
    public final cdxc b() {
        return cdxc.BUTTON;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof cdxd) {
            cdxd cdxdVar = (cdxd) obj;
            if (cdxc.BUTTON == cdxdVar.b() && this.a.equals(cdxdVar.a())) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        String valueOf = String.valueOf(this.a);
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 13);
        sb.append("Item{button=");
        sb.append(valueOf);
        sb.append("}");
        return sb.toString();
    }
}
