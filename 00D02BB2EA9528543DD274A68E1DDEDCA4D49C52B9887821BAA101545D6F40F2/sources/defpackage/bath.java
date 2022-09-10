package defpackage;
/* compiled from: PG */
/* renamed from: bath  reason: default package */
/* loaded from: classes3.dex */
public final class bath {
    public final dxio<btvo> a;

    public bath(dxio<btvo> dxioVar) {
        this.a = dxioVar;
    }

    public final dvko a(@dzsi dndr dndrVar) {
        dvkp personalPlacesParameters = this.a.a().getPersonalPlacesParameters();
        if (dndrVar == null) {
            dvko dvkoVar = personalPlacesParameters.b;
            return dvkoVar == null ? dvko.n : dvkoVar;
        }
        int ordinal = dndrVar.ordinal();
        if (ordinal != 1 && ordinal != 2) {
            dvko dvkoVar2 = personalPlacesParameters.b;
            return dvkoVar2 == null ? dvko.n : dvkoVar2;
        } else if ((personalPlacesParameters.a & 2) != 0) {
            dvko dvkoVar3 = personalPlacesParameters.c;
            return dvkoVar3 == null ? dvko.n : dvkoVar3;
        } else {
            dvko dvkoVar4 = personalPlacesParameters.b;
            return dvkoVar4 == null ? dvko.n : dvkoVar4;
        }
    }
}
