package defpackage;

import android.content.Context;
import android.os.IBinder;
import android.os.IInterface;
import com.google.android.gms.vision.label.internal.client.ImageLabelerOptions;
/* compiled from: PG */
/* renamed from: cpgf  reason: default package */
/* loaded from: classes5.dex */
public final class cpgf extends cpfu<cpga> {
    private final ImageLabelerOptions a;

    public cpgf(Context context, ImageLabelerOptions imageLabelerOptions) {
        super(context, "ica");
        this.a = imageLabelerOptions;
        e();
    }

    @Override // defpackage.cpfu
    protected final void a() {
        cpga e = e();
        cnwc.a(e);
        e.f();
    }

    @Override // defpackage.cpfu
    @dzsi
    protected final /* bridge */ /* synthetic */ cpga b(cobp cobpVar, Context context) {
        IInterface queryLocalInterface;
        cpgb cpgbVar;
        if (cpfw.a(context, "com.google.android.gms.vision.dynamite.ica")) {
            IBinder e = cobpVar.e("com.google.android.gms.vision.label.NativeImageLabelerCreator");
            if (e != null) {
                queryLocalInterface = e.queryLocalInterface("com.google.android.gms.vision.label.internal.client.INativeImageLabelerCreator");
                if (!(queryLocalInterface instanceof cpgb)) {
                    cpgbVar = new cpgb(e);
                }
                cpgbVar = (cpgb) queryLocalInterface;
            }
            cpgbVar = null;
        } else {
            IBinder e2 = cobpVar.e("com.google.android.gms.vision.label.ChimeraNativeImageLabelerCreator");
            if (e2 != null) {
                queryLocalInterface = e2.queryLocalInterface("com.google.android.gms.vision.label.internal.client.INativeImageLabelerCreator");
                if (!(queryLocalInterface instanceof cpgb)) {
                    cpgbVar = new cpgb(e2);
                }
                cpgbVar = (cpgb) queryLocalInterface;
            }
            cpgbVar = null;
        }
        if (cpgbVar == null) {
            return null;
        }
        return cpgbVar.e(cobb.b(context), this.a);
    }
}
