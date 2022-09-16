package defpackage;
/* compiled from: PG */
/* renamed from: dgvy  reason: default package */
/* loaded from: classes6.dex */
final class dgvy extends dgtl<Character> {
    @Override // defpackage.dgtl
    public final /* bridge */ /* synthetic */ Character a(dgxe dgxeVar) {
        if (dgxeVar.q() == 9) {
            dgxeVar.j();
            return null;
        }
        String h = dgxeVar.h();
        if (h.length() == 1) {
            return Character.valueOf(h.charAt(0));
        }
        throw new dgtj("Expecting character, got: " + h);
    }

    @Override // defpackage.dgtl
    public final /* bridge */ /* synthetic */ void b(dgxg dgxgVar, Character ch) {
        Character ch2 = ch;
        dgxgVar.j(ch2 == null ? null : String.valueOf(ch2));
    }
}
