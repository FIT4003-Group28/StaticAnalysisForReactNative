package defpackage;

import com.facebook.yoga.YogaAlign;
import com.facebook.yoga.YogaFlexDirection;
import com.facebook.yoga.YogaJustify;
import com.facebook.yoga.YogaWrap;
import java.util.List;
/* compiled from: PG */
/* renamed from: cyl  reason: default package */
/* loaded from: classes3.dex */
public final class cyl extends cyr {
    public static final /* synthetic */ int g = 0;
    public List a;
    public YogaAlign b;
    public YogaAlign c;
    public YogaJustify d;
    public YogaWrap e;
    public boolean f;

    public cyl() {
        super("Column");
    }

    public static cyk a(cyv cyvVar) {
        cyk cykVar = new cyk();
        cykVar.h(cyvVar, new cyl());
        return cykVar;
    }

    @Override // defpackage.czb
    protected final cyr b(cyv cyvVar) {
        return this;
    }

    @Override // defpackage.czb
    protected final cyz c(cyv cyvVar) {
        dbk E = czu.E(cyvVar);
        E.bH(this.f ? YogaFlexDirection.COLUMN_REVERSE : YogaFlexDirection.COLUMN);
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
        cyl cylVar = (cyl) cyrVar;
        if (this.k == cylVar.k) {
            return true;
        }
        List list = this.a;
        if (list != null) {
            if (cylVar.a == null || list.size() != cylVar.a.size()) {
                return false;
            }
            int size = this.a.size();
            for (int i = 0; i < size; i++) {
                if (!((cyr) this.a.get(i)).f((cyr) cylVar.a.get(i))) {
                    return false;
                }
            }
        } else if (cylVar.a != null) {
            return false;
        }
        YogaAlign yogaAlign = this.b;
        if (yogaAlign == null ? cylVar.b != null : !yogaAlign.equals(cylVar.b)) {
            return false;
        }
        YogaAlign yogaAlign2 = this.c;
        if (yogaAlign2 == null ? cylVar.c != null : !yogaAlign2.equals(cylVar.c)) {
            return false;
        }
        YogaJustify yogaJustify = this.d;
        if (yogaJustify == null ? cylVar.d != null : !yogaJustify.equals(cylVar.d)) {
            return false;
        }
        return this.f == cylVar.f;
    }

    @Override // defpackage.cyr, defpackage.dan
    public final /* bridge */ /* synthetic */ boolean f(Object obj) {
        return f((cyr) obj);
    }
}
