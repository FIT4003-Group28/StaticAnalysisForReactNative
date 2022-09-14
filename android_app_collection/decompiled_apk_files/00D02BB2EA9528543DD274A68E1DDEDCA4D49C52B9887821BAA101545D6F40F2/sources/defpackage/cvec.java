package defpackage;

import java.security.InvalidParameterException;
/* compiled from: PG */
/* renamed from: cvec  reason: default package */
/* loaded from: classes5.dex */
public enum cvec {
    MESSAGE_BUBBLE(0),
    SUGGESTION_LIST(1),
    RICH_CARD_BUBBLE(2),
    TOMBSTONE_BUBBLE(3),
    TYPING_INDICATOR(4);
    
    public final int f;

    cvec(int i) {
        this.f = i;
    }

    public static cvec a(int i) {
        if (i != 0) {
            if (i == 1) {
                return SUGGESTION_LIST;
            }
            if (i == 2) {
                return RICH_CARD_BUBBLE;
            }
            if (i == 3) {
                return TOMBSTONE_BUBBLE;
            }
            if (i != 4) {
                throw new InvalidParameterException("Invalid MessageListCellViewModel type.");
            }
            return TYPING_INDICATOR;
        }
        return MESSAGE_BUBBLE;
    }
}
