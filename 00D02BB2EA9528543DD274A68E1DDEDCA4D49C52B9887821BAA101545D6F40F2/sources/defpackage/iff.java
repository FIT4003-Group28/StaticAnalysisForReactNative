package defpackage;
/* compiled from: PG */
/* renamed from: iff  reason: default package */
/* loaded from: classes6.dex */
final class iff extends igs {
    private final String a;
    private final igu b;

    public iff(@dzsi String str, @dzsi igu iguVar) {
        this.a = str;
        this.b = iguVar;
    }

    @Override // defpackage.igs
    @dzsi
    public final jbl a() {
        return null;
    }

    @Override // defpackage.igs, defpackage.igq
    @dzsi
    public String b() {
        return this.a;
    }

    @Override // defpackage.igs, defpackage.igq
    @dzsi
    public String c() {
        return null;
    }

    @Override // defpackage.igs, defpackage.igq
    @dzsi
    public cqtd d() {
        return null;
    }

    @Override // defpackage.igs, defpackage.igq
    @dzsi
    public String e() {
        return null;
    }

    public boolean equals(Object obj) {
        String str;
        igu iguVar;
        if (obj == this) {
            return true;
        }
        if (obj instanceof igs) {
            igs igsVar = (igs) obj;
            if (igsVar.a() == null && ((str = this.a) != null ? str.equals(igsVar.b()) : igsVar.b() == null) && igsVar.c() == null && igsVar.d() == null && igsVar.e() == null && ((iguVar = this.b) != null ? iguVar.equals(igsVar.f()) : igsVar.f() == null)) {
                return true;
            }
        }
        return false;
    }

    @Override // defpackage.igs, defpackage.igq
    @dzsi
    public igu f() {
        return this.b;
    }

    public int hashCode() {
        String str = this.a;
        int i = 0;
        int hashCode = ((str == null ? 0 : str.hashCode()) ^ (-721379959)) * 1525764945;
        igu iguVar = this.b;
        if (iguVar != null) {
            i = iguVar.hashCode();
        }
        return hashCode ^ i;
    }

    public String toString() {
        String str = this.a;
        String valueOf = String.valueOf(this.b);
        int length = "null".length();
        int length2 = String.valueOf(str).length();
        int length3 = "null".length();
        int length4 = "null".length();
        StringBuilder sb = new StringBuilder(length + 131 + length2 + length3 + length4 + "null".length() + String.valueOf(valueOf).length());
        sb.append("ModCarouselHeaderViewModelImpl{viewOnClickListener=");
        sb.append("null");
        sb.append(", title=");
        sb.append(str);
        sb.append(", actionLabel=");
        sb.append((String) null);
        sb.append(", actionIcon=");
        sb.append("null");
        sb.append(", actionContentDescription=");
        sb.append((String) null);
        sb.append(", viewProperties=");
        sb.append(valueOf);
        sb.append("}");
        return sb.toString();
    }
}
