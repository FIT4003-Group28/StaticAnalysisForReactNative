package defpackage;

import com.google.android.gms.googlehelp.OfflineSuggestion;
import java.util.Set;
/* compiled from: PG */
/* renamed from: cklg  reason: default package */
/* loaded from: classes.dex */
public final class cklg {
    public final dzsj<dxio<akfa>> a;
    public final dzsj<dbsg<dxio<afha>>> b;
    public final dzsj<cjqy> c;
    public final dzsj<gce> d;
    public final dzsj<Set<OfflineSuggestion>> e;

    public cklg(dzsj<dxio<akfa>> dzsjVar, dzsj<dbsg<dxio<afha>>> dzsjVar2, dzsj<cjqy> dzsjVar3, dzsj<gce> dzsjVar4, dzsj<Set<OfflineSuggestion>> dzsjVar5) {
        a(dzsjVar, 1);
        this.a = dzsjVar;
        a(dzsjVar2, 2);
        this.b = dzsjVar2;
        a(dzsjVar3, 3);
        this.c = dzsjVar3;
        a(dzsjVar4, 4);
        this.d = dzsjVar4;
        a(dzsjVar5, 5);
        this.e = dzsjVar5;
    }

    public static <T> void a(T t, int i) {
        if (t != null) {
            return;
        }
        StringBuilder sb = new StringBuilder(93);
        sb.append("@AutoFactory method argument is null but is not marked @Nullable. Argument index: ");
        sb.append(i);
        throw new NullPointerException(sb.toString());
    }
}
