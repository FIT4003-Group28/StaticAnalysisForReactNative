package defpackage;

import android.os.Parcel;
import com.google.android.filament.R;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.data.DataHolder;
import com.google.android.gms.wearable.internal.AddLocalCapabilityResponse;
import com.google.android.gms.wearable.internal.ChannelReceiveFileResponse;
import com.google.android.gms.wearable.internal.ChannelSendFileResponse;
import com.google.android.gms.wearable.internal.CloseChannelResponse;
import com.google.android.gms.wearable.internal.DeleteDataItemsResponse;
import com.google.android.gms.wearable.internal.GetAllCapabilitiesResponse;
import com.google.android.gms.wearable.internal.GetCapabilityResponse;
import com.google.android.gms.wearable.internal.GetChannelInputStreamResponse;
import com.google.android.gms.wearable.internal.GetChannelOutputStreamResponse;
import com.google.android.gms.wearable.internal.GetCloudSyncOptInOutDoneResponse;
import com.google.android.gms.wearable.internal.GetCloudSyncOptInStatusResponse;
import com.google.android.gms.wearable.internal.GetCloudSyncSettingResponse;
import com.google.android.gms.wearable.internal.GetConfigResponse;
import com.google.android.gms.wearable.internal.GetConfigsResponse;
import com.google.android.gms.wearable.internal.GetConnectedNodesResponse;
import com.google.android.gms.wearable.internal.GetDataItemResponse;
import com.google.android.gms.wearable.internal.GetFdForAssetResponse;
import com.google.android.gms.wearable.internal.GetLocalNodeResponse;
import com.google.android.gms.wearable.internal.OpenChannelResponse;
import com.google.android.gms.wearable.internal.PutDataResponse;
import com.google.android.gms.wearable.internal.RemoveLocalCapabilityResponse;
import com.google.android.gms.wearable.internal.RpcResponse;
import com.google.android.gms.wearable.internal.SendMessageResponse;
import com.google.android.gms.wearable.internal.StorageInfoResponse;
/* compiled from: PG */
/* renamed from: cpit  reason: default package */
/* loaded from: classes5.dex */
public abstract class cpit extends clb implements cpiu {
    public cpit() {
        super("com.google.android.gms.wearable.internal.IWearableCallbacks");
    }

