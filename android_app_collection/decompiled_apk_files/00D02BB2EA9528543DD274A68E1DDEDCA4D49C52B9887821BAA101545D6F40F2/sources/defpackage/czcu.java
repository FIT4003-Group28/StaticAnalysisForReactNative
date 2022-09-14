package defpackage;

import com.google.android.libraries.social.populous.core.MatchInfo;
import java.util.Comparator;
/* renamed from: czcu  reason: default package */
/* loaded from: classes5.dex */
final /* synthetic */ class czcu implements Comparator {
    static final Comparator a = new czcu();

    private czcu() {
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        MatchInfo matchInfo = (MatchInfo) obj;
        MatchInfo matchInfo2 = (MatchInfo) obj2;
        int b = cyxz.b(matchInfo.a(), matchInfo2.a());
        return b != 0 ? b : cyxz.b(matchInfo.b(), matchInfo2.b());
    }
}
