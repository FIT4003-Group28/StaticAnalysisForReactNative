package defpackage;

import com.facebook.yoga.YogaAlign;
import com.facebook.yoga.YogaFlexDirection;
import com.facebook.yoga.YogaJustify;
import com.facebook.yoga.YogaWrap;
import java.util.List;
/* compiled from: PG */
/* renamed from: ddg  reason: default package */
/* loaded from: classes3.dex */
public final class ddg extends cyr {
    public static final /* synthetic */ int g = 0;
    public List a;
    public YogaAlign b;
    public YogaAlign c;
    public YogaJustify d;
    public YogaWrap e;
    public boolean f;

    public ddg() {
        super("Row");
    }

    public static ddf a(cyv cyvVar) {
        ddf ddfVar = new ddf();
        ddfVar.f(cyvVar, new ddg());
        return ddfVar;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.czb
    public final cyr b(cyv cyvVar) {
        return this;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.czb
    public final cyz c(cyv cyvVar) {
        dbk E = czu.E(cyvVar);
        E.bH(this.f ? YogaFlexDirection.ROW_REVERSE : YogaFlexDirection.ROW);
        YogaAlign yogaAlign = this.b;
        if (yogaAlign != null) {
            E.bf(yogaAlign);
        }
        YogaAlign yogaAlign2 = this.c;
        if (yogaAlign2 != null) {
            E.be(yogaAlign2);
        }
        YogaJustify yogaJustify = this.d;
        if (yogaJustify != null) {
            E.bs(yogaJustify);
        }
        YogaWrap yogaWrap = this.e;
        if (yogaWrap != null) {
            E.bE(yogaWrap);
        }
        List<cyr> list = this.a;
        if (list != null) {
            for (cyr cyrVar : list) {
                if (cyvVar.k()) {
                    return cyv.a;
                }
                if (cyvVar.l()) {
                    E.aA(cyrVar);
                } else {
                    E.bi(cyrVar);
                }
            }
        }
        return E;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.cyr
    public final boolean d() {
        return true;
    }

    @Override // defpackage.cyr
    public final boolean e(cyr cyrVar) {
        if (this == cyrVar) {
            return true;
        }
        if (cyrVar == null || getClass() != cyrVar.getClass()) {
            return false;
        }
        ddg ddgVar = (ddg) cyrVar;
        if (this.k == ddgVar.k) {
            return true;
        }
        List list = this.a;
        if (list != null) {
            if (ddgVar.a == null || list.size() != ddgVar.a.size()) {
                return false;
            }
            int size = this.a.size();
            for (int i = 0; i < size; i++) {
                if (!((cyr) this.a.get(i)).f((cyr) ddgVar.a.get(i))) {
                    return false;
                }
            }
        } else if (ddgVar.a != null) {
            return false;
        }
        YogaAlign yogaAlign = this.b;
        if (yogaAlign == null ? ddgVar.b != null : !yogaAlign.equals(ddgVar.b)) {
            return false;
        }
        YogaAlign yogaAlign2 = this.c;
        if (yogaAlign2 == null ? ddgVar.c != null : !yogaAlign2.equals(ddgVar.c)) {
            return false;
        }
        YogaJustify yogaJustify = this.d;
        if (yogaJustify == null ? ddgVar.d != null : !yogaJustify.equals(ddgVar.d)) {
            return false;
        }
        return this.f == ddgVar.f;
    }

    @Override // defpackage.cyr, defpackage.dan
    public final /* bridge */ /* synthetic */ boolean f(Object obj) {
        return f((cyr) obj);
    }
}
