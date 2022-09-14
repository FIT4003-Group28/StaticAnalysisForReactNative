package defpackage;
/* compiled from: PG */
/* renamed from: ahnq  reason: default package */
/* loaded from: classes2.dex */
public enum ahnq {
    ZERO(0),
    ZERO_TO_ONE(1),
    ONE_TO_TWO(2),
    TWO_TO_FOUR(3),
    FOUR_TO_EIGHT(4),
    EIGHT_TO_SIXTEEN(5),
    SIXTEEN_TO_THIRTY_TWO(6),
    THIRTY_TWO_TO_SIXTY_FOUR(7),
    SIXTY_FOUR_TO_HUNDRED_AND_TWENTY_EIGHT(8),
    GREATER_THAN_HUNDRED_AND_TWENTY_EIGHT(9);
    
    public final int k;

    ahnq(int i) {
        this.k = i;
    }
}
