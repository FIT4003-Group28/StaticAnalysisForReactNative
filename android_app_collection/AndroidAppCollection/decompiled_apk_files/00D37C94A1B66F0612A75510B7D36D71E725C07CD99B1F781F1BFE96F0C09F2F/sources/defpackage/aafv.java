package defpackage;

import android.content.Context;
import android.text.Spanned;
import android.text.style.ClickableSpan;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
/* compiled from: PG */
/* renamed from: aafv  reason: default package */
/* loaded from: classes.dex */
public final class aafv {
    public static final CharSequence[] a = new CharSequence[0];

    @Deprecated
    public static Spanned a(arag aragVar, aafo aafoVar, boolean z) {
        return b(null, aragVar, aafoVar, z);
    }

    public static Spanned b(Context context, arag aragVar, final aafo aafoVar, boolean z) {
        ajgf ajgfVar;
        if (aafoVar != null) {
            final aafs a2 = aaft.a(z);
            ajgfVar = new ajgf() { // from class: aafu
                @Override // defpackage.ajgf
                public final ClickableSpan a(apzg apzgVar) {
                    return aafs.this.a(aafoVar, null, apzgVar);
                }
            };
        } else {
            ajgfVar = null;
        }
        if (context == null || aragVar == null || ajgfVar == null) {
            return ajgl.c(aragVar, ajgfVar);
        }
        ajgi a3 = ajgj.a();
        a3.a = context;
        a3.b = aragVar;
        a3.c = ajgfVar;
        return ajgl.a(a3.a());
    }

    @Deprecated
    public static Spanned[] c(arag[] aragVarArr, aafo aafoVar, boolean z) {
        Spanned[] spannedArr = new Spanned[aragVarArr.length];
        for (int i = 0; i < aragVarArr.length; i++) {
            spannedArr[i] = a(aragVarArr[i], aafoVar, z);
        }
        return spannedArr;
    }

    public static List d(List list, aafo aafoVar) {
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(a((arag) it.next(), aafoVar, false));
        }
        return arrayList;
    }
}
