package defpackage;

import android.widget.CompoundButton;
/* compiled from: PG */
/* renamed from: bzbm  reason: default package */
/* loaded from: classes4.dex */
final class bzbm extends bzbw {
    private final CompoundButton.OnCheckedChangeListener a;
    private final cjtd b;

    public bzbm(CompoundButton.OnCheckedChangeListener onCheckedChangeListener, cjtd cjtdVar) {
        this.a = onCheckedChangeListener;
        this.b = cjtdVar;
    }

    @Override // defpackage.bzbw, defpackage.bzbv
    public CompoundButton.OnCheckedChangeListener a() {
        return this.a;
    }

    @Override // defpackage.bzbw, defpackage.bzbv
    public cjtd b() {
        return this.b;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof bzbw) {
            bzbw bzbwVar = (bzbw) obj;
            if (this.a.equals(bzbwVar.a()) && this.b.equals(bzbwVar.b())) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        return ((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode();
    }

    public String toString() {
        String valueOf = String.valueOf(this.a);
        String valueOf2 = String.valueOf(this.b);
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 86 + String.valueOf(valueOf2).length());
        sb.append("TransitRecordDialogViewModelImpl{onCheckedChange=");
        sb.append(valueOf);
        sb.append(", getNeverAskAgainCheckBoxUe3Params=");
        sb.append(valueOf2);
        sb.append("}");
        return sb.toString();
    }
}
