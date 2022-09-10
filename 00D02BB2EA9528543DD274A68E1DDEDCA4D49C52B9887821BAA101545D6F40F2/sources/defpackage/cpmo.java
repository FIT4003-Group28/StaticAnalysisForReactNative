package defpackage;

import com.google.android.filament.R;
/* compiled from: PG */
/* renamed from: cpmo  reason: default package */
/* loaded from: classes5.dex */
final class cpmo extends cpmm {
    private final cpmy a;
    private final cpnj b;
    private final cpne c;
    private final cpnn d;

    public cpmo(@dzsi cpmy cpmyVar, @dzsi cpnj cpnjVar, @dzsi cpne cpneVar, @dzsi cpnn cpnnVar) {
        this.a = cpmyVar;
        this.b = cpnjVar;
        this.c = cpneVar;
        this.d = cpnnVar;
    }

    @Override // defpackage.cpmm
    @dzsi
    public final cpmy a() {
        return this.a;
    }

    @Override // defpackage.cpmm
    @dzsi
    public final cpnj b() {
        return this.b;
    }

    @Override // defpackage.cpmm
    @dzsi
    public final cpne c() {
        return this.c;
    }

    @Override // defpackage.cpmm
    @dzsi
    public final cpnn d() {
        return this.d;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof cpmm) {
            cpmm cpmmVar = (cpmm) obj;
            cpmy cpmyVar = this.a;
            if (cpmyVar != null ? cpmyVar.equals(cpmmVar.a()) : cpmmVar.a() == null) {
                cpnj cpnjVar = this.b;
                if (cpnjVar != null ? cpnjVar.equals(cpmmVar.b()) : cpmmVar.b() == null) {
                    cpne cpneVar = this.c;
                    if (cpneVar != null ? cpneVar.equals(cpmmVar.c()) : cpmmVar.c() == null) {
                        cpnn cpnnVar = this.d;
                        if (cpnnVar != null ? cpnnVar.equals(cpmmVar.d()) : cpmmVar.d() == null) {
                            return true;
                        }
                    }
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        cpmy cpmyVar = this.a;
        int i = 0;
        int hashCode = ((cpmyVar == null ? 0 : cpmyVar.hashCode()) ^ 1000003) * 1000003;
        cpnj cpnjVar = this.b;
        int hashCode2 = (hashCode ^ (cpnjVar == null ? 0 : cpnjVar.hashCode())) * 1000003;
        cpne cpneVar = this.c;
        int hashCode3 = (hashCode2 ^ (cpneVar == null ? 0 : cpneVar.hashCode())) * 1000003;
        cpnn cpnnVar = this.d;
        if (cpnnVar != null) {
            i = cpnnVar.hashCode();
        }
        return hashCode3 ^ i;
    }

    public final String toString() {
        String valueOf = String.valueOf(this.a);
        String valueOf2 = String.valueOf(this.b);
        String valueOf3 = String.valueOf(this.c);
        String valueOf4 = String.valueOf(this.d);
        int length = String.valueOf(valueOf).length();
        int length2 = String.valueOf(valueOf2).length();
        int length3 = String.valueOf(valueOf3).length();
        StringBuilder sb = new StringBuilder(length + R.styleable.AppCompatTheme_textAppearanceSearchResultTitle + length2 + length3 + String.valueOf(valueOf4).length());
        sb.append("AddressWidgetListeners{autocompleteListener=");
        sb.append(valueOf);
        sb.append(", inputListener=");
        sb.append(valueOf2);
        sb.append(", addressInputStateListener=");
        sb.append(valueOf3);
        sb.append(", feedbackListener=");
        sb.append(valueOf4);
        sb.append("}");
        return sb.toString();
    }
}
