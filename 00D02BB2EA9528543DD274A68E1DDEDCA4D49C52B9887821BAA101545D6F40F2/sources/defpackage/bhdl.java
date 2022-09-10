package defpackage;

import android.view.View;
/* compiled from: PG */
/* renamed from: bhdl  reason: default package */
/* loaded from: classes3.dex */
public final class bhdl extends bhds {
    public String a;
    public View.OnClickListener b;
    public jht c;
    public jhp d;
    public String e;
    public jic f;
    public cjtd g;
    public cjtd h;
    private String i;

    @Override // defpackage.bhds
    public final void b(String str) {
        if (str != null) {
            this.i = str;
            return;
        }
        throw new NullPointerException("Null headline");
    }

    @Override // defpackage.bhds
    public final bhdt a() {
        String str = this.i == null ? " headline" : "";
        if (!str.isEmpty()) {
            throw new IllegalStateException(str.length() != 0 ? "Missing required properties:".concat(str) : new String("Missing required properties:"));
        }
        return new bhdm(this.i, this.a, this.b, this.c, this.d, this.e, this.f, this.g, this.h);
    }
}
