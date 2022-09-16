package defpackage;
/* compiled from: PG */
/* renamed from: ulk  reason: default package */
/* loaded from: classes4.dex */
public final class ulk {
    public final uky a;
    public final uoy b;
    public final aoul c;
    public final aoul d;
    public final upq e;
    public final unl f;

    public ulk(uky ukyVar, uoy uoyVar, aoul aoulVar, upq upqVar, unl unlVar) {
        this.a = ukyVar;
        this.b = uoyVar;
        aouk aoukVar = (aouk) aoulVar.mo52toBuilder();
        aouq aouqVar = aouq.WILL_SWITCH_TO_A_DIFFERENT_ACCOUNT_EVENT;
        aoukVar.copyOnWrite();
        ((aoul) aoukVar.instance).n(aouqVar);
        this.c = (aoul) aoukVar.mo39build();
        aouk aoukVar2 = (aouk) aoulVar.mo52toBuilder();
        aouq aouqVar2 = aouq.SWITCHED_TO_A_DIFFERENT_ACCOUNT_EVENT;
        aoukVar2.copyOnWrite();
        ((aoul) aoukVar2.instance).n(aouqVar2);
        this.d = (aoul) aoukVar2.mo39build();
        this.e = upqVar;
        this.f = unlVar;
    }
}
