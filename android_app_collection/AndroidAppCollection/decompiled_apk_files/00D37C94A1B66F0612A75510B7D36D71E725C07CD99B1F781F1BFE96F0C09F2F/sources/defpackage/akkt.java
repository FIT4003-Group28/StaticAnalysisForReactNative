package defpackage;
/* compiled from: PG */
/* renamed from: akkt  reason: default package */
/* loaded from: classes.dex */
enum akkt {
    CHANNEL_ITEM,
    REMOVE_CONTACT_ITEM,
    BLOCK_ITEM,
    UNBLOCK_ITEM,
    INVITE_ITEM,
    CANCEL_INVITE_ITEM,
    ACCEPT_INVITE_ITEM,
    REINVITE_ITEM,
    CHAT_ITEM;

    public final ateg a(aqgl aqglVar) {
        switch (ordinal()) {
            case 0:
                ateg ategVar = aqglVar.c;
                return ategVar == null ? ateg.a : ategVar;
            case 1:
                ateg ategVar2 = aqglVar.d;
                return ategVar2 == null ? ateg.a : ategVar2;
            case 2:
                ateg ategVar3 = aqglVar.e;
                return ategVar3 == null ? ateg.a : ategVar3;
            case 3:
                ateg ategVar4 = aqglVar.j;
                return ategVar4 == null ? ateg.a : ategVar4;
            case 4:
                ateg ategVar5 = aqglVar.f;
                return ategVar5 == null ? ateg.a : ategVar5;
            case 5:
                ateg ategVar6 = aqglVar.g;
                return ategVar6 == null ? ateg.a : ategVar6;
            case 6:
                ateg ategVar7 = aqglVar.i;
                return ategVar7 == null ? ateg.a : ategVar7;
            case 7:
                ateg ategVar8 = aqglVar.h;
                return ategVar8 == null ? ateg.a : ategVar8;
            case 8:
                ateg ategVar9 = aqglVar.k;
                return ategVar9 == null ? ateg.a : ategVar9;
            default:
                throw new IllegalArgumentException(name());
        }
    }
}
