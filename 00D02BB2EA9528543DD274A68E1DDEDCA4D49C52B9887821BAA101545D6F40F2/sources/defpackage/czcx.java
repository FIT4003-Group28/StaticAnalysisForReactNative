package defpackage;

import com.google.android.libraries.social.populous.core.MatchInfo;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
/* compiled from: PG */
/* renamed from: czcx  reason: default package */
/* loaded from: classes5.dex */
public abstract class czcx {
    private static final Comparator<MatchInfo> a = czcu.a;

    public static czcv g() {
        czco czcoVar = new czco();
        czcoVar.b(dcdc.e());
        czcoVar.c(dcdc.e());
        czcoVar.a = new ArrayList();
        czcoVar.b = new ArrayList();
        return czcoVar;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public static final dcdc<MatchInfo> h(List<MatchInfo> list) {
        if (list.size() <= 1) {
            return dcdc.r(list);
        }
        Collections.sort(list, a);
        ArrayDeque arrayDeque = new ArrayDeque();
        arrayDeque.add(list.get(0));
        for (MatchInfo matchInfo : list) {
            MatchInfo matchInfo2 = (MatchInfo) arrayDeque.peekLast();
            dbsk.s(matchInfo2);
            if (matchInfo.a() <= matchInfo2.a() + matchInfo2.b()) {
                arrayDeque.removeLast();
                arrayDeque.add(MatchInfo.c(matchInfo2.a(), Math.max(matchInfo2.b(), matchInfo.b() + (matchInfo.a() - matchInfo2.a()))));
            } else {
                arrayDeque.add(matchInfo);
            }
        }
        return dcdc.r(arrayDeque);
    }

    public abstract dcdc<dudl> a();

    public abstract dcdc<dudl> b();

    public abstract dcdc<Integer> c();

    public abstract czcw d();

    public abstract List<MatchInfo> e();

    public abstract List<MatchInfo> f();
}
