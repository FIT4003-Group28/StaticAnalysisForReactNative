package defpackage;

import com.google.android.filament.R;
/* compiled from: PG */
/* renamed from: rly  reason: default package */
/* loaded from: classes7.dex */
final class rly extends rls {
    private final dpol a;
    private final boolean b;
    private final dngu c;
    private final dngu d;

    public rly(dpol dpolVar, boolean z, dngu dnguVar, dngu dnguVar2) {
        if (dpolVar != null) {
            this.a = dpolVar;
            this.b = z;
            if (dnguVar != null) {
                this.c = dnguVar;
                if (dnguVar2 != null) {
                    this.d = dnguVar2;
                    return;
                }
                throw new NullPointerException("Null leaveWorkAtTime");
            }
            throw new NullPointerException("Null toWorkByTime");
        }
        throw new NullPointerException("Null dayOfWeek");
    }

    @Override // defpackage.rls
    public final dpol a() {
        return this.a;
    }

    @Override // defpackage.rls
    public final boolean b() {
        return this.b;
    }

    @Override // defpackage.rls
    public final dngu c() {
        return this.c;
    }

    @Override // defpackage.rls
    public final dngu d() {
        return this.d;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof rls) {
            rls rlsVar = (rls) obj;
            if (this.a.equals(rlsVar.a()) && this.b == rlsVar.b() && this.c.equals(rlsVar.c()) && this.d.equals(rlsVar.d())) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int hashCode = (((this.a.hashCode() ^ 1000003) * 1000003) ^ (true != this.b ? 1237 : 1231)) * 1000003;
        dngu dnguVar = this.c;
        int i = dnguVar.bC;
        if (i == 0) {
            i = dsst.a.b(dnguVar).c(dnguVar);
            dnguVar.bC = i;
        }
        int i2 = (hashCode ^ i) * 1000003;
        dngu dnguVar2 = this.d;
        int i3 = dnguVar2.bC;
        if (i3 == 0) {
            i3 = dsst.a.b(dnguVar2).c(dnguVar2);
            dnguVar2.bC = i3;
        }
        return i2 ^ i3;
    }

    public final String toString() {
        String valueOf = String.valueOf(this.a);
        boolean z = this.b;
        String valueOf2 = String.valueOf(this.c);
        String valueOf3 = String.valueOf(this.d);
        int length = String.valueOf(valueOf).length();
        int length2 = String.valueOf(valueOf2).length();
        StringBuilder sb = new StringBuilder(length + R.styleable.AppCompatTheme_textAppearancePopupMenuHeader + length2 + String.valueOf(valueOf3).length());
        sb.append("AdvancedScheduleTimeDialogResult{dayOfWeek=");
        sb.append(valueOf);
        sb.append(", isApplyAllCommuteDays=");
        sb.append(z);
        sb.append(", toWorkByTime=");
        sb.append(valueOf2);
        sb.append(", leaveWorkAtTime=");
        sb.append(valueOf3);
        sb.append("}");
        return sb.toString();
    }
}
