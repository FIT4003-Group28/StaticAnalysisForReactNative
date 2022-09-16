package defpackage;

import android.os.IInterface;
/* compiled from: PG */
/* renamed from: qaj  reason: default package */
/* loaded from: classes4.dex */
public final /* synthetic */ class qaj implements qgc {
    private final /* synthetic */ int d;
    public static final /* synthetic */ qaj c = new qaj(2);
    public static final /* synthetic */ qaj b = new qaj(1);
    public static final /* synthetic */ qaj a = new qaj();

    private /* synthetic */ qaj() {
    }

    private /* synthetic */ qaj(int i) {
        this.d = i;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.qgc
    public final Object a(Object obj) {
        int i = this.d;
        if (i == 0) {
            if (obj == 0) {
                return null;
            }
            IInterface queryLocalInterface = obj.queryLocalInterface("com.google.android.gms.ads.internal.offline.IOfflineUtilsCreator");
            if (queryLocalInterface instanceof qfn) {
                return (qfn) queryLocalInterface;
            }
            return new qfn(obj);
        } else if (i != 1) {
            if (obj == 0) {
                return null;
            }
            IInterface queryLocalInterface2 = obj.queryLocalInterface("com.google.android.gms.ads.internal.client.IAdLoaderBuilderCreator");
            if (queryLocalInterface2 instanceof qbj) {
                return (qbj) queryLocalInterface2;
            }
            return new qbj(obj);
        } else if (obj == 0) {
            return null;
        } else {
            IInterface queryLocalInterface3 = obj.queryLocalInterface("com.google.android.gms.ads.internal.client.IAdManagerCreator");
            if (queryLocalInterface3 instanceof qbn) {
                return (qbn) queryLocalInterface3;
            }
            return new qbn(obj);
        }
    }
}
