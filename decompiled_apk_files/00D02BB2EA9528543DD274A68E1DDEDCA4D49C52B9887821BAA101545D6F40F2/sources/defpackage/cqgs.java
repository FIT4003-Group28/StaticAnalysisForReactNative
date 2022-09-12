package defpackage;

import android.widget.DatePicker;
/* compiled from: PG */
/* renamed from: cqgs  reason: default package */
/* loaded from: classes5.dex */
final class cqgs extends cqgg {
    private final Integer a;
    private final Integer b;
    private final Integer c;
    private final DatePicker.OnDateChangedListener d;

    public cqgs(Integer num, Integer num2, Integer num3, DatePicker.OnDateChangedListener onDateChangedListener) {
        if (num != null) {
            this.a = num;
            if (num2 != null) {
                this.b = num2;
                if (num3 != null) {
                    this.c = num3;
                    if (onDateChangedListener != null) {
                        this.d = onDateChangedListener;
                        return;
                    }
                    throw new NullPointerException("Null onDateChangedListener");
                }
                throw new NullPointerException("Null dayOfMonth");
            }
            throw new NullPointerException("Null monthOfYear");
        }
        throw new NullPointerException("Null year");
    }

    @Override // defpackage.cqgg
    public final Integer a() {
        return this.a;
    }

    @Override // defpackage.cqgg
    public final Integer b() {
        return this.b;
    }

    @Override // defpackage.cqgg
    public final Integer c() {
        return this.c;
    }

    @Override // defpackage.cqgg
    public final DatePicker.OnDateChangedListener d() {
        return this.d;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof cqgg) {
            cqgg cqggVar = (cqgg) obj;
            if (this.a.equals(cqggVar.a()) && this.b.equals(cqggVar.b()) && this.c.equals(cqggVar.c()) && this.d.equals(cqggVar.d())) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003) ^ this.c.hashCode()) * 1000003) ^ this.d.hashCode();
    }

    public final String toString() {
        String valueOf = String.valueOf(this.a);
        String valueOf2 = String.valueOf(this.b);
        String valueOf3 = String.valueOf(this.c);
        String valueOf4 = String.valueOf(this.d);
        int length = String.valueOf(valueOf).length();
        int length2 = String.valueOf(valueOf2).length();
        StringBuilder sb = new StringBuilder(length + 76 + length2 + String.valueOf(valueOf3).length() + String.valueOf(valueOf4).length());
        sb.append("DatePickerInitData{year=");
        sb.append(valueOf);
        sb.append(", monthOfYear=");
        sb.append(valueOf2);
        sb.append(", dayOfMonth=");
        sb.append(valueOf3);
        sb.append(", onDateChangedListener=");
        sb.append(valueOf4);
        sb.append("}");
        return sb.toString();
    }
}
