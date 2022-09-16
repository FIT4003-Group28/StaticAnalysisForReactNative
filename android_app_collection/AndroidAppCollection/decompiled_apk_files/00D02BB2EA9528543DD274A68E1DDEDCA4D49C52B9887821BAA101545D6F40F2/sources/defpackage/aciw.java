package defpackage;

import android.content.res.Resources;
/* compiled from: PG */
/* renamed from: aciw  reason: default package */
/* loaded from: classes2.dex */
public final class aciw {
    public aciw(dzsj<cqhn> dzsjVar, dzsj<dxio<cafi>> dzsjVar2, dzsj<btrm> dzsjVar3, dzsj<Resources> dzsjVar4, dzsj<akfa> dzsjVar5, dzsj<adxf> dzsjVar6, dzsj<iyj> dzsjVar7, dzsj<bkpi> dzsjVar8, dzsj<bnos> dzsjVar9, dzsj<aciu> dzsjVar10, dzsj<fd> dzsjVar11) {
        a(dzsjVar, 1);
        a(dzsjVar2, 2);
        a(dzsjVar3, 3);
        a(dzsjVar4, 4);
        a(dzsjVar5, 5);
        a(dzsjVar6, 6);
        a(dzsjVar7, 7);
        a(dzsjVar8, 8);
        a(dzsjVar9, 9);
        a(dzsjVar10, 10);
        a(dzsjVar11, 11);
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
