package defpackage;
/* compiled from: PG */
/* renamed from: dzxt  reason: default package */
/* loaded from: classes6.dex */
public final class dzxt extends dzvy implements dzve<dzwi, String> {
    final /* synthetic */ CharSequence a;

    public dzxt(CharSequence charSequence) {
        this.a = charSequence;
    }

    @Override // defpackage.dzve
    public final /* bridge */ /* synthetic */ String a(dzwi dzwiVar) {
        dzwi dzwiVar2 = dzwiVar;
        dzvx.c(dzwiVar2, "it");
        CharSequence charSequence = this.a;
        dzvx.c(charSequence, "$this$substring");
        dzvx.c(dzwiVar2, "range");
        return charSequence.subSequence(Integer.valueOf(dzwiVar2.a).intValue(), Integer.valueOf(dzwiVar2.b).intValue() + 1).toString();
    }
}
