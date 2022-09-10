package defpackage;

import android.content.Context;
import com.google.android.apps.maps.R;
/* compiled from: PG */
/* renamed from: bono  reason: default package */
/* loaded from: classes3.dex */
public class bono implements bopy {
    private final boou a;
    private final String b;
    private final boolean c;
    private final bonr d;
    private final Context e;

    public bono(Context context, boou boouVar, bonr bonrVar, boolean z) {
        this.a = boouVar;
        this.c = z;
        this.d = bonrVar;
        this.e = context;
        this.b = new bydk(context).a(boouVar.v(), boouVar.s(), false, boouVar.G().intValue(), boouVar.H().intValue(), boouVar.M().intValue(), boouVar.N().intValue());
    }

    @Override // defpackage.bopy
    /* renamed from: a */
    public boou i() {
        return this.a;
    }

    @Override // defpackage.bopy
    public String b() {
        return this.b;
    }

    @Override // defpackage.bopy
    public Boolean c() {
        return Boolean.valueOf(this.c);
    }

    @Override // defpackage.bopy
    public cqkl d() {
        bonr bonrVar = this.d;
        boou boouVar = this.a;
        boouVar.S();
        bonrVar.o(boouVar);
        return cqkl.a;
    }

    @Override // defpackage.bopy
    public cqkl e() {
        bonr bonrVar = this.d;
        boou boouVar = this.a;
        boouVar.T();
        bonrVar.o(boouVar);
        return cqkl.a;
    }

    @Override // defpackage.bopy
    public cqkl f() {
        bonr bonrVar = this.d;
        boou boouVar = this.a;
        boouVar.U();
        bonrVar.o(boouVar);
        return cqkl.a;
    }

    @Override // defpackage.bopy
    public cqkl g() {
        this.d.t(this.a);
        return cqkl.a;
    }

    @Override // defpackage.bopy
    public String h() {
        return this.e.getString(R.string.CLEAR_BUTTON_CONTENT_DESCRIPTION, new bydk(this.e).a(this.a.v(), this.a.s(), false, this.a.G().intValue(), this.a.H().intValue(), this.a.M().intValue(), this.a.N().intValue()));
    }
}
