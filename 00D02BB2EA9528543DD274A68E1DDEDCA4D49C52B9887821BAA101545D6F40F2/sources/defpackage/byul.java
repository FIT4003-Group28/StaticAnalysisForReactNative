package defpackage;

import java.util.Comparator;
/* compiled from: PG */
/* renamed from: byul  reason: default package */
/* loaded from: classes4.dex */
public final class byul implements Comparator<bzia> {
    private static long a(bzia bziaVar) {
        bzjh bzjhVar;
        int i = bziaVar.b;
        if (i == 2) {
            return ((bzjl) bziaVar.c).b;
        }
        if (i == 1) {
            bzjhVar = (bzjh) bziaVar.c;
        } else {
            bzjhVar = bzjh.j;
        }
        return bzjhVar.b;
    }

    @Override // java.util.Comparator
    public final /* bridge */ /* synthetic */ int compare(bzia bziaVar, bzia bziaVar2) {
        return (a(bziaVar) > a(bziaVar2) ? 1 : (a(bziaVar) == a(bziaVar2) ? 0 : -1));
    }
}
