package defpackage;
/* compiled from: PG */
@wsf(a = xag.class)
/* renamed from: wrz  reason: default package */
/* loaded from: classes4.dex */
public final class wrz implements wsg {
    private final /* synthetic */ int a;

    public wrz() {
    }

    public wrz(int i) {
        this.a = i;
    }

    @Override // defpackage.wsg
    public final String a() {
        return this.a != 2 ? "0" : "";
    }

    @Override // defpackage.wsg
    public final String b(xac xacVar) {
        int i = this.a;
        if (i != 0) {
            if (i == 1) {
                return true != ((wyx) xacVar.c(xag.class)).e() ? "0" : "1";
            } else if (i == 2) {
                String str = ((wyx) xacVar.c(xag.class)).b;
                return str != null ? str : "";
            } else if (i == 3) {
                return Integer.toString(((wyx) xacVar.c(xag.class)).a());
            } else {
                return Integer.toString(((wyx) xacVar.c(xag.class)).c());
            }
        }
        return Integer.toString(((wyx) xacVar.c(xag.class)).b());
    }
}
