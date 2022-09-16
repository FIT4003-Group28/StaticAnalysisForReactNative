package defpackage;

import android.graphics.Bitmap;
import com.google.android.libraries.youtube.edit.common.DeviceLocalFile;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: zvn  reason: default package */
/* loaded from: classes4.dex */
public final class zvn extends agc {
    public zvn(int i) {
        super(i);
    }

    @Override // defpackage.agc
    protected final /* bridge */ /* synthetic */ int a(Object obj, Object obj2) {
        DeviceLocalFile deviceLocalFile = (DeviceLocalFile) obj;
        ampq ampqVar = (ampq) obj2;
        if (ampqVar.h()) {
            return ((Bitmap) ampqVar.c()).getByteCount();
        }
        return 0;
    }
}
