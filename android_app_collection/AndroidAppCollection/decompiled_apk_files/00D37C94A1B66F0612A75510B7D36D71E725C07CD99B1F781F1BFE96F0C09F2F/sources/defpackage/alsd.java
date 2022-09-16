package defpackage;

import android.os.IBinder;
import android.os.IInterface;
/* compiled from: PG */
/* renamed from: alsd  reason: default package */
/* loaded from: classes.dex */
public final /* synthetic */ class alsd implements alsu {
    private final /* synthetic */ int e;
    public static final /* synthetic */ alsd d = new alsd(3);
    public static final /* synthetic */ alsd c = new alsd(2);
    public static final /* synthetic */ alsd b = new alsd(1);
    public static final /* synthetic */ alsd a = new alsd();

    private /* synthetic */ alsd() {
    }

    private /* synthetic */ alsd(int i) {
        this.e = i;
    }

    @Override // defpackage.alsu
    public final Object a(IBinder iBinder) {
        int i = this.e;
        if (i == 0) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.play.core.prewarm.protocol.IPrewarmService");
            if (queryLocalInterface instanceof alsg) {
                return (alsg) queryLocalInterface;
            }
            return new alsg(iBinder);
        } else if (i == 1) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface2 = iBinder.queryLocalInterface("com.google.android.play.core.appupdate.protocol.IAppUpdateService");
            if (queryLocalInterface2 instanceof alrm) {
                return (alrm) queryLocalInterface2;
            }
            return new alrm(iBinder);
        } else if (i != 2) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface3 = iBinder.queryLocalInterface("com.google.android.play.core.splitinstall.protocol.ISplitInstallService");
            if (queryLocalInterface3 instanceof alud) {
                return (alud) queryLocalInterface3;
            }
            return new alud(iBinder);
        } else if (iBinder == null) {
            return null;
        } else {
            IInterface queryLocalInterface4 = iBinder.queryLocalInterface("com.google.android.play.core.inappreview.protocol.IInAppReviewService");
            if (queryLocalInterface4 instanceof alrp) {
                return (alrp) queryLocalInterface4;
            }
            return new alrp(iBinder);
        }
    }
}
