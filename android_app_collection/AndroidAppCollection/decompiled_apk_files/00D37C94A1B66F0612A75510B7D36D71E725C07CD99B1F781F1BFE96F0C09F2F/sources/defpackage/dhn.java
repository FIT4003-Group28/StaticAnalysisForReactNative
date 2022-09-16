package defpackage;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: dhn  reason: default package */
/* loaded from: classes3.dex */
public final class dhn extends ddq {
    final /* synthetic */ dhv a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dhn(dhv dhvVar, ddq ddqVar) {
        super(ddqVar);
        this.a = dhvVar;
    }

    @Override // defpackage.ddq
    public final void a(ddq ddqVar) {
        dhv dhvVar = this.a;
        try {
            dhvVar.k();
        } catch (IndexOutOfBoundsException e) {
            String c = dhv.c(dhvVar);
            String message = e.getMessage();
            StringBuilder sb = new StringBuilder(String.valueOf(c).length() + 169 + String.valueOf(message).length());
            sb.append("Index out of bounds while applying a new section. This indicates a bad diff was sent to the RecyclerBinder. See https://bit.ly/39Oq0Hs for more information. Debug info: ");
            sb.append(c);
            sb.append(message);
            throw new RuntimeException(sb.toString(), e);
        }
    }
}
