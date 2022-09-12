package defpackage;
/* compiled from: PG */
/* renamed from: con  reason: default package */
/* loaded from: classes5.dex */
public enum con {
    NONE(0),
    MODAL(1),
    MULTIMOVE_MODAL(2);
    
    private final int d;

    con(int i) {
        this.d = i;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static con a(int i, con conVar) {
        con[] values;
        for (con conVar2 : values()) {
            if (conVar2.d == i) {
                return conVar2;
            }
        }
        return conVar;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int b(con conVar) {
        int ordinal = conVar.ordinal();
        if (ordinal != 0) {
            if (ordinal == 1) {
                return 1;
            }
            if (ordinal == 2) {
                return 2;
            }
            String valueOf = String.valueOf(conVar);
            StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 18);
            sb.append("Unsupported type: ");
            sb.append(valueOf);
            throw new IllegalArgumentException(sb.toString());
        }
        return 0;
    }
}
