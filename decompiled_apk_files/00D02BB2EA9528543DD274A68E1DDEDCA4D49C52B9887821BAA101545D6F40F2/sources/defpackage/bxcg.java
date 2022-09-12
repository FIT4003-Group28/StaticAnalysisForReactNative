package defpackage;

import android.view.View;
import com.google.android.filament.R;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: bxcg  reason: default package */
/* loaded from: classes4.dex */
public final class bxcg extends bxcm {
    private final boolean a;
    private final cqtd b;
    private final CharSequence c;
    private final boolean d;
    private final View.OnClickListener e;
    private final cjtd f;

    public bxcg(boolean z, cqtd cqtdVar, CharSequence charSequence, boolean z2, View.OnClickListener onClickListener, cjtd cjtdVar) {
        this.a = z;
        this.b = cqtdVar;
        if (charSequence != null) {
            this.c = charSequence;
            this.d = z2;
            if (onClickListener != null) {
                this.e = onClickListener;
                if (cjtdVar != null) {
                    this.f = cjtdVar;
                    return;
                }
                throw new NullPointerException("Null getLoggingParams");
            }
            throw new NullPointerException("Null onClick");
        }
        throw new NullPointerException("Null getLabel");
    }

    @Override // defpackage.bxbz
    public boolean a() {
        return this.a;
    }

    @Override // defpackage.bxbz
    public cqtd b() {
        return this.b;
    }

    @Override // defpackage.bxbz
    public CharSequence c() {
        return this.c;
    }

    @Override // defpackage.bxbz
    public boolean d() {
        return this.d;
    }

    @Override // defpackage.bxbz
    public View.OnClickListener e() {
        return this.e;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof bxcm) {
            bxcm bxcmVar = (bxcm) obj;
            if (this.a == bxcmVar.a() && this.b.equals(bxcmVar.b()) && this.c.equals(bxcmVar.c()) && this.d == bxcmVar.d() && this.e.equals(bxcmVar.e()) && this.f.equals(bxcmVar.f())) {
                return true;
            }
        }
        return false;
    }

    @Override // defpackage.bxbz
    public cjtd f() {
        return this.f;
    }

    public int hashCode() {
        int i = 1237;
        int hashCode = ((((((true != this.a ? 1237 : 1231) ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003) ^ this.c.hashCode()) * 1000003;
        if (true == this.d) {
            i = 1231;
        }
        return ((((hashCode ^ i) * 1000003) ^ this.e.hashCode()) * 1000003) ^ this.f.hashCode();
    }

    public String toString() {
        boolean z = this.a;
        String valueOf = String.valueOf(this.b);
        String valueOf2 = String.valueOf(this.c);
        boolean z2 = this.d;
        String valueOf3 = String.valueOf(this.e);
        String valueOf4 = String.valueOf(this.f);
        int length = String.valueOf(valueOf).length();
        int length2 = String.valueOf(valueOf2).length();
        int length3 = String.valueOf(valueOf3).length();
        StringBuilder sb = new StringBuilder(length + R.styleable.AppCompatTheme_windowActionModeOverlay + length2 + length3 + String.valueOf(valueOf4).length());
        sb.append("IconChipViewModelImpl{shouldUseImmersiveStyle=");
        sb.append(z);
        sb.append(", getIcon=");
        sb.append(valueOf);
        sb.append(", getLabel=");
        sb.append(valueOf2);
        sb.append(", isVisible=");
        sb.append(z2);
        sb.append(", onClick=");
        sb.append(valueOf3);
        sb.append(", getLoggingParams=");
        sb.append(valueOf4);
        sb.append("}");
        return sb.toString();
    }
}
