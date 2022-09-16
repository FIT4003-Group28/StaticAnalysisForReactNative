package defpackage;

import android.graphics.drawable.Drawable;
import com.facebook.yoga.YogaAlign;
import com.facebook.yoga.YogaFlexDirection;
import com.facebook.yoga.YogaJustify;
import com.facebook.yoga.YogaWrap;
import java.util.List;
/* compiled from: PG */
/* renamed from: suy  reason: default package */
/* loaded from: classes4.dex */
public final class suy extends cyr {
    @dfs(a = 13)
    YogaAlign a;
    @dfs(a = 13)
    YogaAlign b;
    @dfs(a = 6)
    List c;
    @dfs(a = 13)
    public Drawable d;
    @dfs(a = 13)
    YogaFlexDirection e;
    @dfs(a = 13)
    Integer f;
    @dfs(a = 13)
    YogaJustify g;
    @dfs(a = 13)
    String v;
    @dfs(a = 13)
    Integer w;
    @dfs(a = 0)
    public float x;
    @dfs(a = 13)
    YogaWrap y;
    @dfs(a = 13)
    tdt z;

    private suy() {
        super("Container");
    }

    public static sux a(cyv cyvVar) {
        sux suxVar = new sux();
        sux.d(suxVar, cyvVar, new suy());
        return suxVar;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.czb
    public final void au(aflw aflwVar) {
        if (aflwVar == null) {
            return;
        }
        this.z = (tdt) aflwVar.f(tdt.class);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.czb
    public final cyr b(cyv cyvVar) {
        cyq cyqVar;
        YogaFlexDirection yogaFlexDirection = this.e;
        List<cyr> list = this.c;
        tdt tdtVar = this.z;
        Drawable drawable = this.d;
        Integer num = this.w;
        Integer num2 = this.f;
        YogaAlign yogaAlign = this.b;
        YogaWrap yogaWrap = this.y;
        YogaJustify yogaJustify = this.g;
        YogaAlign yogaAlign2 = this.a;
        String str = this.v;
        YogaFlexDirection yogaFlexDirection2 = YogaFlexDirection.COLUMN;
        int ordinal = yogaFlexDirection.ordinal();
        if (ordinal == 1) {
            cyk a = cyl.a(cyvVar);
            a.j();
            cyqVar = a;
        } else if (ordinal == 2) {
            cyqVar = ddg.a(cyvVar);
        } else if (ordinal == 3) {
            ddf a2 = ddg.a(cyvVar);
            a2.h();
            cyqVar = a2;
        } else {
            cyqVar = cyl.a(cyvVar);
        }
        if (list != null) {
            for (cyr cyrVar : list) {
                cyqVar.g(cyrVar.j());
            }
        }
        if (yogaAlign != null) {
            cyqVar.e(yogaAlign);
        }
        if (yogaWrap != null) {
            cyqVar.k(yogaWrap);
        }
        if (yogaJustify != null) {
            cyqVar.i(yogaJustify);
        }
        if (yogaAlign2 != null) {
            cyqVar.d(yogaAlign2);
        }
        if (str != null && tdtVar != null) {
            tdtVar.c = str;
        }
        if (drawable != null) {
            cyqVar.q(drawable);
        } else if (num != null || num2 != null) {
            tac tacVar = new tac();
            int i = 0;
            tacVar.a = num2 == null ? 0 : num2.intValue();
            if (num != null) {
                i = num.intValue();
            }
            tacVar.b = i;
            cyqVar.q(tacVar);
        }
        return cyqVar.a();
    }
}
