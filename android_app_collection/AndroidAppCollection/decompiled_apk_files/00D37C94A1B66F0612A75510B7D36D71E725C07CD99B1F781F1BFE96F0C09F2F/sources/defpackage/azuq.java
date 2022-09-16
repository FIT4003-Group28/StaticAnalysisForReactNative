package defpackage;
/* compiled from: PG */
/* renamed from: azuq  reason: default package */
/* loaded from: classes2.dex */
public final class azuq extends azsu implements azsc {
    private final /* synthetic */ int f;
    public static final azuq e = new azuq(4);
    public static final azuq d = new azuq(3);
    public static final azuq c = new azuq(2);
    public static final azuq b = new azuq(1);
    public static final azuq a = new azuq();

    public azuq() {
        super(1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public azuq(int i) {
        super(1);
        this.f = i;
    }

    @Override // defpackage.azsc
    public final /* bridge */ /* synthetic */ Object a(Object obj) {
        int i = this.f;
        if (i == 0) {
            azra azraVar = (azra) obj;
            azraVar.getClass();
            if (!(azraVar instanceof azur)) {
                return null;
            }
            return (azur) azraVar;
        } else if (i == 1) {
            String str = (String) obj;
            str.getClass();
            return str;
        } else if (i != 2) {
            if (i == 3) {
                ((Throwable) obj).getClass();
                return null;
            }
            ((Throwable) obj).getClass();
            return null;
        } else {
            azra azraVar2 = (azra) obj;
            azraVar2.getClass();
            if (!(azraVar2 instanceof azvj)) {
                return null;
            }
            return (azvj) azraVar2;
        }
    }
}
