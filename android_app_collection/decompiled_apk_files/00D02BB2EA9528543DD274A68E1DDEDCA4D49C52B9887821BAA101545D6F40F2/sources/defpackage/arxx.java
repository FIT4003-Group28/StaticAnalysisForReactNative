package defpackage;

import android.content.Context;
/* compiled from: PG */
/* renamed from: arxx  reason: default package */
/* loaded from: classes2.dex */
public class arxx implements aryj {
    @dzsi
    private final CharSequence a;
    private final boolean b;
    private final arxj c;
    private final cqkn<aryj> d;
    private final aryb e;

    public arxx(Context context, cqkn<aryj> cqknVar, String str, @dzsi CharSequence charSequence, boolean z, aryb arybVar) {
        this.d = cqknVar;
        this.a = charSequence;
        this.b = z;
        this.e = arybVar;
        this.c = arxj.d(context, str);
    }

    @Override // defpackage.aryj
    @dzsi
    public CharSequence a() {
        CharSequence charSequence = ((arxh) this.c).a;
        return charSequence == null ? this.a : charSequence;
    }

    @Override // defpackage.aryj
    @dzsi
    public cqtd b() {
        return ((arxh) this.c).b;
    }

    @Override // defpackage.aryj
    public String c() {
        return ((arxh) this.c).c;
    }

    @Override // defpackage.aryj
    public Boolean d() {
        return Boolean.valueOf(this.e.g() == this);
    }

    @Override // defpackage.aryj
    public cqkn<aryj> e() {
        return this.d;
    }

    public boolean f() {
        return this.b;
    }
}
