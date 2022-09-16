package defpackage;

import android.os.Parcelable;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import com.google.android.gms.appdatasearch.DocumentContents;
import com.google.android.gms.appdatasearch.DocumentId;
import com.google.android.gms.appdatasearch.DocumentSection;
import com.google.android.gms.appdatasearch.Feature;
import com.google.android.gms.appdatasearch.GetRecentContextCall$Response;
import com.google.android.gms.appdatasearch.RegisterSectionInfo;
import com.google.android.gms.appdatasearch.ScoringConfig;
import com.google.android.gms.appdatasearch.UsageInfo;
import com.google.android.gms.auth.AccountChangeEvent;
import com.google.android.gms.auth.AccountChangeEventsRequest;
import com.google.android.gms.auth.AccountChangeEventsResponse;
import com.google.android.gms.auth.GetAccountsRequest;
import com.google.android.gms.auth.HasCapabilitiesRequest;
import com.google.android.gms.auth.TokenData;
import com.google.android.gms.auth.api.proxy.ProxyResponse;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.auth.firstparty.dataservice.ClearTokenRequest;
import com.google.android.gms.cast.AdBreakClipInfo;
import com.google.android.gms.cast.AdBreakInfo;
import com.google.android.gms.cast.AdBreakStatus;
/* compiled from: PG */
/* renamed from: qhh  reason: default package */
/* loaded from: classes4.dex */
public final class qhh implements Parcelable.Creator {
    private final /* synthetic */ int a;

    public qhh() {
    }

    public qhh(int i) {
        this.a = i;
    }

    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
        switch (this.a) {
            case 0:
                return new DocumentContents[i];
            case 1:
                return new VersionInfoParcel[i];
            case 2:
                return new DocumentId[i];
            case 3:
                return new DocumentSection[i];
            case 4:
                return new Feature[i];
            case 5:
                return new GetRecentContextCall$Response[i];
            case 6:
                return new RegisterSectionInfo[i];
            case 7:
                return new ScoringConfig[i];
            case 8:
                return new UsageInfo[i];
            case 9:
                return new AccountChangeEvent[i];
            case 10:
                return new AccountChangeEventsRequest[i];
            case 11:
                return new AccountChangeEventsResponse[i];
            case 12:
                return new GetAccountsRequest[i];
            case 13:
                return new HasCapabilitiesRequest[i];
            case 14:
                return new TokenData[i];
            case 15:
                return new ProxyResponse[i];
            case 16:
                return new GoogleSignInAccount[i];
            case 17:
                return new ClearTokenRequest[i];
            case 18:
                return new AdBreakClipInfo[i];
            case 19:
                return new AdBreakInfo[i];
            default:
                return new AdBreakStatus[i];
        }
    }

    /*  JADX ERROR: JadxRuntimeException in pass: BlockProcessor
        jadx.core.utils.exceptions.JadxRuntimeException: CFG modification limit reached, blocks count: 612
        	at jadx.core.dex.visitors.blocks.BlockProcessor.processBlocksTree(BlockProcessor.java:60)
        	at jadx.core.dex.visitors.blocks.BlockProcessor.visit(BlockProcessor.java:40)
        */
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ java.lang.Object createFromParcel(android.os.Parcel r30) {
        /*
            Method dump skipped, instructions count: 1896
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.qhh.createFromParcel(android.os.Parcel):java.lang.Object");
    }
}
