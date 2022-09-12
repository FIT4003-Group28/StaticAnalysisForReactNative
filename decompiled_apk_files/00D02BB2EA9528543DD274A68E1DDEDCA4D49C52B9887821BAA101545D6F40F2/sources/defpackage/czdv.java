package defpackage;
/* renamed from: czdv  reason: default package */
/* loaded from: classes5.dex */
final /* synthetic */ class czdv implements dbrn {
    static final dbrn a = new czdv();

    private czdv() {
    }

    @Override // defpackage.dbrn
    public final Object a(Object obj) {
        int i;
        cyxh cyxhVar;
        cykz cykzVar = (cykz) obj;
        cyxi d = cyxj.d();
        switch (cykzVar.a) {
            case 0:
                i = 2;
                break;
            case 1:
                i = 3;
                break;
            case 2:
                i = 4;
                break;
            case 3:
                i = 5;
                break;
            case 4:
                i = 6;
                break;
            case 5:
                i = 7;
                break;
            case 6:
                i = 8;
                break;
            case 7:
                i = 9;
                break;
            case 8:
                i = 10;
                break;
            case 9:
                i = 11;
                break;
            case 10:
                i = 12;
                break;
            case 11:
                i = 13;
                break;
            case 12:
                i = 14;
                break;
            case 13:
                i = 15;
                break;
            case 14:
                i = 16;
                break;
            case 15:
                i = 17;
                break;
            case 16:
                i = 18;
                break;
            case 17:
                i = 19;
                break;
            case 18:
                i = 20;
                break;
            default:
                i = 0;
                break;
        }
        if (i == 0) {
            i = 1;
        }
        switch (i - 2) {
            case 1:
                cyxhVar = cyxh.TIMES_CONTACTED;
                break;
            case 2:
                cyxhVar = cyxh.SECONDS_SINCE_LAST_TIME_CONTACTED;
                break;
            case 3:
                cyxhVar = cyxh.IS_SECONDARY_GOOGLE_ACCOUNT;
                break;
            case 4:
                cyxhVar = cyxh.FIELD_TIMES_USED;
                break;
            case 5:
                cyxhVar = cyxh.FIELD_SECONDS_SINCE_LAST_TIME_USED;
                break;
            case 6:
                cyxhVar = cyxh.IS_CONTACT_STARRED;
                break;
            case 7:
                cyxhVar = cyxh.HAS_POSTAL_ADDRESS;
                break;
            case 8:
                cyxhVar = cyxh.HAS_NICKNAME;
                break;
            case 9:
                cyxhVar = cyxh.HAS_BIRTHDAY;
                break;
            case 10:
                cyxhVar = cyxh.HAS_CUSTOM_RINGTONE;
                break;
            case 11:
                cyxhVar = cyxh.HAS_AVATAR;
                break;
            case 12:
                cyxhVar = cyxh.IS_SENT_TO_VOICEMAIL;
                break;
            case 13:
                cyxhVar = cyxh.IS_PINNED;
                break;
            case 14:
                cyxhVar = cyxh.PINNED_POSITION;
                break;
            case 15:
                cyxhVar = cyxh.NUM_COMMUNICATION_CHANNELS;
                break;
            case 16:
                cyxhVar = cyxh.NUM_RAW_CONTACTS;
                break;
            case 17:
                cyxhVar = cyxh.FIELD_IS_PRIMARY;
                break;
            case 18:
                cyxhVar = cyxh.FIELD_IS_SUPER_PRIMARY;
                break;
            default:
                cyxhVar = cyxh.UNKNOWN;
                break;
        }
        d.c(cyxhVar);
        d.d(cykzVar.b);
        d.b(cykzVar.c);
        return d.a();
    }
}
