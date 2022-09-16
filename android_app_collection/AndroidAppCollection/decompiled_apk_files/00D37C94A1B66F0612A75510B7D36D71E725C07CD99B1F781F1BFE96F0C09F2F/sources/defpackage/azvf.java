package defpackage;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: azvf  reason: default package */
/* loaded from: classes2.dex */
public final class azvf implements azvm {
    public final boolean a;

    public azvf(boolean z) {
        this.a = z;
    }

    @Override // defpackage.azvm
    public final azvz su() {
        return null;
    }

    @Override // defpackage.azvm
    public final boolean sv() {
        return this.a;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Empty{");
        sb.append(true != this.a ? "New" : "Active");
        sb.append('}');
        return sb.toString();
    }
}
