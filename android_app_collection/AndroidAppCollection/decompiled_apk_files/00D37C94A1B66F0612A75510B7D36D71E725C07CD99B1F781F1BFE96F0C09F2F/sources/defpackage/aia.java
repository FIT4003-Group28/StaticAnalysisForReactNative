package defpackage;

import java.util.ArrayList;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: aia  reason: default package */
/* loaded from: classes.dex */
public final class aia {
    public static int a;
    aid b;
    final ArrayList c = new ArrayList();

    public aia(aid aidVar) {
        this.b = null;
        a++;
        this.b = aidVar;
    }

    public final long a(ahu ahuVar, long j) {
        aid aidVar = ahuVar.d;
        if (aidVar instanceof ahy) {
            return j;
        }
        int size = ahuVar.j.size();
        long j2 = j;
        for (int i = 0; i < size; i++) {
            ahs ahsVar = (ahs) ahuVar.j.get(i);
            if (ahsVar instanceof ahu) {
                ahu ahuVar2 = (ahu) ahsVar;
                if (ahuVar2.d != aidVar) {
                    j2 = Math.min(j2, a(ahuVar2, ahuVar2.e + j));
                }
            }
        }
        if (ahuVar != aidVar.j) {
            return j2;
        }
        long a2 = j - aidVar.a();
        return Math.min(Math.min(j2, a(aidVar.i, a2)), a2 - aidVar.i.e);
    }

    public final long b(ahu ahuVar, long j) {
        aid aidVar = ahuVar.d;
        if (aidVar instanceof ahy) {
            return j;
        }
        int size = ahuVar.j.size();
        long j2 = j;
        for (int i = 0; i < size; i++) {
            ahs ahsVar = (ahs) ahuVar.j.get(i);
            if (ahsVar instanceof ahu) {
                ahu ahuVar2 = (ahu) ahsVar;
                if (ahuVar2.d != aidVar) {
                    j2 = Math.max(j2, b(ahuVar2, ahuVar2.e + j));
                }
            }
        }
        if (ahuVar != aidVar.i) {
            return j2;
        }
        long a2 = j + aidVar.a();
        return Math.max(Math.max(j2, b(aidVar.j, a2)), a2 - aidVar.j.e);
    }
}
