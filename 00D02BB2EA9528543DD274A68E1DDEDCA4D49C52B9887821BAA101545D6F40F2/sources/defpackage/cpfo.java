package defpackage;

import android.content.Context;
import android.os.IBinder;
import android.os.IInterface;
import com.google.android.gms.vision.face.internal.client.FaceSettingsParcel;
/* compiled from: PG */
/* renamed from: cpfo  reason: default package */
/* loaded from: classes5.dex */
public final class cpfo extends cpfu<cpfr> {
    private final FaceSettingsParcel a;

    public cpfo(Context context, FaceSettingsParcel faceSettingsParcel) {
        super(context, "face");
        this.a = faceSettingsParcel;
        e();
    }

    @Override // defpackage.cpfu
    protected final void a() {
        cpfr e = e();
        cnwc.a(e);
        e.f();
    }

    @Override // defpackage.cpfu
    protected final /* bridge */ /* synthetic */ cpfr b(cobp cobpVar, Context context) {
        IInterface queryLocalInterface;
        cpfs cpfsVar;
        if (cpfw.a(context, "com.google.android.gms.vision.dynamite.face")) {
            IBinder e = cobpVar.e("com.google.android.gms.vision.face.NativeFaceDetectorV2Creator");
            if (e != null) {
                queryLocalInterface = e.queryLocalInterface("com.google.android.gms.vision.face.internal.client.INativeFaceDetectorCreator");
                if (!(queryLocalInterface instanceof cpfs)) {
                    cpfsVar = new cpfs(e);
                }
                cpfsVar = (cpfs) queryLocalInterface;
            }
            cpfsVar = null;
        } else {
            IBinder e2 = cobpVar.e("com.google.android.gms.vision.face.ChimeraNativeFaceDetectorCreator");
            if (e2 != null) {
                queryLocalInterface = e2.queryLocalInterface("com.google.android.gms.vision.face.internal.client.INativeFaceDetectorCreator");
                if (!(queryLocalInterface instanceof cpfs)) {
                    cpfsVar = new cpfs(e2);
                }
                cpfsVar = (cpfs) queryLocalInterface;
            }
            cpfsVar = null;
        }
        if (cpfsVar == null) {
            return null;
        }
        return cpfsVar.e(cobb.b(context), this.a);
    }
}
