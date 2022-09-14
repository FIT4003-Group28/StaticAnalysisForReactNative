package defpackage;

import java.util.Arrays;
/* compiled from: PG */
/* renamed from: wqz  reason: default package */
/* loaded from: classes7.dex */
abstract class wqz implements wps {
    @dzsi
    private final cqtd a;
    private final CharSequence b;
    @dzsi
    private final cjtd c;

    public wqz(@dzsi cqtd cqtdVar, CharSequence charSequence, @dzsi cjtd cjtdVar) {
        this.a = cqtdVar;
        this.b = charSequence;
        this.c = cjtdVar;
    }

    @Override // defpackage.wps
    @dzsi
    public cqtd a() {
        return this.a;
    }

    @Override // defpackage.wps
    public CharSequence b() {
        return this.b;
    }

    @Override // defpackage.wps
    @dzsi
    public cjtd d() {
        return this.c;
    }

    public boolean equals(@dzsi Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof wqz)) {
            return false;
        }
        wqz wqzVar = (wqz) obj;
        return this.b.toString().contentEquals(wqzVar.b) && dbsd.a(this.a, wqzVar.a);
    }

    public int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, this.b.toString()});
    }
}
