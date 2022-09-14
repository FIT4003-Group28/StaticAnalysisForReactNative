package defpackage;
/* compiled from: PG */
/* renamed from: pfa  reason: default package */
/* loaded from: classes7.dex */
public enum pfa {
    PLACE_VIEWS(2, 2),
    RECENT_SEARCHES_ZERO_SUGGEST(3, 3),
    VIEWPORT_UPDATES(4, 2);

    pfa(int i, int i2) {
        dfnz bZ = dfoc.d.bZ();
        if (bZ.c) {
            bZ.bF();
            bZ.c = false;
        }
        dfoc dfocVar = (dfoc) bZ.b;
        dfocVar.b = i - 1;
        int i3 = dfocVar.a | 1;
        dfocVar.a = i3;
        dfocVar.c = i2 - 1;
        dfocVar.a = i3 | 2;
        bZ.bK();
    }
}
