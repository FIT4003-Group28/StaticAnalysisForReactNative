package defpackage;

import java.util.Comparator;
/* compiled from: PG */
/* renamed from: amkd  reason: default package */
/* loaded from: classes.dex */
public final class amkd implements Comparator<amhh> {
    @Override // java.util.Comparator
    public final /* bridge */ /* synthetic */ int compare(amhh amhhVar, amhh amhhVar2) {
        amhh amhhVar3 = amhhVar;
        amhh amhhVar4 = amhhVar2;
        int h = amkg.h(amhhVar3, amhhVar4);
        return h != 0 ? h : amkg.i(amhhVar3, amhhVar4);
    }
}
