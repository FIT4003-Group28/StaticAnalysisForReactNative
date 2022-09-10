package defpackage;

import com.google.android.filament.R;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: vls  reason: default package */
/* loaded from: classes7.dex */
public final class vls extends vnu {
    private final dqvj a;
    private final boolean b;
    private final String c;
    private final vwn d;
    private final boolean e;
    private final bvrt<douj> f;

    public vls(dqvj dqvjVar, boolean z, String str, vwn vwnVar, boolean z2, @dzsi bvrt<douj> bvrtVar) {
        if (dqvjVar != null) {
            this.a = dqvjVar;
            this.b = z;
            if (str != null) {
                this.c = str;
                if (vwnVar != null) {
                    this.d = vwnVar;
                    this.e = z2;
                    this.f = bvrtVar;
                    return;
                }
                throw new NullPointerException("Null tripCardsState");
            }
            throw new NullPointerException("Null formattedDuration");
        }
        throw new NullPointerException("Null travelMode");
    }

    @Override // defpackage.vnu
    public final dqvj a() {
        return this.a;
    }

    @Override // defpackage.vnu
    public final boolean b() {
        return this.b;
    }

    @Override // defpackage.vnu
    public final String c() {
        return this.c;
    }

    @Override // defpackage.vnu
    public final vwn d() {
        return this.d;
    }

    @Override // defpackage.vnu
    public final boolean e() {
        return this.e;
    }

    public final boolean equals(Object obj) {
        bvrt<douj> bvrtVar;
        if (obj == this) {
            return true;
        }
        if (obj instanceof vnu) {
            vnu vnuVar = (vnu) obj;
            if (this.a.equals(vnuVar.a()) && this.b == vnuVar.b() && this.c.equals(vnuVar.c()) && this.d.equals(vnuVar.d()) && this.e == vnuVar.e() && ((bvrtVar = this.f) != null ? bvrtVar.equals(vnuVar.f()) : vnuVar.f() == null)) {
                return true;
            }
        }
        return false;
    }

    @Override // defpackage.vnu
    @dzsi
    public final bvrt<douj> f() {
        return this.f;
    }

    public final int hashCode() {
        int i = 1237;
        int hashCode = (((((((this.a.hashCode() ^ 1000003) * 1000003) ^ (true != this.b ? 1237 : 1231)) * 1000003) ^ this.c.hashCode()) * 1000003) ^ this.d.hashCode()) * 1000003;
        if (true == this.e) {
            i = 1231;
        }
        int i2 = (hashCode ^ i) * 1000003;
        bvrt<douj> bvrtVar = this.f;
        return i2 ^ (bvrtVar == null ? 0 : bvrtVar.hashCode());
    }

    public final String toString() {
        String valueOf = String.valueOf(this.a);
        boolean z = this.b;
        String str = this.c;
        String valueOf2 = String.valueOf(this.d);
        boolean z2 = this.e;
        String valueOf3 = String.valueOf(this.f);
        int length = String.valueOf(valueOf).length();
        int length2 = str.length();
        int length3 = String.valueOf(valueOf2).length();
        StringBuilder sb = new StringBuilder(length + R.styleable.AppCompatTheme_windowActionModeOverlay + length2 + length3 + String.valueOf(valueOf3).length());
        sb.append("TabState{travelMode=");
        sb.append(valueOf);
        sb.append(", disabled=");
        sb.append(z);
        sb.append(", formattedDuration=");
        sb.append(str);
        sb.append(", tripCardsState=");
        sb.append(valueOf2);
        sb.append(", refreshing=");
        sb.append(z2);
        sb.append(", serializableIconOverride=");
        sb.append(valueOf3);
        sb.append("}");
        return sb.toString();
    }
}
