package defpackage;

import android.content.res.Resources;
import java.util.List;
/* compiled from: PG */
/* renamed from: apii  reason: default package */
/* loaded from: classes2.dex */
public class apii {
    private final dzsj<Resources> a;
    private final dzsj<apim> b;
    private final dzsj<cjqy> c;
    private final dzsj<aphj> d;

    public apii(dzsj<Resources> dzsjVar, dzsj<apim> dzsjVar2, dzsj<cjqy> dzsjVar3, dzsj<aphj> dzsjVar4) {
        b(dzsjVar, 1);
        this.a = dzsjVar;
        b(dzsjVar2, 2);
        this.b = dzsjVar2;
        b(dzsjVar3, 3);
        this.c = dzsjVar3;
        b(dzsjVar4, 4);
        this.d = dzsjVar4;
    }

    private static <T> void b(T t, int i) {
        if (t != null) {
            return;
        }
        StringBuilder sb = new StringBuilder(93);
        sb.append("@AutoFactory method argument is null but is not marked @Nullable. Argument index: ");
        sb.append(i);
        throw new NullPointerException(sb.toString());
    }

    public final apih a(bwrs<aoyg> bwrsVar, List<aoxt> list, cjtd cjtdVar, aoyk aoykVar) {
        Resources a = this.a.a();
        b(a, 1);
        apim a2 = this.b.a();
        b(a2, 2);
        cjqy a3 = this.c.a();
        b(a3, 3);
        aphj a4 = this.d.a();
        b(a4, 4);
        b(bwrsVar, 5);
        b(list, 6);
        b(cjtdVar, 7);
        b(aoykVar, 8);
        return new apih(a, a2, a3, a4, bwrsVar, list, cjtdVar, aoykVar);
    }
}
