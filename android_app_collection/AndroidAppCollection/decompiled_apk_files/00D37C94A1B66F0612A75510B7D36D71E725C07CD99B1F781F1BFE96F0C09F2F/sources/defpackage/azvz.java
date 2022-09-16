package defpackage;
/* compiled from: PG */
/* renamed from: azvz  reason: default package */
/* loaded from: classes2.dex */
public final class azvz extends azxt implements azvm {
    public final String c(String str) {
        StringBuilder sb = new StringBuilder();
        sb.append("List{");
        sb.append(str);
        sb.append("}[");
        boolean z = true;
        for (azxw azxwVar = (azxw) g(); !azst.c(azxwVar, this); azxwVar = azxwVar.h()) {
            if (azxwVar instanceof azvs) {
                azvs azvsVar = (azvs) azxwVar;
                if (!z) {
                    sb.append(", ");
                }
                sb.append(azvsVar);
                z = false;
            }
        }
        sb.append("]");
        String sb2 = sb.toString();
        sb2.getClass();
        return sb2;
    }

    @Override // defpackage.azvm
    public final azvz su() {
        return this;
    }

    @Override // defpackage.azvm
    public final boolean sv() {
        return true;
    }

    @Override // defpackage.azxw
    public final String toString() {
        return azuy.a ? c("Active") : super.toString();
    }
}
