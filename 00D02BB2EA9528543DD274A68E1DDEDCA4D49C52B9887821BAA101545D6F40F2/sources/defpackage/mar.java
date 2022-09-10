package defpackage;

import com.google.android.filament.R;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: mar  reason: default package */
/* loaded from: classes7.dex */
public final class mar extends mca {
    private final aryr a;
    private final mck b;
    private final akra c;
    private final mby d;
    private final mby e;

    public mar(aryr aryrVar, mck mckVar, akra akraVar, mby mbyVar, mby mbyVar2) {
        this.a = aryrVar;
        if (mckVar != null) {
            this.b = mckVar;
            this.c = akraVar;
            this.d = mbyVar;
            this.e = mbyVar2;
            return;
        }
        throw new NullPointerException("Null navigationSearchResultItem");
    }

    @Override // defpackage.mca
    public final aryr a() {
        return this.a;
    }

    @Override // defpackage.mca
    public final mck b() {
        return this.b;
    }

    @Override // defpackage.mca
    public final akra c() {
        return this.c;
    }

    @Override // defpackage.mca
    public final mby d() {
        return this.d;
    }

    @Override // defpackage.mca
    public final mby e() {
        return this.e;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof mca) {
            mca mcaVar = (mca) obj;
            if (this.a.equals(mcaVar.a()) && this.b.equals(mcaVar.b()) && this.c.equals(mcaVar.c()) && this.d.equals(mcaVar.d()) && this.e.equals(mcaVar.e())) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((((((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003) ^ this.c.hashCode()) * 1000003) ^ this.d.hashCode()) * 1000003) ^ this.e.hashCode();
    }

    public final String toString() {
        String valueOf = String.valueOf(this.a);
        String valueOf2 = String.valueOf(this.b);
        String valueOf3 = String.valueOf(this.c);
        String valueOf4 = String.valueOf(this.d);
        String valueOf5 = String.valueOf(this.e);
        int length = String.valueOf(valueOf).length();
        int length2 = String.valueOf(valueOf2).length();
        int length3 = String.valueOf(valueOf3).length();
        int length4 = String.valueOf(valueOf4).length();
        StringBuilder sb = new StringBuilder(length + R.styleable.AppCompatTheme_textColorSearchUrl + length2 + length3 + length4 + String.valueOf(valueOf5).length());
        sb.append("SearchResult{navigationSearchResult=");
        sb.append(valueOf);
        sb.append(", navigationSearchResultItem=");
        sb.append(valueOf2);
        sb.append(", resultLocation=");
        sb.append(valueOf3);
        sb.append(", dayCallout=");
        sb.append(valueOf4);
        sb.append(", nightCallout=");
        sb.append(valueOf5);
        sb.append("}");
        return sb.toString();
    }
}
