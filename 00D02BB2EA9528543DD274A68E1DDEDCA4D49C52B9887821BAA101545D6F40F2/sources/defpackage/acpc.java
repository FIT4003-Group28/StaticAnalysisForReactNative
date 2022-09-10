package defpackage;

import android.text.Spanned;
import android.text.style.ClickableSpan;
import android.view.View;
import java.util.Arrays;
/* compiled from: PG */
/* renamed from: acpc  reason: default package */
/* loaded from: classes2.dex */
public class acpc implements acpa {
    public static final cqtd b = cqrt.g(2131232706, ibm.n());
    public static final cqtd c = cqrt.g(2131232726, ibm.n());
    public final ClickableSpan[] d;
    private final CharSequence e;
    private final CharSequence f;
    private final cqtd g;

    public acpc(CharSequence charSequence, CharSequence charSequence2) {
        this(charSequence, charSequence2, b);
    }

    @Override // defpackage.acpa
    public cqtd a() {
        return this.g;
    }

    @Override // defpackage.acpa
    public CharSequence b() {
        return this.e;
    }

    @Override // defpackage.acpa
    public Integer c() {
        return Integer.valueOf(this.d.length);
    }

    @Override // defpackage.acpa
    public View.OnClickListener d() {
        return new View.OnClickListener(this) { // from class: acpb
            private final acpc a;

            {
                this.a = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                ClickableSpan[] clickableSpanArr = this.a.d;
                if (clickableSpanArr.length == 1) {
                    clickableSpanArr[0].onClick(view);
                }
            }
        };
    }

    @Override // defpackage.acpa
    public CharSequence e() {
        return this.f;
    }

    public boolean equals(@dzsi Object obj) {
        if (!(obj instanceof acpc)) {
            return false;
        }
        acpc acpcVar = (acpc) obj;
        return dbsd.a(this.e.toString(), acpcVar.e.toString()) && dbsd.a(this.f.toString(), acpcVar.f.toString()) && dbsd.a(this.g, acpcVar.g);
    }

    public int hashCode() {
        return Arrays.hashCode(new Object[]{this.e, this.f, this.g});
    }

    public acpc(CharSequence charSequence, CharSequence charSequence2, cqtd cqtdVar) {
        this.e = charSequence;
        this.f = charSequence2.toString();
        this.g = cqtdVar;
        this.d = charSequence instanceof Spanned ? (ClickableSpan[]) ((Spanned) charSequence).getSpans(0, charSequence.length(), ClickableSpan.class) : new ClickableSpan[0];
    }
}
