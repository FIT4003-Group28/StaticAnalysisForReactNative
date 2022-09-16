package defpackage;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
/* compiled from: PG */
/* renamed from: alyl  reason: default package */
/* loaded from: classes.dex */
public final class alyl extends dvc implements IInterface {
    public alyl(IBinder iBinder) {
        super(iBinder, "com.google.android.youtube.player.internal.IPlayerStateChangeListener");
    }

    public final void a(String str) {
        Parcel pv = pv();
        pv.writeString(str);
        px(6, pv);
    }
}
