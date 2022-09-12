package defpackage;
/* compiled from: PG */
/* renamed from: jyy  reason: default package */
/* loaded from: classes7.dex */
public class jyy implements jyr {
    private final CharSequence a;
    @dzsi
    private final ddho b;
    private final int c;

    public jyy(CharSequence charSequence, @dzsi ddho ddhoVar, int i) {
        this.a = charSequence;
        this.b = ddhoVar;
        this.c = i;
    }

    @Override // defpackage.jyr
    @dzsi
    public CharSequence a() {
        return this.a;
    }

    @Override // defpackage.jyr
    @dzsi
    public cjtd b() {
        if (this.b == null) {
            return null;
        }
        cjta b = cjtd.b();
        b.d = this.b;
        b.i(this.c);
        return b.a();
    }
}
