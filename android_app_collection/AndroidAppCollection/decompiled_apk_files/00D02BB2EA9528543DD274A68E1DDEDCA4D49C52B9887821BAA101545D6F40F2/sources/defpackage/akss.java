package defpackage;

import com.google.android.filament.R;
/* compiled from: PG */
/* renamed from: akss  reason: default package */
/* loaded from: classes2.dex */
public final class akss extends aktr {
    private final int a;
    private final int b;
    private final int c;

    public akss(int i, int i2, int i3) {
        this.a = i;
        this.b = i2;
        this.c = i3;
    }

    @Override // defpackage.aktr
    public final int a() {
        return this.a;
    }

    @Override // defpackage.aktr
    public final int b() {
        return this.b;
    }

    @Override // defpackage.aktr
    public final int c() {
        return this.c;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof aktr) {
            aktr aktrVar = (aktr) obj;
            if (this.a == aktrVar.a() && this.b == aktrVar.b() && this.c == aktrVar.c()) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((this.a ^ 1000003) * 1000003) ^ this.b) * 1000003) ^ this.c;
    }

    public final String toString() {
        int i = this.a;
        int i2 = this.b;
        int i3 = this.c;
        StringBuilder sb = new StringBuilder((int) R.styleable.AppCompatTheme_textAppearanceSearchResultSubtitle);
        sb.append("LabelBucketOptions{maxLabels=");
        sb.append(i);
        sb.append(", invariablePinSize=");
        sb.append(i2);
        sb.append(", invariableSoftMaxSize=");
        sb.append(i3);
        sb.append("}");
        return sb.toString();
    }
}
