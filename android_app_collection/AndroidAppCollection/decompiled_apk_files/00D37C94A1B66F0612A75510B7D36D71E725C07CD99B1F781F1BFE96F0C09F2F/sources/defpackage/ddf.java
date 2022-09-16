package defpackage;

import com.facebook.yoga.YogaAlign;
import com.facebook.yoga.YogaJustify;
import com.facebook.yoga.YogaWrap;
import java.util.ArrayList;
/* compiled from: PG */
/* renamed from: ddf  reason: default package */
/* loaded from: classes3.dex */
public final class ddf extends cyq {
    public ddg a;

    @Override // defpackage.cyp
    public final /* bridge */ /* synthetic */ cyr a() {
        return this.a;
    }

    @Override // defpackage.cyp
    protected final void b(cyr cyrVar) {
        this.a = (ddg) cyrVar;
    }

    @Override // defpackage.cyq
    /* renamed from: c */
    public final void g(cyr cyrVar) {
        if (cyrVar == null) {
            return;
        }
        ddg ddgVar = this.a;
        if (ddgVar.a == null) {
            ddgVar.a = new ArrayList();
        }
        this.a.a.add(cyrVar);
    }

    @Override // defpackage.cyq
    public final /* bridge */ /* synthetic */ void d(YogaAlign yogaAlign) {
        ddg ddgVar = this.a;
        int i = ddg.g;
        ddgVar.c = yogaAlign;
    }

    @Override // defpackage.cyq
    public final /* bridge */ /* synthetic */ void e(YogaAlign yogaAlign) {
        ddg ddgVar = this.a;
        int i = ddg.g;
        ddgVar.b = yogaAlign;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void f(cyv cyvVar, ddg ddgVar) {
        super.w(cyvVar, ddgVar);
        this.a = ddgVar;
    }

    public final void h() {
        ddg ddgVar = this.a;
        int i = ddg.g;
        ddgVar.f = true;
    }

    @Override // defpackage.cyq
    public final /* bridge */ /* synthetic */ void i(YogaJustify yogaJustify) {
        ddg ddgVar = this.a;
        int i = ddg.g;
        ddgVar.d = yogaJustify;
    }

    public final void j(cyp cypVar) {
        g(cypVar.a());
    }

    @Override // defpackage.cyq
    public final /* bridge */ /* synthetic */ void k(YogaWrap yogaWrap) {
        ddg ddgVar = this.a;
        int i = ddg.g;
        ddgVar.e = yogaWrap;
    }
}
