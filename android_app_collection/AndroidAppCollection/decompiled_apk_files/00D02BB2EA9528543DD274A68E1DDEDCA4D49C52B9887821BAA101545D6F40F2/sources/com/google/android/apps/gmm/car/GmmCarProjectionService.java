package com.google.android.apps.gmm.car;

import java.io.FileDescriptor;
import java.io.PrintWriter;
/* compiled from: PG */
/* loaded from: classes.dex */
public final class GmmCarProjectionService extends cmvx implements btph {
    @Override // defpackage.btph
    public final void NX(String str, PrintWriter printWriter) {
        throw null;
    }

    @Override // defpackage.cmvy
    public final Class<? extends cmvs> a() {
        return mum.class;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.cmvx, android.app.Service
    public final void dump(FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        super.dump(fileDescriptor, printWriter, strArr);
        mum mumVar = (mum) d();
        if (mumVar != null) {
            mumVar.z("", fileDescriptor, printWriter, strArr);
        }
    }
}
