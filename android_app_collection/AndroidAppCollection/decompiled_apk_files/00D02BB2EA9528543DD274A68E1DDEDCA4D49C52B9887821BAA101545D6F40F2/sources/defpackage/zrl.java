package defpackage;

import android.content.res.Resources;
import java.util.List;
/* compiled from: PG */
/* renamed from: zrl  reason: default package */
/* loaded from: classes7.dex */
public class zrl {
    private final dzsj<Resources> a;
    private final dzsj<dxio<bwsh>> b;
    private final dzsj<btvo> c;

    public zrl(dzsj<Resources> dzsjVar, dzsj<dxio<bwsh>> dzsjVar2, dzsj<btvo> dzsjVar3) {
        b(dzsjVar, 1);
        this.a = dzsjVar;
        b(dzsjVar2, 2);
        this.b = dzsjVar2;
        b(dzsjVar3, 3);
        this.c = dzsjVar3;
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

    public final zrk a(amuo amuoVar, @dzsi amub amubVar, @dzsi String str, @dzsi String str2, CharSequence charSequence, @dzsi CharSequence charSequence2, @dzsi CharSequence charSequence3, cqtd cqtdVar, cqtd cqtdVar2, List<zcv> list, boolean z, @dzsi Runnable runnable, @dzsi atee ateeVar, @dzsi ated atedVar) {
        Resources a = this.a.a();
        b(a, 1);
        dxio a2 = ((dxjh) this.b).a();
        b(a2, 2);
        b(amuoVar, 3);
        b(charSequence, 7);
        b(cqtdVar, 10);
        b(cqtdVar2, 11);
        b(list, 12);
        btvo a3 = this.c.a();
        b(a3, 17);
        return new zrk(a, a2, amuoVar, amubVar, str, str2, charSequence, charSequence2, charSequence3, cqtdVar, cqtdVar2, list, z, runnable, ateeVar, atedVar, a3);
    }
}
