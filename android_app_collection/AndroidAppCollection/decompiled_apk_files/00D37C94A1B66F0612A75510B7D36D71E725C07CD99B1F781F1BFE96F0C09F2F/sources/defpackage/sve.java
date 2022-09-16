package defpackage;

import android.text.TextUtils;
import android.widget.EditText;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: sve  reason: default package */
/* loaded from: classes4.dex */
public final class sve extends cyr {
    @dfs(a = 14)
    private final svd A;
    @dfs(a = 13)
    tcu a;
    @dfs(a = 13)
    tda b;
    @dfs(a = 13)
    axmy c;
    @dfs(a = 3)
    boolean d;
    @dfs(a = 13)
    teb e;
    @dfs(a = 13)
    tfw f;
    @dfs(a = 13)
    tfw g;
    @dfs(a = 13)
    tfw v;
    @dfs(a = 13)
    tfw w;
    @dfs(a = 13)
    tfw x;
    @dfs(a = 13)
    Map y;
    @dfs(a = 13)
    tfj z;

    public sve() {
        super("EditableText");
        this.A = new svd();
    }

    public static daq a(cyv cyvVar, tfw tfwVar) {
        return H(sve.class, cyvVar, 378376578, new Object[]{cyvVar, tfwVar});
    }

    @Override // defpackage.czb, defpackage.dap
    public final Object K(daq daqVar, Object obj) {
        switch (daqVar.b) {
            case -1974694341:
                daw dawVar = (daw) obj;
                dbb dbbVar = daqVar.a;
                Object[] objArr = daqVar.c;
                cyv cyvVar = (cyv) objArr[0];
                sve sveVar = (sve) dbbVar;
                svh.d((tfw) objArr[1], (tfw) objArr[2], dawVar.a, dawVar.b, sveVar.a, sveVar.b);
                return null;
            case -1048037474:
                N((cyv) daqVar.c[0], (dao) obj);
                return null;
            case 378110312:
                dlt dltVar = (dlt) obj;
                dbb dbbVar2 = daqVar.a;
                Object[] objArr2 = daqVar.c;
                cyv cyvVar2 = (cyv) objArr2[0];
                tfw tfwVar = (tfw) objArr2[1];
                tfw tfwVar2 = (tfw) objArr2[2];
                EditText editText = dltVar.a;
                String str = dltVar.b;
                sve sveVar2 = (sve) dbbVar2;
                tcu tcuVar = sveVar2.a;
                tda tdaVar = sveVar2.b;
                svg svgVar = sveVar2.A.b;
                String str2 = svh.a;
                synchronized (svgVar) {
                    svgVar.a.add(0, str);
                }
                if (tfwVar != null) {
                    tcuVar.b(tfwVar.a(), svh.a(editText, tdaVar.u)).Q();
                }
                if (TextUtils.isEmpty(str) && tfwVar2 != null) {
                    tcuVar.b(tfwVar2.a(), svh.a(editText, tdaVar.u)).Q();
                }
                return null;
            case 378376578:
                dbb dbbVar3 = daqVar.a;
                Object[] objArr3 = daqVar.c;
                cyv cyvVar3 = (cyv) objArr3[0];
                sve sveVar3 = (sve) dbbVar3;
                return Boolean.valueOf(svh.c((tfw) objArr3[1], ((djd) obj).a, sveVar3.a, sveVar3.b));
            case 1803022739:
                dbb dbbVar4 = daqVar.a;
                cyv cyvVar4 = (cyv) daqVar.c[0];
                sve sveVar4 = (sve) dbbVar4;
                svh.e(sveVar4.c, sveVar4.A.a, ((dev) obj).b);
                return null;
            default:
                return null;
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.czb
    public final void M(cyv cyvVar) {
        dcz dczVar = new dcz();
        dcz dczVar2 = new dcz();
        svh.b(dczVar, dczVar2);
        Object obj = dczVar.a;
        if (obj != null) {
            this.A.b = (svg) obj;
        }
        Object obj2 = dczVar2.a;
        if (obj2 != null) {
            this.A.a = (AtomicBoolean) obj2;
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.czb
    public final void X(ddl ddlVar, ddl ddlVar2) {
        svd svdVar = (svd) ddlVar;
        svd svdVar2 = (svd) ddlVar2;
        svdVar2.a = svdVar.a;
        svdVar2.b = svdVar.b;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.czb
    public final boolean ac() {
        return true;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.czb
    public final cyr b(cyv cyvVar) {
        return svh.f(cyvVar, this.c, this.g, this.v, this.w, this.f, this.x, this.z, this.e, this.a, this.b, this.y, this.A.b);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.cyr
    public final ddl m() {
        return this.A;
    }
}
