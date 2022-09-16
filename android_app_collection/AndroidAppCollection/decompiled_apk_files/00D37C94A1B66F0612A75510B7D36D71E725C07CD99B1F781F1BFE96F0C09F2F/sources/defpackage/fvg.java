package defpackage;

import android.text.TextUtils;
import android.view.View;
/* compiled from: PG */
/* renamed from: fvg  reason: default package */
/* loaded from: classes3.dex */
public final class fvg extends akfh {
    public Boolean a;
    public akev b;
    private Boolean c;
    private Boolean d;
    private Integer e;
    private CharSequence f;
    private CharSequence g;
    private View.OnClickListener h;

    @Override // defpackage.akew
    /* renamed from: c */
    public final void i(int i) {
        this.e = Integer.valueOf(i);
    }

    @Override // defpackage.akfh
    /* renamed from: d */
    public final void j(boolean z) {
        this.c = Boolean.valueOf(z);
    }

    public final void e(boolean z) {
        this.d = Boolean.valueOf(z);
    }

    @Override // defpackage.akfh
    /* renamed from: f */
    public final void k(CharSequence charSequence) {
        if (charSequence != null) {
            this.f = charSequence;
            return;
        }
        throw new NullPointerException("Null text");
    }

    @Override // defpackage.akfh
    protected final /* bridge */ /* synthetic */ void g(View.OnClickListener onClickListener) {
        this.h = onClickListener;
    }

    @Override // defpackage.akfh
    protected final /* bridge */ /* synthetic */ void h(CharSequence charSequence) {
        this.g = charSequence;
    }

    @Override // defpackage.akfh
    public final /* bridge */ /* synthetic */ void l(akev akevVar) {
        this.b = akevVar;
    }

    @Override // defpackage.akfh
    /* renamed from: a */
    public final fvl b() {
        Integer num = this.e;
        if (num == null) {
            throw new IllegalStateException("Property \"duration\" has not been set");
        }
        if (num.intValue() == -1 && !TextUtils.isEmpty(this.g)) {
            i(0);
        }
        Boolean bool = this.c;
        if (bool == null || this.d == null || this.a == null || this.e == null || this.f == null) {
            StringBuilder sb = new StringBuilder();
            if (this.c == null) {
                sb.append(" rateLimited");
            }
            if (this.d == null) {
                sb.append(" shownOnFullscreen");
            }
            if (this.a == null) {
                sb.append(" counterfactual");
            }
            if (this.e == null) {
                sb.append(" duration");
            }
            if (this.f == null) {
                sb.append(" text");
            }
            String valueOf = String.valueOf(sb);
            StringBuilder sb2 = new StringBuilder(String.valueOf(valueOf).length() + 28);
            sb2.append("Missing required properties:");
            sb2.append(valueOf);
            throw new IllegalStateException(sb2.toString());
        }
        return new fvl(bool.booleanValue(), this.d.booleanValue(), this.a.booleanValue(), this.e.intValue(), this.f, this.g, this.h, this.b);
    }
}
