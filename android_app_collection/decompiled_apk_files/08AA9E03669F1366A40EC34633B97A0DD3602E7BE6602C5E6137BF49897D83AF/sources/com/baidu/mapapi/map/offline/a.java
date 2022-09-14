package com.baidu.mapapi.map.offline;

import com.baidu.platform.comapi.map.t;
import com.baidu.platform.comapi.map.x;
import java.util.ArrayList;
/* loaded from: classes.dex */
class a implements x {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ MKOfflineMap f1746a;

    /* JADX INFO: Access modifiers changed from: package-private */
    public a(MKOfflineMap mKOfflineMap) {
        this.f1746a = mKOfflineMap;
    }

    @Override // com.baidu.platform.comapi.map.x
    public void a(int i, int i2) {
        MKOfflineMapListener mKOfflineMapListener;
        MKOfflineMapListener mKOfflineMapListener2;
        MKOfflineMapListener mKOfflineMapListener3;
        t tVar;
        if (i == 4) {
            ArrayList<MKOLUpdateElement> allUpdateInfo = this.f1746a.getAllUpdateInfo();
            if (allUpdateInfo == null) {
                return;
            }
            for (MKOLUpdateElement mKOLUpdateElement : allUpdateInfo) {
                if (mKOLUpdateElement.update) {
                    mKOfflineMapListener = this.f1746a.f1745c;
                    mKOfflineMapListener.onGetOfflineMapState(4, mKOLUpdateElement.cityID);
                }
            }
        } else if (i == 6) {
            mKOfflineMapListener2 = this.f1746a.f1745c;
            mKOfflineMapListener2.onGetOfflineMapState(6, i2);
        } else if (i == 8) {
            int i3 = 65535 & (i2 >> 16);
            mKOfflineMapListener3 = this.f1746a.f1745c;
            mKOfflineMapListener3.onGetOfflineMapState(0, i3);
        } else if (i == 12) {
            tVar = this.f1746a.f1744b;
            tVar.a(true, false);
        }
    }
}