    @Override // defpackage.clb
    protected final boolean Sw(int i, Parcel parcel, Parcel parcel2) {
        switch (i) {
            case 2:
                GetConfigResponse getConfigResponse = (GetConfigResponse) clc.d(parcel, GetConfigResponse.CREATOR);
                s();
                break;
            case 3:
                PutDataResponse putDataResponse = (PutDataResponse) clc.d(parcel, PutDataResponse.CREATOR);
                z();
                break;
            case 4:
                GetDataItemResponse getDataItemResponse = (GetDataItemResponse) clc.d(parcel, GetDataItemResponse.CREATOR);
                u();
                break;
            case 5:
                b((DataHolder) clc.d(parcel, DataHolder.CREATOR));
                break;
            case 6:
                c((DeleteDataItemsResponse) clc.d(parcel, DeleteDataItemsResponse.CREATOR));
                break;
            case 7:
                d((SendMessageResponse) clc.d(parcel, SendMessageResponse.CREATOR));
                break;
            case 8:
                GetFdForAssetResponse getFdForAssetResponse = (GetFdForAssetResponse) clc.d(parcel, GetFdForAssetResponse.CREATOR);
                v();
                break;
            case 9:
                GetLocalNodeResponse getLocalNodeResponse = (GetLocalNodeResponse) clc.d(parcel, GetLocalNodeResponse.CREATOR);
                w();
                break;
            case 10:
                e((GetConnectedNodesResponse) clc.d(parcel, GetConnectedNodesResponse.CREATOR));
                break;
            case 11:
                f((Status) clc.d(parcel, Status.CREATOR));
                break;
            case 12:
                StorageInfoResponse storageInfoResponse = (StorageInfoResponse) clc.d(parcel, StorageInfoResponse.CREATOR);
                x();
                break;
            case 13:
                GetConfigsResponse getConfigsResponse = (GetConfigsResponse) clc.d(parcel, GetConfigsResponse.CREATOR);
                t();
                break;
            case 14:
                OpenChannelResponse openChannelResponse = (OpenChannelResponse) clc.d(parcel, OpenChannelResponse.CREATOR);
                y();
                break;
            case 15:
                CloseChannelResponse closeChannelResponse = (CloseChannelResponse) clc.d(parcel, CloseChannelResponse.CREATOR);
                j();
                break;
            case 16:
                CloseChannelResponse closeChannelResponse2 = (CloseChannelResponse) clc.d(parcel, CloseChannelResponse.CREATOR);
                k();
                break;
            case 17:
                GetChannelInputStreamResponse getChannelInputStreamResponse = (GetChannelInputStreamResponse) clc.d(parcel, GetChannelInputStreamResponse.CREATOR);
                n();
                break;
            case 18:
                GetChannelOutputStreamResponse getChannelOutputStreamResponse = (GetChannelOutputStreamResponse) clc.d(parcel, GetChannelOutputStreamResponse.CREATOR);
                o();
                break;
            case 19:
                ChannelReceiveFileResponse channelReceiveFileResponse = (ChannelReceiveFileResponse) clc.d(parcel, ChannelReceiveFileResponse.CREATOR);
                h();
                break;
            case 20:
                ChannelSendFileResponse channelSendFileResponse = (ChannelSendFileResponse) clc.d(parcel, ChannelSendFileResponse.CREATOR);
                i();
                break;
            case 21:
            case 24:
            case 25:
            case R.styleable.AppCompatTheme_actionModeWebSearchDrawable /* 31 */:
            case R.styleable.AppCompatTheme_actionOverflowButtonStyle /* 32 */:
            case R.styleable.AppCompatTheme_actionOverflowMenuStyle /* 33 */:
            default:
                return false;
            case 22:
                GetCapabilityResponse getCapabilityResponse = (GetCapabilityResponse) clc.d(parcel, GetCapabilityResponse.CREATOR);
                m();
                break;
            case 23:
                GetAllCapabilitiesResponse getAllCapabilitiesResponse = (GetAllCapabilitiesResponse) clc.d(parcel, GetAllCapabilitiesResponse.CREATOR);
                l();
                break;
            case 26:
                AddLocalCapabilityResponse addLocalCapabilityResponse = (AddLocalCapabilityResponse) clc.d(parcel, AddLocalCapabilityResponse.CREATOR);
                g();
                break;
            case 27:
                RemoveLocalCapabilityResponse removeLocalCapabilityResponse = (RemoveLocalCapabilityResponse) clc.d(parcel, RemoveLocalCapabilityResponse.CREATOR);
                A();
                break;
            case 28:
                GetCloudSyncOptInOutDoneResponse getCloudSyncOptInOutDoneResponse = (GetCloudSyncOptInOutDoneResponse) clc.d(parcel, GetCloudSyncOptInOutDoneResponse.CREATOR);
                p();
                break;
            case 29:
                GetCloudSyncSettingResponse getCloudSyncSettingResponse = (GetCloudSyncSettingResponse) clc.d(parcel, GetCloudSyncSettingResponse.CREATOR);
                r();
                break;
            case R.styleable.AppCompatTheme_actionModeTheme /* 30 */:
                GetCloudSyncOptInStatusResponse getCloudSyncOptInStatusResponse = (GetCloudSyncOptInStatusResponse) clc.d(parcel, GetCloudSyncOptInStatusResponse.CREATOR);
                q();
                break;
            case R.styleable.AppCompatTheme_activityChooserViewStyle /* 34 */:
                RpcResponse rpcResponse = (RpcResponse) clc.d(parcel, RpcResponse.CREATOR);
                B();
                break;
        }
        parcel2.writeNoException();
        return true;
    }
}
