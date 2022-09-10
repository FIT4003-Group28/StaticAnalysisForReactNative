package defpackage;
/* compiled from: PG */
/* renamed from: biwu  reason: default package */
/* loaded from: classes3.dex */
final class biwu extends biyj {
    private final Boolean b;
    private final mw<cjqm> c;
    private final Boolean d;
    private final boolean e;
    private final Runnable f;
    private final jic g;
    private final Integer h;
    private final CharSequence i;
    private final dcdc<biwf> j;
    private final CharSequence k;
    private final cjtd l;
    private final Boolean m;

    public biwu(Boolean bool, mw<cjqm> mwVar, Boolean bool2, boolean z, Runnable runnable, @dzsi jic jicVar, Integer num, CharSequence charSequence, dcdc<biwf> dcdcVar, CharSequence charSequence2, cjtd cjtdVar, Boolean bool3) {
        this.b = bool;
        this.c = mwVar;
        this.d = bool2;
        this.e = z;
        this.f = runnable;
        this.g = jicVar;
        this.h = num;
        this.i = charSequence;
        this.j = dcdcVar;
        this.k = charSequence2;
        this.l = cjtdVar;
        this.m = bool3;
    }

    @Override // defpackage.biyj, defpackage.biwg
    @dzsi
    public cqtd d() {
        return null;
    }

    public boolean equals(Object obj) {
        jic jicVar;
        if (obj == this) {
            return true;
        }
        if (obj instanceof biyj) {
            biyj biyjVar = (biyj) obj;
            if (this.b.equals(biyjVar.n()) && this.c.equals(biyjVar.o()) && this.d.equals(biyjVar.p()) && this.e == biyjVar.q() && this.f.equals(biyjVar.r()) && biyjVar.d() == null && ((jicVar = this.g) != null ? jicVar.equals(biyjVar.g()) : biyjVar.g() == null) && this.h.equals(biyjVar.i()) && this.i.equals(biyjVar.h()) && dchl.m(this.j, biyjVar.j()) && this.k.equals(biyjVar.k()) && this.l.equals(biyjVar.m()) && this.m.equals(biyjVar.s())) {
                return true;
            }
        }
        return false;
    }

    @Override // defpackage.biyj, defpackage.biwg
    @dzsi
    public jic g() {
        return this.g;
    }

    @Override // defpackage.biyj, defpackage.biwg
    public CharSequence h() {
        return this.i;
    }

    public int hashCode() {
        int hashCode = (((((((((this.b.hashCode() ^ 1000003) * 1000003) ^ this.c.hashCode()) * 1000003) ^ this.d.hashCode()) * 1000003) ^ (true != this.e ? 1237 : 1231)) * 1000003) ^ this.f.hashCode()) * (-721379959);
        jic jicVar = this.g;
        return ((((((((((((hashCode ^ (jicVar == null ? 0 : jicVar.hashCode())) * 1000003) ^ this.h.hashCode()) * 1000003) ^ this.i.hashCode()) * 1000003) ^ this.j.hashCode()) * 1000003) ^ this.k.hashCode()) * 1000003) ^ this.l.hashCode()) * 1000003) ^ this.m.hashCode();
    }

    @Override // defpackage.biyj, defpackage.biwg
    public Integer i() {
        return this.h;
    }

    @Override // defpackage.biyj, defpackage.biwg
    public dcdc<biwf> j() {
        return this.j;
    }

    @Override // defpackage.biyj, defpackage.biwg
    public CharSequence k() {
        return this.k;
    }

    @Override // defpackage.biyj, defpackage.biwg
    public cjtd m() {
        return this.l;
    }

    @Override // defpackage.biyj
    public final Boolean n() {
        return this.b;
    }

    @Override // defpackage.biyj
    public final mw<cjqm> o() {
        return this.c;
    }

    @Override // defpackage.biyj
    public final Boolean p() {
        return this.d;
    }

    @Override // defpackage.biyj
    public final boolean q() {
        return this.e;
    }

    @Override // defpackage.biyj
    public final Runnable r() {
        return this.f;
    }

    @Override // defpackage.biyj
    public final Boolean s() {
        return this.m;
    }

    public String toString() {
        String valueOf = String.valueOf(this.b);
        String valueOf2 = String.valueOf(this.c);
        String valueOf3 = String.valueOf(this.d);
        boolean z = this.e;
        String valueOf4 = String.valueOf(this.f);
        String valueOf5 = String.valueOf(this.g);
        String valueOf6 = String.valueOf(this.h);
        String valueOf7 = String.valueOf(this.i);
        String valueOf8 = String.valueOf(this.j);
        String valueOf9 = String.valueOf(this.k);
        String valueOf10 = String.valueOf(this.l);
        String valueOf11 = String.valueOf(this.m);
        int length = String.valueOf(valueOf).length();
        int length2 = String.valueOf(valueOf2).length();
        int length3 = String.valueOf(valueOf3).length();
        int length4 = String.valueOf(valueOf4).length();
        int length5 = "null".length();
        int length6 = String.valueOf(valueOf5).length();
        int length7 = String.valueOf(valueOf6).length();
        int length8 = String.valueOf(valueOf7).length();
        int length9 = String.valueOf(valueOf8).length();
        int length10 = String.valueOf(valueOf9).length();
        StringBuilder sb = new StringBuilder(length + 224 + length2 + length3 + length4 + length5 + length6 + length7 + length8 + length9 + length10 + String.valueOf(valueOf10).length() + String.valueOf(valueOf11).length());
        sb.append("SimpleListItemWithIconViewModelImpl{isClickable=");
        sb.append(valueOf);
        sb.append(", onClickAction=");
        sb.append(valueOf2);
        sb.append(", isGone=");
        sb.append(valueOf3);
        sb.append(", isLongClickable=");
        sb.append(z);
        sb.append(", onLongClickAction=");
        sb.append(valueOf4);
        sb.append(", icon=");
        sb.append("null");
        sb.append(", webIcon=");
        sb.append(valueOf5);
        sb.append(", maxLines=");
        sb.append(valueOf6);
        sb.append(", text=");
        sb.append(valueOf7);
        sb.append(", textItems=");
        sb.append(valueOf8);
        sb.append(", contentDescription=");
        sb.append(valueOf9);
        sb.append(", loggingParams=");
        sb.append(valueOf10);
        sb.append(", hasUserSuggestedEdit=");
        sb.append(valueOf11);
        sb.append("}");
        return sb.toString();
    }
}
