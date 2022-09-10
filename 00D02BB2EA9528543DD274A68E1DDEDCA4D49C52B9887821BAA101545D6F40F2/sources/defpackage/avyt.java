package defpackage;

import com.google.android.filament.R;
/* compiled from: PG */
/* renamed from: avyt  reason: default package */
/* loaded from: classes.dex */
final class avyt extends avzc {
    private final btlu a;
    private final dlsw b;
    private final boolean c;
    private final boolean d;

    public avyt(@dzsi btlu btluVar, dlsw dlswVar, boolean z, boolean z2) {
        this.a = btluVar;
        this.b = dlswVar;
        this.c = z;
        this.d = z2;
    }

    @Override // defpackage.avzc
    @dzsi
    public final btlu a() {
        return this.a;
    }

    @Override // defpackage.avzc
    public final dlsw b() {
        return this.b;
    }

    @Override // defpackage.avzc
    public final boolean c() {
        return this.c;
    }

    @Override // defpackage.avzc
    public final boolean d() {
        return this.d;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof avzc) {
            avzc avzcVar = (avzc) obj;
            btlu btluVar = this.a;
            if (btluVar != null ? btluVar.equals(avzcVar.a()) : avzcVar.a() == null) {
                if (this.b.equals(avzcVar.b()) && this.c == avzcVar.c() && this.d == avzcVar.d()) {
                    return true;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        btlu btluVar = this.a;
        int hashCode = ((btluVar == null ? 0 : btluVar.hashCode()) ^ 1000003) * 1000003;
        dlsw dlswVar = this.b;
        int i = dlswVar.bC;
        if (i == 0) {
            i = dsst.a.b(dlswVar).c(dlswVar);
            dlswVar.bC = i;
        }
        int i2 = (hashCode ^ i) * 1000003;
        int i3 = 1237;
        int i4 = (i2 ^ (true != this.c ? 1237 : 1231)) * 1000003;
        if (true == this.d) {
            i3 = 1231;
        }
        return i4 ^ i3;
    }

    public final String toString() {
        String valueOf = String.valueOf(this.a);
        String valueOf2 = String.valueOf(this.b);
        boolean z = this.c;
        boolean z2 = this.d;
        int length = String.valueOf(valueOf).length();
        StringBuilder sb = new StringBuilder(length + R.styleable.AppCompatTheme_switchStyle + String.valueOf(valueOf2).length());
        sb.append("OfflineInstanceContext{account=");
        sb.append(valueOf);
        sb.append(", activeOwner=");
        sb.append(valueOf2);
        sb.append(", isSdCardMounted=");
        sb.append(z);
        sb.append(", shouldUseExternalStorage=");
        sb.append(z2);
        sb.append("}");
        return sb.toString();
    }
}
