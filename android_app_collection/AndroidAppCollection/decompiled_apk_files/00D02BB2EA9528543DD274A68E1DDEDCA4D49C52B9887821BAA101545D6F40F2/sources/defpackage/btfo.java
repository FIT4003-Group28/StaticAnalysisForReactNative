package defpackage;
/* compiled from: PG */
/* renamed from: btfo  reason: default package */
/* loaded from: classes4.dex */
public class btfo implements btfn {
    private final CharSequence a;
    private final CharSequence b;
    private final boolean c;
    private final CharSequence d;

    public btfo(CharSequence charSequence, CharSequence charSequence2, boolean z, CharSequence charSequence3) {
        this.a = charSequence;
        this.b = charSequence2;
        this.c = z;
        this.d = charSequence3;
    }

    @Override // defpackage.btfn
    public CharSequence a() {
        return this.a;
    }

    @Override // defpackage.btfn
    public CharSequence b() {
        return this.b;
    }

    @Override // defpackage.btfn
    public Boolean c() {
        return Boolean.valueOf(this.c);
    }

    @Override // defpackage.btfn
    public CharSequence d() {
        return this.d;
    }
}
