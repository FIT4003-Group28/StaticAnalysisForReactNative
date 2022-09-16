package defpackage;

import com.facebook.yoga.YogaAlign;
import com.facebook.yoga.YogaJustify;
import com.facebook.yoga.YogaWrap;
import java.util.ArrayList;
/* compiled from: PG */
/* renamed from: cyk  reason: default package */
/* loaded from: classes3.dex */
public final class cyk extends cyq {
    public cyl a;

    @Override // defpackage.cyp
    public final /* bridge */ /* synthetic */ cyr a() {
        return this.a;
    }

    @Override // defpackage.cyp
    protected final void b(cyr cyrVar) {
        this.a = (cyl) cyrVar;
    }

    @Override // defpackage.cyq
    /* renamed from: c */
    public final void d(YogaAlign yogaAlign) {
        cyl cylVar = this.a;
        int i = cyl.g;
        cylVar.c = yogaAlign;
    }

    @Override // defpackage.cyq
    public final /* bridge */ /* synthetic */ void e(YogaAlign yogaAlign) {
        cyl cylVar = this.a;
        int i = cyl.g;
        cylVar.b = yogaAlign;
    }

    @Override // defpackage.cyq
    /* renamed from: f */
    public final void g(cyr cyrVar) {
        if (cyrVar == null) {
            return;
        }
        cyl cylVar = this.a;
        if (cylVar.a == null) {
            cylVar.a = new ArrayList();
        }
        this.a.a.add(cyrVar);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void h(cyv cyvVar, cyl cylVar) {
        super.w(cyvVar, cylVar);
        this.a = cylVar;
    }

    @Override // defpackage.cyq
    public final /* bridge */ /* synthetic */ void i(YogaJustify yogaJustify) {
        cyl cylVar = this.a;
        int i = cyl.g;
        cylVar.d = yogaJustify;
    }

    public final void j() {
        cyl cylVar = this.a;
        int i = cyl.g;
        cylVar.f = true;
    }

    @Override // defpackage.cyq
    public final /* bridge */ /* synthetic */ void k(YogaWrap yogaWrap) {
        cyl cylVar = this.a;
        int i = cyl.g;
        cylVar.e = yogaWrap;
    }

    public final void l(cyp cypVar) {
        g(cypVar.a());
    }
}
