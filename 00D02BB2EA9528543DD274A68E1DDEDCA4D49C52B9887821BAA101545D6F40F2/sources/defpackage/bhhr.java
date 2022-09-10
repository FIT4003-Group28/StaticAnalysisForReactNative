package defpackage;

import com.google.android.filament.R;
/* compiled from: PG */
/* renamed from: bhhr  reason: default package */
/* loaded from: classes3.dex */
final class bhhr extends bhhx {
    private final bhhw a;
    private final ilo b;
    private final dwyd c;
    private final int d;

    public bhhr(int i, @dzsi bhhw bhhwVar, @dzsi ilo iloVar, @dzsi dwyd dwydVar) {
        this.d = i;
        this.a = bhhwVar;
        this.b = iloVar;
        this.c = dwydVar;
    }

    @Override // defpackage.bhhx
    @dzsi
    public final bhhw a() {
        return this.a;
    }

    @Override // defpackage.bhhx
    @dzsi
    public final ilo b() {
        return this.b;
    }

    @Override // defpackage.bhhx
    @dzsi
    public final dwyd c() {
        return this.c;
    }

    @Override // defpackage.bhhx
    public final int d() {
        return this.d;
    }

    public final boolean equals(Object obj) {
        bhhw bhhwVar;
        ilo iloVar;
        dwyd dwydVar;
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof bhhx)) {
            return false;
        }
        bhhx bhhxVar = (bhhx) obj;
        int i = this.d;
        int d = bhhxVar.d();
        if (i == 0) {
            throw null;
        }
        return i == d && ((bhhwVar = this.a) != null ? bhhwVar.equals(bhhxVar.a()) : bhhxVar.a() == null) && ((iloVar = this.b) != null ? iloVar.equals(bhhxVar.b()) : bhhxVar.b() == null) && ((dwydVar = this.c) != null ? dwydVar.equals(bhhxVar.c()) : bhhxVar.c() == null);
    }

    public final int hashCode() {
        int i = this.d;
        if (i != 0) {
            int i2 = (i ^ 1000003) * 1000003;
            bhhw bhhwVar = this.a;
            int i3 = 0;
            int hashCode = (i2 ^ (bhhwVar == null ? 0 : bhhwVar.hashCode())) * 1000003;
            ilo iloVar = this.b;
            int hashCode2 = (hashCode ^ (iloVar == null ? 0 : iloVar.hashCode())) * 1000003;
            dwyd dwydVar = this.c;
            if (dwydVar != null) {
                i3 = dwydVar.hashCode();
            }
            return hashCode2 ^ i3;
        }
        throw null;
    }

    public final String toString() {
        int i = this.d;
        String str = i != 1 ? i != 2 ? "null" : "MENU_PHOTOS_UPLOAD" : "UNKNOWN";
        String valueOf = String.valueOf(this.a);
        String valueOf2 = String.valueOf(this.b);
        String valueOf3 = String.valueOf(this.c);
        int length = str.length();
        StringBuilder sb = new StringBuilder(length + R.styleable.AppCompatTheme_textAppearanceListItem + String.valueOf(valueOf).length() + String.valueOf(valueOf2).length() + String.valueOf(valueOf3).length());
        sb.append("RecommendedActionFlowProperties{recommendedAction=");
        sb.append(str);
        sb.append(", introPageProperties=");
        sb.append(valueOf);
        sb.append(", placemark=");
        sb.append(valueOf2);
        sb.append(", photoEntryPoint=");
        sb.append(valueOf3);
        sb.append("}");
        return sb.toString();
    }
}
