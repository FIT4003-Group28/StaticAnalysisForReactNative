package defpackage;

import com.google.android.filament.R;
/* compiled from: PG */
/* renamed from: brak  reason: default package */
/* loaded from: classes4.dex */
final class brak extends braz {
    private final cjqm a;
    private final begh b;
    private final boolean c;

    public brak(cjqm cjqmVar, @dzsi begh beghVar, boolean z) {
        this.a = cjqmVar;
        this.b = beghVar;
        this.c = z;
    }

    @Override // defpackage.braz
    public final cjqm a() {
        return this.a;
    }

    @Override // defpackage.braz
    @dzsi
    public final begh b() {
        return this.b;
    }

    @Override // defpackage.braz
    public final boolean c() {
        return this.c;
    }

    public final boolean equals(Object obj) {
        begh beghVar;
        if (obj == this) {
            return true;
        }
        if (obj instanceof braz) {
            braz brazVar = (braz) obj;
            if (this.a.equals(brazVar.a()) && ((beghVar = this.b) != null ? beghVar.equals(brazVar.b()) : brazVar.b() == null) && this.c == brazVar.c()) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int hashCode = (this.a.hashCode() ^ 1000003) * 1000003;
        begh beghVar = this.b;
        return ((hashCode ^ (beghVar == null ? 0 : beghVar.hashCode())) * 1000003) ^ (true != this.c ? 1237 : 1231);
    }

    public final String toString() {
        String valueOf = String.valueOf(this.a);
        String valueOf2 = String.valueOf(this.b);
        boolean z = this.c;
        int length = String.valueOf(valueOf).length();
        StringBuilder sb = new StringBuilder(length + R.styleable.AppCompatTheme_textAppearanceListItem + String.valueOf(valueOf2).length());
        sb.append("BatchSearchOptions{loggedInteraction=");
        sb.append(valueOf);
        sb.append(", placeSummaryOverrideDisplayParams=");
        sb.append(valueOf2);
        sb.append(", shouldUseStaticHeader=");
        sb.append(z);
        sb.append("}");
        return sb.toString();
    }
}
