package defpackage;

import java.util.ArrayList;
import java.util.List;
import java.util.regex.Pattern;
import java.util.regex.PatternSyntaxException;
/* compiled from: PG */
/* renamed from: bvuk  reason: default package */
/* loaded from: classes4.dex */
public final class bvuk {
    private static final dcqe a = dcqe.c("bvuk");

    public static cxnh a(btvo btvoVar) {
        List<String> list;
        if (btvoVar.getSearchParameters().h()) {
            list = btvoVar.getSearchParameters().g().a;
        } else {
            list = bvtk.a;
        }
        ArrayList arrayList = new ArrayList();
        for (String str : list) {
            try {
                arrayList.add(Pattern.compile(str));
            } catch (PatternSyntaxException e) {
                bvoo.h("Invalid deep link url allowlist regex %s", e);
            }
        }
        return new cxne(dcdc.r(arrayList));
    }
}
