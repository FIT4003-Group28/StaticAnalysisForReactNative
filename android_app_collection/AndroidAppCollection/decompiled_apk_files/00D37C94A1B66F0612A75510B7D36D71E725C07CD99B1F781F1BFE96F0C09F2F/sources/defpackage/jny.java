package defpackage;

import android.text.TextUtils;
import android.view.View;
import com.google.android.libraries.youtube.player.model.PlaybackStartDescriptor;
import com.google.protos.youtube.api.innertube.WatchEndpointOuterClass;
import com.google.protos.youtube.api.innertube.WatchPlaylistEndpointOuterClass;
/* compiled from: PG */
/* renamed from: jny  reason: default package */
/* loaded from: classes3.dex */
public final /* synthetic */ class jny implements ampt {
    private final /* synthetic */ int u;
    public static final /* synthetic */ jny t = new jny(20);
    public static final /* synthetic */ jny s = new jny(19);
    public static final /* synthetic */ jny r = new jny(18);
    public static final /* synthetic */ jny q = new jny(17);
    public static final /* synthetic */ jny p = new jny(16);
    public static final /* synthetic */ jny o = new jny(15);
    public static final /* synthetic */ jny n = new jny(14);
    public static final /* synthetic */ jny m = new jny(13);
    public static final /* synthetic */ jny l = new jny(12);
    public static final /* synthetic */ jny k = new jny(11);
    public static final /* synthetic */ jny j = new jny(10);
    public static final /* synthetic */ jny i = new jny(9);
    public static final /* synthetic */ jny h = new jny(8);
    public static final /* synthetic */ jny g = new jny(7);
    public static final /* synthetic */ jny f = new jny(6);
    public static final /* synthetic */ jny e = new jny(5);
    public static final /* synthetic */ jny d = new jny(4);
    public static final /* synthetic */ jny c = new jny(3);
    public static final /* synthetic */ jny b = new jny(1);
    public static final /* synthetic */ jny a = new jny();

    private /* synthetic */ jny() {
    }

    public /* synthetic */ jny(int i2) {
        this.u = i2;
    }

    @Override // defpackage.ampt
    public final boolean a(Object obj) {
        awnc c2;
        switch (this.u) {
            case 0:
                return ((agqv) obj).s();
            case 1:
                PlaybackStartDescriptor playbackStartDescriptor = (PlaybackStartDescriptor) obj;
                int i2 = jnn.b;
                return playbackStartDescriptor != null && !TextUtils.isEmpty(playbackStartDescriptor.k());
            case 2:
                if (!(obj instanceof ajhh) || (c2 = jsd.c((ajhh) obj)) == null) {
                    return false;
                }
                return c2.qn(aqpc.b);
            case 3:
                return !(obj instanceof aslu);
            case 4:
                apzg apzgVar = (apzg) obj;
                return apzgVar.qn(WatchEndpointOuterClass.watchEndpoint) || apzgVar.qn(WatchPlaylistEndpointOuterClass.watchPlaylistEndpoint) || apzgVar.qn(attg.a);
            case 5:
                apzg apzgVar2 = (apzg) obj;
                return apzgVar2.qn(WatchEndpointOuterClass.watchEndpoint) || apzgVar2.qn(WatchPlaylistEndpointOuterClass.watchPlaylistEndpoint) || apzgVar2.qn(attg.a);
            case 6:
                aslt asltVar = (aslt) obj;
                return (asltVar == null || (asltVar.d & 32) == 0) ? false : true;
            case 7:
                return ((krz) obj).d();
            case 8:
                return !((krz) obj).c();
            case 9:
                return obj instanceof kzq;
            case 10:
                return (obj instanceof awdi) || (obj instanceof auyz) || (obj instanceof ajhh) || (obj instanceof kzq) || (obj instanceof laa);
            case 11:
                arfa arfaVar = (arfa) obj;
                return true;
            case 12:
                aslt asltVar2 = (aslt) obj;
                return (asltVar2 == null || (asltVar2.d & 262144) == 0) ? false : true;
            case 13:
                aslt asltVar3 = (aslt) obj;
                return (asltVar3 == null || (asltVar3.c & 1048576) == 0) ? false : true;
            case 14:
                aslt asltVar4 = (aslt) obj;
                return (asltVar4 == null || (asltVar4.e & 16777216) == 0) ? false : true;
            case 15:
                avwn avwnVar = (avwn) obj;
                return (avwnVar == null || (avwnVar.b & 16777216) == 0) ? false : true;
            case 16:
                return mcp.n(obj);
            case 17:
                return ((View) obj).isClickable();
            case 18:
                return ((View) obj).isClickable();
            case 19:
                return (((atxh) obj).b & 4) != 0;
            default:
                return (((atxh) obj).b & 64) != 0;
        }
    }
}
