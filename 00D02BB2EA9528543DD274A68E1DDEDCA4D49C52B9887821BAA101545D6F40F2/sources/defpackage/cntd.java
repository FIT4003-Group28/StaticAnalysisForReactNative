package defpackage;

import com.google.android.gms.common.Feature;
import defpackage.cnnq;
/* compiled from: PG */
/* renamed from: cntd  reason: default package */
/* loaded from: classes.dex */
public abstract class cntd<A extends cnnq, ResultT> {
    public final Feature[] b;
    public final boolean c;
    public final int d;

    @Deprecated
    public cntd() {
        this.b = null;
        this.c = false;
        this.d = 0;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public cntd(Feature[] featureArr, boolean z, int i) {
        this.b = featureArr;
        boolean z2 = false;
        if (featureArr != null && z) {
            z2 = true;
        }
        this.c = z2;
        this.d = i;
    }

    public static <A extends cnnq, ResultT> cntc<A, ResultT> builder() {
        return new cntc<>();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public abstract void a(A a, cpct<ResultT> cpctVar);
}
