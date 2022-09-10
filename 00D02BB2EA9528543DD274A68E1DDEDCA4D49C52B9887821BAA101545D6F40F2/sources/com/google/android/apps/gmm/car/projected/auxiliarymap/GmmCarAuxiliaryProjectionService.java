package com.google.android.apps.gmm.car.projected.auxiliarymap;

import java.io.FileDescriptor;
import java.io.PrintWriter;
/* compiled from: PG */
/* loaded from: classes.dex */
public final class GmmCarAuxiliaryProjectionService extends cmvx implements btph {
    @Override // defpackage.btph
    public final void NX(String str, PrintWriter printWriter) {
        throw null;
    }

    @Override // defpackage.cmvy
    public final Class<? extends cmvs> a() {
        return mve.class;
    }

    @Override // defpackage.cmvx, defpackage.cmvy
    public final int b() {
        return 515;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.cmvx, android.app.Service
    public final void dump(FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        super.dump(fileDescriptor, printWriter, strArr);
        mve mveVar = (mve) d();
        if (mveVar != null) {
            mveVar.z("", fileDescriptor, printWriter, strArr);
        }
    }
}
