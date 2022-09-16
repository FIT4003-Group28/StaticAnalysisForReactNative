package defpackage;

import com.google.android.libraries.youtube.innertube.model.BrowseResponseModel;
import com.google.android.libraries.youtube.innertube.model.WatchNextResponseModel;
import j$.util.Optional;
import java.util.Collection;
import java.util.List;
import java.util.concurrent.TimeoutException;
/* compiled from: PG */
/* renamed from: jgl  reason: default package */
/* loaded from: classes3.dex */
public final /* synthetic */ class jgl implements ampg {
    private final /* synthetic */ int u;
    public static final /* synthetic */ jgl t = new jgl(20);
    public static final /* synthetic */ jgl s = new jgl(19);
    public static final /* synthetic */ jgl r = new jgl(18);
    public static final /* synthetic */ jgl q = new jgl(17);
    public static final /* synthetic */ jgl p = new jgl(16);
    public static final /* synthetic */ jgl o = new jgl(15);
    public static final /* synthetic */ jgl n = new jgl(14);
    public static final /* synthetic */ jgl m = new jgl(13);
    public static final /* synthetic */ jgl l = new jgl(12);
    public static final /* synthetic */ jgl k = new jgl(11);
    public static final /* synthetic */ jgl j = new jgl(10);
    public static final /* synthetic */ jgl i = new jgl(9);
    public static final /* synthetic */ jgl h = new jgl(8);
    public static final /* synthetic */ jgl g = new jgl(7);
    public static final /* synthetic */ jgl f = new jgl(6);
    public static final /* synthetic */ jgl e = new jgl(5);
    public static final /* synthetic */ jgl d = new jgl(4);
    public static final /* synthetic */ jgl c = new jgl(3);
    public static final /* synthetic */ jgl b = new jgl(2);
    public static final /* synthetic */ jgl a = new jgl();

    private /* synthetic */ jgl() {
    }

    public /* synthetic */ jgl(int i2) {
        this.u = i2;
    }

    @Override // defpackage.ampg
    public final Object apply(Object obj) {
        aqot aqotVar;
        boolean z = false;
        switch (this.u) {
            case 0:
                awnn awnnVar = (awnn) obj;
                aopa createBuilder = awsr.a.createBuilder();
                createBuilder.copyOnWrite();
                awsr awsrVar = (awsr) createBuilder.instance;
                awnnVar.getClass();
                awsrVar.d = awnnVar;
                awsrVar.c |= 1;
                return (awsr) createBuilder.mo39build();
            case 1:
                agqp agqpVar = agqp.DELETED;
                switch (((agqp) obj).ordinal()) {
                    case 1:
                        return jiq.PLAYABLE;
                    case 2:
                    case 11:
                    case 14:
                    case 19:
                    default:
                        zep.b("Unrecognized OfflineVideoDisplayState, defaulting to unknown");
                        return jiq.UNKNOWN;
                    case 3:
                        return jiq.TRANSFER_IN_PROGRESS;
                    case 4:
                    case 6:
                    case 7:
                    case 8:
                    case 9:
                        return jiq.TRANSFER_WAITING_IN_QUEUE;
                    case 5:
                        return jiq.TRANSFER_PENDING_USER_APPROVAL;
                    case 10:
                        return jiq.TRANSFER_PAUSED;
                    case 12:
                        return jiq.ERROR_PENDING_PLAYABILITY_ACTION;
                    case 13:
                        return jiq.ERROR_STREAMS_MISSING;
                    case 15:
                        return jiq.ERROR_NOT_PLAYABLE;
                    case 16:
                        return jiq.ERROR_POLICY;
                    case 17:
                        return jiq.ERROR_EXPIRED;
                    case 18:
                        return jiq.ERROR_EXPIRED_RENTAL;
                    case 20:
                        return jiq.ERROR_DISK;
                    case 21:
                        return jiq.ERROR_DISK_SD_CARD;
                    case 22:
                        return jiq.ERROR_GENERIC;
                }
            case 2:
                awnn awnnVar2 = (awnn) obj;
                aopa createBuilder2 = aqmi.a.createBuilder();
                createBuilder2.copyOnWrite();
                aqmi aqmiVar = (aqmi) createBuilder2.instance;
                awnnVar2.getClass();
                aqmiVar.h = awnnVar2;
                aqmiVar.c |= 16;
                return (aqmi) createBuilder2.mo39build();
            case 3:
                aopc aopcVar = (aopc) aqtb.a.createBuilder();
                ajhm.b(aopcVar, (awnn) obj);
                return (aqtb) aopcVar.mo39build();
            case 4:
                return Boolean.valueOf(((jib) obj).a());
            case 5:
                return emn.h((String) obj);
            case 6:
                return emn.q((String) obj);
            case 7:
                return emn.s((String) obj);
            case 8:
                return emn.x((String) obj);
            case 9:
                return (String) obj;
            case 10:
                return aqqu.f((String) obj);
            case 11:
                return Optional.ofNullable((WatchNextResponseModel) obj);
            case 12:
                TimeoutException timeoutException = (TimeoutException) obj;
                return Optional.empty();
            case 13:
                BrowseResponseModel browseResponseModel = new BrowseResponseModel((arlt) obj);
                browseResponseModel.i("browse_response_enable_logging", true);
                browseResponseModel.i("browse_response_new_response_needed", true);
                browseResponseModel.i("browse_response_is_loading_response", true);
                return browseResponseModel;
            case 14:
                BrowseResponseModel browseResponseModel2 = new BrowseResponseModel((arlt) obj);
                browseResponseModel2.i("browse_response_enable_logging", false);
                browseResponseModel2.i("browse_response_new_response_needed", true);
                browseResponseModel2.i("browse_response_is_loading_response", true);
                return browseResponseModel2;
            case 15:
                return amuk.o((Collection) obj);
            case 16:
                return amuk.n(arey.p((List) obj, jny.a));
            case 17:
                aopa mo52toBuilder = ((fdb) obj).mo52toBuilder();
                mo52toBuilder.copyOnWrite();
                fdb fdbVar = (fdb) mo52toBuilder.instance;
                fdbVar.b &= -2;
                fdbVar.c = fdb.a.c;
                return (fdb) mo52toBuilder.mo39build();
            case 18:
                return Boolean.valueOf(!((Boolean) obj).booleanValue());
            case 19:
                if (((aqoy) obj).b == 2) {
                    z = true;
                }
                return Boolean.valueOf(z);
            default:
                aqoy aqoyVar = (aqoy) obj;
                if (aqoyVar.b == 2) {
                    aqotVar = (aqot) aqoyVar.c;
                } else {
                    aqotVar = aqot.a;
                }
                aqpa b2 = aqpa.b(aqotVar.d);
                return b2 == null ? aqpa.FILTER_TYPE_UNSPECIFIED : b2;
        }
    }
}
