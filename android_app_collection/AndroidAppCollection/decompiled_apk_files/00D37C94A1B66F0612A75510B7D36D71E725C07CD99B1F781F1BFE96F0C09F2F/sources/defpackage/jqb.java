package defpackage;

import com.google.android.youtube.R;
/* compiled from: PG */
/* renamed from: jqb  reason: default package */
/* loaded from: classes3.dex */
public final class jqb implements jpf {
    private final yrj a;
    private final fcd b;
    private final aghg c;
    private final azqb d;
    private final ahdf e;
    private final /* synthetic */ int f;

    public jqb(yrj yrjVar, fcd fcdVar, aghg aghgVar, azqb azqbVar, ahdf ahdfVar) {
        this.a = yrjVar;
        this.b = fcdVar;
        this.c = aghgVar;
        this.d = azqbVar;
        this.e = ahdfVar;
    }

    public jqb(yrj yrjVar, fcd fcdVar, aghg aghgVar, azqb azqbVar, ahdf ahdfVar, int i) {
        this.f = i;
        this.a = yrjVar;
        this.b = fcdVar;
        this.c = aghgVar;
        this.d = azqbVar;
        this.e = ahdfVar;
    }

    @Override // defpackage.jpf
    public final ampq a(agqp agqpVar, agqu agquVar, asaa asaaVar) {
        int ap;
        int i = this.f;
        Integer valueOf = Integer.valueOf((int) R.string.downloaded_video_pending_wifi_or_unmetered);
        Integer valueOf2 = Integer.valueOf((int) R.string.downloaded_video_renewing);
        Integer valueOf3 = Integer.valueOf((int) R.string.downloaded_video_pending_wifi);
        Integer valueOf4 = Integer.valueOf((int) R.string.downloaded_video_error_generic);
        Integer valueOf5 = Integer.valueOf((int) R.string.downloaded_video_paused);
        Integer valueOf6 = Integer.valueOf((int) R.string.downloaded_video_pending_storage);
        Integer valueOf7 = Integer.valueOf((int) R.string.downloaded_video_pending_network);
        Integer valueOf8 = Integer.valueOf((int) R.string.downloaded_video_waiting);
        if (i == 0) {
            agqp agqpVar2 = agqp.DELETED;
            switch (agqpVar.ordinal()) {
                case 4:
                    return ampq.j(valueOf8);
                case 5:
                    return ampq.j(Integer.valueOf((int) R.string.downloaded_video_pending_approval_online_context));
                case 6:
                    return ampq.j(valueOf7);
                case 7:
                    if (!this.e.c() || !this.c.a() || ((agvq) this.d.get()).w() != awuy.UNMETERED_WIFI_OR_UNMETERED_MOBILE) {
                        return ampq.j(valueOf3);
                    }
                    return ampq.j(valueOf);
                case 8:
                case 11:
                case 14:
                case 18:
                case 21:
                default:
                    return amon.a;
                case 9:
                    return ampq.j(valueOf6);
                case 10:
                    return ampq.j(valueOf5);
                case 12:
                case 15:
                case 16:
                    return ampq.j(Integer.valueOf((int) R.string.downloaded_video_error_unplayable_online_context));
                case 13:
                    return ampq.j(Integer.valueOf((int) R.string.downloaded_video_error_streams_missing_online_context));
                case 17:
                    if (!this.b.a || !this.a.o()) {
                        return ampq.j(Integer.valueOf((int) R.string.downloaded_video_error_expired_online_context));
                    }
                    return ampq.j(valueOf2);
                case 19:
                    return ampq.j(Integer.valueOf((int) R.string.downloaded_video_error_network_online_context));
                case 20:
                    return ampq.j(Integer.valueOf((int) R.string.downloaded_video_error_disk_online_context));
                case 22:
                    return ampq.j(valueOf4);
            }
        }
        boolean o = this.a.o();
        agqp agqpVar3 = agqp.DELETED;
        switch (agqpVar.ordinal()) {
            case 4:
                return ampq.j(valueOf8);
            case 5:
                return ampq.j(Integer.valueOf((int) R.string.downloaded_video_pending_approval_download_context));
            case 6:
                return ampq.j(valueOf7);
            case 7:
                if (!this.e.c() || !this.c.a() || ((agvq) this.d.get()).w() != awuy.UNMETERED_WIFI_OR_UNMETERED_MOBILE) {
                    return ampq.j(valueOf3);
                }
                return ampq.j(valueOf);
            case 8:
            case 11:
            case 14:
            case 18:
            default:
                return amon.a;
            case 9:
                return ampq.j(valueOf6);
            case 10:
                return ampq.j(valueOf5);
            case 12:
                if (asaaVar == null) {
                    return ampq.j(Integer.valueOf((int) R.string.downloaded_video_error_unplayable_download_context));
                }
                int cj = awwc.cj(asaaVar.c);
                if (cj == 0) {
                    cj = 1;
                }
                int i2 = cj - 1;
                if (i2 == 4) {
                    return ampq.j(Integer.valueOf((int) R.string.downloaded_video_error_unplayable_content_check_download_context));
                }
                if (i2 == 5) {
                    return ampq.j(Integer.valueOf((int) R.string.downloaded_video_error_unplayable_age_check_download_context));
                }
                return ampq.j(Integer.valueOf((int) R.string.downloaded_video_error_unplayable_download_context));
            case 13:
                return ampq.j(Integer.valueOf((int) R.string.downloaded_video_error_streams_missing_download_context));
            case 15:
            case 16:
                return ampq.j(Integer.valueOf((int) R.string.downloaded_video_error_unplayable_download_context));
            case 17:
                boolean z = this.b.a;
                if (agquVar != null && (ap = akel.ap(agquVar.b.j)) != 0 && ap == 4) {
                    return ampq.j(Integer.valueOf((int) R.string.downloaded_video_error_expired_travel_download_context));
                }
                if (!o) {
                    return ampq.j(Integer.valueOf((int) R.string.downloaded_video_error_expired_disconnected_download_context));
                }
                if (z) {
                    return ampq.j(valueOf2);
                }
                return ampq.j(Integer.valueOf((int) R.string.downloaded_video_error_expired_connected_download_context));
            case 19:
                if (o) {
                    return ampq.j(Integer.valueOf((int) R.string.downloaded_video_error_network_connected_download_context));
                }
                return ampq.j(Integer.valueOf((int) R.string.downloaded_video_error_network_disconnected_download_context));
            case 20:
                return ampq.j(Integer.valueOf((int) R.string.downloaded_video_error_disk_download_context));
            case 21:
                return ampq.j(Integer.valueOf((int) R.string.downloaded_video_temp_error_disk_sd_card_download_context));
            case 22:
                return ampq.j(valueOf4);
        }
    }
}
