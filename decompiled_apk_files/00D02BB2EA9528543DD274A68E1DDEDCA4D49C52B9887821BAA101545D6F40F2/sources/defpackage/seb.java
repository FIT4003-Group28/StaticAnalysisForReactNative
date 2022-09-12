package defpackage;
/* compiled from: PG */
/* renamed from: seb  reason: default package */
/* loaded from: classes7.dex */
public class seb implements sal {
    private final cqtd a;
    private final CharSequence b;
    @dzsi
    private CharSequence c = null;

    public seb(cqtd cqtdVar, CharSequence charSequence, @dzsi CharSequence charSequence2) {
        this.a = cqtdVar;
        this.b = charSequence;
    }

    @Override // defpackage.sal
    public cqtd a() {
        return this.a;
    }

    @Override // defpackage.sal
    public CharSequence b() {
        return this.b;
    }

    @Override // defpackage.sal
    @dzsi
    public CharSequence c() {
        return this.c;
    }

    @Override // defpackage.sal
    public void d(@dzsi String str) {
        this.c = str;
    }
}
