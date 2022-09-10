package defpackage;

import android.content.Context;
/* compiled from: PG */
/* renamed from: bpbx  reason: default package */
/* loaded from: classes3.dex */
public class bpbx implements bpvp {
    private final bowy a;
    private final String b;
    private final cjtd c;
    private final int d;

    public bpbx(Context context, bowy bowyVar, int i, int i2, ddho ddhoVar) {
        this.a = bowyVar;
        this.d = i2;
        this.c = cjtd.a(ddhoVar);
        this.b = context.getResources().getString(i);
    }

    @Override // defpackage.bpvp
    public bpvo a() {
        return bpvo.DEFAULT_RADIO_BUTTON;
    }

    @Override // defpackage.bpvp
    public String b() {
        return this.b;
    }

    @Override // defpackage.bpvp
    public Boolean c() {
        return Boolean.valueOf(this.a.b.intValue() == this.d);
    }

    @Override // defpackage.bpvp
    public cqkl d() {
        this.a.b = Integer.valueOf(this.d);
        cqkx.p(this);
        return cqkl.a;
    }

    @Override // defpackage.bpvp
    public cjtd e() {
        return this.c;
    }
}
