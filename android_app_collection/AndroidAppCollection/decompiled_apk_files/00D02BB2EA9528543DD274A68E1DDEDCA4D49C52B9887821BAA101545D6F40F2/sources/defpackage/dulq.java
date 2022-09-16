package defpackage;
/* compiled from: PG */
/* renamed from: dulq  reason: default package */
/* loaded from: classes6.dex */
public enum dulq implements dsrb {
    COMBINE_ACTIONS_WITH_PREVIOUS_ITEM(1),
    REMOVE_PRECEDING_DIVIDER_LINE(2),
    REMOVE_FOLLOWING_DIVIDER_LINE(4),
    TITLE_CAPITALIZATION_STYLE(3),
    FIFE_IMAGE_URL(5),
    IMAGE_CONTENT_DESCRIPTION(6),
    TEXT_HIGHLIGHT_STYLE_BOLD_ITALIC(7),
    PHOTO_OFFERING_INFO(8),
    PHOTO_VOTE_INFO(9);
    
    public final int j;

    dulq(int i) {
        this.j = i;
    }

    public static dulq b(int i) {
        switch (i) {
            case 1:
                return COMBINE_ACTIONS_WITH_PREVIOUS_ITEM;
            case 2:
                return REMOVE_PRECEDING_DIVIDER_LINE;
            case 3:
                return TITLE_CAPITALIZATION_STYLE;
            case 4:
                return REMOVE_FOLLOWING_DIVIDER_LINE;
            case 5:
                return FIFE_IMAGE_URL;
            case 6:
                return IMAGE_CONTENT_DESCRIPTION;
            case 7:
                return TEXT_HIGHLIGHT_STYLE_BOLD_ITALIC;
            case 8:
                return PHOTO_OFFERING_INFO;
            case 9:
                return PHOTO_VOTE_INFO;
            default:
                return null;
        }
    }

    public static dsrd c() {
        return dulp.a;
    }

    @Override // defpackage.dsrb
    public final int a() {
        return this.j;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return Integer.toString(this.j);
    }
}
