package defpackage;

import java.util.Comparator;
/* compiled from: PG */
/* renamed from: abyb  reason: default package */
/* loaded from: classes2.dex */
final class abyb implements Comparator<acej> {
    @Override // java.util.Comparator
    public final /* bridge */ /* synthetic */ int compare(acej acejVar, acej acejVar2) {
        acej acejVar3 = acejVar2;
        dizh dizhVar = acejVar.a().p;
        if (dizhVar == null) {
            dizhVar = dizh.j;
        }
        diis diisVar = dizhVar.g;
        if (diisVar == null) {
            diisVar = diis.h;
        }
        dhpf dhpfVar = diisVar.e;
        if (dhpfVar == null) {
            dhpfVar = dhpf.i;
        }
        Long valueOf = Long.valueOf(abyc.a(dhpfVar));
        dizh dizhVar2 = acejVar3.a().p;
        if (dizhVar2 == null) {
            dizhVar2 = dizh.j;
        }
        diis diisVar2 = dizhVar2.g;
        if (diisVar2 == null) {
            diisVar2 = diis.h;
        }
        dhpf dhpfVar2 = diisVar2.e;
        if (dhpfVar2 == null) {
            dhpfVar2 = dhpf.i;
        }
        return Long.valueOf(abyc.a(dhpfVar2)).compareTo(valueOf);
    }
}
