package defpackage;

import java.io.InputStream;
/* compiled from: PG */
/* renamed from: chu  reason: default package */
/* loaded from: classes2.dex */
public final class chu implements chw {
    final /* synthetic */ InputStream a;
    final /* synthetic */ clb b;

    public chu(InputStream inputStream, clb clbVar) {
        this.a = inputStream;
        this.b = clbVar;
    }

    @Override // defpackage.chw
    public final int a(chp chpVar) {
        try {
            return chpVar.a(this.a, this.b);
        } finally {
            this.a.reset();
        }
    }
}
