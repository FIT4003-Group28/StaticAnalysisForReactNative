package defpackage;

import java.util.Comparator;
/* compiled from: PG */
/* renamed from: cpow  reason: default package */
/* loaded from: classes5.dex */
public final class cpow implements Comparator<cpox> {
    public static final cpow a = new cpow();

    private cpow() {
    }

    @Override // java.util.Comparator
    public final /* bridge */ /* synthetic */ int compare(cpox cpoxVar, cpox cpoxVar2) {
        return cpoxVar.a() - cpoxVar2.a();
    }
}
