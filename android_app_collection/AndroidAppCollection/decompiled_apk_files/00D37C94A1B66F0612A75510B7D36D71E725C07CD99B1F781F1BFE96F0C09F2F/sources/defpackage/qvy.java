package defpackage;

import com.google.android.gms.common.Feature;
/* compiled from: PG */
/* renamed from: qvy  reason: default package */
/* loaded from: classes4.dex */
public abstract class qvy {
    public final Feature[] b;
    public final boolean c;
    public final int d;

    /* JADX INFO: Access modifiers changed from: protected */
    public qvy(Feature[] featureArr, boolean z, int i) {
        this.b = featureArr;
        boolean z2 = false;
        if (featureArr != null && z) {
            z2 = true;
        }
        this.c = z2;
        this.d = i;
    }

    public static qvx b() {
        return new qvx();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public abstract void a(qsi qsiVar, rvh rvhVar);
}
