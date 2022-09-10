package defpackage;
/* compiled from: PG */
/* renamed from: xev  reason: default package */
/* loaded from: classes7.dex */
final class xev implements btzi<diby, dice> {
    final /* synthetic */ xew a;
    @dzsi
    private final String b;
    @dzsi
    private final dibx c;

    public xev(@dzsi xew xewVar, @dzsi String str, dibx dibxVar) {
        this.a = xewVar;
        this.b = str;
        this.c = dibxVar;
    }

    @Override // defpackage.btzi
    public final void QY(btzr<diby> btzrVar, btzy btzyVar) {
        xew xewVar = this.a;
        xewVar.c.a(xewVar);
    }

    @Override // defpackage.btzi
    public final /* bridge */ /* synthetic */ void QZ(btzr<diby> btzrVar, dice diceVar) {
        c(diceVar);
    }

    public final void c(dice diceVar) {
        int a;
        int a2;
        String str;
        String str2 = diceVar.f;
        diid diidVar = diceVar.b;
        if (diidVar == null) {
            diidVar = diid.e;
        }
        String str3 = diidVar.b;
        if ((diceVar.a & 128) == 0 || (str = this.b) == null) {
            if (this.b != null) {
                int a3 = djwu.a(diceVar.e);
                if (a3 == 0 || a3 != 2 || (a2 = dicb.a(diceVar.g)) == 0 || a2 != 2) {
                    this.a.a.put(this.b, new xfb(diceVar));
                } else {
                    this.a.e(diceVar, this.b);
                    return;
                }
            } else {
                dibx dibxVar = this.c;
                if (dibxVar != null) {
                    if (dibxVar != dibx.SUICA || (a = dicb.a(diceVar.g)) == 0 || a != 2) {
                        this.a.b.put(this.c, new xfb(diceVar));
                    } else {
                        this.a.e(diceVar, null);
                        return;
                    }
                }
            }
            xew xewVar = this.a;
            xewVar.c.a(xewVar);
            return;
        }
        this.a.b(diceVar, str);
    }
}
