package defpackage;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: cduk  reason: default package */
/* loaded from: classes4.dex */
public final class cduk extends cdul {
    private final cdxe a;

    public cduk(cdxe cdxeVar) {
        this.a = cdxeVar;
    }

    @Override // defpackage.cdxd
    public final cdxc b() {
        return cdxc.MEDIA;
    }

    @Override // defpackage.cdul, defpackage.cdxd
    public final cdxe c() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof cdxd) {
            cdxd cdxdVar = (cdxd) obj;
            if (cdxc.MEDIA == cdxdVar.b() && this.a.equals(cdxdVar.c())) {
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
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 12);
        sb.append("Item{media=");
        sb.append(valueOf);
        sb.append("}");
        return sb.toString();
    }
}
