package defpackage;
/* compiled from: PG */
/* renamed from: cury  reason: default package */
/* loaded from: classes5.dex */
public final class cury {
    public static boolean a(cuqq cuqqVar, cuuc cuucVar) {
        if (cuqqVar.f() != cuqp.RICH_CARD_BUTTONS) {
            return true;
        }
        dcdc<cuqa> a = cuqqVar.a().e().a();
        int size = a.size();
        for (int i = 0; i < size; i++) {
            cuqa cuqaVar = a.get(i);
            if (cuqaVar.c().f() == ctzd.CUSTOM_ACTION && cuucVar.c(cuqaVar.c()) == 2) {
                return false;
            }
        }
        return true;
    }
}
