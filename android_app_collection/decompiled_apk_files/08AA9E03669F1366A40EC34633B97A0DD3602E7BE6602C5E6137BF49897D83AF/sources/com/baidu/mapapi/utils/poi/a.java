package com.baidu.mapapi.utils.poi;

import android.content.Context;
import android.util.Log;
import com.baidu.mapapi.http.HttpClient;
import com.baidu.platform.comapi.a.a;
import com.baidu.platform.comapi.a.c;
/* loaded from: classes.dex */
final class a implements a.InterfaceC0037a<c> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ Context f1963a;

    /* JADX INFO: Access modifiers changed from: package-private */
    public a(Context context) {
        this.f1963a = context;
    }

    @Override // com.baidu.platform.comapi.a.a.InterfaceC0037a
    public void a(HttpClient.HttpStateError httpStateError) {
        String str;
        String str2;
        switch (httpStateError) {
            case NETWORK_ERROR:
                str = "baidumapsdk";
                str2 = "current network is not available";
                break;
            case INNER_ERROR:
                str = "baidumapsdk";
                str2 = "network inner error, please check network";
                break;
            default:
                return;
        }
        Log.d(str, str2);
    }

    @Override // com.baidu.platform.comapi.a.a.InterfaceC0037a
    public void a(c cVar) {
        String str;
        String str2;
        if (cVar == null) {
            Log.d("baidumapsdk", "pano info is null");
            return;
        }
        switch (cVar.a()) {
            case PANO_UID_ERROR:
                str = "baidumapsdk";
                str2 = "pano uid is error, please check param poi uid";
                break;
            case PANO_NOT_FOUND:
                str = "baidumapsdk";
                str2 = "pano id not found for this poi point";
                break;
            case PANO_NO_TOKEN:
                str = "baidumapsdk";
                str2 = "please check ak for permission";
                break;
            case PANO_NO_ERROR:
                if (cVar.c() != 1) {
                    str = "baidumapsdk";
                    str2 = "this point do not support for pano show";
                    break;
                } else {
                    BaiduMapPoiSearch.b(cVar.b(), this.f1963a);
                    return;
                }
            default:
                return;
        }
        Log.d(str, str2);
    }
}
