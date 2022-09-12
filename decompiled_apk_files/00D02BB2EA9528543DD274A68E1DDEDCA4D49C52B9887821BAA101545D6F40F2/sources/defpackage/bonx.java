package defpackage;
/* compiled from: PG */
/* renamed from: bonx  reason: default package */
/* loaded from: classes3.dex */
public class bonx implements boqd {
    private final CharSequence a;
    private final CharSequence b;

    public bonx(CharSequence charSequence, CharSequence charSequence2, boolean z) {
        this.a = charSequence;
        this.b = charSequence2;
    }

    @Override // defpackage.boqd
    public CharSequence a() {
        return this.a;
    }

    @Override // defpackage.boqd
    public CharSequence b() {
        return this.b;
    }

    @Override // defpackage.boqd
    public Boolean c() {
        return true;
    }
}
