package defpackage;

import java.util.Comparator;
/* compiled from: PG */
/* renamed from: bahu  reason: default package */
/* loaded from: classes3.dex */
final class bahu implements Comparator<bayk> {
    @Override // java.util.Comparator
    public final /* bridge */ /* synthetic */ int compare(bayk baykVar, bayk baykVar2) {
        return ((baykVar.i() - baykVar2.i()) > 0L ? 1 : ((baykVar.i() - baykVar2.i()) == 0L ? 0 : -1));
    }
}
